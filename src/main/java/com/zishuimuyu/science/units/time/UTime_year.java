package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：year（年）
 * <p>
 * 年是时间单位，符号为year。
 * 1年定义为365.25天（考虑闰年的平均值），即约31,557,600秒。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 year ≈ 31,557,600 s（秒）</li>
 *   <li>1 year ≈ 52.18 weeks（周）</li>
 *   <li>1 year = 365.25 days（天）</li>
 *   <li>1 year = 8,766 hours（小时）</li>
 *   <li>1 year = 12 months（月）</li>
 *   <li>1 year = 4 quarters（季度）</li>
 *   <li>1 century = 100 years（世纪）</li>
 * </ul>
 * <p>
 * 年单位在日常生活、历史、天文、法律、计划安排等领域有广泛应用，
 * 用于测量长期的时间间隔，如年龄、合同年限、历史时期等。
 * 年是基于地球绕太阳公转周期的重要时间单位。
 * <p>
 * 该单位基于儒略年平均长度（365.25天）。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UTime_year extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义年单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 年是时间单位，1年约等于31,557,600秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将年数值转换为标准单位（秒）的数值。
     * 由于1year ≈ 31,557,600s（基于平均每年365.25天），所以factor = 31557600.0。
     * 这意味着1年约等于31,557,600秒。
     */
    private final static double factor = 31557600.0;

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
    private final static String description = "year";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立年单位与基本单位的关系。
     * 年是时间单位，由秒单位构成。
     */
    static {
        // 秒，指数1
        elementList.add(new UnitElement(BasicUnit.s, 1.0));
    }

    /**
     * 构造函数，创建一个年时间单位(year)实例
     * <p>
     * 初始化年时间单位，设置单位符号为"year"，基本单位组成为s，
     * 转换因子为31557600.0（即1year ≈ 31,557,600s），无附加偏移量。
     */
    public UTime_year() {
        // 调用父类DerivedUnit的构造方法，初始化年时间单位
        // 参数依次为：单位描述("year")、基本单位元素列表([s^1])、转换因子(31557600.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}