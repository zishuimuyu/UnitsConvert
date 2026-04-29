package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：ym（幺米）
 * <p>
 * 幺米是国际单位制中的长度单位，符号为ym。
 * 1幺米定义为1米的10⁻²⁴倍，是国际单位制中最小的长度前缀。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ym = 10⁻²⁴ m（米）</li>
 *   <li>1 ym = 10⁻¹⁵ fm（飞米）</li>
 *   <li>1 ym = 10⁻⁶ zm（仄米）</li>
 *   <li>1 fm = 10⁹ ym</li>
 *   <li>1 am = 10¹² ym</li>
 * </ul>
 * <p>
 * 幺米主要用于理论物理学中的极小尺度研究，如弦理论中的弦长度。
 * 目前在实际测量中几乎不使用，更多是理论概念。
 * <p>
 * 幺米的名称来源于法语"yocto"，表示10⁻²⁴。
 * 这个单位在量子物理和高能物理研究中偶尔会提及。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_ym extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义幺米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 幺米虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现幺米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 幺米单位的转换因子为1.0E-24。
     * 1 ym = 10⁻²⁴ m
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 1.0E-24;

    /**
     * 附加偏移量
     * <p>
     * 长度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "ym";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立幺米单位与基本单位的关系。
     * 幺米本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个幺米单位(ym)实例
     * <p>
     * 初始化幺米单位，设置单位符号为"ym"，基本单位组成为m，
     * 转换因子为1.0E-24（即1ym = 1.0E-24m），
     * 无附加偏移量。
     */
    public ULength_ym() {
        // 调用父类DerivedUnit的构造方法，初始化幺米单位
        // 参数依次为：单位描述("ym")、基本单位元素列表([m^1])、转换因子(1.0E-24)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}