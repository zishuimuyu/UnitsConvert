package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：imp gal（英制加仑）
 * <p>
 * 英制加仑是体积单位，符号为 imperial gallon（imp gal），用于英国及部分英联邦国家。
 * 1英制加仑定义为4.54609升，约等于277.42立方英寸。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 UK gal = 4.54609 L（升）</li>
 *   <li>1 UK gal = 4,546.09 mL（毫升）</li>
 *   <li>1 UK gal = 1.20095 US gal（美制加仑）</li>
 *   <li>1 UK gal = 8 pt（液量品脱）</li>
 *   <li>1 UK gal = 160 fl oz（液量盎司）</li>
 * </ul>
 * <p>
 * <b>与美制加仑的区别：</b>
 * 美制加仑（{@link UVolume_gal}）基于231立方英寸 ≈ 3.785升；
 * 英制加仑基于10磅纯水体积重新定义 ≈ 4.546升，比美制大约20%。
 * 二者不可混用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_impgal extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 英制加仑 = 4.54609 dm³ = 4.54609×10^-3 m³
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子，表示英制加仑相对于立方米的关系
     * 1 UK gal = 4.54609×10^-3 m³
     */
    private final static double factor;

    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;

    /**
     * 单位描述字符串
     */
    private final static String description = "imp gal";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 4.54609e-3;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建英制加仑单位实例
     */
    public UVolume_impgal() {
        super(description, elementList, factor, additional);
    }
}
