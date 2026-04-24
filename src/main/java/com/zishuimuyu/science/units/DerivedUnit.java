package com.zishuimuyu.science.units;

import java.util.ArrayList;
import java.util.List;

/**
 * 导出单位抽象基类
 * <p>
 * 该类是所有具体单位类的基类，定义了单位的基本属性和操作方法。
 * 所有具体的单位类（如长度单位、质量单位、温度单位等）都继承自此类。
 * <p>
 * 该类提供了单位运算（乘、除、幂）的实现，以及单位间比较和转换的基础功能。
 * <p>
 * 核心功能：
 * <ul>
 *   <li>单位元素管理：维护构成单位的基本单位及其指数</li>
 *   <li>单位运算：支持单位间的乘、除、幂运算</li>
 *   <li>单位比较：判断单位是否属于同一量纲</li>
 *   <li>单位转换：提供转换所需的因子和偏移量</li>
 * </ul>
 * <p>
 * 使用示例：
 * <pre>
 * // 创建一个长度单位
 * DerivedUnit meter = new ULength_m();
 *
 * // 两个单位相乘得到面积单位
 * DerivedUnit area = meter.multiply(meter);
 * // 结果：m²单位
 *
 * // 判断两个单位是否属于同一量纲
 * boolean same = meter.isSameAs(new ULength_cm());
 * // true
 * </pre>
 * <p>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public abstract class DerivedUnit {

    /**
     * 单位的描述字符串
     * <p>
     * 用于显示和标识该单位，如"m"表示米，"Kg"表示千克，"℃"表示摄氏度等。
     * 这个字符串通常用于输出和用户界面显示。
     */
    private final String description;

    /**
     * 单位元素列表
     * <p>
     * 存储构成该单位的基本单位及其指数。
     * 例如：力的单位N（牛顿）由Kg·m·s⁻²构成，所以列表包含：
     * - Kg，指数1.0
     * - m，指数1.0
     * - s，指数-2.0
     */
    private final List<UnitElement> elementList;

    /**
     * 转换因子
     * <p>
     * 表示该单位相对于基本单位的倍数关系。
     * 在单位转换时使用：目标值 = 源值 × 源因子 / 目标因子
     * 对于有偏移量的单位（如温度），还需要考虑偏移量的影响。
     */
    private final double factor;

    /**
     * 偏移量
     * <p>
     * 表示该单位相对于基本单位的零点偏移。
     * 主要用于温度等有绝对零点的单位转换。
     * 在单位转换时，需要先加上偏移量，再进行因子转换。
     */
    private final double addition;

    /**
     * 构造方法，初始化导出单位的各个属性
     * <p>
     * 该方法被子类调用，用于设置单位的描述、基本单位元素、转换因子和偏移量。
     * <p>
     * 构造过程：
     * <ol>
     *   <li>设置描述、因子和偏移量</li>
     *   <li>验证单位元素列表的合法性</li>
     *   <li>检查是否存在重复的基本单位</li>
     *   <li>过滤掉指数接近零的单位元素</li>
     * </ol>
     *
     * @param description 单位的描述字符串，如"MPa"、"mm"、"℃"等
     * @param elementList 单位元素列表，包含构成该单位的基本单位及其指数
     * @param factor      相对于基本单位的倍数因子
     *                    如°F=[5/9*x+(273.15-32*5/9)]K，则factor=5/9
     * @param addition    相对于基本单位的偏移量
     *                    如°F=[5/9*x+(273.15-32*5/9)]K，则addition=273.15-32*5/9
     * @throws BasicUnitDuplicateException 当单位元素列表中包含重复的基本单位时抛出
     */
    protected DerivedUnit(String description, List<UnitElement> elementList, double factor, double addition) {
        // 设置单位描述
        this.description = description;
        // 设置偏移量
        this.addition = addition;
        // 设置转换因子
        this.factor = factor;
        // 检查输入的元素列表是否为空
        if (elementList == null) {
            // 如果为空，创建一个新的空列表
            this.elementList = new ArrayList<>();
        } else {
            // 获取输入列表的副本，避免外部修改影响内部数据
            List<UnitElement> innerList = getCopyList(elementList);
            // 检查数据的合法性
            // 创建一个临时列表用于检查重复的基本单位
            List<BasicUnit> basicList = new ArrayList<>();
            // 从后往前遍历，这样删除元素时不会影响后续索引
            for (int i = innerList.size() - 1; i >= 0; i--) {
                UnitElement unit = innerList.get(i);
                // 检查是否已存在相同的基本单位
                if (basicList.contains(unit.getUnit())) {
                    // 如果存在重复的基本单位，抛出异常
                    throw new BasicUnitDuplicateException("The basic unit [" + unit.getUnit().toString() + "] is duplicated !");
                } else {
                    // 将基本单位添加到检查列表中
                    basicList.add(unit.getUnit());
                }
                // 去除小于等于DoubleUtils.DEVIATION的项
                // 过滤掉指数接近零的单位元素，避免不必要的计算误差
                if (Math.abs(unit.getExp()) <= DoubleUtils.DEVIATION) {
                    innerList.remove(unit);
                }
            }
            // 设置最终的单位元素列表
            this.elementList = innerList;
        }
    }

    /**
     * 返回两个单位相乘后的新单位
     * <p>
     * 该方法实现单位间的乘法运算，将两个单位的元素列表合并。
     * 相同的基本单位的指数相加，不同的基本单位保持不变。
     * <p>
     * 示例：
     * <ul>
     *   <li>长度单位 × 长度单位 = 面积单位（m × m = m²）</li>
     *   <li>力单位 × 长度单位 = 能量单位（N × m = J）</li>
     * </ul>
     * <p>
     * 注意：结果单位总是使用基本单位表示，且因子设为1.0，偏移量设为0.0。
     * 数值上的处理在使用单位的ValueWithUnit类中完成。
     *
     * @param unit 另一个参与乘法运算的单位
     * @return 新的复合单位实例，类型为UCommon
     */
    public DerivedUnit multiply(DerivedUnit unit) {
        // 如果传入的单位为null，返回当前单位的副本
        if (unit == null) {
            return this.copy();
        }
        // 获取当前单位的元素列表副本
        List<UnitElement> copyList = getCopyList();
        // 遍历另一个单位的所有元素
        for (UnitElement element : unit.getUnits()) {
            // 查找当前列表中是否存在相同的基本单位
            int index = indexUnit(copyList, element);
            if (index >= 0) {
                // 如果存在，将指数相加
                UnitElement current = copyList.get(index);
                current.setExp(current.getExp() + element.getExp());
            } else {
                // 如果不存在，直接添加新元素
                copyList.add(new UnitElement(element.getUnit(), element.getExp()));
            }
        }
        // 返回一个新的通用单位实例，因子为1.0，偏移量为0.0
        return new UCommon(null, copyList, 1.0, 0.0);
    }

    /**
     * 返回两个单位相除后的新单位
     * <p>
     * 该方法实现单位间的除法运算，将被除数单位的元素指数减去除数单位的元素指数。
     * 相同的基本单位的指数相减，不同的基本单位取负指数加入结果。
     * <p>
     * 示例：
     * <ul>
     *   <li>长度单位 ÷ 时间单位 = 速度单位（m ÷ s = m/s）</li>
     *   <li>力单位 ÷ 面积单位 = 压强单位（N ÷ m² = Pa）</li>
     * </ul>
     * <p>
     * 注意：结果单位总是使用基本单位表示，且因子设为1.0，偏移量设为0.0。
     * 数值上的处理在使用单位的ValueWithUnit类中完成。
     *
     * @param unit 作为除数的单位
     * @return 新的复合单位实例，类型为UCommon
     */
    public DerivedUnit divide(DerivedUnit unit) {
        // 如果传入的单位为null，返回当前单位的副本
        if (unit == null) {
            return this.copy();
        }
        // 获取当前单位的元素列表副本
        List<UnitElement> copyList = getCopyList();
        // 遍历除数单位的所有元素
        for (UnitElement element : unit.getUnits()) {
            // 查找当前列表中是否存在相同的基本单位
            int index = indexUnit(copyList, element);
            if (index >= 0) {
                // 如果存在，将指数相减（被除数指数 - 除数指数）
                UnitElement current = copyList.get(index);
                current.setExp(current.getExp() - element.getExp());
            } else {
                // 如果不存在，添加该基本单位的负指数（相当于除法）
                copyList.add(new UnitElement(element.getUnit(), -element.getExp()));
            }
        }
        // 返回一个新的通用单位实例，因子为1.0，偏移量为0.0
        return new UCommon(null, copyList, 1.0, 0.0);
    }

    /**
     * 返回单位的幂运算结果
     * <p>
     * 该方法实现单位的幂运算，将单位中所有基本单位的指数乘以给定的幂次。
     * <p>
     * 示例：
     * <ul>
     *   <li>长度单位的平方 = 面积单位（m²）</li>
     *   <li>长度单位的立方 = 体积单位（m³）</li>
     * </ul>
     * <p>
     * 注意：结果单位总是使用基本单位表示，且因子设为1.0，偏移量设为0.0。
     * 数值上的处理在使用单位的ValueWithUnit类中完成。
     *
     * @param pow 幂次，可以是正数、负数或小数
     * @return 新的复合单位实例，类型为UCommon
     */
    public DerivedUnit power(double pow) {
        // 获取当前单位元素列表的副本
        List<UnitElement> copyList = getCopyList();
        // 遍历列表中的每个元素
        for (UnitElement element : copyList) {
            // 将每个基本单位的指数乘以给定的幂次
            // 例如：长度单位m（指数为1），平方运算后变成m^2（指数为1*2=2）
            element.setExp(element.getExp() * pow);
        }
        // 返回一个新的通用单位实例，因子为1.0，偏移量为0.0
        return new UCommon(null, copyList, 1.0, 0.0);
    }

    /**
     * 判断两个单位是否属于同一量纲
     * <p>
     * 该方法检查两个单位是否具有相同的量纲，即是否可以相互转换。
     * 例如：米和厘米属于同一量纲，可以相互转换；而米和千克不属于同一量纲。
     * <p>
     * 比较逻辑：
     * <ol>
     *   <li>检查元素列表的大小是否相同</li>
     *   <li>检查每个基本单位及其指数是否都能在另一个单位中找到</li>
     * </ol>
     *
     * @param unit 待比较的单位
     * @return 如果两个单位属于同一量纲返回true，否则返回false
     */
    public boolean isSameAs(DerivedUnit unit) {
        // 如果传入的单位为null，直接返回false
        if (unit == null) {
            return false;
        }
        // 获取待比较单位的元素列表副本
        List<UnitElement> copyList = unit.getCopyList();
        // 首先比较两个单位的元素列表大小，如果不相同则肯定不是同一量纲
        if (copyList.size() != elementList.size()) {
            return false;
        }
        // 遍历待比较单位的每个元素
        for (UnitElement element : copyList) {
            // 检查当前单位中是否包含相同的元素（基本单位和指数）
            if (indexUnit(elementList, element) < 0) {
                // 如果找不到对应元素，则不是同一量纲
                return false;
            }
        }
        // 如果所有元素都匹配，则属于同一量纲
        return true;
    }

    /**
     * 判断两个单位是否完全相同
     * <p>
     * 该方法检查两个单位是否在各个方面都完全相同，包括：
     * 描述、基本单位元素、转换因子和偏移量。
     * <p>
     * 与isSameAs方法不同，isEqual要求两个单位的所有属性都相同。
     *
     * @param unit 待比较的单位
     * @return 如果两个单位完全相同返回true，否则返回false
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
     * 获取基本单位在列表中的索引位置
     * <p>
     * 该私有静态方法用于在单位元素列表中查找指定基本单位的位置。
     *
     * @param list    单位元素列表
     * @param element 要查找的单位元素
     * @return 找到则返回索引位置，未找到返回-1
     */
    private static int indexUnit(List<UnitElement> list, UnitElement element) {
        // 获取列表的大小
        int count = list.size();
        // 遍历列表中的每个元素
        for (int i = 0; i < count; i++) {
            // 比较当前元素的基本单位是否与目标元素的基本单位相同
            if (list.get(i).getUnit() == element.getUnit()) {
                // 如果找到匹配的元素，返回其索引位置
                return i;
            }
        }
        // 如果遍历完整个列表都没有找到匹配的元素，返回-1
        return -1;
    }

    /**
     * 创建当前单位的深度拷贝
     * <p>
     * 该方法创建一个与当前单位具有相同属性的新实例。
     * 使用UCommon类创建副本，保持所有原始属性。
     *
     * @return 当前单位的一个新实例
     */
    public DerivedUnit copy() {
        List<UnitElement> cloneList = getCopyList();
        return new UCommon(description, cloneList, factor, addition);
    }

    /**
     * 获取当前单位元素列表的拷贝
     * <p>
     * 该私有方法返回当前单位元素列表的副本，防止外部修改原列表。
     *
     * @return 单位元素列表的副本
     */
    private List<UnitElement> getCopyList() {
        // 调用重载方法，传入当前实例的元素列表
        return getCopyList(this.elementList);
    }

    /**
     * 获取指定单位元素列表的拷贝
     * <p>
     * 该私有方法创建并返回输入列表的深度拷贝，包括所有元素的副本。
     *
     * @param elementList 要拷贝的单位元素列表
     * @return 输入列表的深度拷贝
     */
    private List<UnitElement> getCopyList(List<UnitElement> elementList) {
        // 创建一个新的列表来存放拷贝的元素
        List<UnitElement> cloneList = new ArrayList<>();
        // 遍历输入列表中的每个元素
        for (UnitElement element : elementList) {
            // 对每个元素进行拷贝并添加到新列表中，实现深度拷贝
            cloneList.add(element.copy());
        }
        // 返回深度拷贝的列表
        return cloneList;
    }

    /**
     * 获取单位的标准显示格式
     * <p>
     * 以标准格式返回单位的表示形式，如"Kg*m*s^-2"。
     * 该格式清晰地展示了单位的构成和各基本单位的指数。
     *
     * @return 单位的标准显示字符串
     */
    public String getStandardFormat() {
        return elementList.toString();
    }

    /**
     * 获取单位的描述字符串
     * <p>
     * 返回该单位的简短描述，如"m"、"Kg"、"℃"等。
     *
     * @return 单位的描述字符串
     */
    public String getDescription() {
        return description;
    }

    /**
     * 获取单位的基本元素列表
     * <p>
     * 返回构成该单位的基本单位元素列表的副本。
     * 返回的是副本，不会影响原列表的内容。
     *
     * @return 单位基本元素列表的副本
     */
    public List<UnitElement> getUnits() {
        // 返回集合的副本，以免原数据被修改
        return getCopyList();
    }

    /**
     * 获取对象的字符串表示
     * <p>
     * 返回包含该单位所有属性信息的字符串，主要用于调试和日志记录。
     *
     * @return 包含单位属性信息的字符串
     */
    @Override
    public String toString() {
        return "DerivedUnit{" + "description=" + description + ", elementList=" + elementList + ", factor=" + factor + ", addition=" + addition + '}';
    }

    /**
     * 获取单位的偏移量
     * <p>
     * 返回该单位相对于基本单位的零点偏移量。
     * 主要用于温度等有绝对零点的单位转换。
     *
     * @return 单位的偏移量
     */
    public double getAddition() {
        return addition;
    }

    /**
     * 获取单位的转换因子
     * <p>
     * 返回该单位相对于基本单位的倍数因子。
     * 在单位转换计算中起关键作用。
     *
     * @return 单位的转换因子
     */
    public double getFactor() {
        return factor;
    }

}