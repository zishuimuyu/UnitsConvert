package cn.nlte.science.units.force;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：N（牛顿）
 * <P>
 * 牛顿是国际单位制中力的基本导出单位，符号为N。
 * 1牛顿定义为使质量为1千克的物体产生1米/秒²加速度所需的力。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 N = 1 Kg·m·s⁻²（千克·米·秒⁻²）</li>
 *   <li>1 N ≈ 0.10197 kgf（公斤力）</li>
 *   <li>1 kgf = 9.80665 N</li>
 *   <li>1 kN = 1000 N（千牛顿）</li>
 * </ul>
 * <P>
 * 牛顿单位广泛应用于物理学和工程学领域，用于测量各种力的大小，
 * 如重力、摩擦力、弹力、电磁力等。在机械工程、土木工程、航空航天等领域都有重要应用。
 * <P>
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
     * <P>
     * 定义牛顿单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为1  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据F=ma（牛顿第二定律），力 = 质量 × 加速度 = 质量 × 位移/时间²
     * 因此力的单位为 Kg·m·s⁻²
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 牛顿是力的标准单位，因此转换因子为1.0。
     * 用于与其他力单位进行数值转换。
     */
    private final static double factor = 1.0;
    
    /**
     * 附加偏移量
     * <P>
     * 力单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
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
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));   // 米，指数1
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    /**
     * 构造方法
     * <P>
     * 创建牛顿单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     */
    public UForce_N() {
        super(description, elementList, factor, additional);
    }

}