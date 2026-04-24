package com.zishuimuyu.science.units.velocity;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.length.ULength_mi;
import com.zishuimuyu.science.units.time.UTime_h;

import java.util.ArrayList;
import java.util.List;

/**
 * 速度单位：mph（英里/小时）
 * <p>
 * 英里每小时是非国际单位制速度单位，符号为mph（mile per hour）。
 * 1英里每小时定义为物体在1小时内移动1英里的距离。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 mph ≈ 0.4470 m/s（米/秒）</li>
 *   <li>1 mph ≈ 1.609 km/h（千米/小时）</li>
 *   <li>1 mph ≈ 0.869 kn（节）</li>
 *   <li>1 km/h ≈ 0.621 mph</li>
 *   <li>音速 ≈ 761.2 mph（标准大气条件下）</li>
 *   <li>1 ft/s ≈ 0.682 mph</li>
 * </ul>
 * <p>
 * 英里每小时单位在美国、英国等使用英制单位的国家有广泛应用，
 * 用于表示车辆速度、风速、交通限速等。
 * 这些国家的交通标志和车辆仪表盘通常使用mph作为速度单位。
 * <p>
 * 该单位在交通运输领域特别重要。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVelocity_miPerh extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义英里每小时单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-1
     * <p>
     * 根据v=s/t（速度=距离/时间），速度单位 = 距离/时间 = m/s
     * 英里每小时与米每秒具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将英里每小时数值转换为标准单位（米每秒）的数值。
     * 由于1mph = 1mi/1h，该值通过计算1英里除以1小时得到。
     * 这意味着1英里每小时约等于0.4470米每秒。
     * 该值通过ValueWithUnit类进行单位运算获得。
     */
    private final static double factor;

    /**
     * 附加偏移量
     * <p>
     * 速度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "mi/h";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1英里除以1小时来确定英里每小时的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行英里和小时单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new ULength_mi());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_h())).getBasicValue();
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 秒，指数-1
        elementList.add(new UnitElement(BasicUnit.s, -1.0));
    }

    /**
     * 构造函数，创建一个英里每小时速度单位(mph)实例
     * <p>
     * 初始化英里每小时速度单位，设置单位符号为"mi/h"，基本单位组成为m·s⁻¹，
     * 转换因子约为0.4470（即1mph ≈ 0.4470m/s），无附加偏移量。
     */
    public UVelocity_miPerh() {
        // 调用父类DerivedUnit的构造方法，初始化英里每小时速度单位
        // 参数依次为：单位描述("mi/h")、基本单位元素列表([m^1, s^-1])、转换因子(约为0.4470)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}