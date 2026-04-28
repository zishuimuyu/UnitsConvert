package com.zishuimuyu.science.units.power;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：TW（太瓦）
 * <p>
 * 太瓦是国际单位制倍数单位，符号为TW。
 * 1太瓦定义为1000吉瓦，即1,000,000,000,000瓦特。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 TW = 1000 GW（吉瓦）</li>
 *   <li>1 TW = 1,000,000 MW（兆瓦）</li>
 *   <li>1 TW = 1,000,000,000 KW（千瓦）</li>
 *   <li>1 TW = 1,000,000,000,000 W（瓦特）</li>
 *   <li>1 TW ≈ 1,341,000,000 hp（马力）</li>
 *   <li>1 TW ≈ 1,360,000,000 PS（公制马力）</li>
 * </ul>
 * <p>
 * 太瓦单位在全球能源统计、国家电网规划、大型发电项目等领域有应用，
 * 用于测量超大规模的功率值，如国家总发电量、全球能源消耗等。
 * <p>
 * 该单位是国际单位制的合法倍数单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UPower_TW extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义太瓦单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-3
     * <p>
     * 根据P=W/t（功率=功/时间），功率单位 = 能量/时间 = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     * 太瓦与瓦特具有相同的基本单位组成，只是转换因子不同（1000000000000倍关系）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将太瓦数值转换为标准单位（瓦特）的数值。
     * 由于1TW = 1000GW = 1000×1000×1000×1000W = 1,000,000,000,000W，所以factor = 1000000000000.0。
     * 这意味着1太瓦等于1万亿瓦特。
     */
    private final static double factor = 1000000000000.0;

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
    private final static String description = "TW";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立太瓦单位与基本单位的关系。
     * 根据P=W/t，功率单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与瓦特单位具有相同的单位构成，仅数值上相差1000000000000倍。
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
     * 构造函数，创建一个太瓦功率单位(TW)实例
     * <p>
     * 初始化太瓦功率单位，设置单位符号为"TW"，基本单位组成为Kg·m²·s⁻³，
     * 转换因子为1000000000000（即1TW = 1,000,000,000,000W），无附加偏移量。
     */
    public UPower_TW() {
        // 调用父类DerivedUnit的构造方法，初始化太瓦功率单位
        // 参数依次为：单位描述("TW")、基本单位元素列表([Kg^1, m^2, s^-3])、转换因子(1000000000000.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}