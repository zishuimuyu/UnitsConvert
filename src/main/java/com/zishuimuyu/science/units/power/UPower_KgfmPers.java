package com.zishuimuyu.science.units.power;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.energy.UEnergy_Kgfm;
import com.zishuimuyu.science.units.time.UTime_s;

import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：kgf·m/s（公斤力·米/秒）
 * <p>
 * 公斤力米每秒是非国际单位制的功率单位，符号为kgf·m/s。
 * 1 kgf·m/s定义为每秒完成1公斤力·米的功。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 kgf·m/s ≈ 9.807 W（瓦特）</li>
 *   <li>1 kgf·m/s ≈ 0.009807 kW（千瓦）</li>
 *   <li>1 kgf·m/s ≈ 0.0132 hp（马力）</li>
 *   <li>1 PS = 75 kgf·m/s（公制马力）</li>
 *   <li>1 hp ≈ 550 ft·lbf/s ≈ 75 kgf·m/s</li>
 *   <li>1 W ≈ 0.102 kgf·m/s</li>
 * </ul>
 * <p>
 * kgf·m/s单位在某些工程领域有应用，特别是在一些亚洲国家的工程实践中，
 * 用于测量小型机械功率、液压系统功率等。
 * 该单位基于公斤力，与牛顿制的瓦特存在固定换算关系。
 * <p>
 * 在工程实践中，该单位常用于表示小型机械的功率输出。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPower_KgfmPers extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义公斤力米每秒单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-3
     * <p>
     * 根据P=E/t（功率=能量/时间），功率单位 = 能量/时间 = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     * kgf·m/s与瓦特具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将公斤力米每秒数值转换为标准单位（瓦特）的数值。
     * 由于1kgf·m/s = 1kgf·m/s，该值通过计算1公斤力米除以1秒得到。
     * 这意味着1 kgf·m/s约等于9.807瓦特。
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
    private final static String description = "Kgf*m/s";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1公斤力米除以1秒来确定公斤力米每秒的转换因子。
     * 使用ValueWithUnit类进行单位运算，确保单位转换的准确性。
     * 由于内部统一使用国际单位制，因此需要进行公斤力单位到国际单位制的转换。
     */
    static {
        ValueWithUnit vwu = new ValueWithUnit(1.0, new UEnergy_Kgfm());
        factor = vwu.divide(new ValueWithUnit(1.0, new UTime_s())).getBasicValue();
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
        // 添加秒基本单位，指数为-3
        elementList.add(new UnitElement(BasicUnit.s, -3.0));
    }

    /**
     * 构造函数，创建一个公斤力米每秒功率单位(kgf·m/s)实例
     * <p>
     * 初始化公斤力米每秒功率单位，设置单位符号为"Kgf*m/s"，基本单位组成为Kg·m²·s⁻³，
     * 转换因子约为9.807（即1kgf·m/s ≈ 9.807W），无附加偏移量。
     */
    public UPower_KgfmPers() {
        // 调用父类DerivedUnit的构造方法，初始化公斤力米每秒功率单位
        // 参数依次为：单位描述("Kgf*m/s")、基本单位元素列表([Kg^1, m^2, s^-3])、转换因子(约为9.807)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}