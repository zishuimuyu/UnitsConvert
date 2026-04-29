package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：M☉（太阳质量）
 * <p>
 * 太阳质量是非国际单位制质量单位，符号为M☉（Solar Mass）。
 * 1太阳质量定义为太阳的实际质量，是天文学中的标准质量单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 M☉ ≈ 1.98847×10³⁰ kg（千克）</li>
 *   <li>1 Earth Mass ≈ 3.003×10⁻⁶ M☉（地球质量）</li>
 *   <li>1 Jupiter Mass ≈ 9.546×10⁻⁴ M☉（木星质量）</li>
 *   <li>1 Lunar Mass ≈ 3.694×10⁻⁸ M☉（月球质量）</li>
 *   <li>1 M☉ ≈ 2.2×10³⁰ lb（磅）</li>
 * </ul>
 * <p>
 * 太阳质量单位在天文学、宇宙学、行星科学等领域有广泛应用，
 * 用于表示恒星、星系、黑洞以及其他天体的质量。
 * 该单位提供了衡量宇宙中巨大质量的便捷方式。
 * <p>
 * 该单位在天体物理学中极其重要，是衡量宇宙天体质量的标准参照。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_MSun extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义太阳质量单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 太阳质量与千克具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化太阳质量单位的转换参数。
     * 太阳质量与千克的转换因子约为1.98847×10³⁰。
     */
    public UMass_MSun() {
        super(
            "太阳质量",                        // 描述：太阳质量
            elementList,                    // 基本单位元素列表
            1.98847E30,                 // 转换因子：1 M☉ ≈ 1.98847×10³⁰ kg
            0.0                           // 偏移量：无偏移
        );
    }
}