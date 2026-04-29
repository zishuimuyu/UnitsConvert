package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：ng（纳克）
 * <p>
 * 纳克是国际单位制质量单位，符号为ng。
 * 1纳克定义为1克的十亿分之一，即1千克的十亿分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ng = 10⁻¹² kg = 10⁻⁹ g（千克、克）</li>
 *   <li>1 μg = 1000 ng（微克）</li>
 *   <li>1 mg = 1,000,000 ng（毫克）</li>
 *   <li>1 pg = 0.001 ng（皮克）</li>
 *   <li>1 ng ≈ 15432.36 gr（格令）</li>
 * </ul>
 * <p>
 * 纳克单位在医学、药学、化学、生物学等领域有广泛应用，
 * 用于测量极微量物质的重量，如激素、毒素、药物活性成分等。
 * 在精密化学分析、环境污染物检测中经常使用。
 * <p>
 * 该单位适合表达极小的质量值，是超精密测量的重要单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_ng extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义纳克单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 纳克与千克具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化纳克单位的转换参数。
     * 纳克与千克的转换因子为10⁻¹²。
     */
    public UMass_ng() {
        super(
            "纳克",                          // 描述：纳克
            elementList,                    // 基本单位元素列表
            1.0E-12,                      // 转换因子：1 ng = 10⁻¹² kg
            0.0                           // 偏移量：无偏移
        );
    }
}