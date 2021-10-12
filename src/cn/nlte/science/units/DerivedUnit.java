/*
 * 本源代码知识产权属于北京新叶至恒软件技术有限公司（NLTE）所有。
 * <P>
 * 本项目以Apache License Version 2.0协议发布，鼓励代码共享和尊重原作者的著作权，
 * <P>
 * 同样允许代码修改，再发布（作为开源或商业软件）。
 * <P>
 * 在延伸的代码中（修改和有源代码衍生的代码中）需要带有原来代码中的协议，
 * <P>
 * 商标，不得以任何形式删去“北京新叶至恒软件技术有限公司（NLTE）”的版权声明。
 * <P>
 * 北京新叶至恒软件技术有限公司官方网址：
 * <P>
 *
 *     http://www.nlte.cn
 *
 * <P>
 * NLTE主要服务于石油、化工、核电、建筑等传统企业，致力于传统行业的现代科技化转型，
 * <P>
 * 提供软件培训、软件研发（包括二次研发）、研发咨询、系统架构、高性能计算集群（HPC）搭建等一体化的专业服务。
 * <P>
 * 公司以“专于行业应用，用心铸造永恒”为核心价值。
 */
package cn.nlte.science.units;

import java.util.ArrayList;
import java.util.List;

/**
 * 导出单位抽象类，所有子单位均继承自此类，用户可自定义新的单位
 * <P>
 *
 * @author yetao
 */
public abstract class DerivedUnit {

    private final String description;
    private final List<UnitElement> elementList;
    private final double factor;
    private final double addition;

    /**
     * 在构造方法中初始化变量的值，子类必须调用
     *
     * 不允许有指数小于等于DoubleUtils.DEVIATION的元单位存在
     *
     * @param description 单位的描述，如：MPa、mm、℃等
     * @param elementList 单位元数组
     * @param factor
     * 相对单位元数值的倍数，如xF=[5/9*x+(273.15-32*5/9)]K，则factor=5/9，addition=273.15-32*5/9
     * @param addition 相对于单位元的偏移量
     */
    protected DerivedUnit(String description, List<UnitElement> elementList, double factor, double addition) {
        this.description = description;
        this.addition = addition;
        this.factor = factor;
        if (elementList == null) {
            this.elementList = new ArrayList<>();
        } else {
            List<UnitElement> innerList = getCopyList(elementList);
            // 检查数据的合法性
            List<BasicUnit> basicList = new ArrayList<>();
            for (int i = innerList.size() - 1; i >= 0; i--) {
                UnitElement unit = innerList.get(i);
                if (basicList.contains(unit.getUnit())) {
                    throw new BasicUnitDuplicateException("The basic unit [" + unit.getUnit().toString() + "] is duplicated !");
                } else {
                    basicList.add(unit.getUnit());
                }
                // 去除小于等于DoubleUtils.DEVIATION的项
                if (Math.abs(unit.getExp()) <= DoubleUtils.DEVIATION) {
                    innerList.remove(unit);
                }
            }
            this.elementList = innerList;
        }
    }

    /**
     * 返回两单位制相乘的新单位制，乘除操作后全部置为基本单位制
     *
     * 数值上的处理在使用单位制的类中进行
     *
     * @param unit
     * @return
     */
    public DerivedUnit multiply(DerivedUnit unit) {
        if (unit == null) {
            return this.copy();
        }
        List<UnitElement> copyList = getCopyList();
        for (UnitElement element : unit.getUnits()) {
            int index = indexUnit(copyList, element);
            if (index >= 0) {
                UnitElement current = copyList.get(index);
                current.setExp(current.getExp() + element.getExp());
            } else {
                copyList.add(new UnitElement(element.getUnit(), element.getExp()));
            }
        }
        return new UCommon(null, copyList, 1.0, 0.0);
    }

    /**
     * 返回两单位制相除的新单位制，乘除操作后全部置为基本单位制
     *
     * 数值上的处理在使用单位制的类中进行
     *
     * @param unit
     * @return
     */
    public DerivedUnit divide(DerivedUnit unit) {
        if (unit == null) {
            return this.copy();
        }
        List<UnitElement> copyList = getCopyList();
        for (UnitElement element : unit.getUnits()) {
            int index = indexUnit(copyList, element);
            if (index >= 0) {
                UnitElement current = copyList.get(index);
                current.setExp(current.getExp() - element.getExp());
            } else {
                copyList.add(new UnitElement(element.getUnit(), -element.getExp()));
            }
        }
        return new UCommon(null, copyList, 1.0, 0.0);
    }

    /**
     * 返回单位制次方运算的结果，操作后全部置为基本单位制
     *
     * 数值上的处理在使用单位制的类中进行
     *
     * @param pow
     * @return
     */
    public DerivedUnit power(double pow) {
        List<UnitElement> copyList = getCopyList();
        for (UnitElement element : copyList) {
            element.setExp(Math.pow(element.getExp(), pow));
        }
        return new UCommon(null, copyList, 1.0, 0.0);
    }

    /**
     * 判断是否为同一类单位制，如m与mm，返回true
     *
     * @param unit
     * @return
     */
    public boolean isSameAs(DerivedUnit unit) {
        if (unit == null) {
            return false;
        }
        List<UnitElement> copyList = unit.getCopyList();
        if (copyList.size() != elementList.size()) {
            return false;
        }
        for (UnitElement element : copyList) {
            if (indexUnit(elementList, element) < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断单位制是否完全一样
     *
     * @param unit
     * @return
     */
    public boolean isEqual(DerivedUnit unit) {
        if (unit == null) {
            return false;
        }
        List<UnitElement> copyList = unit.getCopyList();
        if (copyList.size() != elementList.size()) {
            return false;
        }
        for (UnitElement element : copyList) {
            int index = indexUnit(elementList, element);
            if (index < 0) {
                return false;
            }
            if (!elementList.get(index).isEqual(element)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 获取基本单位在列表中的位置
     *
     * @param list
     * @param element
     * @return
     */
    private static int indexUnit(List<UnitElement> list, UnitElement element) {
        int count = list.size();
        for (int i = 0; i < count; i++) {
            if (list.get(i).getUnit() == element.getUnit()) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 实现深度拷贝
     *
     * @return
     */
    public DerivedUnit copy() {
        List<UnitElement> cloneList = getCopyList();
        return new UCommon(description, cloneList, factor, addition);
    }

    /**
     * 拷贝数组辅助方法
     *
     * @return
     */
    private List<UnitElement> getCopyList() {
        return getCopyList(this.elementList);
    }

    /**
     * 拷贝数组辅助方法
     *
     * @return
     */
    private List<UnitElement> getCopyList(List<UnitElement> elementList) {
        List<UnitElement> cloneList = new ArrayList<>();
        for (UnitElement element : elementList) {
            cloneList.add(element.copy());
        }
        return cloneList;
    }

    /**
     * 获取单位制标准的显示，如：Kg*m*s^-2
     *
     * @return
     */
    public String getStandardFormat() {
        return elementList.toString();
    }

    /**
     * 返回单位的描述，如：MPa、mm、℃等
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * 返回基本单位单元
     *
     * @return the elementList
     */
    public List<UnitElement> getUnits() {
        // 返回集合的副本，以免原数据被修改
        return getCopyList();
    }

    @Override
    public String toString() {
        return "DerivedUnit{" + "description=" + description + ", elementList=" + elementList + ", factor=" + factor + ", addition=" + addition + '}';
    }

    /**
     * @return the addition
     */
    public double getAddition() {
        return addition;
    }

    /**
     * @return the factor
     */
    public double getFactor() {
        return factor;
    }

}
