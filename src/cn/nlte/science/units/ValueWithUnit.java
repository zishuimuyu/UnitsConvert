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
 * 带单位的数据类，实际操作过程中使用
 * <P>
 *
 * @author 紫水木鱼
 */
public final class ValueWithUnit {

    private final double value;
    private final DerivedUnit unit;

    /**
     *
     * @param value 数据
     * @param unit 单位
     */
    public ValueWithUnit(double value, DerivedUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    /**
     * 相加操作，返回结果的单位制以前一个操作数为准
     *
     * @param vwu
     * @return
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
     * 相减操作，返回结果的单位制以前一个操作数为准
     *
     * @param vwu
     * @return
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
     * 相乘操作，结果的单位制为基本单位制，忽略单位转换的附加值
     *
     * 如温度，计算转化为元单位时，只考虑和K的倍数关系
     *
     * @param vwu
     * @return
     */
    public ValueWithUnit multiply(ValueWithUnit vwu) {
        double value1 = this.getBasicValueWithoutAdditional();
        double value2 = vwu.getBasicValueWithoutAdditional();
        double newValue = value1 * value2;
        DerivedUnit newUni = unit.multiply(vwu.getUnit());
        return new ValueWithUnit(newValue, newUni);
    }

    /**
     * 相除操作，结果的单位制为基本单位制，忽略单位转换的附加值
     *
     * 如温度，计算转化为元单位时，只考虑和K的倍数关系
     *
     * @param vwu
     * @return
     */
    public ValueWithUnit divide(ValueWithUnit vwu) {
        double value1 = this.getBasicValueWithoutAdditional();
        double value2 = vwu.getBasicValueWithoutAdditional();
        double newValue = value1 / value2;
        DerivedUnit newUni = unit.divide(vwu.getUnit());
        return new ValueWithUnit(newValue, newUni);
    }

    /**
     * 次方操作，结果的单位制为基本单位制，忽略单位转换的附加值
     *
     * 如温度，计算转化为元单位时，只考虑和K的倍数关系
     *
     * @param pow
     * @return
     */
    public ValueWithUnit power(double pow) {
        double value1 = this.getBasicValueWithoutAdditional();
        double newValue = Math.pow(value1, pow);
        DerivedUnit newUni = unit.power(pow);
        return new ValueWithUnit(newValue, newUni);
    }

    /**
     * 以指定的单位类型表示数据，必须是同一量纲，使用时需自行检查
     *
     * @param destUnit
     * @return
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
     * 以指定的单位类型表示数据，必须是同一量纲，使用时需自行检查
     *
     * 转化时不考虑单位之间的零点关系，仅考虑倍数关系
     *
     * 一般在转化温度时使用，为乘/除/乘方操作的计算值，一般为差值的概念，如：DT、DF等
     *
     * @param destUnit
     * @return
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
     * 获取基本单位制下的结果
     *
     * @return
     */
    public double getBasicValue() {
        return value * unit.getFactor() + unit.getAddition();
    }

    /**
     * 获取基本单位制下的结果，不考虑附加值
     *
     * @return
     */
    public double getBasicValueWithoutAdditional() {
        return value * unit.getFactor();
    }

    @Override
    public String toString() {
        return "ValueWithUnit{" + "value=" + value + ", unit=" + unit + '}';
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @return the unit
     */
    public DerivedUnit getUnit() {
        return unit;
    }

}
