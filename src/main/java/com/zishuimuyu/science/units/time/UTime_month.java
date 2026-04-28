package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：month（月）
 * <p>
 * 月是时间单位，符号为month。
 * 1月定义为约30.44天，即2,629,800秒（基于格里高利历平均值）。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 month ≈ 2,629,800 s（秒）</li>
 *   <li>1 month ≈ 4.35 weeks（周）</li>
 *   <li>1 month ≈ 30.44 days（天）</li>
 *   <li>1 month ≈ 730.5 hours（小时）</li>
 *   <li>1 year = 12 months（年）</li>
 *   <li>1 quarter = 3 months（季度）</li>
 * </ul>
 * <p>
 * 月单位在日常生活、金融、法律、计划安排、天文等领域有广泛应用，
 * 用于测量较长的时间间隔，如租期、贷款期限、合同期间等。
 * 月是人类社会活动和自然周期的重要时间单位。
 * <p>
 * 该单位基于格里高利历平均月份长度。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UTime_month extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义月单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 月是时间单位，1月约等于2,629,800秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将月数值转换为标准单位（秒）的数值。
     * 由于1month ≈ 2,629,800s（基于平均每月30.44天），所以factor = 2629800.0。
     * 这意味着1月约等于2,629,800秒。
     */
    private final static double factor = 2629800.0;

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
    private final static String description = "month";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立月单位与基本单位的关系。
     * 月是时间单位，由秒单位构成。
     */
    static {
        // 秒，指数1
        elementList.add(new UnitElement(BasicUnit.s, 1.0));
    }

    /**
     * 构造函数，创建一个月时间单位(month)实例
     * <p>
     * 初始化月时间单位，设置单位符号为"month"，基本单位组成为s，
     * 转换因子为2629800.0（即1month ≈ 2,629,800s），无附加偏移量。
     */
    public UTime_month() {
        // 调用父类DerivedUnit的构造方法，初始化月时间单位
        // 参数依次为：单位描述("month")、基本单位元素列表([s^1])、转换因子(2629800.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}