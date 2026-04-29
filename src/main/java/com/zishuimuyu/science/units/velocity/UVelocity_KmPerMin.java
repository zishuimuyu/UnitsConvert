package com.zishuimuyu.science.units.velocity;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 速度单位：Km/min（千米每分）
 * <p>
 * 千米每分是速度单位，符号为Km/min。
 * 1Km/min = 16.6667 m/s。
 * <p>
 * 应用场景：交通运输
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVelocity_KmPerMin extends DerivedUnit {

    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor;
    private final static double additional = 0.0;
    private final static String description = "Km/min";

    static {
        factor = 16.6667;
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        elementList.add(new UnitElement(BasicUnit.s, -1.0));
    }

    public UVelocity_KmPerMin() {
        super(description, elementList, factor, additional);
    }
}
