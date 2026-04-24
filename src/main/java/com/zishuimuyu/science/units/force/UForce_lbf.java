package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.accelerate.UAccelerate_g;
import com.zishuimuyu.science.units.mass.UMass_lb;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：lbf（磅力）
 * <p>
 * 磅力是英制单位制中的力单位，符号为lbf。
 * 1磅力定义为质量为1磅的物体在地球表面标准重力加速度下所受的重力。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 lbf ≈ 4.44822 N（牛顿）</li>
 *   <li>1 lbf ≈ 0.45359 kgf（公斤力）</li>
 *   <li>1 kgf ≈ 2.2046 lbf</li>
 *   <li>1 ozf（盎司力）= 0.0625 lbf</li>
 *   <li>1 kip（千磅力）= 1000 lbf</li>
 *   <li>1 tonf（短吨力）= 2000 lbf</li>
 * </ul>
 * <p>
 * 磅力单位广泛应用于美国、英国等使用英制单位的国家，
 * 主要用于工程设计、机械制造、航空航天等领域，
 * 特别是在测量小型设备的推拉力、弹簧弹力等方面。
 * <p>
 * 磅力与牛顿的换算基于标准重力加速度值和磅与千克的换算关系。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UForce_lbf extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义磅力单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据F=mg（重力公式），力 = 质量 × 重力加速度 = 质量 × 位移/时间²
     * 因此力的单位为 Kg·m·s⁻²。磅力与牛顿具有相同的基本单位组成，
     * 只是转换因子不同（基于磅质量和重力加速度的乘积）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将磅力数值转换为标准单位（牛顿）的数值。
     * 由于1lbf = 1lb × g（标准重力加速度），其中lb是磅质量单位，
     * 该值通过计算1磅质量乘以标准重力加速度获得，约等于4.44822。
     * 这意味着1磅力约等于4.44822牛顿。
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
    private final static String description = "lbf";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1磅质量在标准重力加速度下的重力值来确定转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用千克作为质量单位，因此需要进行磅到千克的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UMass_lb());
        // 中立加速度的值在基准单位制下是相同的，因此此处乘以标准重力加速度即可
        factor = vwu.multiply(new ValueWithUnit(1.0, new UAccelerate_g())).getBasicValue();
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 秒，指数-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个磅力力单位(lbf)实例
     * <p>
     * 初始化磅力力单位，设置单位符号为"lbf"，基本单位组成为Kg·m·s⁻²，
     * 转换因子约为4.44822（即1lbf ≈ 4.44822N），无附加偏移量。
     */
    public UForce_lbf() {
        // 调用父类DerivedUnit的构造方法，初始化磅力力单位
        // 参数依次为：单位描述("lbf")、基本单位元素列表([Kg^1, m^1, s^-2])、转换因子(约为4.44822)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}