package cn.nlte.science.units.power;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import cn.nlte.science.units.ValueWithUnit;
import cn.nlte.science.units.force.UForce_Kgf;
import cn.nlte.science.units.length.ULength_m;
import cn.nlte.science.units.time.UTime_s;
import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：PS（公制马力）
 * <P>
 * 公制马力是非国际单位制的功率单位，符号为PS（德语Pferdestärke，意为"马的力量"）。
 * 1公制马力定义为在1秒钟内将75公斤重的物体提升1米所做的功。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 PS = 735.5 W（瓦特）</li>
 *   <li>1 PS ≈ 0.736 kW（千瓦）</li>
 *   <li>1 PS ≈ 0.986 hp（英制马力）</li>
 *   <li>1 PS ≈ 2509 BTU/h（英热单位/小时）</li>
 *   <li>1 PS = 75 kgf·m/s（公斤力·米/秒）</li>
 *   <li>1 kW ≈ 1.360 PS</li>
 * </ul>
 * <P>
 * 公制马力单位在欧洲、亚洲等地区有广泛应用，
 * 主要用于汽车发动机功率、机械设备功率等领域，
 * 是衡量发动机输出功率的重要指标之一。
 * <P>
 * 该单位与英制马力略有差异，1PS ≈ 0.986hp。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPower_Ps extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义公制马力单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2  
     * - 时间单位秒(s)，指数为-3
     * <P>
     * 根据P=W/t（功率=功/时间），功率单位 = 能量/时间 = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     * 公制马力与瓦特具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将公制马力数值转换为标准单位（瓦特）的数值。
     * 由于1PS = 75 kgf·m/s，该值通过计算75米乘以公斤力除以秒得到。
     * 这意味着1公制马力等于735.5瓦特。
     * 该值通过ValueWithUnit类进行单位运算获得。
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 功率单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Ps";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算75倍的1米乘以1公斤力除以1秒来确定公制马力的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行公斤力单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new ULength_m());
        factor = vwu.multiply(new ValueWithUnit(1.0, new UForce_Kgf())).divide(new ValueWithUnit(1.0, new UTime_s())).getBasicValue() * 75.0;
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 2.0));   // 米，指数2
        elementList.add(new UnitElement(BasicUnit.s, -3.0));  // 秒，指数-3
    }

    public UPower_Ps() {
        super(description, elementList, factor, additional);
    }

}