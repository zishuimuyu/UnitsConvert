package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：ME（地球质量）
 * <p>
 * 地球质量是非国际单位制质量单位，符号为ME（Earth Mass）。
 * 1地球质量定义为地球的实际质量，是天文学中的标准质量单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ME ≈ 5.972×10²⁴ kg（千克）</li>
 *   <li>1 M☉ ≈ 332946 ME（太阳质量）</li>
 *   <li>1 Jupiter Mass ≈ 317.8 ME（木星质量）</li>
 *   <li>1 Lunar Mass ≈ 0.0123 ME（月球质量）</li>
 *   <li>1 ME ≈ 1.32×10²⁵ lb（磅）</li>
 * </ul>
 * <p>
 * 地球质量单位在天文学、行星科学、宇宙学等领域有广泛应用，
 * 用于表示行星、卫星以及其他天体的质量。
 * 该单位提供了衡量太阳系天体质量的便捷方式。
 * <p>
 * 该单位在行星物理学中极其重要，是衡量行星质量的标准参照。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_ME extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义地球质量单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 地球质量与千克具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化地球质量单位的转换参数。
     * 地球质量与千克的转换因子约为5.972×10²⁴。
     */
    public UMass_ME() {
        super(
            "地球质量",                        // 描述：地球质量
            elementList,                    // 基本单位元素列表
            5.972E24,                   // 转换因子：1 ME ≈ 5.972×10²⁴ kg
            0.0                           // 偏移量：无偏移
        );
    }
}