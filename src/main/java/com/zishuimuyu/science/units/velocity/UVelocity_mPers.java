package com.zishuimuyu.science.units.velocity;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 速度单位：m/s（米每秒）
 * <p>
 * 米每秒是速度单位，符号为m/s。
 * 1m/s = 1.0 m/s。
 * <p>
 * 应用场景：国际单位制速度基本单位
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVelocity_mPerS extends DerivedUnit {

    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor;
    private final static double additional = 0.0;
    private final static String description = "m/s";

    static {
        factor = 1.0;
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        elementList.add(new UnitElement(BasicUnit.s, -1.0));
    }

    public UVelocity_mPerS() {
        super(description, elementList, factor, additional);
    }
}
