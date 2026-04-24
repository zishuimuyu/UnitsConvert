package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.accelerate.UAccelerate_g;
import com.zishuimuyu.science.units.mass.UMass_g;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：gf（克力）
 * <p>
 * 克力是重力单位制中的力单位，符号为gf。
 * 1克力定义为质量为1克的物体在地球表面标准重力加速度下所受的重力。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 gf = 0.00980665 N（牛顿）</li>
 *   <li>1 gf = 9.80665×10⁻³ N</li>
 *   <li>1 kgf = 1000 gf</li>
 *   <li>1 N ≈ 101.97 gf</li>
 *   <li>1 lbf ≈ 453.59 gf</li>
 * </ul>
 * <p>
 * 克力单位常用于精密仪器、小型设备的力值测量，
 * 如弹簧秤、精密天平、小型电机推力测试等领域，
 * 特别适合测量较小的力值。
 * <p>
 * 克力与牛顿的换算基于标准重力加速度值9.80665 m/s²。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UForce_gf extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义克力单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据F=mg（重力公式），力 = 质量 × 重力加速度 = 质量 × 位移/时间²
     * 因此力的单位为 Kg·m·s⁻²。克力与牛顿具有相同的基本单位组成，
     * 只是转换因子不同（基于克质量和重力加速度的乘积）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将克力数值转换为标准单位（牛顿）的数值。
     * 由于1gf = 1g × g（标准重力加速度），其中g = 9.80665 m/s²，
     * 而1g = 0.001kg，所以factor = 0.001 × 9.80665 = 0.00980665。
     * 这意味着1克力等于0.00980665牛顿。
     * 该值通过计算1克质量乘以标准重力加速度获得。
     */
    private final static double factor;

    /**
     * 附加偏移量
     * <p>
     * 力单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "gf";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1克质量在标准重力加速度下的重力值来确定转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用千克作为质量单位，因此需要进行克到千克的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UMass_g());
        factor = vwu.multiply(new ValueWithUnit(1.0, new UAccelerate_g())).getBasicValue();
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 秒，指数-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个克力力单位(gf)实例
     * <p>
     * 初始化克力力单位，设置单位符号为"gf"，基本单位组成为Kg·m·s⁻²，
     * 转换因子约为0.00980665（即1gf ≈ 0.00980665N），无附加偏移量。
     */
    public UForce_gf() {
        // 调用父类DerivedUnit的构造方法，初始化克力力单位
        // 参数依次为：单位描述("gf")、基本单位元素列表([Kg^1, m^1, s^-2])、转换因子(约为0.00980665)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}