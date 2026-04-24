package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：erg（尔格）
 * <p>
 * 尔格是厘米-克-秒制(CGS)中的能量单位，符号为erg。
 * 1尔格定义为用1达因的力使物体在力的方向上移动1厘米所做的功。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 erg = 10⁻⁷ J（焦耳）</li>
 *   <li>1 J = 10,000,000 erg（千万尔格）</li>
 *   <li>1 erg = 1 g·cm²·s⁻²（克·厘米²·秒⁻²）</li>
 *   <li>1 BTU ≈ 1.055×10¹⁰ erg</li>
 *   <li>1 cal ≈ 4.184×10⁷ erg</li>
 * </ul>
 * <p>
 * 尔格单位在物理学研究、特别是理论物理和天体物理学中仍有使用，
 * 主要用于测量微小的能量值，如分子能量、原子跃迁能量等。
 * 虽然国际单位制已普及，但在某些科学文献中仍可见到尔格单位。
 * <p>
 * CGS制是历史上重要的单位制，在电磁学领域曾有广泛应用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UEnergy_erg extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义尔格单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 虽然尔格是CGS制单位（基于克、厘米、秒），但在内部表示中仍然使用基本单位千克和米，
     * 通过转换因子factor来实现CGS单位到SI单位的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将尔格数值转换为标准单位（焦耳）的数值。
     * 由于1erg = 1dyne·cm = 1g·cm/s² · cm = 0.001kg × 0.01m/s² × 0.01m = 1×10⁻⁷kg·m²/s² = 1×10⁻⁷J，
     * 所以factor = 1.0e-7 = 0.0000001。这表示1尔格等于0.0000001焦耳。
     */
    private final static double factor = 1.0e-7;

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
    private final static String description = "erg";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立尔格单位与基本单位的关系。
     * 虽然尔格是CGS制单位，但其本质仍是力×距离的形式，
     * 因此由千克、米、秒三个基本单位按特定指数组合而成。
     */
    static {
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
        // 添加秒基本单位，指数为-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个尔格能量单位(erg)实例
     * <p>
     * 初始化尔格能量单位，设置单位符号为"erg"，基本单位组成为Kg·m²·s⁻²，
     * 转换因子为0.0000001（即1erg = 0.0000001J），无附加偏移量。
     */
    public UEnergy_erg() {
        // 调用父类DerivedUnit的构造方法，初始化尔格能量单位
        // 参数依次为：单位描述("erg")、基本单位元素列表([Kg^1, m^2, s^-2])、转换因子(0.0000001)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}