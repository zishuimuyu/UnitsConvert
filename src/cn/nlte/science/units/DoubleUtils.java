package cn.nlte.science.units;

/**
 * 浮点数工具类，提供本包中特定的数学操作
 * <P>
 * 该类主要用于处理浮点数精度问题，在进行浮点数比较时，
 * 由于计算机浮点数存储的特性，不能直接使用==运算符，
 * 而需要判断两个数的差值是否在允许的误差范围内。
 * <P>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class DoubleUtils {

    /**
     * 浮点数比较的误差容忍度
     * <P>
     * 当两个浮点数的差的绝对值小于等于此值时，认为这两个数相等。
     * 该值设置为1E-8（0.00000001），适用于大多数工程计算场景。
     */
    public static final double DEVIATION = 1E-8;

    /**
     * 判断在指定误差条件下，两浮点数是否相等
     * <P>
     * 该方法通过计算两个数的差的绝对值，并与预设的误差容忍度进行比较，
     * 来判断两个浮点数是否相等。这是处理浮点数精度问题的标准方法。
     * <P>
     * 使用示例：
     * <pre>
     * double a = 0.1 + 0.2;
     * double b = 0.3;
     * boolean result = DoubleUtils.isSame(a, b); // 返回true
     * </pre>
     *
     * @param num1 第一个浮点数
     * @param num2 第二个浮点数
     * @return 如果两个数的差的绝对值小于等于DEVIATION，返回true；否则返回false
     */
    public static boolean isSame(double num1, double num2) {
        return Math.abs(num1 - num2) <= DEVIATION;
    }

}