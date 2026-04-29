package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：μg（微克）
 * <p>
 * 微克是国际单位制质量单位，符号为μg。
 * 1微克定义为1克的百万分之一，即1千克的十亿分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 μg = 10⁻⁶ g = 10⁻⁹ kg（千克）</li>
 *   <li>1 mg = 1000 μg（毫克）</li>
 *   <li>1 g = 1,000,000 μg（克）</li>
 *   <li>1 ng = 0.001 μg（纳克）</li>
 *   <li>1 μg ≈ 15.43 gr（格令）</li>
 * </ul>
 * <p>
 * 微克单位在医学、药学、化学、生物学等领域有广泛应用，
 * 用于测量微量物质的重量，如药物剂量、微量元素含量等。
 * 在医学检验、精密化学分析中经常使用。
 * <p>
 * 该单位适合表达极小的质量值，是精密测量的重要单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_ug extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义微克单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 微克与千克具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化微克单位的转换参数。
     * 微克与千克的转换因子为10⁻⁹。
     */
    public UMass_ug() {
        super(
            "微克",                          // 描述：微克
            elementList,                    // 基本单位元素列表
            1.0E-9,                       // 转换因子：1 μg = 10⁻⁹ kg
            0.0                           // 偏移量：无偏移
        );
    }
}