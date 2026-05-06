package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：zs（仄秒）
 * <p>
 * 仄秒是国际单位制时间单位，符号为zs。
 * 1仄秒定义为10⁻²¹秒，是国际单位制中极短的时间单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 zs = 10⁻²¹ s（秒）</li>
 *   <li>1 zs = 1,000 ys（幺秒）</li>
 *   <li>1 as = 1,000 zs（阿托秒）</li>
 *   <li>1 fs = 10⁶ zs（飞秒）</li>
 *   <li>1 ps = 10⁹ zs（皮秒）</li>
 * </ul>
 * <p>
 * 仄秒单位在理论物理学、量子力学等领域有潜在应用，
 * 用于测量极其短暂的时间间隔。
 * 该单位目前主要用于理论计算和科学研究。
 * <p>
 * 该单位是人类所能测量的最短时间尺度之一。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年05月06日
 */
public class UTime_zs extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义仄秒单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 仄秒与秒具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化仄秒单位的转换参数。
     * 仄秒与秒的转换因子为10⁻²¹。
     */
    public UTime_zs() {
        super(
            "仄秒",                        // 描述：仄秒
            elementList,                    // 基本单位元素列表
            1.0E-21,                    // 转换因子：1 zs = 10⁻²¹ s
            0.0                           // 偏移量：无偏移
        );
    }
}