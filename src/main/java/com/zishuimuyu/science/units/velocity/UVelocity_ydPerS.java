package com.zishuimuyu.science.units.velocity;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 速度单位：yd/s（码每秒）
 * <p>
 * 码每秒是速度单位，符号为yd/s。
 * 1yd/s = 0.9144 m/s。
 * <p>
 * 应用场景：美国工程
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVelocity_ydPerS extends DerivedUnit {

    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor;
    private final static double additional = 0.0;
    private final static String description = "yd/s";

    static {
        factor = 0.9144;
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        elementList.add(new UnitElement(BasicUnit.s, -1.0));
    }

    public UVelocity_ydPerS() {
        super(description, elementList, factor, additional);
    }
}
