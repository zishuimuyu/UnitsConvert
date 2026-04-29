package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：Mm²（平方兆米）
 * <p>
 * 平方兆米是极大的面积单位，符号为Mm²。
 * 1平方兆米定义为边长为1兆米（Mm）的正方形所围成的面积。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 Mm² = 10¹² m²（平方米）</li>
 *   <li>1 Mm² = 10⁶ km²（平方公里）</li>
 *   <li>1 Mm² = 10⁸ ha（公顷）</li>
 *   <li>1 Mm² ≈ 386,102 mi²（平方英里）</li>
 *   <li>1 km² = 10⁻⁶ Mm²</li>
 *   <li>1 m² = 10⁻¹² Mm²</li>
 * </ul>
 * <p>
 * 平方兆米单位用于测量极大的地理区域，如大陆板块、行星表面等，
 * 在地球科学、地理学和天体物理学中可能使用此单位。
 * <p>
 * 这是一个理论上的极大面积单位，实际应用中很少使用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_SquareMegameter extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义平方兆米单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是平方兆米，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现平方兆米到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1兆米 = 10⁶米，所以1平方兆米 = (10⁶)²平方米 = 10¹²平方米
     * 转换因子为1E12。
     */
    private final static double factor = 1e12;

    /**
     * 附加偏移量
     * <p>
     * 面积单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Mm2";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立平方兆米面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个平方兆米面积单位(Mm²)实例
     * <p>
     * 初始化平方兆米面积单位，设置单位符号为"Mm2"，基本单位组成为m²，
     * 转换因子为1E12（即1Mm² = 1E12m²），无附加偏移量。
     */
    public UArea_SquareMegameter() {
        // 调用父类DerivedUnit的构造方法，初始化平方兆米面积单位
        // 参数依次为：单位描述("Mm2")、基本单位元素列表([m^2])、转换因子(1E12)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}