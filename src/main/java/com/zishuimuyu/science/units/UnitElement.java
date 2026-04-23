package com.zishuimuyu.science.units;

/**
 * 单位元素类
 * <P>
 * 该类封装了一个基本单位类型及其对应的指数，用于构建复合单位。
 * 在单位系统中，复合单位（如力单位N = Kg·m·s⁻²）由多个基本单位（Kg、m、s）及其指数（1、1、-2）组成。
 * <P>
 * 主要用途：
 * <ul>
 *   <li>构成复合单位：通过多个UnitElement组成一个完整的单位定义</li>
 *   <li>单位运算：在乘、除、幂运算中处理基本单位的指数变化</li>
 *   <li>量纲识别：通过基本单位及其指数确定单位的量纲</li>
 * </ul>
 * <P>
 * 使用示例：
 * <pre>
 * // 定义力单位 N = Kg·m·s⁻²
 * List&lt;UnitElement&gt; elements = new ArrayList&lt;&gt;();
 * elements.add(new UnitElement(BasicUnit.Kg, 1.0)); // 千克，指数1
 * elements.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
 * elements.add(new UnitElement(BasicUnit.s, -2.0)); // 秒，指数-2
 * </pre>
 * <P>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public final class UnitElement {

    /**
     * 基本单位类型
     * <P>
     * 表示国际单位制的7个基本单位之一：
     * 长度(m)、质量(Kg)、时间(s)、电流(A)、温度(K)、物质的量(mol)、发光强度(cd)
     * 这些基本单位构成了所有导出单位的基础。
     */
    private BasicUnit unit;

    /**
     * 指数值
     * <P>
     * 表示该基本单位在复合单位中的指数。
     * 正数表示该单位在分子中，负数表示该单位在分母中。
     * 例如：速度单位 m/s 中，m的指数为1，s的指数为-1。
     */
    private double exp;

    /**
     * 推荐的构造方法
     * <P>
     * 通过指定基本单位类型和指数来创建单位元素实例。
     *
     * @param unit 基本单位类型，来自BasicUnit枚举
     * @param exp 指数值，可以是正数、负数或小数
     */
    public UnitElement(BasicUnit unit, double exp) {
        this.unit = unit;
        this.exp = exp;
    }

    /**
     * 默认构造方法
     * <P>
     * 创建一个空的单位元素实例，单位和指数都需要后续设置。
     * 一般情况下推荐使用带参数的构造方法。
     */
    public UnitElement() {
    }

    /**
     * 创建当前单位元素的副本
     * <P>
     * 该方法创建一个新的UnitElement实例，具有与当前实例相同的单位类型和指数。
     * 用于避免对原对象的意外修改。
     *
     * @return 当前单位元素的一个新副本
     */
    public UnitElement copy() {
        return new UnitElement(unit, exp);
    }

    /**
     * 比较两个单位元素是否相等
     * <P>
     * 该方法检查另一个单位元素是否与当前元素在单位类型和指数上相等。
     * 指数的比较使用DoubleUtils.isSame方法，考虑浮点数精度问题。
     *
     * @param obj 待比较的单位元素对象
     * @return 如果两个单位元素的单位类型相同且指数相等（在容差范围内），返回true；否则返回false
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

    /**
     * 获取对象的字符串表示
     * <P>
     * 返回包含单位类型和指数信息的字符串，主要用于调试和日志记录。
     *
     * @return 包含单位类型和指数信息的字符串
     */
    @Override
    public String toString() {
        return "UnitElement{" + "unit=" + unit + ", exp=" + exp + '}';
    }

    /**
     * 获取基本单位类型
     * <P>
     * 返回该单位元素所表示的基本单位类型。
     *
     * @return 基本单位类型
     */
    public BasicUnit getUnit() {
        return unit;
    }

    /**
     * 设置基本单位类型
     * <P>
     * 设置该单位元素的基本单位类型。
     *
     * @param unit 基本单位类型
     */
    public void setUnit(BasicUnit unit) {
        this.unit = unit;
    }

    /**
     * 获取指数值
     * <P>
     * 返回该单位元素的指数值。
     *
     * @return 指数值
     */
    public double getExp() {
        return exp;
    }

    /**
     * 设置指数值
     * <P>
     * 设置该单位元素的指数值。
     *
     * @param exp 指数值
     */
    public void setExp(double exp) {
        this.exp = exp;
    }

}