package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.accelerate.UAccelerate_g;
import com.zishuimuyu.science.units.mass.UMass_t;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：tf（吨力/公吨力）
 * <p>
 * 吨力是重力单位制中的力单位，符号为tf。
 * 1吨力定义为质量为1公吨（吨）的物体在地球表面标准重力加速度下所受的重力。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 tf = 1000 kgf（公斤力）</li>
 *   <li>1 tf = 9806.65 N（牛顿）</li>
 *   <li>1 tf ≈ 9.80665 kN（千牛顿）</li>
 *   <li>1 N ≈ 1.02×10⁻⁶ tf</li>
 *   <li>1 kgf = 0.001 tf</li>
 * </ul>
 * <p>
 * 吨力单位在重型机械、船舶工程、起重设备、土木工程等领域有广泛应用，
 * 用于测量大型设备的承载能力、起重机的最大起重量、桥梁的承载力等。
 * <p>
 * 吨力与牛顿的换算是基于标准重力加速度值9.80665 m/s²和1吨=1000千克的关系。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UForce_tf extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义吨力单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据F=mg（重力公式），力 = 质量 × 重力加速度 = 质量 × 位移/时间²
     * 因此力的单位为 Kg·m·s⁻²。吨力与牛顿具有相同的基本单位组成，
     * 只是转换因子不同（基于吨质量和重力加速度的乘积）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将吨力数值转换为标准单位（牛顿）的数值。
     * 由于1tf = 1t × g（标准重力加速度），其中g = 9.80665 m/s²，
     * 而 t = 1000kg，所以factor = 1000 × 9.80665 = 9806.65。
     * 这意味着1吨力等于9806.65牛顿。
     * 该值通过计算1吨质量乘以标准重力加速度获得。
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
    private final static String description = "tf";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1吨质量在标准重力加速度下的重力值来确定转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用千克作为质量单位，因此需要进行吨到千克的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UMass_t());
        factor = vwu.multiply(new ValueWithUnit(1.0, new UAccelerate_g())).getBasicValue();
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 添加秒基本单位，指数为-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个吨力力单位(tf)实例
     * <p>
     * 初始化吨力力单位，设置单位符号为"tf"，基本单位组成为Kg·m·s⁻²，
     * 转换因子约为9806.65（即1tf ≈ 9806.65N），无附加偏移量。
     */
    public UForce_tf() {
        // 调用父类DerivedUnit的构造方法，初始化吨力力单位
        // 参数依次为：单位描述("tf")、基本单位元素列表([Kg^1, m^1, s^-2])、转换因子(约为9806.65)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}