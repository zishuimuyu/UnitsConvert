package com.zishuimuyu.science.units.velocity;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 速度单位：nmi/h（海里每时）
 * <p>
 * 海里每时是速度单位，符号为nmi/h。
 * 1nmi/h = 0.514444 m/s。
 * <p>
 * 应用场景：航海航空
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVelocity_nmiPerh extends DerivedUnit {

    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor;
    private final static double additional = 0.0;
    private final static String description = "nmi/h";

    static {
        factor = 0.514444;
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        elementList.add(new UnitElement(BasicUnit.s, -1.0));
    }

    public UVelocity_nmiPerh() {
        super(description, elementList, factor, additional);
    }
}
