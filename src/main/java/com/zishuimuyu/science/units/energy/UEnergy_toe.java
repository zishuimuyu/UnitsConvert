package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：toe（吨油当量）
 * <p>
 * 吨油当量是非国际单位制的能量单位，符号为toe。
 * 1吨油当量定义为1吨原油完全燃烧释放的能量。
 * 国际上通常定义1 toe = 41.868 GJ（吉焦）。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 toe = 41.868 GJ = 41,868,000,000 J（焦耳）</li>
 *   <li>1 kgoe = 0.001 toe（千克油当量）</li>
 *   <li>1 toe ≈ 11,630 kWh（千瓦时）</li>
 *   <li>1 toe ≈ 10,000 kcal（千卡）</li>
 *   <li>1 toe ≈ 39,683,000 BTU（英热单位）</li>
 * </ul>
 * <p>
 * 吨油当量单位在国际能源统计、经济分析、能源政策制定等领域有广泛应用，
 * 用于统一计算不同能源品种的消耗量和效率，
 * 是国际能源机构(IEA)等组织常用的能源统计单位。
 * <p>
 * 该单位提供了一种标准化的方法来比较和统计不同能源的等效价值。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UEnergy_toe extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义吨油当量单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据能量单位的一般形式，油当量与焦耳具有相同的量纲：kg·m²·s⁻²
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，设置单位的量纲构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1));  // 千克：质量维度
        elementList.add(new UnitElement(BasicUnit.m, 2));   // 米：长度维度
        elementList.add(new UnitElement(BasicUnit.s, -2));  // 秒：时间维度（负二次方）
    }

    /**
     * 构造函数
     * <p>
     * 初始化吨油当量单位的转换参数。
     * 油当量与焦耳的转换因子为41,868,000,000（41.868 GJ）。
     */
    public UEnergy_toe() {
        super(
            "吨油当量",                       // 描述：吨油当量
            elementList,                    // 基本单位元素列表
            41868000000.0,                // 转换因子：1 toe = 41,868,000,000 J
            0.0                           // 偏移量：无偏移
        );
    }
}