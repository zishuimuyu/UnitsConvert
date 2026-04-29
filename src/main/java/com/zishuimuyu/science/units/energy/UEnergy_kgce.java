package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：kgce（千克标准煤当量）
 * <p>
 * 千克标准煤当量是非国际单位制的能量单位，符号为kgce。
 * 1千克标准煤当量定义为1千克标准煤完全燃烧释放的能量。
 * 标准煤是指低位发热量为29.26MJ/kg（7000大卡/公斤）的煤炭。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 kgce = 29.26 MJ = 29,260,000 J（焦耳）</li>
 *   <li>1 tce = 1000 kgce（吨标准煤当量）</li>
 *   <li>1 kgce ≈ 8.13 kWh（千瓦时）</li>
 *   <li>1 kgce ≈ 7000 kcal（千卡）</li>
 *   <li>1 kgce ≈ 27,700 BTU（英热单位）</li>
 * </ul>
 * <p>
 * 千克标准煤当量单位在中国及部分亚洲国家的能源统计、
 * 节能减排、环保监测等领域有广泛应用，
 * 用于统一计算不同能源品种的消耗量和效率。
 * <p>
 * 该单位提供了一种标准化的方法来比较和统计不同能源的等效价值。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UEnergy_kgce extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义千克标准煤当量单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据能量单位的一般形式，标准煤当量与焦耳具有相同的量纲：kg·m²·s⁻²
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
     * 初始化千克标准煤当量单位的转换参数。
     * 标准煤当量与焦耳的转换因子为29,260,000（29.26 MJ）。
     */
    public UEnergy_kgce() {
        super(
            "千克标准煤当量",                   // 描述：千克标准煤当量
            elementList,                    // 基本单位元素列表
            29260000.0,                   // 转换因子：1 kgce = 29,260,000 J
            0.0                           // 偏移量：无偏移
        );
    }
}