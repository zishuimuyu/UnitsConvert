package com.zishuimuyu.science.units.power;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.energy.UEnergy_Btn;
import com.zishuimuyu.science.units.time.UTime_h;

import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：BTU/h（英热单位/小时）
 * <p>
 * 英热单位每小时是非国际单位制的功率单位，符号为BTU/h。
 * 1 BTU/h定义为每小时产生1英热单位的能量转换速率。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 BTU/h ≈ 0.2931 W（瓦特）</li>
 *   <li>1 BTU/h ≈ 0.0002931 KW（千瓦）</li>
 *   <li>1 BTU/h ≈ 0.000393 hp（马力）</li>
 *   <li>1 kW ≈ 3412.14 BTU/h</li>
 *   <li>1 hp ≈ 2545 BTU/h</li>
 *   <li>1 refrigeration ton = 12,000 BTU/h（冷吨）</li>
 * </ul>
 * <p>
 * BTU/h单位在美国等使用英制单位的国家有广泛应用，
 * 主要用于空调制冷量、供暖设备功率、热交换设备功率等场合，
 * 是暖通空调(HVAC)行业中重要的功率单位。
 * <p>
 * 该单位特别适用于描述热功率和制冷功率。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UPower_BtnPerh extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义英热单位每小时单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-3
     * <p>
     * 根据P=E/t（功率=能量/时间），功率单位 = 能量/时间 = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     * BTU/h与瓦特具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将英热单位每小时数值转换为标准单位（瓦特）的数值。
     * 由于1BTU/h = 1BTU/h，该值通过计算1英热单位除以1小时得到。
     * 这意味着1 BTU/h约等于0.2931瓦特。
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
    private final static String description = "BTU/h";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1英热单位除以1小时来确定英热单位每小时的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行英制单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UEnergy_Btn());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_h())).getBasicValue();
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
        // 添加秒基本单位，指数为-3
        elementList.add(new UnitElement(BasicUnit.s, -3.0));
    }

    /**
     * 构造函数，创建一个英热单位每小时功率单位(BTU/h)实例
     * <p>
     * 初始化英热单位每小时功率单位，设置单位符号为"BTU/h"，基本单位组成为Kg·m²·s⁻³，
     * 转换因子约为0.2931（即1BTU/h ≈ 0.2931W），无附加偏移量。
     */
    public UPower_BtnPerh() {
        // 调用父类DerivedUnit的构造方法，初始化英热单位每小时功率单位
        // 参数依次为：单位描述("BTU/h")、基本单位元素列表([Kg^1, m^2, s^-3])、转换因子(约为0.2931)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}