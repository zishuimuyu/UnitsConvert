package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：shichen（时辰）
 * <p>
 * 时辰是中国古代计时单位，符号为shichen。
 * 1时辰定义为7200秒，相当于2小时，是中国古代十二时辰制的基本单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 shichen = 7200 s（秒）</li>
 *   <li>1 shichen = 120 min（分钟）</li>
 *   <li>1 shichen = 2 h（小时）</li>
 *   <li>1 day = 12 shichen（天）</li>
 *   <li>1 shichen = 8 ke（刻）</li>
 * </ul>
 * <p>
 * 时辰单位在中国古代广泛应用于天文观测、农事安排、政务管理、医学诊断等领域，
 * 是中国古代时间系统的核心概念。
 * 每个时辰对应不同的动物（子鼠、丑牛、寅虎等），形成十二生肖。
 * <p>
 * 该单位体现了中国古代对时间与自然规律结合的深刻理解，至今仍在中国传统文化中发挥重要作用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTime_shichen extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义时辰单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 时辰与秒具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，设置单位的量纲构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.s, 1));  // 秒：时间维度
    }

    /**
     * 构造函数
     * <p>
     * 初始化时辰单位的转换参数。
     * 时辰与秒的转换因子为7200。
     */
    public UTime_shichen() {
        super(
            "时辰",                          // 描述：时辰
            elementList,                    // 基本单位元素列表
            7200.0,                       // 转换因子：1 shichen = 7200 s
            0.0                           // 偏移量：无偏移
        );
    }
}