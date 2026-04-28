package com.zishuimuyu.science.units.power;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.energy.UEnergy_erg;
import com.zishuimuyu.science.units.time.UTime_s;

import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：erg/s（尔格/秒）
 * <p>
 * 尔格每秒是非国际单位制的功率单位，符号为erg/s。
 * 1 erg/s定义为每秒完成1尔格的功。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 erg/s = 10⁻⁷ W（瓦特）</li>
 *   <li>1 erg/s = 0.0000001 W（瓦特）</li>
 *   <li>1 W = 10,000,000 erg/s</li>
 *   <li>1 kW = 10,000,000,000 erg/s</li>
 *   <li>1 hp ≈ 7,457,000,000 erg/s</li>
 *   <li>1 PS ≈ 7,355,000,000 erg/s</li>
 * </ul>
 * <p>
 * erg/s单位在理论物理、天体物理学、精密科学实验等领域有应用，
 * 主要用于测量微小的能量转换速率，如分子能量转换、原子跃迁功率等。
 * 虽然国际单位制已普及，但在某些科学文献中仍可见到该单位。
 * <p>
 * 该单位基于厘米-克-秒制(CGS)中的能量单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UPower_ergPers extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义尔格每秒单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-3
     * <p>
     * 根据P=E/t（功率=能量/时间），功率单位 = 能量/时间 = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     * erg/s与瓦特具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将尔格每秒数值转换为标准单位（瓦特）的数值。
     * 由于1erg/s = 1erg/s，该值通过计算1尔格除以1秒得到。
     * 这意味着1 erg/s等于0.0000001瓦特。
     * 该值通过ValueWithUnit类进行单位运算获得。
     */
    private final static double factor;

    /**
     * 附加偏移量
     * <p>
     * 功率单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "erg/s";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1尔格除以1秒来确定尔格每秒的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行CGS单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UEnergy_erg());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_s())).getBasicValue();
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
        // 添加秒基本单位，指数为-3
        elementList.add(new UnitElement(BasicUnit.s, -3.0));
    }

    /**
     * 构造函数，创建一个尔格每秒功率单位(erg/s)实例
     * <p>
     * 初始化尔格每秒功率单位，设置单位符号为"erg/s"，基本单位组成为Kg·m²·s⁻³，
     * 转换因子为0.0000001（即1erg/s = 0.0000001W），无附加偏移量。
     */
    public UPower_ergPers() {
        // 调用父类DerivedUnit的构造方法，初始化尔格每秒功率单位
        // 参数依次为：单位描述("erg/s")、基本单位元素列表([Kg^1, m^2, s^-3])、转换因子(0.0000001)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}