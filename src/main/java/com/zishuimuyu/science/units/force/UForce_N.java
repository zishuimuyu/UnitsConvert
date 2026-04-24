package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：N（牛顿）
 * <p>
 * 牛顿是国际单位制中力的基本导出单位，符号为N。
 * 1牛顿定义为使质量为1千克的物体产生1米/秒²加速度所需的力。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 N = 1 Kg·m·s⁻²（千克·米·秒⁻²）</li>
 *   <li>1 N ≈ 0.10197 kgf（公斤力）</li>
 *   <li>1 kgf = 9.80665 N</li>
 *   <li>1 kN = 1000 N（千牛顿）</li>
 * </ul>
 * <p>
 * 牛顿单位广泛应用于物理学和工程学领域，用于测量各种力的大小，
 * 如重力、摩擦力、弹力、电磁力等。在机械工程、土木工程、航空航天等领域都有重要应用。
 * <p>
 * 在SI单位制中，力的单位是通过基本单位（质量、长度、时间）的组合来定义的，
 * 体现了单位制的内在一致性。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UForce_N extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义牛顿单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据F=ma（牛顿第二定律），力 = 质量 × 加速度 = 质量 × 位移/时间²
     * 因此力的单位为 Kg·m·s⁻²
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 牛顿是力的标准单位，因此转换因子为1.0。
     * 用于与其他力单位进行数值转换。
     */
    private final static double factor = 1.0;

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
    private final static String description = "N";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立牛顿单位与基本单位的关系。
     * 根据F=ma，牛顿由千克、米、秒三个基本单位按特定指数组合而成。
     */
    static {
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 秒，指数-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个牛顿力单位(N)实例
     * <p>
     * 初始化牛顿力单位，设置单位符号为"N"，基本单位组成为Kg·m·s⁻²，
     * 转换因子为1（即1N = 1N），无附加偏移量。
     */
    public UForce_N() {
        // 调用父类DerivedUnit的构造方法，初始化牛顿力单位
        // 参数依次为：单位描述("N")、基本单位元素列表([Kg^1, m^1, s^-2])、转换因子(1.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}