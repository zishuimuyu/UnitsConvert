package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：mN（毫牛顿）
 * <p>
 * 毫牛顿是国际单位制中力的分数单位，1毫牛顿等于0.001牛顿。
 * 主要应用于精密仪器、微型机械、生物医学工程等领域。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 mN = 0.001 N（牛顿）</li>
 *   <li>1 N = 1000 mN</li>
 *   <li>1 mN = 1.0197\u00d710\u207b\u2074 gf（克力）</li>
 *   <li>1 mN = 100 dyn（达因）</li>
 *   <li>1 kN = 1,000,000 mN</li>
 * </ul>
 */
public class UForce_mN extends DerivedUnit {
    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor = 0.001;
    private final static double addition = 0.0;
    private final static String description = "mN";

    static {
        // 牛顿的定义：Kg\u00b7m\u00b7s\u207b\u00b2
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    public UForce_mN() {
        super(description, elementList, factor, addition);
    }
}