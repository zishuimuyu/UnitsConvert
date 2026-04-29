package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：ag（阿托克）
 * <p>
 * 阿托克是国际单位制质量单位，符号为ag。
 * 1阿托克定义为1克的百亿亿分之一，即1千克的百亿亿分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ag = 10⁻²¹ kg = 10⁻¹⁸ g（千克、克）</li>
 *   <li>1 fg = 1000 ag（飞克）</li>
 *   <li>1 pg = 1,000,000 ag（皮克）</li>
 *   <li>1 zg = 0.001 ag（仄克）</li>
 *   <li>1 ag ≈ 1.543×10¹³ gr（格令）</li>
 * </ul>
 * <p>
 * 阿托克单位在理论物理学、粒子物理学、分子动力学等领域有广泛应用，
 * 用于测量基本粒子、电子、质子等亚原子粒子的质量。
 * 在量子物理研究、基本粒子特性分析中经常使用。
 * <p>
 * 该单位适合表达基本粒子级别的质量值，是理论物理的重要单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_ag extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义阿托克单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 阿托克与千克具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化阿托克单位的转换参数。
     * 阿托克与千克的转换因子为10⁻²¹。
     */
    public UMass_ag() {
        super(
            "阿托克",                         // 描述：阿托克
            elementList,                    // 基本单位元素列表
            1.0E-21,                      // 转换因子：1 ag = 10⁻²¹ kg
            0.0                           // 偏移量：无偏移
        );
    }
}