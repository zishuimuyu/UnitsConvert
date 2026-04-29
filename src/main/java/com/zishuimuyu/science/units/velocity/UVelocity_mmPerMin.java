package com.zishuimuyu.science.units.velocity;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 速度单位：mm/min（毫米每分）
 * <p>
 * 毫米每分是速度单位，符号为mm/min。
 * 1mm/min = 1.66667e-05 m/s。
 * <p>
 * 应用场景：精密测量
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVelocity_mmPerMin extends DerivedUnit {

    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor;
    private final static double additional = 0.0;
    private final static String description = "mm/min";

    static {
        factor = 1.66667e-05;
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        elementList.add(new UnitElement(BasicUnit.s, -1.0));
    }

    public UVelocity_mmPerMin() {
        super(description, elementList, factor, additional);
    }
}
