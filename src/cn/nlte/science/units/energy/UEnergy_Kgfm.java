package cn.nlte.science.units.energy;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import cn.nlte.science.units.force.UForce_Kgf;
import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：kgf·m（公斤力·米）
 * <P>
 * 公斤力米是非国际单位制的能量单位，符号为kgf·m。
 * 1公斤力米定义为用1公斤力使物体在力的方向上移动1米所做的功。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 kgf·m ≈ 9.80665 J（焦耳）</li>
 *   <li>1 kgf·m ≈ 0.009807 kJ（千焦）</li>
 *   <li>1 kgf·m ≈ 2.228×10⁻⁶ kWh（千瓦时）</li>
 *   <li>1 kgf·m ≈ 2.344 cal（卡路里）</li>
 *   <li>1 J ≈ 0.10197 kgf·m</li>
 *   <li>1 kpm = 1 kgf·m（千克力米）</li>
 * </ul>
 * <P>
 * 公斤力米单位在某些工程领域有应用，特别是在一些亚洲国家的工程实践中，
 * 用于测量机械功和能量转换。该单位基于公斤力，与牛顿制的焦耳存在固定换算关系。
 * <P>
 * 在工程实践中，该单位常用于表示小型机械的功和能量。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UEnergy_Kgfm extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义公斤力米单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据W=F·s（功=力×距离），能量单位 = 力×距离 = (Kg·m·s⁻²)·m = Kg·m²·s⁻²
     * 公斤力米与焦耳具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将公斤力米数值转换为标准单位（焦耳）的数值。
     * 由于1kgf·m = 1kgf × 1m，该值通过获取公斤力单位的转换因子获得。
     * 这意味着1公斤力米约等于9.80665焦耳。
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 能量单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Kgfm";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过获取公斤力单位的转换因子来确定公斤力米的转换因子。
     * 1公斤力米等于1公斤力乘以1米的距离，因此转换因子与公斤力单位相同。
     */
    static {
        factor = new UForce_Kgf().getFactor();
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 2.0));   // 米，指数2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    public UEnergy_Kgfm() {
        super(description, elementList, factor, additional);
    }

}