package com.zishuimuyu.science.units.pressure;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 压强单位：mmHg（毫米汞柱）
 * <p>
 * 毫米汞柱是压强的非国际单位制单位，符号为mmHg。
 * 1毫米汞柱定义为在0°C时，密度为13.5951 g/cm³的纯汞所产生的压强，
 * 等于标准大气压的1/760，即1 atm = 760 mmHg。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 mmHg ≈ 133.322 Pa（帕斯卡）</li>
 *   <li>1 mmHg ≈ 0.1333 kPa（千帕）</li>
 *   <li>1 atm = 760 mmHg</li>
 *   <li>1 mmHg ≈ 0.01934 PSI</li>
 *   <li>1 bar ≈ 750.06 mmHg</li>
 *   <li>1 torr ≈ 1 mmHg（托与毫米汞柱近似相等）</li>
 * </ul>
 * <p>
 * 毫米汞柱单位在医学、生理学、真空技术等领域有广泛应用，
 * 特别是在血压测量中，收缩压和舒张压均以毫米汞柱为单位报告。
 * 该单位源于早期的水银气压计，至今仍在临床医学中使用。
 * <p>
 * 毫米汞柱与托尔（torr）单位数值上几乎相等，但定义略有不同。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPressure_mmHg extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义毫米汞柱单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为-1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据P=F/A（压强=力/面积），压强单位 = 力/面积 = (Kg·m·s⁻²)/m² = Kg·m⁻¹·s⁻²
     * 毫米汞柱与帕斯卡具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将毫米汞柱数值转换为标准单位（帕斯卡）的数值。
     * 由于1atm = 760mmHg，所以1mmHg = (101325/760)Pa ≈ 133.322Pa。
     * 该值通过计算标准大气压的转换因子除以760得到。
     */
    private final static double factor;

    /**
     * 附加偏移量
     * <p>
     * 压强单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "mmHg";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算标准大气压的转换因子除以760来确定毫米汞柱的转换因子。
     * 1标准大气压等于760毫米汞柱，这是该单位的定义基础。
     */
    static {
        factor = new UPressure_atm().getFactor() / 760.0;
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 米，指数-1
        elementList.add(new UnitElement(BasicUnit.m, -1.0));
        // 秒，指数-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个毫米汞柱压强单位(mmHg)实例
     * <p>
     * 初始化毫米汞柱压强单位，设置单位符号为"mmHg"，基本单位组成为Kg·m⁻¹·s⁻²，
     * 转换因子为133.32233333333334（即1mmHg ≈ 133.322Pa），无附加偏移量。
     */
    public UPressure_mmHg() {
        // 调用父类DerivedUnit的构造方法，初始化毫米汞柱压强单位
        // 参数依次为：单位描述("mmHg")、基本单位元素列表([Kg^1, m^-1, s^-2])、转换因子(约为133.322)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}