package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：MN（兆牛顿）
 * <p>
 * 兆牛顿是国际单位制中力的倍数单位，1兆牛顿等于1000000牛顿。
 * 主要应用于大型结构工程、桥梁设计、重型机械等领域。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 MN = 1,000,000 N（牛顿）</li>
 *   <li>1 MN = 1,000 KN（千牛顿）</li>
 *   <li>1 MN = 101.97 tf（吨力）</li>
 *   <li>1 MN = 224.81 kip（千磅力）</li>
 *   <li>1 N = 0.000001 MN</li>
 * </ul>
 */
public class UForce_MegaNewton extends DerivedUnit {
    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor = 1000000.0;
    private final static double addition = 0.0;
    private final static String description = "MN";

    static {
        // 牛顿的定义：Kg·m·s⁻²
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    public UForce_MegaNewton() {
        super(description, elementList, factor, addition);
    }
}