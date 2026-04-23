package cn.nlte.science.units.energy;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import cn.nlte.science.units.ValueWithUnit;
import cn.nlte.science.units.force.UForce_lbf;
import cn.nlte.science.units.length.ULength_ft;
import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：ft·lbf（英尺·磅力）
 * <P>
 * 英尺磅力是非国际单位制的能量单位，符号为ft·lbf。
 * 1英尺磅力定义为用1磅力使物体在力的方向上移动1英尺所做的功。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 ft·lbf ≈ 1.356 J（焦耳）</li>
 *   <li>1 ft·lbf ≈ 0.001356 kJ（千焦）</li>
 *   <li>1 ft·lbf ≈ 0.324 cal（卡路里）</li>
 *   <li>1 BTU ≈ 778.17 ft·lbf</li>
 *   <li>1 kWh ≈ 2,655,224 ft·lbf</li>
 *   <li>1 J ≈ 0.7376 ft·lbf</li>
 * </ul>
 * <P>
 * 英尺磅力单位在美国等使用英制单位的国家有广泛应用，
 * 主要用于工程计算、机械设计、材料测试等领域，
 * 特别是在描述扭矩和机械功时经常使用。
 * <P>
 * 该单位在机械工程和物理学中仍被广泛使用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UEnergy_ftlbf extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义英尺磅力单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据W=F·s（功=力×距离），能量单位 = 力×距离 = (Kg·m·s⁻²)·m = Kg·m²·s⁻²
     * 英尺磅力与焦耳具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将英尺磅力数值转换为标准单位（焦耳）的数值。
     * 由于1ft·lbf = 1lbf × 1ft，该值通过计算1英尺乘以1磅力得到。
     * 这意味着1英尺磅力约等于1.356焦耳。
     * 该值通过ValueWithUnit类进行单位运算获得。
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
    private final static String description = "ft*lbf";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1英尺乘以1磅力来确定英尺磅力的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行英制单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new ULength_ft());
        factor = vwu.multiply(new ValueWithUnit(1.0, new UForce_lbf())).getBasicValue();
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 2.0));   // 米，指数2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    public UEnergy_ftlbf() {
        super(description, elementList, factor, additional);
    }

}