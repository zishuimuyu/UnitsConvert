package com.zishuimuyu.science.units.power;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.energy.UEnergy_Btn;
import com.zishuimuyu.science.units.time.UTime_s;
import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：BTU/s（英热单位/秒）
 * <P>
 * 英热单位每秒是非国际单位制的功率单位，符号为BTU/s。
 * 1 BTU/s定义为每秒产生1英热单位的能量转换速率。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 BTU/s ≈ 1055.06 W（瓦特）</li>
 *   <li>1 BTU/s ≈ 1.055 kW（千瓦）</li>
 *   <li>1 BTU/s ≈ 1.415 hp（马力）</li>
 *   <li>1 BTU/s = 3600 BTU/h（英热单位/小时）</li>
 *   <li>1 hp ≈ 0.707 BTU/s</li>
 *   <li>1 kW ≈ 0.948 BTU/s</li>
 * </ul>
 * <P>
 * BTU/s单位在美国等使用英制单位的国家有广泛应用，
 * 主要用于大型供暖、制冷设备的功率标定，
 * 以及工业过程中高功率能量转换的测量。
 * <P>
 * 该单位特别适用于描述快速能量转换过程的功率。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPower_BtnPers extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义英热单位每秒单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2  
     * - 时间单位秒(s)，指数为-3
     * <P>
     * 根据P=E/t（功率=能量/时间），功率单位 = 能量/时间 = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     * BTU/s与瓦特具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将英热单位每秒数值转换为标准单位（瓦特）的数值。
     * 由于1BTU/s = 1BTU/s，该值通过计算1英热单位除以1秒得到。
     * 这意味着1 BTU/s约等于1055.06瓦特。
     * 该值通过ValueWithUnit类进行单位运算获得。
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 功率单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Btn/s";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1英热单位除以1秒来确定英热单位每秒的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行英制单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UEnergy_Btn());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_s())).getBasicValue();
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 2.0));   // 米，指数2
        elementList.add(new UnitElement(BasicUnit.s, -3.0));  // 秒，指数-3
    }

    public UPower_BtnPers() {
        super(description, elementList, factor, additional);
    }

}