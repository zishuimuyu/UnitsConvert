package cn.nlte.science.units.force;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：kN（千牛顿）
 * <P>
 * 千牛顿是力的国际单位制倍数单位，符号为kN。
 * 1千牛顿定义为1000牛顿的力，即10³牛顿。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 kN = 1000 N（牛顿）</li>
 *   <li>1 kN = 1000 Kg·m·s⁻²（千克·米·秒⁻²）</li>
 *   <li>1 kN ≈ 101.97 kgf（公斤力）</li>
 *   <li>1 kgf ≈ 0.009807 kN</li>
 *   <li>1 MN（兆牛顿）= 1000 kN</li>
 *   <li>1 N = 0.001 kN</li>
 * </ul>
 * <P>
 * 千牛顿单位广泛应用于工程力学、结构工程、桥梁设计、建筑结构等领域，
 * 用于测量较大的力值，如建筑物荷载、桥梁承载能力、大型机械的推拉力等。
 * <P>
 * 在土木工程和建筑工程中，千牛顿是重要的力单位，特别适用于大型结构的受力分析。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UForce_KN extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义千牛顿单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为1  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据F=ma（牛顿第二定律），力 = 质量 × 加速度 = 质量 × 位移/时间²
     * 因此力的单位为 Kg·m·s⁻²。千牛顿与牛顿具有相同的基本单位组成，
     * 只是转换因子不同（1000倍关系）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将千牛顿数值转换为标准单位（牛顿）的数值。
     * 由于1kN = 1000N，所以factor = 1000.0。
     * 这意味着1千牛顿等于1000牛顿。
     */
    private final static double factor = 1000.0;
    
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
    private final static String description = "KN";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立千牛顿单位与基本单位的关系。
     * 根据F=ma，千牛顿由千克、米、秒三个基本单位按特定指数组合而成，
     * 与牛顿单位具有相同的单位构成，仅数值上相差1000倍。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));   // 米，指数1
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    public UForce_KN() {
        super(description, elementList, factor, additional);
    }

}