package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：GJ（吉焦）
 * <p>
 * 吉焦是国际单位制倍数单位，符号为GJ。
 * 1吉焦定义为1,000,000,000焦耳（10⁹ J）。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 GJ = 1,000,000,000 J（焦耳）</li>
 *   <li>1 GJ = 1000 MJ（兆焦）</li>
 *   <li>1 TJ = 1000 GJ（太焦）</li>
 *   <li>1 GJ ≈ 239005.74 kcal（千卡）</li>
 *   <li>1 GJ ≈ 277.78 kWh（千瓦时）</li>
 *   <li>1 GJ ≈ 947817.12 BTU（英热单位）</li>
 * </ul>
 * <p>
 * 吉焦单位在工程、能源、热力学等领域有广泛应用，
 * 用于测量大范围的能量值，如工业过程能耗、
 * 能源统计、环境科学等。
 * <p>
 * 该单位适合表达较大规模的能量转换和存储。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UEnergy_GJ extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义吉焦单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据能量单位的一般形式，吉焦与焦耳具有相同的量纲：kg·m²·s⁻²
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
     * 初始化吉焦单位的转换参数。
     * 吉焦与焦耳的转换因子为1,000,000,000（10⁹）。
     */
    public UEnergy_GJ() {
        super(
            "吉焦",                          // 描述：吉焦
            elementList,                    // 基本单位元素列表
            1.0E9,                        // 转换因子：1 GJ = 1,000,000,000 J
            0.0                           // 偏移量：无偏移
        );
    }
}