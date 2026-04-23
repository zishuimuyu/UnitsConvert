package com.zishuimuyu.science.units.pressure;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 压强单位：atm（标准大气压）
 * <P>
 * 标准大气压是压强的非国际单位制单位，符号为atm。
 * 1标准大气压定义为在海平面标准温度和湿度条件下，
 * 地球大气层对单位面积施加的压力，精确值为101,325帕斯卡。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 atm = 101,325 Pa（帕斯卡）</li>
 *   <li>1 atm = 101.325 kPa（千帕）</li>
 *   <li>1 atm ≈ 1.01325 bar</li>
 *   <li>1 atm = 14.696 psi（磅/平方英寸）</li>
 *   <li>1 atm = 760 mmHg（毫米汞柱）</li>
 *   <li>1 bar ≈ 0.9869 atm</li>
 * </ul>
 * <P>
 * 标准大气压单位在化学、物理、气象学等领域有广泛应用，
 * 特别是在描述气体状态、化学反应条件等方面。
 * 该单位基于地球海平面的平均大气压力，便于理解和使用。
 * <P>
 * 标准大气压与实际大气压不同，后者会随海拔、天气等因素变化。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPressure_atm extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义标准大气压单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为-1  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据P=F/A（压强=力/面积），压强单位 = 力/面积 = (Kg·m·s⁻²)/m² = Kg·m⁻¹·s⁻²
     * 标准大气压与帕斯卡具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将标准大气压数值转换为标准单位（帕斯卡）的数值。
     * 由于1atm = 101,325Pa，所以factor = 101325.0。
     * 这是标准大气压的精确定义值。
     */
    private final static double factor = 101325.0;
    
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
    private final static String description = "atm";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立标准大气压单位与基本单位的关系。
     * 根据P=F/A，压强单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与帕斯卡单位具有相同的单位构成，仅数值上相差101,325倍。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, -1.0));  // 米，指数-1
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    public UPressure_atm() {
        super(description, elementList, factor, additional);
    }

}