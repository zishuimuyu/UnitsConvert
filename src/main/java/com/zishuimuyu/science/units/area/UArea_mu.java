package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：mu（市亩）
 * <p>
 * 市亩是中国传统的面积单位，符号为mu。
 * 1市亩定义为666.67平方米的面积（准确值为2000/3平方米）。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 mu = 2000/3 m² ≈ 666.67 m²（平方米）</li>
 *   <li>1 mu = 600 qing（顷）</li>
 *   <li>1 ha（公顷）= 15 mu</li>
 *   <li>1 km² = 1,500 mu</li>
 *   <li>1 m² ≈ 0.0015 mu</li>
 *   <li>1 acre（英亩）≈ 6.07 mu</li>
 * </ul>
 * <p>
 * 市亩单位广泛应用于中国农村地区的土地测量和农业统计，
 * 是中国传统的土地面积计量单位，在现代农业、土地承包、农地流转等场合仍有使用。
 * <p>
 * 在中国，1公顷等于15亩，这种换算关系便于土地面积的计算和统计。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UArea_mu extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义市亩单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 市亩虽然是中国传统单位，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现市亩到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将市亩数值转换为标准单位（平方米）的数值。
     * 由于1mu = 2000/3 m² ≈ 666.67m²，所以factor = 2000/3 = 1000.0*2.0/3.0。
     * 这意味着1市亩等于2000/3平方米。
     */
    private final static double factor = 1000.0 * 2.0 / 3.0;

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
    private final static String description = "mu";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表。
     * 由于市亩本质上是平方米的倍数单位，所以基本单位元素仍然是米的平方。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个市亩面积单位(mu)实例
     * <p>
     * 初始化市亩面积单位，设置单位符号为"mu"，基本单位组成为m²，
     * 转换因子约为666.67（即1mu ≈ 666.67m²），无附加偏移量。
     */
    public UArea_mu() {
        // 调用父类DerivedUnit的构造方法，初始化市亩面积单位
        // 参数依次为：单位描述("mu")、基本单位元素列表([m^2])、转换因子(约为666.67)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}