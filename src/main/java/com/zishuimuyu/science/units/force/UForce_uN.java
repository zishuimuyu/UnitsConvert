package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：μN（微牛顿）
 * <p>
 * 微牛顿是国际单位制中力的分数单位，1微牛顿等于0.000001牛顿。
 * 主要应用于微观粒子研究、纳米技术、生物分子力测量等领域。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 μN = 10⁻⁶ N（牛顿）</li>
 *   <li>1 N = 1,000,000 μN</li>
 *   <li>1 μN = 1.0197×10⁻⁷ gf（克力）</li>
 *   <li>1 mN = 1,000 μN</li>
 *   <li>1 dyn = 10 μN</li>
 * </ul>
 */
public class UForce_uN extends DerivedUnit {
    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor = 1e-06;
    private final static double addition = 0.0;
    private final static String description = "uN";

    static {
        // 牛顿的定义：Kg·m·s⁻²
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    public UForce_uN() {
        super(description, elementList, factor, addition);
    }
}