package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：BTU（英制热单位/British Thermal Unit）
 * <p>
 * 英制热单位是非国际单位制的能量单位，符号为BTU。
 * 1 BTU定义为将1磅水的温度升高1华氏度所需的热量。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 BTU ≈ 1055.06 J（焦耳）</li>
 *   <li>1 BTU ≈ 1.055 kJ（千焦）</li>
 *   <li>1 MBTU = 1000 BTU（千英热单位）</li>
 *   <li>1 therm = 100,000 BTU（热姆）</li>
 *   <li>1 kWh ≈ 3412.14 BTU（千瓦时）</li>
 *   <li>1 BTU ≈ 252.16 cal（卡路里）</li>
 * </ul>
 * <p>
 * BTU单位在美国和其他使用英制单位的国家有广泛应用，
 * 主要用于空调制冷量、供暖设备功率、燃料能量含量等场合，
 * 是暖通空调(HVAC)行业中重要的能量单位。
 * <p>
 * 该单位在能源和工程领域中仍被广泛使用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UEnergy_Btn extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义英制热单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据W=F·s（功=力×距离），能量单位 = 力×距离 = (Kg·m·s⁻²)·m = Kg·m²·s⁻²
     * BTU与焦耳具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将英制热单位数值转换为标准单位（焦耳）的数值。
     * 由于1BTU ≈ 1055.06J，所以factor = 1055.0558526。
     * 这是国际标准定义的BTU到焦耳的转换系数。
     */
    private final static double factor = 1055.0558526;

    /**
     * 附加偏移量
     * <p>
     * 能量单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Btn";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立英制热单位与基本单位的关系。
     * 根据W=F·s，能量单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与焦耳单位具有相同的单位构成，仅数值上相差约1055.06倍。
     */
    static {
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
        // 添加秒基本单位，指数为-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个英制热单位能量单位(BTU)实例
     * <p>
     * 初始化英制热单位能量单位，设置单位符号为"Btn"，基本单位组成为Kg·m²·s⁻²，
     * 转换因子约为1055.06（即1BTU ≈ 1055.06J），无附加偏移量。
     */
    public UEnergy_Btn() {
        // 调用父类DerivedUnit的构造方法，初始化英制热单位能量单位
        // 参数依次为：单位描述("Btn")、基本单位元素列表([Kg^1, m^2, s^-2])、转换因子(1055.0558526)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}