package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：ps（皮秒）
 * <p>
 * 皮秒是时间单位，符号为ps。
 * 1皮秒定义为0.000000000001秒，即1秒的万亿分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ps = 1×10⁻¹² s（秒）</li>
 *   <li>1 ps = 0.001 ns（纳秒）</li>
 *   <li>1 ns = 1000 ps</li>
 *   <li>1 μs = 1,000,000 ps</li>
 *   <li>1 ms = 1,000,000,000 ps</li>
 *   <li>1 s = 1,000,000,000,000 ps</li>
 * </ul>
 * <p>
 * 皮秒单位在光学、激光技术、高速电子学、分子动力学等领域有广泛应用，
 * 用于测量极短的时间间隔，如激光脉冲持续时间、化学反应时间、
 * 分子振动周期等。
 * 在现代科学研究中，皮秒是研究超快过程的重要时间单位。
 * <p>
 * 该单位适合表示超短的时间间隔。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UTime_ps extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义皮秒单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 皮秒是时间单位，1皮秒等于0.000000000001秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将皮秒数值转换为标准单位（秒）的数值。
     * 由于1ps = 0.000000000001s，所以factor = 0.000000000001。
     * 这意味着1皮秒等于0.000000000001秒。
     */
    private final static double factor = 0.000000000001;

    /**
     * 附加偏移量
     * <p>
     * 时间单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "ps";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立皮秒单位与基本单位的关系。
     * 皮秒是时间单位，由秒单位构成。
     */
    static {
        // 秒，指数1
        elementList.add(new UnitElement(BasicUnit.s, 1.0));
    }

    /**
     * 构造函数，创建一个皮秒时间单位(ps)实例
     * <p>
     * 初始化皮秒时间单位，设置单位符号为"ps"，基本单位组成为s，
     * 转换因子为0.000000000001（即1ps = 0.000000000001s），无附加偏移量。
     */
    public UTime_ps() {
        // 调用父类DerivedUnit的构造方法，初始化皮秒时间单位
        // 参数依次为：单位描述("ps")、基本单位元素列表([s^1])、转换因子(0.000000000001)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}