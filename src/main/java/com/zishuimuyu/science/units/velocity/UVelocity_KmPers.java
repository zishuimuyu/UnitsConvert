package com.zishuimuyu.science.units.velocity;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.length.ULength_Km;
import com.zishuimuyu.science.units.time.UTime_s;
import java.util.ArrayList;
import java.util.List;

/**
 * 速度单位：km/s（千米/秒）
 * <P>
 * 千米每秒是国际单位制倍数单位，符号为km/s。
 * 1千米每秒定义为物体在1秒内移动1千米的距离。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 km/s = 1000 m/s（米/秒）</li>
 *   <li>1 km/s = 3,600 km/h（千米/小时）</li>
 *   <li>1 km/s ≈ 1944 kn（节）</li>
 *   <li>1 km/s ≈ 2237 mph（英里/小时）</li>
 *   <li>光速 c ≈ 299,792.458 km/s</li>
 *   <li>1 m/s = 0.001 km/s</li>
 * </ul>
 * <P>
 * 千米每秒单位在航天、航空、高速运动分析等领域有广泛应用，
 * 用于测量极高速度，如火箭速度、行星轨道速度、
 * 子弹初速等。该单位适合表达非常快的运动速度。
 * <P>
 * 该单位是国际单位制的合法倍数单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVelocity_KmPers extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义千米每秒单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-1
     * <P>
     * 根据v=s/t（速度=距离/时间），速度单位 = 距离/时间 = m/s
     * 千米每秒与米每秒具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将千米每秒数值转换为标准单位（米每秒）的数值。
     * 由于1km/s = 1000m/s，该值通过计算1千米除以1秒得到。
     * 这意味着1千米每秒等于1000米每秒。
     * 该值通过ValueWithUnit类进行单位运算获得。
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 速度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Km/s";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1千米除以1秒来确定千米每秒的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行千米单位到米单位的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new ULength_Km());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_s())).getBasicValue();
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
        elementList.add(new UnitElement(BasicUnit.s, -1.0)); // 秒，指数-1
    }

    public UVelocity_KmPers() {
        super(description, elementList, factor, additional);
    }

}