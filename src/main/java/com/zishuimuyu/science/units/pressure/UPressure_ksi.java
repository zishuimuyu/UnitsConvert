package com.zishuimuyu.science.units.pressure;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.force.UForce_lbf;

import java.util.ArrayList;
import java.util.List;

/**
 * 压强单位：ksi（千磅力每平方英寸）
 * <p>
 * ksi是压强单位，全称为"kilo pound-force per square inch"，即千磅力每平方英寸。
 * 1 ksi等于1000 psi（磅力每平方英寸），约等于6.89476 MPa。
 * 该单位在材料科学和工程领域广泛使用，特别是用于表示高强度钢和其他材料的屈服强度和抗拉强度。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ksi = 1000 lbf/in² = 1000 psi</li>
 *   <li>1 ksi ≈ 6.89476×10⁶ Pa</li>
 *   <li>1 ksi ≈ 6.89476 MPa</li>
 *   <li>1 ksi ≈ 68.9476 bar</li>
 *   <li>1 ksi ≈ 6804.6 torr</li>
 *   <li>1 MPa ≈ 0.145038 ksi</li>
 * </ul>
 * <p>
 * ksi单位在材料工程、结构工程和制造业中非常重要。
 * 它特别适用于表示高强度材料的力学性能，如高强度钢、钛合金、复合材料等。
 * 例如，许多高强度钢的屈服强度在50-200 ksi范围内。
 * <p>
 * 在美国的工程标准中，ksi是表示材料强度的主要单位之一，
 * 常用于钢结构设计、机械设计和材料规格制定。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UPressure_ksi extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义ksi单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为-1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 压强的单位为力/面积，即(N/m²)，展开后为Kg·m⁻¹·s⁻²。
     * ksi与帕斯卡具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将ksi数值转换为标准单位（帕斯卡）的数值。
     * 1 ksi = 1000 lbf/in²
     * 1 lbf = 4.44822 N
     * 1 in = 0.0254 m
     * 1 in² = (0.0254)² m² = 0.00064516 m²
     * 因此 1 ksi = 1000 × 4.44822 / 0.00064516 Pa ≈ 6894757.293 Pa
     */
    private final static double factor;

    /**
     * 附加偏移量
     * <p>
     * 压强单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "ksi";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 计算1 ksi 对应的帕斯卡值。
     */
    static {
        // 1 lbf = 4.44822 N
        // 1 in = 0.0254 m
        // 1 in² = (0.0254)² m² = 0.00064516 m²
        // 1 ksi = 1000 lbf/in² = 1000 * 4.44822 N / 0.00064516 m²
        factor = 1000.0 * 4.44822 / (0.0254 * 0.0254);
        
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为-1
        elementList.add(new UnitElement(BasicUnit.m, -1.0));
        // 添加秒基本单位，指数为-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个ksi压强单位(ksi)实例
     * <p>
     * 初始化ksi压强单位，设置单位符号为"ksi"，基本单位组成为Kg·m⁻¹·s⁻²，
     * 转换因子约为6894757.293（即1ksi ≈ 6894757.293Pa），无附加偏移量。
     */
    public UPressure_ksi() {
        // 调用父类DerivedUnit的构造方法，初始化ksi压强单位
        // 参数依次为：单位描述("ksi")、基本单位元素列表([Kg^1, m^-1, s^-2])、转换因子(≈6894757.293)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}