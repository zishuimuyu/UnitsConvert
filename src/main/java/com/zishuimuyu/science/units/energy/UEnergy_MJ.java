package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：MJ（兆焦）
 * <p>
 * 兆焦是国际单位制倍数单位，符号为MJ。
 * 1兆焦定义为1,000,000焦耳（10⁶ J）。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 MJ = 1,000,000 J（焦耳）</li>
 *   <li>1 MJ = 1000 kJ（千焦）</li>
 *   <li>1 GJ = 1000 MJ（吉焦）</li>
 *   <li>1 MJ ≈ 239 kcal（千卡）</li>
 *   <li>1 MJ ≈ 239,000 cal（卡路里）</li>
 *   <li>1 kWh ≈ 3.6 MJ（千瓦时）</li>
 * </ul>
 * <p>
 * 兆焦单位在工程、能源、热力学等领域有广泛应用，
 * 用于测量大范围的能量值，如燃料能量含量、
 * 工业过程能耗、能源统计等。
 * <p>
 * 该单位适合表达较大规模的能量转换和存储。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UEnergy_MJ extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义兆焦单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据W=F·s（功=力×距离），能量单位 = 力×距离 = (Kg·m·s⁻²)·m = Kg·m²·s⁻²
     * 兆焦与焦耳具有相同的基本单位组成，只是转换因子不同（1,000,000倍关系）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将兆焦数值转换为标准单位（焦耳）的数值。
     * 由于1MJ = 1,000,000J = 10⁶J，所以factor = 1.0E6 = 1000000.0。
     * 这意味着1兆焦等于1,000,000焦耳。
     */
    private final static double factor = 1.0E6;

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
    private final static String description = "MJ";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立兆焦单位与基本单位的关系。
     * 根据W=F·s，能量单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与焦耳单位具有相同的单位构成，仅数值上相差1,000,000倍。
     */
    static {
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
        // 秒，指数-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个兆焦能量单位(MJ)实例
     * <p>
     * 初始化兆焦能量单位，设置单位符号为"MJ"，基本单位组成为Kg·m²·s⁻²，
     * 转换因子为1000000（即1MJ = 1000000J），无附加偏移量。
     */
    public UEnergy_MJ() {
        // 调用父类DerivedUnit的构造方法，初始化兆焦能量单位
        // 参数依次为：单位描述("MJ")、基本单位元素列表([Kg^1, m^2, s^-2])、转换因子(1.0E6)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}