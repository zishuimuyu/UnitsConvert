package cn.nlte.science.units.power;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：kW（千瓦）
 * <P>
 * 千瓦是国际单位制倍数单位，符号为kW。
 * 1千瓦定义为1000瓦特。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 kW = 1000 W（瓦特）</li>
 *   <li>1 MW = 1000 kW（兆瓦）</li>
 *   <li>1 kW ≈ 1.341 hp（马力）</li>
 *   <li>1 kW ≈ 1.360 PS（公制马力）</li>
 *   <li>1 kW ≈ 3412.14 BTU/h（英热单位/小时）</li>
 *   <li>1 kW = 1000 J/s（焦耳/秒）</li>
 * </ul>
 * <P>
 * 千瓦单位在工程、电力、机械等领域有广泛应用，
 * 用于测量中等范围的功率值，如家用电器功率、
 * 小型发动机功率、电力设备容量等。
 * <P>
 * 该单位是国际单位制的合法倍数单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPower_KW extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义千瓦单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2  
     * - 时间单位秒(s)，指数为-3
     * <P>
     * 根据P=W/t（功率=功/时间），功率单位 = 能量/时间 = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     * 千瓦与瓦特具有相同的基本单位组成，只是转换因子不同（1000倍关系）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将千瓦数值转换为标准单位（瓦特）的数值。
     * 由于1kW = 1000W，所以factor = 1000.0。
     * 这意味着1千瓦等于1000瓦特。
     */
    private final static double factor = 1000.0;
    
    /**
     * 附加偏移量
     * <P>
     * 功率单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "KW";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立千瓦单位与基本单位的关系。
     * 根据P=W/t，功率单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与瓦特单位具有相同的单位构成，仅数值上相差1000倍。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 2.0));   // 米，指数2
        elementList.add(new UnitElement(BasicUnit.s, -3.0));  // 秒，指数-3
    }

    public UPower_KW() {
        super(description, elementList, factor, additional);
    }

}