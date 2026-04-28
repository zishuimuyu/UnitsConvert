package com.zishuimuyu.science.units.power;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.energy.UEnergy_Kcal;
import com.zishuimuyu.science.units.time.UTime_h;

import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：kcal/h（千卡/小时）
 * <p>
 * 千卡每小时是非国际单位制的功率单位，符号为kcal/h。
 * 1 kcal/h定义为每小时产生1千卡的能量转换速率。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 kcal/h ≈ 1.163 W（瓦特）</li>
 *   <li>1 kcal/h ≈ 0.001163 KW（千瓦）</li>
 *   <li>1 kcal/h ≈ 0.0015596 hp（马力）</li>
 *   <li>1 kW ≈ 860 kcal/h</li>
 *   <li>1 hp ≈ 641.19 kcal/h</li>
 *   <li>1 kcal/s = 3600 kcal/h</li>
 * </ul>
 * <p>
 * kcal/h单位在营养学、生物医学、化学工程等领域有应用，
 * 主要用于测量生物代谢速率、化学反应功率、
 * 以及热交换过程中的能量转换速率。
 * <p>
 * 该单位特别适用于描述生物学和化学过程中的功率。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UPower_KcalPerh extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义千卡每小时单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-3
     * <p>
     * 根据P=E/t（功率=能量/时间），功率单位 = 能量/时间 = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     * kcal/h与瓦特具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将千卡每小时数值转换为标准单位（瓦特）的数值。
     * 由于1kcal/h = 1kcal/h，该值通过计算1千卡除以1小时得到。
     * 这意味着1 kcal/h约等于1.163瓦特。
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
    private final static String description = "kcal/h";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1千卡除以1小时来确定千卡每小时的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行卡路里单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UEnergy_Kcal());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_h())).getBasicValue();
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
        // 添加秒基本单位，指数为-3
        elementList.add(new UnitElement(BasicUnit.s, -3.0));
    }

    /**
     * 构造函数，创建一个千卡每小时功率单位(kcal/h)实例
     * <p>
     * 初始化千卡每小时功率单位，设置单位符号为"kcal/h"，基本单位组成为Kg·m²·s⁻³，
     * 转换因子约为1.163（即1kcal/h ≈ 1.163W），无附加偏移量。
     */
    public UPower_KcalPerh() {
        // 调用父类DerivedUnit的构造方法，初始化千卡每小时功率单位
        // 参数依次为：单位描述("kcal/h")、基本单位元素列表([Kg^1, m^2, s^-3])、转换因子(约为1.163)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}