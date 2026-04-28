package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：megaannum（百万年）
 * <p>
 * 百万年是时间单位，符号为megaannum（Ma）。
 * 1百万年定义为1,000,000年，即约31,557,600,000,000秒。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 megaannum ≈ 31,557,600,000,000 s（秒）</li>
 *   <li>1 megaannum ≈ 52,180,000 weeks（周）</li>
 *   <li>1 megaannum = 365,250,000 days（天）</li>
 *   <li>1 megaannum = 8,766,000,000 hours（小时）</li>
 *   <li>1 megaannum = 12,000,000 months（月）</li>
 *   <li>1 megaannum = 4,000,000 quarters（季度）</li>
 *   <li>1 megaannum = 1,000,000 years（年）</li>
 *   <li>1 megaannum = 10,000 centuries（世纪）</li>
 *   <li>1 megaannum = 1,000 millennia（千年）</li>
 * </ul>
 * <p>
 * 百万年单位在地质学、古生物学、宇宙学、进化生物学等领域有广泛应用，
 * 用于测量极长时间间隔，如地质时代、物种进化、星系演化等。
 * 百万年是描述地球历史和宇宙演化的重要时间单位。
 * <p>
 * 该单位基于1,000,000个儒略年（每个365.25天）。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UTime_megaannum extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义百万年单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 百万年是时间单位，1百万年约等于31,557,600,000,000秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将百万年数值转换为标准单位（秒）的数值。
     * 由于1megaannum ≈ 31,557,600,000,000s（基于1,000,000年×365.25天/年），所以factor = 31557600000000.0。
     * 这意味着1百万年约等于31,557,600,000,000秒。
     */
    private final static double factor = 31557600000000.0;

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
    private final static String description = "megaannum";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立百万年单位与基本单位的关系。
     * 百万年是时间单位，由秒单位构成。
     */
    static {
        // 秒，指数1
        elementList.add(new UnitElement(BasicUnit.s, 1.0));
    }

    /**
     * 构造函数，创建一个百万年时间单位(megaannum)实例
     * <p>
     * 初始化百万年时间单位，设置单位符号为"megaannum"，基本单位组成为s，
     * 转换因子为31557600000000.0（即1megaannum ≈ 31,557,600,000,000s），无附加偏移量。
     */
    public UTime_megaannum() {
        // 调用父类DerivedUnit的构造方法，初始化百万年时间单位
        // 参数依次为：单位描述("megaannum")、基本单位元素列表([s^1])、转换因子(31557600000000.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}