package com.zishuimuyu.science.units.pressure;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.area.UArea_in2;
import com.zishuimuyu.science.units.force.UForce_lbf;

import java.util.ArrayList;
import java.util.List;

/**
 * 压强单位：lbf/in²（磅/平方英寸，PSI）
 * <p>
 * 磅每平方英寸是英制单位制中的压强单位，通常简称为PSI（Pounds per Square Inch）。
 * 1 PSI定义为1磅力作用在1平方英寸面积上所产生的压强。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 PSI ≈ 6,895 Pa（帕斯卡）</li>
 *   <li>1 PSI ≈ 0.006895 MPa（兆帕）</li>
 *   <li>1 PSI ≈ 0.06895 bar</li>
 *   <li>1 PSI ≈ 0.07031 kgf/cm²（公斤力/平方厘米）</li>
 *   <li>1 atm ≈ 14.696 PSI</li>
 *   <li>1 bar ≈ 14.504 PSI</li>
 * </ul>
 * <p>
 * PSI单位广泛应用于美国等使用英制单位的国家，
 * 主要用于轮胎压力、液压系统、气压系统、管道压力等场合，
 * 在汽车、航空、工业设备等领域非常常见。
 * <p>
 * PSI是工程实践中最常用的压强单位之一，特别是在机械和汽车工业中。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPressure_lbfPerin2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义PSI单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为-1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据P=F/A（压强=力/面积），压强单位 = 力/面积 = (Kg·m·s⁻²)/m² = Kg·m⁻¹·s⁻²
     * PSI与帕斯卡具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将PSI数值转换为标准单位（帕斯卡）的数值。
     * 由于1PSI = 1lbf/in²，该值通过计算1磅力除以1平方英寸得到。
     * 这意味着1PSI等于6894.76帕斯卡（约6895）。
     * 该值通过ValueWithUnit类进行单位运算获得。
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
    private final static String description = "lbf/in^2";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1磅力除以1平方英寸来确定PSI的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行英制单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UForce_lbf());
        factor = vwu.divide(new ValueWithUnit(1.0, new UArea_in2())).getBasicValue();
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为-1
        elementList.add(new UnitElement(BasicUnit.m, -1.0));
        // 添加秒基本单位，指数为-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个磅每平方英寸压强单位(lbf/in²)实例
     * <p>
     * 初始化磅每平方英寸压强单位，设置单位符号为"lbf/in^2"，基本单位组成为Kg·m⁻¹·s⁻²，
     * 转换因子为6894.757293168365（即1PSI ≈ 6895Pa），无附加偏移量。
     */
    public UPressure_lbfPerin2() {
        // 调用父类DerivedUnit的构造方法，初始化磅每平方英寸压强单位
        // 参数依次为：单位描述("lbf/in^2")、基本单位元素列表([Kg^1, m^-1, s^-2])、转换因子(约为6894.76)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}