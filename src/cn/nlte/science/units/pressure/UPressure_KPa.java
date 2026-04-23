package cn.nlte.science.units.pressure;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 压强单位：kPa（千帕）
 * <P>
 * 千帕是压强的国际单位制倍数单位，符号为kPa。
 * 1千帕定义为1000帕斯卡。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 kPa = 1000 Pa（帕斯卡）</li>
 *   <li>1 MPa = 1000 kPa（兆帕）</li>
 *   <li>1 bar = 100 kPa</li>
 *   <li>1 atm ≈ 101.325 kPa</li>
 *   <li>1 PSI ≈ 6.895 kPa</li>
 *   <li>1 hPa = 0.1 kPa</li>
 * </ul>
 * <P>
 * 千帕单位在工程、科学和技术应用中非常常见，
 * 用于测量中等范围的压强值，如水压、气压、材料强度等。
 * 相比于帕斯卡，千帕更适合表达日常工程中的压强值，
 * 避免了使用过大数字的不便。
 * <P>
 * 该单位是国际单位制的合法倍数单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPressure_KPa extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义千帕单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为-1  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据P=F/A（压强=力/面积），压强单位 = 力/面积 = (Kg·m·s⁻²)/m² = Kg·m⁻¹·s⁻²
     * 千帕与帕斯卡具有相同的基本单位组成，只是转换因子不同（1000倍关系）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将千帕数值转换为标准单位（帕斯卡）的数值。
     * 由于1kPa = 1000Pa，所以factor = 1000.0。
     * 这意味着1千帕等于1000帕斯卡。
     */
    private final static double factor = 1000.0;
    
    /**
     * 附加偏移量
     * <P>
     * 压强单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "KPa";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立千帕单位与基本单位的关系。
     * 根据P=F/A，压强单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与帕斯卡单位具有相同的单位构成，仅数值上相差1000倍。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, -1.0));  // 米，指数-1
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    public UPressure_KPa() {
        super(description, elementList, factor, additional);
    }

}