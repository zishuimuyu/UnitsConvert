package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：millennium（千年）
 * <p>
 * 千年是时间单位，符号为millennium。
 * 1千年定义为1000年，即约31,557,600,000秒。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 millennium ≈ 31,557,600,000 s（秒）</li>
 *   <li>1 millennium ≈ 52,180 weeks（周）</li>
 *   <li>1 millennium = 365,250 days（天）</li>
 *   <li>1 millennium = 8,766,000 hours（小时）</li>
 *   <li>1 millennium = 12,000 months（月）</li>
 *   <li>1 millennium = 4,000 quarters（季度）</li>
 *   <li>1 millennium = 1,000 years（年）</li>
 *   <li>1 millennium = 10 centuries（世纪）</li>
 * </ul>
 * <p>
 * 千年单位在历史、地质学、考古学、长期规划等领域有广泛应用，
 * 用于测量极长的时间间隔，如文明兴衰、地质时代、进化历程等。
 * 千年是描述重大历史事件和自然演化的宏观时间单位。
 * <p>
 * 该单位基于1000个儒略年（每个365.25天）。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UTime_millennium extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义千年单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 千年是时间单位，1千年约等于31,557,600,000秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将千年数值转换为标准单位（秒）的数值。
     * 由于1millennium ≈ 31,557,600,000s（基于1000年×365.25天/年），所以factor = 31557600000.0。
     * 这意味着1千年约等于31,557,600,000秒。
     */
    private final static double factor = 31557600000.0;

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
    private final static String description = "millennium";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立千年单位与基本单位的关系。
     * 千年是时间单位，由秒单位构成。
     */
    static {
        // 秒，指数1
        elementList.add(new UnitElement(BasicUnit.s, 1.0));
    }

    /**
     * 构造函数，创建一个千年时间单位(millennium)实例
     * <p>
     * 初始化千年时间单位，设置单位符号为"millennium"，基本单位组成为s，
     * 转换因子为31557600000.0（即1millennium ≈ 31,557,600,000s），无附加偏移量。
     */
    public UTime_millennium() {
        // 调用父类DerivedUnit的构造方法，初始化千年时间单位
        // 参数依次为：单位描述("millennium")、基本单位元素列表([s^1])、转换因子(31557600000.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}