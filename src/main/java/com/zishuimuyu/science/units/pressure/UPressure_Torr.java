package com.zishuimuyu.science.units.pressure;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.force.UForce_N;

import java.util.ArrayList;
import java.util.List;

/**
 * 压强单位：Torr（托）
 * <p>
 * 托是压强单位，定义为1/760标准大气压。
 * 1托精确等于101325/760帕斯卡，约等于133.322帕斯卡。
 * 该单位以物理学家埃万杰利斯塔·托里拆利(Evangelista Torricelli)命名，
 * 他发明了汞柱气压计。托主要用于真空技术、血液压力测量等领域。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 Torr = (101325/760) Pa ≈ 133.322 Pa</li>
 *   <li>1 Torr = (1/760) atm ≈ 1.3158×10⁻³ atm</li>
 *   <li>1 atm = 760 Torr</li>
 *   <li>1 Torr ≈ 1.3332×10⁻³ bar</li>
 *   <li>1 mmHg ≈ 1.0000001425 Torr (几乎相等，但略有差异)</li>
 * </ul>
 * <p>
 * 托单位在真空技术、血液压力测量和某些科学实验中广泛使用。
 * 在真空技术中，托用于表示各种真空等级，
 * 如粗真空(10³-1 Torr)、细真空(1-10⁻³ Torr)、高真空(10⁻³-10⁻⁷ Torr)、超高真空(<10⁻⁷ Torr)。
 * <p>
 * 托与毫米汞柱(mmHg)非常接近但不完全相等：
 * - 1 Torr = (101325/760) Pa ≈ 133.3223684 Pa
 * - 1 mmHg = 133.322 Pa
 * 这种微小差异源于标准重力加速度和汞密度的精确值。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UPressure_Torr extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义托单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为-1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 压强的单位为力/面积，即(N/m²)，展开后为Kg·m⁻¹·s⁻²。
     * 托与帕斯卡具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将托数值转换为标准单位（帕斯卡）的数值。
     * 1托定义为1/760标准大气压，而1标准大气压=101325帕斯卡。
     * 因此factor = 101325/760 ≈ 133.3223684。
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
    private final static String description = "Torr";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 计算1托对应的帕斯卡值：1 Torr = (101325/760) Pa
     */
    static {
        // 1标准大气压(atm) = 101325 Pa
        // 1 Torr = 1/760 atm
        // 因此 1 Torr = 101325/760 Pa
        factor = 101325.0 / 760.0;
        
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为-1
        elementList.add(new UnitElement(BasicUnit.m, -1.0));
        // 添加秒基本单位，指数为-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个托压强单位(Torr)实例
     * <p>
     * 初始化托压强单位，设置单位符号为"Torr"，基本单位组成为Kg·m⁻¹·s⁻²，
     * 转换因子约为133.322（即1Torr ≈ 133.322Pa），无附加偏移量。
     */
    public UPressure_Torr() {
        // 调用父类DerivedUnit的构造方法，初始化托压强单位
        // 参数依次为：单位描述("Torr")、基本单位元素列表([Kg^1, m^-1, s^-2])、转换因子(≈133.322)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}