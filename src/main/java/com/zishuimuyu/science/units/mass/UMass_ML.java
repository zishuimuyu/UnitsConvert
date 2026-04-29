package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：ML（月球质量）
 * <p>
 * 月球质量是非国际单位制质量单位，符号为ML（Lunar Mass）。
 * 1月球质量定义为月球的实际质量，是天文学中的标准质量单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ML ≈ 7.342×10²² kg（千克）</li>
 *   <li>1 ME ≈ 81.3 ML（地球质量）</li>
 *   <li>1 M☉ ≈ 2.707×10⁷ ML（太阳质量）</li>
 *   <li>1 Jupiter Mass ≈ 2.589×10⁴ ML（木星质量）</li>
 *   <li>1 ML ≈ 1.62×10²³ lb（磅）</li>
 * </ul>
 * <p>
 * 月球质量单位在天文学、行星科学、月球研究等领域有广泛应用，
 * 用于表示月球、小行星以及其他较小天体的质量。
 * 该单位提供了衡量较小天体质量的便捷方式。
 * <p>
 * 该单位在月球物理学中极其重要，是衡量月球系统质量的标准参照。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_ML extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义月球质量单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 月球质量与千克具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化月球质量单位的转换参数。
     * 月球质量与千克的转换因子约为7.342×10²²。
     */
    public UMass_ML() {
        super(
            "月球质量",                        // 描述：月球质量
            elementList,                    // 基本单位元素列表
            7.342E22,                 // 转换因子：1 ML ≈ 7.342×10²² kg
            0.0                           // 偏移量：无偏移
        );
    }
}