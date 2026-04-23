package cn.nlte.science.units;

/**
 * 带单位的数据类
 * <p>
 * 该类封装了数值和单位，是进行带单位运算的主要操作类。
 * 提供了加、减、乘、除、幂运算等操作，以及单位转换功能。
 * <p>
 * 核心功能：
 * <ul>
 *   <li>数值与单位的绑定：将数值与其单位信息关联</li>
 *   <li>单位运算：支持同类单位的加减运算和不同单位的乘除运算</li>
 *   <li>单位转换：在同一量纲内将数值转换为不同单位</li>
 *   <li>量纲检查：确保运算的单位具有相同的量纲</li>
 * </ul>
 * <p>
 * 使用示例：
 * <pre>
 * // 创建带单位的数值
 * ValueWithUnit length = new ValueWithUnit(10.0, new ULength_m());
 * ValueWithUnit width = new ValueWithUnit(5.0, new ULength_m());
 *
 * // 进行运算
 * ValueWithUnit area = length.multiply(width); // 面积计算
 * ValueWithUnit total = length.add(width); // 长度相加
 *
 * // 单位转换
 * ValueWithUnit lengthCm = length.convertTo(new ULength_cm()); // 转换为厘米
 * </pre>
 * <p>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public final class ValueWithUnit {

    /**
     * 数值部分
     * <p>
     * 存储实际的数值，使用double类型以保证一定的精度。
     * 该值是在当前单位下的数值表示。
     */
    private final double value;

    /**
     * 单位部分
     * <p>
     * 存储该数值对应的单位信息，类型为DerivedUnit及其子类。
     * 该单位决定了数值的含义和转换规则。
     */
    private final DerivedUnit unit;

    /**
     * 构造方法，创建一个带单位的数值实例
     * <p>
     * 该方法将数值与单位进行绑定，创建一个完整的带单位数值对象。
     *
     * @param value 数值部分，表示在指定单位下的数值
     * @param unit  单位部分，表示该数值所属的单位
     */
    public ValueWithUnit(double value, DerivedUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    /**
     * 与另一个带单位数值相加
     * <p>
     * 该方法实现两个相同量纲数值的加法运算。
     * 首先检查两个数值的单位是否属于同一量纲，然后将第二个数值转换为第一个数值的单位，
     * 最后执行数值相加，结果保持第一个数值的单位。
     * <p>
     * 运算规则：
     * <ol>
     *   <li>检查两个单位是否属于同一量纲</li>
     *   <li>将第二个数值转换为与第一个数值相同的单位</li>
     *   <li>执行数值相加</li>
     *   <li>返回结果，单位与第一个数值相同</li>
     * </ol>
     *
     * @param vwu 另一个待相加的带单位数值
     * @return 相加后的结果，单位与当前数值相同
     * @throws UnitsNotSameException 当两个数值的单位不属于同一量纲时抛出
     */
    public ValueWithUnit add(ValueWithUnit vwu) {
        // 判断类型是否可加
        if (!unit.isSameAs(vwu.getUnit())) {
            throw new UnitsNotSameException("The unit [" + unit.getStandardFormat() + "] is not the same as [" + vwu.getUnit().getStandardFormat() + "]!");
        }
        // 转化类型
        double newValue = value + vwu.convertTo(unit).getValue();
        return new ValueWithUnit(newValue, unit);
    }

    /**
     * 与另一个带单位数值相减
     * <p>
     * 该方法实现两个相同量纲数值的减法运算。
     * 首先检查两个数值的单位是否属于同一量纲，然后将第二个数值转换为第一个数值的单位，
     * 最后执行数值相减，结果保持第一个数值的单位。
     * <p>
     * 运算规则：
     * <ol>
     *   <li>检查两个单位是否属于同一量纲</li>
     *   <li>将第二个数值转换为与第一个数值相同的单位</li>
     *   <li>执行数值相减</li>
     *   <li>返回结果，单位与第一个数值相同</li>
     * </ol>
     *
     * @param vwu 另一个待相减的带单位数值
     * @return 相减后的结果，单位与当前数值相同
     * @throws UnitsNotSameException 当两个数值的单位不属于同一量纲时抛出
     */
    public ValueWithUnit sub(ValueWithUnit vwu) {
        // 判断类型是否可加
        if (!unit.isSameAs(vwu.getUnit())) {
            throw new UnitsNotSameException("The unit [" + unit.getStandardFormat() + "] is not the same as [" + vwu.getUnit().getStandardFormat() + "]!");
        }
        // 转化类型
        double newValue = value - vwu.convertTo(unit).getValue();
        return new ValueWithUnit(newValue, unit);
    }

    /**
     * 与另一个带单位数值相乘
     * <p>
     * 该方法实现两个数值的乘法运算，生成新的复合单位。
     * 该运算不检查量纲匹配性，而是将两个单位按照乘法规则组合成新的复合单位。
     * <p>
     * 运算规则：
     * <ol>
     *   <li>将两个数值转换为基本单位制下的数值（忽略偏移量）</li>
     *   <li>执行数值相乘</li>
     *   <li>将两个单位按照乘法规则组合成新的复合单位</li>
     *   <li>返回结果，单位为复合单位</li>
     * </ol>
     *
     * @param vwu 另一个待相乘的带单位数值
     * @return 相乘后的结果，单位为复合单位
     */
    public ValueWithUnit multiply(ValueWithUnit vwu) {
        double value1 = this.getBasicValueWithoutAdditional();
        double value2 = vwu.getBasicValueWithoutAdditional();
        double newValue = value1 * value2;
        DerivedUnit newUni = unit.multiply(vwu.getUnit());
        return new ValueWithUnit(newValue, newUni);
    }

    /**
     * 与另一个带单位数值相除
     * <p>
     * 该方法实现两个数值的除法运算，生成新的复合单位。
     * 该运算不检查量纲匹配性，而是将两个单位按照除法规则组合成新的复合单位。
     * <p>
     * 运算规则：
     * <ol>
     *   <li>将两个数值转换为基本单位制下的数值（忽略偏移量）</li>
     *   <li>执行数值相除</li>
     *   <li>将两个单位按照除法规则组合成新的复合单位</li>
     *   <li>返回结果，单位为复合单位</li>
     * </ol>
     *
     * @param vwu 另一个待相除的带单位数值
     * @return 相除后的结果，单位为复合单位
     */
    public ValueWithUnit divide(ValueWithUnit vwu) {
        double value1 = this.getBasicValueWithoutAdditional();
        double value2 = vwu.getBasicValueWithoutAdditional();
        double newValue = value1 / value2;
        DerivedUnit newUni = unit.divide(vwu.getUnit());
        return new ValueWithUnit(newValue, newUni);
    }

    /**
     * 执行幂运算
     * <p>
     * 该方法实现数值的幂运算，同时相应地改变单位。
     * 将当前数值进行幂运算，并将单位也进行相应的幂运算。
     * <p>
     * 运算规则：
     * <ol>
     *   <li>将数值转换为基本单位制下的数值（忽略偏移量）</li>
     *   <li>执行数值的幂运算</li>
     *   <li>将单位进行相应的幂运算</li>
     *   <li>返回结果，数值和单位都进行了幂运算</li>
     * </ol>
     *
     * @param pow 幂次，可以是正数、负数或小数
     * @return 幂运算后的结果
     */
    public ValueWithUnit power(double pow) {
        double value1 = this.getBasicValueWithoutAdditional();
        double newValue = Math.pow(value1, pow);
        DerivedUnit newUni = unit.power(pow);
        return new ValueWithUnit(newValue, newUni);
    }

    /**
     * 转换为指定单位
     * <p>
     * 将当前数值从当前单位转换为指定的目标单位。
     * 此方法会考虑单位的偏移量（如温度单位），执行完整的转换计算。
     * <p>
     * 转换公式：
     * <pre>
     * newValue = (current_value * current_factor + current_addition - dest_addition) / dest_factor
     * </pre>
     *
     * @param destUnit 目标单位，必须与当前单位属于同一量纲
     * @return 转换后的新实例，数值已转换为目标单位下的值
     * @throws UnitsNotSameException 当目标单位与当前单位不属于同一量纲时抛出
     */
    public ValueWithUnit convertTo(DerivedUnit destUnit) {
        // 检查量纲
        if (!unit.isSameAs(destUnit)) {
            throw new UnitsNotSameException("The unit [" + unit.getStandardFormat() + "] is not the same as [" + destUnit.getStandardFormat() + "]!");
        }
        // 计算标准量纲的值，然后计算现有值
        double newValue = value * unit.getFactor() + unit.getAddition();
        newValue = (newValue - destUnit.getAddition()) / destUnit.getFactor();
        return new ValueWithUnit(newValue, destUnit);
    }

    /**
     * 转换为指定单位（忽略偏移量）
     * <p>
     * 将当前数值从当前单位转换为指定的目标单位，但忽略单位的偏移量。
     * 仅考虑单位的倍数关系，不考虑零点偏移。
     * <p>
     * 此方法主要用于温度差值的转换等场景，例如将摄氏度温差转换为开尔文温差。
     * <p>
     * 转换公式：
     * <pre>
     * newValue = (current_value * current_factor) / dest_factor
     * </pre>
     *
     * @param destUnit 目标单位，必须与当前单位属于同一量纲
     * @return 转换后的新实例，数值已转换为目标单位下的值（忽略偏移量）
     * @throws UnitsNotSameException 当目标单位与当前单位不属于同一量纲时抛出
     */
    public ValueWithUnit convertToWithoutAdditional(DerivedUnit destUnit) {
        // 检查量纲
        if (!unit.isSameAs(destUnit)) {
            throw new UnitsNotSameException("The unit [" + unit.getStandardFormat() + "] is not the same as [" + destUnit.getStandardFormat() + "]!");
        }
        // 计算标准量纲的值，然后计算现有值
        double newValue = value * unit.getFactor();
        newValue = (newValue) / destUnit.getFactor();
        return new ValueWithUnit(newValue, destUnit);
    }

    /**
     * 获取基本单位制下的数值（包含偏移量）
     * <p>
     * 将当前数值转换为基本单位制下的值，考虑单位的偏移量。
     * <p>
     * 转换公式：
     * <pre>
     * basic_value = current_value * factor + addition
     * </pre>
     *
     * @return 基本单位制下的数值
     */
    public double getBasicValue() {
        return value * unit.getFactor() + unit.getAddition();
    }

    /**
     * 获取基本单位制下的数值（忽略偏移量）
     * <p>
     * 将当前数值转换为基本单位制下的值，忽略单位的偏移量。
     * 仅考虑单位的倍数关系。
     * <p>
     * 转换公式：
     * <pre>
     * basic_value = current_value * factor
     * </pre>
     *
     * @return 基本单位制下的数值（忽略偏移量）
     */
    public double getBasicValueWithoutAdditional() {
        return value * unit.getFactor();
    }

    /**
     * 获取对象的字符串表示
     * <p>
     * 返回包含数值和单位信息的字符串，主要用于调试和日志记录。
     *
     * @return 包含数值和单位信息的字符串
     */
    @Override
    public String toString() {
        return "ValueWithUnit{" + "value=" + value + ", unit=" + unit + '}';
    }

    /**
     * 获取数值部分
     * <p>
     * 返回该带单位数值的纯数值部分。
     *
     * @return 数值部分
     */
    public double getValue() {
        return value;
    }

    /**
     * 获取单位部分
     * <p>
     * 返回该带单位数值的单位信息。
     *
     * @return 单位部分
     */
    public DerivedUnit getUnit() {
        return unit;
    }

}