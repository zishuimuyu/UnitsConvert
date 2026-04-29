package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：fg（飞克）
 * <p>
 * 飞克是国际单位制质量单位，符号为fg。
 * 1飞克定义为1克的千万亿分之一，即1千克的千万亿分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 fg = 10⁻¹⁸ kg = 10⁻¹⁵ g（千克、克）</li>
 *   <li>1 pg = 1000 fg（皮克）</li>
 *   <li>1 ng = 1,000,000,000 fg（纳克）</li>
 *   <li>1 ag = 0.001 fg（阿托克）</li>
 *   <li>1 fg ≈ 1.543×10¹⁰ gr（格令）</li>
 * </ul>
 * <p>
 * 飞克单位在分子物理学、原子物理学、量子生物学等领域有广泛应用，
 * 用于测量单个分子、原子团簇、纳米颗粒等的重量。
 * 在超高精度质量测量、单分子研究中经常使用。
 * <p>
 * 该单位适合表达原子级别的质量值，是量子科学的重要单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_fg extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义飞克单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 飞克与千克具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，设置单位的量纲构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1));  // 千克：质量维度
    }

    /**
     * 构造函数
     * <p>
     * 初始化飞克单位的转换参数。
     * 飞克与千克的转换因子为10⁻¹⁸。
     */
    public UMass_fg() {
        super(
            "飞克",                          // 描述：飞克
            elementList,                    // 基本单位元素列表
            1.0E-18,                      // 转换因子：1 fg = 10⁻¹⁸ kg
            0.0                           // 偏移量：无偏移
        );
    }
}