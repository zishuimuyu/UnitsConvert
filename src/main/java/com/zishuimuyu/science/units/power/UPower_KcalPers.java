package com.zishuimuyu.science.units.power;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.energy.UEnergy_Kcal;
import com.zishuimuyu.science.units.time.UTime_s;

import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：kcal/s（千卡/秒）
 * <p>
 * 千卡每秒是非国际单位制的功率单位，符号为kcal/s。
 * 1 kcal/s定义为每秒产生1千卡的能量转换速率。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 kcal/s ≈ 4184 W（瓦特）</li>
 *   <li>1 kcal/s ≈ 4.184 kW（千瓦）</li>
 *   <li>1 kcal/s ≈ 5.61 hp（马力）</li>
 *   <li>1 kcal/s = 15,062 BTU/h（英热单位/小时）</li>
 *   <li>1 hp ≈ 0.178 kcal/s</li>
 *   <li>1 kW ≈ 0.239 kcal/s</li>
 * </ul>
 * <p>
 * kcal/s单位在营养学、生物医学、化学工程等领域有应用，
 * 主要用于测量生物代谢速率、化学反应功率、
 * 以及热交换过程中的能量转换速率。
 * <p>
 * 该单位特别适用于描述生物学和化学过程中的功率。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPower_KcalPers extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义千卡每秒单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-3
     * <p>
     * 根据P=E/t（功率=能量/时间），功率单位 = 能量/时间 = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     * kcal/s与瓦特具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将千卡每秒数值转换为标准单位（瓦特）的数值。
     * 由于1kcal/s = 1kcal/s，该值通过计算1千卡除以1秒得到。
     * 这意味着1 kcal/s约等于4184瓦特。
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
    private final static String description = "Kcal/s";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1千卡除以1秒来确定千卡每秒的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行卡路里单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UEnergy_Kcal());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_s())).getBasicValue();
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
        // 添加秒基本单位，指数为-3
        elementList.add(new UnitElement(BasicUnit.s, -3.0));
    }

    /**
     * 构造函数，创建一个千卡每秒功率单位(kcal/s)实例
     * <p>
     * 初始化千卡每秒功率单位，设置单位符号为"Kcal/s"，基本单位组成为Kg·m²·s⁻³，
     * 转换因子约为4184（即1kcal/s ≈ 4184W），无附加偏移量。
     */
    public UPower_KcalPers() {
        // 调用父类DerivedUnit的构造方法，初始化千卡每秒功率单位
        // 参数依次为：单位描述("Kcal/s")、基本单位元素列表([Kg^1, m^2, s^-3])、转换因子(约为4184)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}