package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：kWh（千瓦时）
 * <P>
 * 千瓦时是非国际单位制的能量单位，符号为kWh。
 * 1千瓦时定义为功率为1千瓦的电器在1小时内所消耗的电能，
 * 也常被称为"度"，是电力计量的常用单位。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 kWh = 3,600,000 J（焦耳）</li>
 *   <li>1 kWh = 3600 kJ（千焦）</li>
 *   <li>1 kWh = 1000 Wh（瓦时）</li>
 *   <li>1 kWh ≈ 859.85 kcal（千卡）</li>
 *   <li>1 kWh ≈ 3412.14 BTU（英热单位）</li>
 *   <li>1 MWh = 1000 kWh（兆瓦时）</li>
 * </ul>
 * <P>
 * 千瓦时单位在电力行业、家庭用电计量、能源统计等领域有广泛应用，
 * 是衡量电能消耗和发电量的主要单位。
 * 电费账单通常以千瓦时为单位进行计费。
 * <P>
 * 1 kWh = 1 kW × 1 h = 1000 W × 3600 s = 3,600,000 J。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UEnergy_KWh extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义千瓦时单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据W=P·t（功=功率×时间），能量单位 = 功率×时间 = (Kg·m²·s⁻³)·s = Kg·m²·s⁻²
     * 千瓦时与焦耳具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将千瓦时数值转换为标准单位（焦耳）的数值。
     * 由于1kWh = 1kW×1h = 1000W×3600s = 3,600,000J，所以factor = 3600000.0。
     * 这意味着1千瓦时等于3,600,000焦耳。
     */
    private final static double factor = 3600000.0;
    
    /**
     * 附加偏移量
     * <P>
     * 能量单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "KWh";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立千瓦时单位与基本单位的关系。
     * 根据W=P·t，能量单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与焦耳单位具有相同的单位构成，仅数值上相差3,600,000倍。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 2.0));   // 米，指数2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    public UEnergy_KWh() {
        super(description, elementList, factor, additional);
    }

}