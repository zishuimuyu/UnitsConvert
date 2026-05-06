package com.zishuimuyu.science.units.power;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：MW（兆瓦）
 * <p>
 * 兆瓦是国际单位制倍数单位，符号为MW。
 * 1兆瓦定义为1,000,000瓦特（10⁶ W）。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 MW = 1,000,000 W（瓦特）</li>
 *   <li>1 MW = 1000 kW（千瓦）</li>
 *   <li>1 GW = 1000 MW（吉瓦）</li>
 *   <li>1 MW ≈ 1341 hp（马力）</li>
 *   <li>1 MW ≈ 1360 PS（公制马力）</li>
 *   <li>1 MW ≈ 3412 BTU/h（英热单位/小时）</li>
 * </ul>
 * <p>
 * 兆瓦单位在电力工程、大型工业、发电站等领域有广泛应用，
 * 用于测量较大的功率值，如发电机组功率、
 * 工业用电容量、船舶推进功率等。
 * <p>
 * 该单位是国际单位制的合法倍数单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPower_MW extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义兆瓦单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-3
     * <p>
     * 根据P=W/t（功率=功/时间），功率单位 = 能量/时间 = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     * 兆瓦与瓦特具有相同的基本单位组成，只是转换因子不同（1,000,000倍关系）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将兆瓦数值转换为标准单位（瓦特）的数值。
     * 由于1MW = 1,000,000W = 10⁶W，所以factor = 1.0E6。
     * 这意味着1兆瓦等于1,000,000瓦特。
     */
    private final static double factor = 1.0E6;

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
    private final static String description = "MW";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立兆瓦单位与基本单位的关系。
     * 根据P=W/t，功率单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与瓦特单位具有相同的单位构成，仅数值上相差1,000,000倍。
     */
    static {
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
        // 秒，指数-3
        elementList.add(new UnitElement(BasicUnit.s, -3.0));
    }

    /**
     * 构造函数，创建一个兆瓦功率单位(MW)实例
     * <p>
     * 初始化兆瓦功率单位，设置单位符号为"MW"，基本单位组成为Kg·m²·s⁻³，
     * 转换因子为1000000（即1MW = 1000000W），无附加偏移量。
     */
    public UPower_MW() {
        // 调用父类DerivedUnit的构造方法，初始化兆瓦功率单位
        // 参数依次为：单位描述("MW")、基本单位元素列表([Kg^1,m^2,s^-3])、转换因子(1.0E6)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}