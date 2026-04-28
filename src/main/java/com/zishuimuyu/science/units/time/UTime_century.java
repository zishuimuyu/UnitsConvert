package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：century（世纪）
 * <p>
 * 世纪是时间单位，符号为century。
 * 1世纪定义为100年，即约3,155,760,000秒。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 century ≈ 3,155,760,000 s（秒）</li>
 *   <li>1 century ≈ 5,218 weeks（周）</li>
 *   <li>1 century = 36,525 days（天）</li>
 *   <li>1 century = 876,600 hours（小时）</li>
 *   <li>1 century = 1,200 months（月）</li>
 *   <li>1 century = 400 quarters（季度）</li>
 *   <li>1 century = 100 years（年）</li>
 *   <li>1 millennium = 10 centuries（千年）</li>
 * </ul>
 * <p>
 * 世纪单位在历史、地质学、考古学、长期规划等领域有广泛应用，
 * 用于测量非常长的时间间隔，如历史时期划分、文明发展进程等。
 * 世纪是描述人类历史和自然演化的重要时间单位。
 * <p>
 * 该单位基于100个儒略年（每个365.25天）。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UTime_century extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义世纪单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 世纪是时间单位，1世纪约等于3,155,760,000秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将世纪数值转换为标准单位（秒）的数值。
     * 由于1century ≈ 3,155,760,000s（基于100年×365.25天/年），所以factor = 3155760000.0。
     * 这意味着1世纪约等于3,155,760,000秒。
     */
    private final static double factor = 3155760000.0;

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
    private final static String description = "century";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立世纪单位与基本单位的关系。
     * 世纪是时间单位，由秒单位构成。
     */
    static {
        // 秒，指数1
        elementList.add(new UnitElement(BasicUnit.s, 1.0));
    }

    /**
     * 构造函数，创建一个世纪时间单位(century)实例
     * <p>
     * 初始化世纪时间单位，设置单位符号为"century"，基本单位组成为s，
     * 转换因子为3155760000.0（即1century ≈ 3,155,760,000s），无附加偏移量。
     */
    public UTime_century() {
        // 调用父类DerivedUnit的构造方法，初始化世纪时间单位
        // 参数依次为：单位描述("century")、基本单位元素列表([s^1])、转换因子(3155760000.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}