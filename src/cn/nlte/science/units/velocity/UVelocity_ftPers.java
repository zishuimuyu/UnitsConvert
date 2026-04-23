package cn.nlte.science.units.velocity;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import cn.nlte.science.units.ValueWithUnit;
import cn.nlte.science.units.length.ULength_ft;
import cn.nlte.science.units.time.UTime_s;
import java.util.ArrayList;
import java.util.List;

/**
 * 速度单位：ft/s（英尺/秒）
 * <P>
 * 英尺每秒是非国际单位制速度单位，符号为ft/s。
 * 1英尺每秒定义为物体在1秒内移动1英尺的距离。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 ft/s ≈ 0.3048 m/s（米/秒）</li>
 *   <li>1 ft/s ≈ 1.097 km/h（千米/小时）</li>
 *   <li>1 ft/s ≈ 0.682 mph（英里/小时）</li>
 *   <li>1 ft/s ≈ 0.592 kn（节）</li>
 *   <li>1 m/s ≈ 3.281 ft/s</li>
 *   <li>音速 ≈ 1125 ft/s（标准大气条件下）</li>
 *   <li>1 mph ≈ 1.467 ft/s</li>
 * </ul>
 * <P>
 * 英尺每秒单位在美国等使用英制单位的国家有广泛应用，
 * 用于工程计算、空气动力学、流体力学等领域，
 * 特别是在描述风速、流体速度等方面经常使用。
 * <P>
 * 该单位在某些工程和科学计算中仍然重要。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVelocity_ftPers extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义英尺每秒单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-1
     * <P>
     * 根据v=s/t（速度=距离/时间），速度单位 = 距离/时间 = m/s
     * 英尺每秒与米每秒具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将英尺每秒数值转换为标准单位（米每秒）的数值。
     * 由于1ft/s = 1ft/1s，该值通过计算1英尺除以1秒得到。
     * 这意味着1英尺每秒约等于0.3048米每秒。
     * 该值通过ValueWithUnit类进行单位运算获得。
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 速度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "ft/s";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1英尺除以1秒来确定英尺每秒的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行英尺单位到米单位的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new ULength_ft());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_s())).getBasicValue();
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
        elementList.add(new UnitElement(BasicUnit.s, -1.0)); // 秒，指数-1
    }

    public UVelocity_ftPers() {
        super(description, elementList, factor, additional);
    }

}