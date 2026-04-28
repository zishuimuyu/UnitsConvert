package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：fs（飞秒）
 * <p>
 * 飞秒是时间单位，符号为fs。
 * 1飞秒定义为0.000000000000001秒，即1秒的千万亿分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 fs = 1×10⁻¹⁵ s（秒）</li>
 *   <li>1 fs = 0.001 ps（皮秒）</li>
 *   <li>1 ps = 1000 fs</li>
 *   <li>1 ns = 1,000,000 fs</li>
 *   <li>1 μs = 1,000,000,000 fs</li>
 *   <li>1 s = 1,000,000,000,000,000 fs</li>
 * </ul>
 * <p>
 * 飞秒单位在激光科学、超快光谱学、分子动力学、原子物理学等领域有广泛应用，
 * 用于测量极短的时间间隔，如化学键形成和断裂过程、电子运动过程、
 * 分子内能转移等。
 * 在现代科学研究中，飞秒是研究原子和分子层面超快过程的重要时间单位。
 * <p>
 * 该单位适合表示极短的时间间隔。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UTime_fs extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义飞秒单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 飞秒是时间单位，1飞秒等于0.000000000000001秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将飞秒数值转换为标准单位（秒）的数值。
     * 由于1fs = 0.000000000000001s，所以factor = 0.000000000000001。
     * 这意味着1飞秒等于0.000000000000001秒。
     */
    private final static double factor = 0.000000000000001;

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
    private final static String description = "fs";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立飞秒单位与基本单位的关系。
     * 飞秒是时间单位，由秒单位构成。
     */
    static {
        // 秒，指数1
        elementList.add(new UnitElement(BasicUnit.s, 1.0));
    }

    /**
     * 构造函数，创建一个飞秒时间单位(fs)实例
     * <p>
     * 初始化飞秒时间单位，设置单位符号为"fs"，基本单位组成为s，
     * 转换因子为0.000000000000001（即1fs = 0.000000000000001s），无附加偏移量。
     */
    public UTime_fs() {
        // 调用父类DerivedUnit的构造方法，初始化飞秒时间单位
        // 参数依次为：单位描述("fs")、基本单位元素列表([s^1])、转换因子(0.000000000000001)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}