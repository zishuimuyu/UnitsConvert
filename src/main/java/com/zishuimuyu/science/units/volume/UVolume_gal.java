package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：gal（美制加仑）
 * <p>
 * 美制加仑是体积单位，符号为gal（US），是美国常用的液体体积单位。
 * 1美制加仑等于231立方英寸，约等于3.785升。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 US gal = 3.785 L（升）</li>
 *   <li>1 US gal = 3,785 mL（毫升）</li>
 *   <li>1 US gal = 4 qt（液量夸脱）</li>
 *   <li>1 US gal = 8 pt（液量品脱）</li>
 *   <li>1 US gal = 128 fl oz（液量盎司）</li>
 *   <li>1 US gal ≈ 0.833 UK gal（英制加仑）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 加仑起源于英国，最初用于测量葡萄酒和啤酒的容量。
 * 美国独立后采用了自己的加仑定义，即1707年英国啤酒加仑的大小。
 * 美制加仑与英制加仑不同，美制加仑更小。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>交通运输：汽车油箱容量、燃油消耗</li>
 *   <li>日常生活：牛奶、饮料的包装（美国市场）</li>
 *   <li>工业领域：化工产品的批量计量</li>
 *   <li>园艺：农药、肥料溶液的配制</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_gal extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 美制加仑 = 231立方英寸 = 231 × (0.0254米)³ = 3.7854×10^-3 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示美制加仑相对于立方米的关系
     * 1 US gal ≈ 3.7854×10^-3 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "gal";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 3.7854e-3;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建美制加仑单位实例
     */
    public UVolume_gal() {
        super(description, elementList, factor, additional);
    }
}