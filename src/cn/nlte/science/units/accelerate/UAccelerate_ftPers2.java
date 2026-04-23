package cn.nlte.science.units.accelerate;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import cn.nlte.science.units.ValueWithUnit;
import cn.nlte.science.units.length.ULength_ft;
import cn.nlte.science.units.time.UTime_s;
import java.util.ArrayList;
import java.util.List;

/**
 * 加速度单位：ft/s²（英尺每二次方秒）
 * <P>
 * 英尺每二次方秒是非国际单位制加速度单位，符号为ft/s²。
 * 1英尺每二次方秒定义为物体在1秒内速度增加1英尺/秒的加速度。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 ft/s² ≈ 0.3048 m/s²（米/秒²）</li>
 *   <li>1 ft/s² ≈ 0.031 g（重力加速度）</li>
 *   <li>1 m/s² ≈ 3.281 ft/s²</li>
 *   <li>1 g ≈ 32.174 ft/s²</li>
 * </ul>
 * <P>
 * 英尺每二次方秒单位在美国等使用英制单位的国家有应用，
 * 用于测量各种运动物体的加速度，如车辆加速、飞行器机动等。
 * 在航空航天、汽车工程等领域，有时会使用英制单位系统。
 * <P>
 * 该单位在使用英制系统的工程环境中常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UAccelerate_ftPers2 extends DerivedUnit {
    
    /**
     * 基本单位元素列表
     * <P>
     * 定义英尺每二次方秒单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据a=Δv/Δt（加速度=速度变化量/时间），ft/s²需要转换为m/s²的基本单位形式。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将英尺每二次方秒数值转换为标准单位（米每二次方秒）的数值。
     * 通过ValueWithUnit进行单位换算，从英尺转换为米。
     * 这意味着1英尺每二次方秒约等于0.3048米每二次方秒。
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 加速度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "ft/s^2";
    
    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过ValueWithUnit类进行单位换算，将英尺每二次方秒转换为基本单位。
     * 使用1英尺除以1秒的平方来计算转换因子。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new ULength_ft());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_s()).power(2.0)).getBasicValue();
        elementList.add(new UnitElement(BasicUnit.m, 1.0));   // 米，指数1
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }
    
    public UAccelerate_ftPers2() {
        super(description, elementList, factor, additional);
    }
    
}