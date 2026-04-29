package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：u（原子质量单位/道尔顿）
 * <p>
 * 原子质量单位是非国际单位制质量单位，符号为u或Da（道尔顿）。
 * 1原子质量单位定义为碳-12原子质量的十二分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 u ≈ 1.66053906660×10⁻²⁷ kg（千克）</li>
 *   <li>1 g ≈ 6.02214076×10²³ u（克）</li>
 *   <li>1 Da = 1 u（道尔顿）</li>
 *   <li>1 me ≈ 5.4857990904×10⁻⁴ u（电子静止质量）</li>
 *   <li>1 mol ≈ 6.02214076×10²³ g/u（阿伏伽德罗常数）</li>
 * </ul>
 * <p>
 * 原子质量单位在原子物理学、分子生物学、生物化学、质谱学等领域有广泛应用，
 * 用于表示原子、分子、离子等微观粒子的质量。
 * 在蛋白质、DNA、RNA等生物大分子的质量测定中经常使用。
 * <p>
 * 该单位专门为微观粒子质量测量而设计，是量子和分子层面的重要单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_u extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义原子质量单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 原子质量单位与千克具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化原子质量单位的转换参数。
     * 原子质量单位与千克的转换因子约为1.66053906660×10⁻²⁷。
     */
    public UMass_u() {
        super(
            "原子质量单位",                     // 描述：原子质量单位
            elementList,                    // 基本单位元素列表
            1.66053906660E-27,          // 转换因子：1 u ≈ 1.66053906660×10⁻²⁷ kg
            0.0                           // 偏移量：无偏移
        );
    }
}