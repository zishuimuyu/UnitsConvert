package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：STf（短吨力）
 * <p>
 * 短吨力是美制单位系统中的力单位，定义为1短吨（2000磅）质量在标准重力下的重量。
 * 主要应用于美国工程标准、重型机械、建筑结构等领域。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 STf = 8896.44323052 N（牛顿）</li>
 *   <li>1 N = 1.124045×10⁻⁴ STf</li>
 *   <li>1 STf = 2000 lbf（磅力）</li>
 *   <li>1 STf = 0.907185 tf（吨力）</li>
 *   <li>1 kip = 1 STf（千磅力）</li>
 * </ul>
 */
public class UForce_STf extends DerivedUnit {
    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor = 8896.44323052;
    private final static double addition = 0.0;
    private final static String description = "STf";

    static {
        // 牛顿的定义：Kg·m·s⁻²
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    public UForce_STf() {
        super(description, elementList, factor, addition);
    }
}