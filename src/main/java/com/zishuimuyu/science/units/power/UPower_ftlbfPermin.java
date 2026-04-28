package com.zishuimuyu.science.units.power;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.energy.UEnergy_ftlbf;
import com.zishuimuyu.science.units.time.UTime_min;

import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：ft·lbf/min（英尺·磅力/分钟）
 * <p>
 * 英尺磅力每分钟是非国际单位制的功率单位，符号为ft·lbf/min。
 * 1 ft·lbf/min定义为每分钟完成1英尺·磅力的功。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ft·lbf/min ≈ 0.022597 W（瓦特）</li>
 *   <li>1 ft·lbf/min ≈ 0.000022597 KW（千瓦）</li>
 *   <li>1 ft·lbf/min ≈ 0.0000303 hp（马力）</li>
 *   <li>1 hp = 33,000 ft·lbf/min</li>
 *   <li>1 ft·lbf/s = 60 ft·lbf/min</li>
 *   <li>1 kW ≈ 44,254 ft·lbf/min</li>
 * </ul>
 * <p>
 * ft·lbf/min单位在美国等使用英制单位的国家有广泛应用，
 * 主要用于工程计算、机械设计、材料测试等领域，
 * 特别是在描述低功率输出或长时间工作的设备时经常使用。
 * <p>
 * 该单位在机械工程和物理学中仍有使用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UPower_ftlbfPermin extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义英尺磅力每分钟单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-3
     * <p>
     * 根据P=E/t（功率=能量/时间），功率单位 = 能量/时间 = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     * ft·lbf/min与瓦特具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将英尺磅力每分钟数值转换为标准单位（瓦特）的数值。
     * 由于1ft·lbf/min = 1ft·lbf/min，该值通过计算1英尺磅力除以1分钟得到。
     * 这意味着1 ft·lbf/min约等于0.022597瓦特。
     * 该值通过ValueWithUnit类进行单位运算获得。
     */
    private final static double factor;

    /**
     * 附加偏移量
     * <p>
     * 功率单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "ft*lbf/min";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1英尺磅力除以1分钟来确定英尺磅力每分钟的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行英制单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UEnergy_ftlbf());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_min())).getBasicValue();
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
        // 秒，指数-3
        elementList.add(new UnitElement(BasicUnit.s, -3.0));
    }

    /**
     * 构造函数，创建一个英尺磅力每分钟功率单位(ft·lbf/min)实例
     * <p>
     * 初始化英尺磅力每分钟功率单位，设置单位符号为"ft*lbf/min"，基本单位组成为Kg·m²·s⁻³，
     * 转换因子约为0.022597（即1ft·lbf/min ≈ 0.022597W），无附加偏移量。
     */
    public UPower_ftlbfPermin() {
        // 调用父类DerivedUnit的构造方法，初始化英尺磅力每分钟功率单位
        // 参数依次为：单位描述("ft*lbf/min")、基本单位元素列表([Kg^1, m^2, s^-3])、转换因子(约为0.022597)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}