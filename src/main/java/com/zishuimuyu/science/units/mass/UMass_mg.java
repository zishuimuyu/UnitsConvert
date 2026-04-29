package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：mg（毫克）
 * <p>
 * 毫克是国际单位制中的质量单位，符号为mg。
 * 1毫克定义为0.000001千克，即1千克的百万分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 mg = 1×10⁻⁶ Kg（千克）</li>
 *   <li>1 mg = 0.001 g（克）</li>
 *   <li>1 mg = 1000 μg（微克）</li>
 *   <li>1 g = 1000 mg（克）</li>
 *   <li>1 kg = 1,000,000 mg（千克）</li>
 * </ul>
 * <p>
 * 毫克单位在医药、化学、食品等领域有广泛应用，
 * 用于测量小剂量药物、化学试剂、食品添加剂等。
 * 在医学处方、实验配制中经常使用。
 * <p>
 * 该单位适合表达较小的质量值，是日常生活中常用的单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_mg extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义毫克单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 毫克与千克具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化毫克单位的转换参数。
     * 毫克与千克的转换因子为0.000001（10⁻⁶）。
     */
    public UMass_mg() {
        super(
            "毫克",                          // 描述：毫克
            elementList,                    // 基本单位元素列表
            1.0E-6,                       // 转换因子：1 mg = 1×10⁻⁶ kg
            0.0                           // 偏移量：无偏移
        );
    }
}