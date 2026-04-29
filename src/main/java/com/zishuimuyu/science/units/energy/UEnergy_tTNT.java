package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：t TNT（吨TNT当量）
 * <p>
 * 吨TNT当量是非国际单位制的能量单位，符号为t TNT。
 * 1吨TNT当量定义为1吨三硝基甲苯(TNT)爆炸释放的能量。
 * 这是一个用于衡量爆炸威力的标准化单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 t TNT ≈ 4.184×10⁹ J（焦耳）</li>
 *   <li>1 kt TNT = 1000 t TNT（千吨TNT当量）</li>
 *   <li>1 Mt TNT = 1,000,000 t TNT（百万吨TNT当量）</li>
 *   <li>1 t TNT ≈ 1162.22 kWh（千瓦时）</li>
 *   <li>1 t TNT ≈ 1000 kg TNT（千克TNT）</li>
 * </ul>
 * <p>
 * 吨TNT当量单位在军事、地质学、地震学等领域有广泛应用，
 * 用于衡量核武器、常规炸药的爆炸威力，以及地震、火山爆发等自然现象的能量。
 * 该单位提供了一种直观的方式来比较不同规模爆炸事件的威力。
 * <p>
 * 该单位在核武器效应分析、防护工程设计等方面具有重要意义。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UEnergy_tTNT extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义吨TNT当量单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据能量单位的一般形式，吨TNT当量与焦耳具有相同的量纲：kg·m²·s⁻²
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
     * 初始化吨TNT当量单位的转换参数。
     * 吨TNT当量与焦耳的转换因子约为4.184×10⁹。
     */
    public UEnergy_tTNT() {
        super(
            "吨TNT当量",                      // 描述：吨TNT当量
            elementList,                    // 基本单位元素列表
            4.184E9,                      // 转换因子：1 t TNT ≈ 4.184×10⁹ J
            0.0                           // 偏移量：无偏移
        );
    }
}