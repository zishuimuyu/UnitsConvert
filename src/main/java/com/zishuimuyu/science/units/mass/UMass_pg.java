package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：pg（皮克）
 * <p>
 * 皮克是国际单位制质量单位，符号为pg。
 * 1皮克定义为1克的一万亿分之一，即1千克的一万亿分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 pg = 10⁻¹⁵ kg = 10⁻¹² g（千克、克）</li>
 *   <li>1 ng = 1000 pg（纳克）</li>
 *   <li>1 μg = 1,000,000 pg（微克）</li>
 *   <li>1 fg = 0.001 pg（飞克）</li>
 *   <li>1 pg ≈ 1.543×10⁷ gr（格令）</li>
 * </ul>
 * <p>
 * 皮克单位在分子生物学、基因组学、纳米技术等领域有广泛应用，
 * 用于测量单个细胞、病毒颗粒、DNA片段等的重量。
 * 在生物分子定量分析、单分子检测中经常使用。
 * <p>
 * 该单位适合表达分子级别的质量值，是纳米科学的重要单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_pg extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义皮克单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 皮克与千克具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化皮克单位的转换参数。
     * 皮克与千克的转换因子为10⁻¹⁵。
     */
    public UMass_pg() {
        super(
            "皮克",                          // 描述：皮克
            elementList,                    // 基本单位元素列表
            1.0E-15,                      // 转换因子：1 pg = 10⁻¹⁵ kg
            0.0                           // 偏移量：无偏移
        );
    }
}