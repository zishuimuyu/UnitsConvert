package com.zishuimuyu.science.units.pressure;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 压强单位：bar（巴）
 * <P>
 * 巴是压强的非国际单位制单位，符号为bar。
 * 1巴定义为100,000帕斯卡，近似等于标准大气压。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 bar = 100,000 Pa（帕斯卡）</li>
 *   <li>1 bar = 100 kPa（千帕）</li>
 *   <li>1 bar ≈ 0.9869 atm（标准大气压）</li>
 *   <li>1 bar = 14.504 psi（磅/平方英寸）</li>
 *   <li>1 bar = 1.0197 kgf/cm²（公斤力/平方厘米）</li>
 *   <li>1 atm ≈ 1.01325 bar</li>
 * </ul>
 * <P>
 * 巴单位广泛应用于工程、气象学、海洋学等领域，
 * 特别是在欧洲国家的工业应用中非常常见。
 * 1巴约等于1个标准大气压，便于记忆和使用。
 * <P>
 * 毫巴（mbar）常用于气象学中表示气压。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPressure_bar extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义巴单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为-1  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据P=F/A（压强=力/面积），压强单位 = 力/面积 = (Kg·m·s⁻²)/m² = Kg·m⁻¹·s⁻²
     * 巴与帕斯卡具有相同的基本单位组成，只是转换因子不同（100,000倍关系）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将巴数值转换为标准单位（帕斯卡）的数值。
     * 由于1bar = 100,000Pa，所以factor = 100000.0。
     * 这意味着1巴等于100,000帕斯卡。
     */
    private final static double factor = 100000.0;
    
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
    private final static String description = "bar";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立巴单位与基本单位的关系。
     * 根据P=F/A，压强单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与帕斯卡单位具有相同的单位构成，仅数值上相差100,000倍。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, -1.0));  // 米，指数-1
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    public UPressure_bar() {
        super(description, elementList, factor, additional);
    }

}