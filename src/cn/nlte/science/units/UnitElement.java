/*
 * 本源代码知识产权属于斯塔克工业（STK）所有。
 * <P>
 * 本项目以Apache License Version 2.0协议发布，鼓励代码共享和尊重原作者的著作权，
 * <P>
 * 同样允许代码修改，再发布（作为开源或商业软件）。
 * <P>
 * 在延伸的代码中（修改和有源代码衍生的代码中）需要带有原来代码中的协议，
 * <P>
 * 商标，不得以任何形式删去“斯塔克工业（STK）”的版权声明。
 * <P>
 * 斯塔克工业官方网址：
 * <P>
 *
 *     http://www.stk.cn
 *
 * <P>
 * STK主要服务于石油、化工、核电、建筑等传统企业，致力于传统行业的现代科技化转型，
 * <P>
 * 提供软件培训、软件研发（包括二次研发）、研发咨询、系统架构、高性能计算集群（HPC）搭建等一体化的专业服务。
 * <P>
 * 公司以“专于行业应用，用心铸造永恒”为核心价值。
 */
package cn.nlte.science.units;

/**
 * 单位单元类，封装单位类型及指数
 * <P>
 *
 * @author 紫水木鱼
 */
public final class UnitElement {

    // 基本单位类型
    private BasicUnit unit;
    // 指数值
    private double exp;

    /**
     * 推荐的构造方法
     *
     * @param unit
     * @param exp
     */
    public UnitElement(BasicUnit unit, double exp) {
        this.unit = unit;
        this.exp = exp;
    }

    public UnitElement() {
    }

    /**
     * 实现对象的拷贝（不采用Java提供的）
     *
     * @return
     */
    public UnitElement copy() {
        return new UnitElement(unit, exp);
    }

    /**
     * 此处不重写Object的equal方法，太麻烦了...
     *
     * @param obj
     * @return
     */
    public boolean isEqual(UnitElement obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof UnitElement)) {
            return false;
        }
        UnitElement element = (UnitElement) obj;
        return (unit == element.getUnit()) && DoubleUtils.isSame(exp, element.getExp());
    }

    @Override
    public String toString() {
        return "UnitElement{" + "unit=" + unit + ", exp=" + exp + '}';
    }

    /**
     * @return the unit
     */
    public BasicUnit getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(BasicUnit unit) {
        this.unit = unit;
    }

    /**
     * @return the exp
     */
    public double getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(double exp) {
        this.exp = exp;
    }

}
