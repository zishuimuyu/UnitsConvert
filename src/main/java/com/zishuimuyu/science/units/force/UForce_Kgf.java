package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.accelerate.UAccelerate_g;
import com.zishuimuyu.science.units.mass.UMass_Kg;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：kgf（公斤力/千克力）
 * <p>
 * 公斤力是重力单位制中的力单位，符号为kgf。
 * 1公斤力定义为质量为1千克的物体在地球表面标准重力加速度下所受的重力。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 kgf = 9.80665 N（牛顿）</li>
 *   <li>1 kgf = 9.80665 Kg·m·s⁻²（千克·米·秒⁻²）</li>
 *   <li>1 N ≈ 0.10197 kgf</li>
 *   <li>1 tf（吨力）= 1000 kgf</li>
 *   <li>1 gf（克力）= 0.001 kgf</li>
 * </ul>
 * <p>
 * 公斤力单位在工程实践中仍被广泛应用，特别是在亚洲地区，
 * 用于测量机械强度、材料承重、起重设备载荷等场合。
 * 尽管国际单位制推荐使用牛顿，但在某些行业领域中公斤力仍然常见。
 * <p>
 * 公斤力与牛顿的换算基于标准重力加速度值9.80665 m/s²。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UForce_Kgf extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义公斤力单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据F=mg（重力公式），力 = 质量 × 重力加速度 = 质量 × 位移/时间²
     * 因此力的单位为 Kg·m·s⁻²。公斤力与牛顿具有相同的基本单位组成，
     * 只是转换因子不同（基于重力加速度的倍数关系）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将公斤力数值转换为标准单位（牛顿）的数值。
     * 由于1kgf = 1kg × g（标准重力加速度），其中g = 9.80665 m/s²，
     * 所以factor = 9.80665。这意味着1公斤力等于9.80665牛顿。
     * 该值通过计算1kg的质量乘以标准重力加速度获得。
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
    private final static String description = "Kgf";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1千克质量在标准重力加速度下的重力值来确定转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UMass_Kg());
        factor = vwu.multiply(new ValueWithUnit(1.0, new UAccelerate_g())).getBasicValue();
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 秒，指数-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个公斤力力单位(kgf)实例
     * <p>
     * 初始化公斤力力单位，设置单位符号为"Kgf"，基本单位组成为Kg·m·s⁻²，
     * 转换因子约为9.80665（即1kgf ≈ 9.80665N），无附加偏移量。
     */
    public UForce_Kgf() {
        // 调用父类DerivedUnit的构造方法，初始化公斤力力单位
        // 参数依次为：单位描述("Kgf")、基本单位元素列表([Kg^1, m^1, s^-2])、转换因子(约为9.80665)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}