package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：kip（千磅力）
 * <p>
 * 千磅力是英制单位制中的力单位，符号为kip。
 * 1千磅力定义为1000磅力的力，常用于工程结构设计和建筑领域。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 kip = 1000 lbf（磅力）</li>
 *   <li>1 kip ≈ 4448.22 N（牛顿）</li>
 *   <li>1 kip ≈ 4.448 kN（千牛顿）</li>
 *   <li>1 kip ≈ 0.4536 tf（公吨力）</li>
 *   <li>1 lbf = 0.001 kip</li>
 * </ul>
 * <p>
 * 千磅力单位在美国等使用英制单位的国家有广泛应用，
 * 主要用于土木工程、结构工程、建筑等领域，
 * 特别是在测量大型建筑结构的承载能力、桥梁设计等方面。
 * <p>
 * kip是"kilo-pound"的缩写，代表千磅力单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UForce_kip extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义千磅力单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据F=mg（重力公式），力 = 质量 × 重力加速度 = 质量 × 位移/时间²
     * 因此力的单位为 Kg·m·s⁻²。千磅力与牛顿具有相同的基本单位组成，
     * 只是转换因子不同（基于千磅质量 和重力加速度的乘积）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将千磅力数值转换为标准单位（牛顿）的数值。
     * 由于1kip = 1000 lbf（磅力），该值通过计算磅力的转换因子乘以1000获得。
     * 这意味着1千磅力等于1000磅力。
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
    private final static String description = "kip";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1000磅力的总值来确定千磅力的转换因子。
     * 1千磅力等于1000磅力，因此转换因子为磅力转换因子的1000倍。
     */
    static {
        factor = new UForce_lbf().getFactor() * 1000.0;
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 秒，指数-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个千磅力力单位(kip)实例
     * <p>
     * 初始化千磅力力单位，设置单位符号为"kip"，基本单位组成为Kg·m·s⁻²，
     * 转换因子约为4448.22（即1kip ≈ 4448.22N），无附加偏移量。
     */
    public UForce_kip() {
        // 调用父类DerivedUnit的构造方法，初始化千磅力力单位
        // 参数依次为：单位描述("kip")、基本单位元素列表([Kg^1, m^1, s^-2])、转换因子(约为4448.22)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}