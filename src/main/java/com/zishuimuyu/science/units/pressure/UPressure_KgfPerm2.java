package com.zishuimuyu.science.units.pressure;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.area.UArea_m2;
import com.zishuimuyu.science.units.force.UForce_Kgf;
import java.util.ArrayList;
import java.util.List;

/**
 * 压强单位：kgf/m²（公斤力/平方米）
 * <P>
 * 公斤力每平方米是重力单位制中的压强单位，符号为kgf/m²。
 * 1公斤力每平方米定义为1公斤力作用在1平方米面积上所产生的压强。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 kgf/m² ≈ 9.80665 Pa（帕斯卡）</li>
 *   <li>1 kgf/m² ≈ 0.009807 kPa（千帕）</li>
 *   <li>1 kgf/cm² ≈ 98,066.5 Pa（公斤力/平方厘米）</li>
 *   <li>1 atm ≈ 10,332 kgf/m²</li>
 *   <li>1 bar ≈ 10,197 kgf/m²</li>
 * </ul>
 * <P>
 * 公斤力每平方米单位在某些工程领域有应用，
 * 特别是在一些亚洲国家的工程实践中，
 * 用于测量压力、应力等物理量。
 * 该单位基于公斤力，与牛顿制的帕斯卡存在固定换算关系。
 * <P>
 * 在工程实践中，公斤力/平方厘米(kgf/cm²)更常用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPressure_KgfPerm2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义公斤力每平方米单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为-1  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据P=F/A（压强=力/面积），压强单位 = 力/面积 = (Kg·m·s⁻²)/m² = Kg·m⁻¹·s⁻²
     * 公斤力每平方米与帕斯卡具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将公斤力每平方米数值转换为标准单位（帕斯卡）的数值。
     * 由于1kgf/m² = 1kgf/m²，该值通过计算1公斤力除以1平方米得到。
     * 这意味着1公斤力每平方米约等于9.80665帕斯卡。
     * 该值通过ValueWithUnit类进行单位运算获得。
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 压强单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Kgf/m^2";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1公斤力除以1平方米来确定公斤力每平方米的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行公斤力单位到牛顿的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UForce_Kgf());
        factor = vwu.divide(new ValueWithUnit(1.0, new UArea_m2())).getBasicValue();
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, -1.0));  // 米，指数-1
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    public UPressure_KgfPerm2() {
        super(description, elementList, factor, additional);
    }

}