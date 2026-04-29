package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：ozf（盎司力）
 * <p>
 * 盎司力是英制单位系统中的力单位，定义为1盎司质量在标准重力下的重量。
 * 主要应用于轻型机械、精密仪器、美国工程标准等领域。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ozf = 0.278013851 N（牛顿）</li>
 *   <li>1 N = 3.59694309 ozf</li>
 *   <li>1 lbf = 16 ozf（磅力）</li>
 *   <li>1 ozf = 27801.3851 dyn（达因）</li>
 *   <li>1 kgf = 35.27396 ozf</li>
 * </ul>
 */
public class UForce_ozf extends DerivedUnit {
    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor = 0.278013851;
    private final static double addition = 0.0;
    private final static String description = "ozf";

    static {
        // 牛顿的定义：Kg·m·s⁻²
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    public UForce_ozf() {
        super(description, elementList, factor, addition);
    }
}