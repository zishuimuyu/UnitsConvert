package com.zishuimuyu.science.units;

/**
 * 单位不相等异常类
 * <P>
 * 当尝试对量纲不同的单位进行加法或减法运算时抛出此异常。
 * <P>
 * 该异常继承自RuntimeException，是一个非受检异常，
 * 表示程序运行时的错误情况，不需要在方法签名中声明。
 * <P>
 * 使用场景：
 * <ul>
 *   <li>尝试将长度单位与质量单位相加时</li>
 *   <li>尝试将时间单位与温度单位相减时</li>
 *   <li>任何量纲不匹配的加减运算</li>
 * </ul>
 * <P>
 * 使用示例：
 * <pre>
 * try {
 *     ValueWithUnit length = new ValueWithUnit(10.0, new ULength_m());
 *     ValueWithUnit mass = new ValueWithUnit(5.0, new UMass_Kg());
 *     ValueWithUnit result = length.add(mass); // 抛出UnitsNotSameException
 * } catch (UnitsNotSameException e) {
 *     System.err.println("错误：" + e.getMessage());
 * }
 * </pre>
 * <P>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UnitsNotSameException extends RuntimeException {

    /**
     * 构造方法，创建一个单位不相等异常实例
     * <P>
     * 该构造方法接收一个错误信息字符串，用于描述异常的具体原因。
     * <P>
     * 典型的错误信息格式：
     * <pre>
     * "The unit [m] is not the same as [Kg]!"
     * "The unit [Kg*m/s^2] is not the same as [Kg]!"
     * </pre>
     *
     * @param info 错误信息字符串，描述异常的具体原因
     */
    public UnitsNotSameException(String info) {
        super(info);
    }

}