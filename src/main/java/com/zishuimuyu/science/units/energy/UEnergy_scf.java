package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：scf（标准立方英尺天然气）
 * <p>
 * 标准立方英尺天然气是非国际单位制的能量单位，符号为scf。
 * 1标准立方英尺天然气定义为在标准条件下（60°F和14.73 psi）1立方英尺天然气所含的能量。
 * 天然气的热值通常在1000-1100 BTU/scf范围内，一般取平均值1037 BTU/scf。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 scf ≈ 1037 BTU ≈ 1,094,000 J（焦耳）</li>
 *   <li>1 MCF = 1000 scf（千立方英尺）</li>
 *   <li>1 MMSCF = 1,000,000 scf（百万标准立方英尺）</li>
 *   <li>1 scf ≈ 0.293 kWh（千瓦时）</li>
 *   <li>1 scf ≈ 264.2 kcal（千卡）</li>
 *   <li>1 MMBTU = 964.2 scf（百万英热单位）</li>
 * </ul>
 * <p>
 * 标准立方英尺天然气单位在北美地区天然气行业有广泛应用，
 * 用于天然气的计量、定价和交易，是天然气工业的标准能量单位。
 * <p>
 * 该单位专门用于天然气的能量计算，便于天然气的商业贸易和计量。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UEnergy_scf extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义标准立方英尺天然气单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据能量单位的一般形式，天然气能量与焦耳具有相同的量纲：kg·m²·s⁻²
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
     * 初始化标准立方英尺天然气单位的转换参数。
     * 天然气能量与焦耳的转换因子约为1,094,000（约1037 BTU）。
     */
    public UEnergy_scf() {
        super(
            "标准立方英尺天然气",                // 描述：标准立方英尺天然气
            elementList,                    // 基本单位元素列表
            1094000.0,                    // 转换因子：1 scf ≈ 1,094,000 J
            0.0                           // 偏移量：无偏移
        );
    }
}