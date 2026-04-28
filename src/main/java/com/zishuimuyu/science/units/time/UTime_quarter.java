package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：quarter（季度）
 * <p>
 * 季度是时间单位，符号为quarter。
 * 1季度定义为3个月，即约7,889,400秒（基于格里高利历平均值）。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 quarter ≈ 7,889,400 s（秒）</li>
 *   <li>1 quarter ≈ 13.04 weeks（周）</li>
 *   <li>1 quarter ≈ 91.31 days（天）</li>
 *   <li>1 quarter ≈ 2,191.5 hours（小时）</li>
 *   <li>1 quarter = 3 months（月）</li>
 *   <li>1 year = 4 quarters（年）</li>
 * </ul>
 * <p>
 * 季度单位在商业、金融、会计、经济分析等领域有广泛应用，
 * 用于测量中期的时间间隔，如财务报告周期、预算周期、绩效评估周期等。
 * 季度是商业和经济活动中重要的时间划分单位。
 * <p>
 * 该单位基于格里高利历平均季度长度。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UTime_quarter extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义季度单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 季度是时间单位，1季度约等于7,889,400秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将季度数值转换为标准单位（秒）的数值。
     * 由于1quarter ≈ 7,889,400s（基于平均每季度91.31天），所以factor = 7889400.0。
     * 这意味着1季度约等于7,889,400秒。
     */
    private final static double factor = 7889400.0;

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
    private final static String description = "quarter";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立季度单位与基本单位的关系。
     * 季度是时间单位，由秒单位构成。
     */
    static {
        // 秒，指数1
        elementList.add(new UnitElement(BasicUnit.s, 1.0));
    }

    /**
     * 构造函数，创建一个季度时间单位(quarter)实例
     * <p>
     * 初始化季度时间单位，设置单位符号为"quarter"，基本单位组成为s，
     * 转换因子为7889400.0（即1quarter ≈ 7,889,400s），无附加偏移量。
     */
    public UTime_quarter() {
        // 调用父类DerivedUnit的构造方法，初始化季度时间单位
        // 参数依次为：单位描述("quarter")、基本单位元素列表([s^1])、转换因子(7889400.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}