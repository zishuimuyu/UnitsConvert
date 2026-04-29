package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：tP（普朗克时间）
 * <p>
 * 普朗克时间是物理学中的基本时间单位，符号为tP。
 * 1普朗克时间定义约为5.39×10⁻⁴⁴秒，是量子引力理论中的时间基本单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 tP ≈ 5.39×10⁻⁴⁴ s（秒）</li>
 *   <li>1 ys ≈ 1.86×10¹⁹ tP（幺秒）</li>
 *   <li>1 zs ≈ 1.86×10²² tP（仄秒）</li>
 *   <li>1 as ≈ 1.86×10²⁶ tP（阿托秒）</li>
 *   <li>1 fs ≈ 1.86×10²⁹ tP（飞秒）</li>
 * </ul>
 * <p>
 * 普朗克时间单位在量子引力、弦理论、宇宙学等领域有重要应用，
 * 用于描述时空量子化效应、黑洞物理、宇宙起源等问题。
 * 是理论物理学中时间的最小有意义单位。
 * <p>
 * 该单位代表了现代物理学中时间的理论极限，低于此时间尺度的事件无法被观测或描述。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTime_tP extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义普朗克时间单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 普朗克时间与秒具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化普朗克时间单位的转换参数。
     * 普朗克时间与秒的转换因子约为5.39×10⁻⁴⁴。
     */
    public UTime_tP() {
        super(
            "普朗克时间",                        // 描述：普朗克时间
            elementList,                    // 基本单位元素列表
            5.39E-44,                   // 转换因子：1 tP ≈ 5.39×10⁻⁴⁴ s
            0.0                           // 偏移量：无偏移
        );
    }
}