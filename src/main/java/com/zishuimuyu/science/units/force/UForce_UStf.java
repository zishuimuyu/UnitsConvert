package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：UStf（美吨力/短吨力）
 * <p>
 * 美吨力是英制单位制中的力单位，符号为UStf或tonf。
 * 1美吨力定义为质量为1美吨（短吨）的物体在地球表面标准重力加速度下所受的重力。
 * 1美吨（短吨）等于2000磅。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 UStf = 2000 lbf（磅力）</li>
 *   <li>1 UStf ≈ 8896.44 N（牛顿）</li>
 *   <li>1 UStf ≈ 8.896 kN（千牛顿）</li>
 *   <li>1 UStf ≈ 0.907 tf（公吨力）</li>
 *   <li>1 lbf = 0.0005 UStf</li>
 * </ul>
 * <p>
 * 美吨力单位在美国等使用英制单位的国家有广泛应用，
 * 主要用于重型机械、船舶工程、起重设备等领域，
 * 特别是在测量大型设备的承载能力、起重机的最大起重量等方面。
 * <p>
 * 美吨力与公吨力不同，公吨力基于公制吨（1000kg），而美吨力基于美吨（2000磅）。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UForce_UStf extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义美吨力单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据F=mg（重力公式），力 = 质量 × 重力加速度 = 质量 × 位移/时间²
     * 因此力的单位为 Kg·m·s⁻²。美吨力与牛顿具有相同的基本单位组成，
     * 只是转换因子不同（基于美吨质量和重力加速度的乘积）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将美吨力数值转换为标准单位（牛顿）的数值。
     * 由于1UStf = 2000 lbf（磅力），该值通过计算磅力的转换因子乘以2000获得。
     * 这意味着1美吨力等于2000磅力。
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
    private final static String description = "UStf";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算2000磅力的总值来确定美吨力的转换因子。
     * 1美吨力等于2000磅力，因此转换因子为磅力转换因子的2000倍。
     */
    static {
        factor = new UForce_lbf().getFactor() * 2000.0;
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 添加秒基本单位，指数为-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个美吨力力单位(UStf)实例
     * <p>
     * 初始化美吨力力单位，设置单位符号为"UStf"，基本单位组成为Kg·m·s⁻²，
     * 转换因子约为8896.44（即1UStf ≈ 8896.44N），无附加偏移量。
     */
    public UForce_UStf() {
        // 调用父类DerivedUnit的构造方法，初始化美吨力力单位
        // 参数依次为：单位描述("UStf")、基本单位元素列表([Kg^1, m^1, s^-2])、转换因子(约为8896.44)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}