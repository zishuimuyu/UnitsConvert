package com.zishuimuyu.science.units.pressure;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 压强单位：MPa（兆帕）
 * <p>
 * 兆帕是压强的国际单位制倍数单位，符号为MPa。
 * 1兆帕定义为1,000,000帕斯卡（10⁶ Pa）。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 MPa = 1,000,000 Pa（帕斯卡）</li>
 *   <li>1 MPa = 1000 kPa（千帕）</li>
 *   <li>1 MPa = 10 bar</li>
 *   <li>1 MPa ≈ 9.869 atm（标准大气压）</li>
 *   <li>1 MPa ≈ 145.0 PSI</li>
 *   <li>1 GPa = 1000 MPa（吉帕）</li>
 * </ul>
 * <p>
 * 兆帕单位在工程、材料科学、机械设计等领域非常重要，
 * 用于测量高压力值，如高强度钢材的屈服强度、
 * 高压容器的设计压力、岩石和混凝土的抗压强度等。
 * 该单位适合表达工程材料和结构的高压力特性。
 * <p>
 * 该单位是国际单位制的合法倍数单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPressure_MPa extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义兆帕单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为-1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据P=F/A（压强=力/面积），压强单位 = 力/面积 = (Kg·m·s⁻²)/m² = Kg·m⁻¹·s⁻²
     * 兆帕与帕斯卡具有相同的基本单位组成，只是转换因子不同（1,000,000倍关系）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将兆帕数值转换为标准单位（帕斯卡）的数值。
     * 由于1MPa = 1,000,000Pa = 10⁶Pa，所以factor = 1.0E6 = 1000000.0。
     * 这意味着1兆帕等于1,000,000帕斯卡。
     */
    private final static double factor = 1.0E6;

    /**
     * 附加偏移量
     * <p>
     * 压强单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "MPa";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立兆帕单位与基本单位的关系。
     * 根据P=F/A，压强单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与帕斯卡单位具有相同的单位构成，仅数值上相差1,000,000倍。
     */
    static {
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 米，指数-1
        elementList.add(new UnitElement(BasicUnit.m, -1.0));
        // 秒，指数-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个兆帕压强单位(MPa)实例
     * <p>
     * 初始化兆帕压强单位，设置单位符号为"MPa"，基本单位组成为Kg·m⁻¹·s⁻²，
     * 转换因子为1000000（即1MPa = 10⁶Pa），无附加偏移量。
     */
    public UPressure_MPa() {
        // 调用父类DerivedUnit的构造方法，初始化兆帕压强单位
        // 参数依次为：单位描述("MPa")、基本单位元素列表([Kg^1, m^-1, s^-2])、转换因子(1.0E6)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}