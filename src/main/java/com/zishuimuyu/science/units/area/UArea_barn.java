package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：barn（靶恩）
 * <p>
 * 靶恩是核物理学中的面积单位，符号为b。
 * 1靶恩定义为10^-28平方米的面积，大约相当于铀原子核的截面面积。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 barn = 10^-28 m²（平方米）</li>
 *   <li>1 barn = 100 fm²（平方飞米）</li>
 *   <li>1 μm² = 10^16 barn</li>
 *   <li>1 nm² = 10^10 barn</li>
 *   <li>1 cm² = 10^24 barn</li>
 * </ul>
 * <p>
 * 靶恩单位在核物理学和粒子物理学中广泛使用，
 * 用于表示核反应截面、散射截面和其他极小的面积。
 * 该单位名称来源于俚语"as big as a barn door"（像谷仓门一样大），
 * 因为在原子尺度上，原子核相对较大，就像一扇"谷仓门"。
 * <p>
 * 在核反应研究和粒子加速器实验中，靶恩是一个重要的面积单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_barn extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义靶恩单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是靶恩，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现靶恩到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1靶恩 = 10⁻²⁸平方米
     * 转换因子为1E-28。
     */
    private final static double factor = 1e-28;

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
    private final static String description = "barn";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立靶恩面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个靶恩面积单位(barn)实例
     * <p>
     * 初始化靶恩面积单位，设置单位符号为"barn"，基本单位组成为m²，
     * 转换因子为1E-28（即1barn = 1E-28m²），无附加偏移量。
     */
    public UArea_barn() {
        // 调用父类DerivedUnit的构造方法，初始化靶恩面积单位
        // 参数依次为：单位描述("barn")、基本单位元素列表([m^2])、转换因子(1E-28)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}