package com.zishuimuyu.science.units.velocity;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.length.ULength_nmi;
import com.zishuimuyu.science.units.time.UTime_h;
import java.util.ArrayList;
import java.util.List;

/**
 * 速度单位：kn（节）
 * <P>
 * 节是非国际单位制速度单位，符号为kn（knot）。
 * 1节定义为每小时航行1海里，即1 nmi/h。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 kn ≈ 0.5144 m/s（米/秒）</li>
 *   <li>1 kn ≈ 1.852 km/h（千米/小时）</li>
 *   <li>1 kn ≈ 1.151 mph（英里/小时）</li>
 *   <li>1 km/h ≈ 0.540 kn</li>
 *   <li>音速 ≈ 661.7 kn（标准大气条件下）</li>
 *   <li>1 m/s ≈ 1.944 kn</li>
 * </ul>
 * <P>
 * 节单位在航海和航空领域有广泛应用，
 * 用于表示船只速度、飞机空速等。
 * 这是海上和空中导航的标准速度单位，
 * 在海图、飞行计划和气象报告中经常使用。
 * <P>
 * 该单位源于历史上海员测量船只速度的方法。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVelocity_Kn extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义节单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-1
     * <P>
     * 根据v=s/t（速度=距离/时间），速度单位 = 距离/时间 = m/s
     * 节与米每秒具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将节数值转换为标准单位（米每秒）的数值。
     * 由于1kn = 1nmi/h，该值通过计算1海里除以1小时得到。
     * 这意味着1节约等于0.5144米每秒。
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
    private final static String description = "Kn";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1海里除以1小时来确定节的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行海里和小时单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new ULength_nmi());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_h())).getBasicValue();
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
        elementList.add(new UnitElement(BasicUnit.s, -1.0)); // 秒，指数-1
    }

    public UVelocity_Kn() {
        super(description, elementList, factor, additional);
    }

}