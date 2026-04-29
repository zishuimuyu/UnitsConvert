package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：pc²（秒差距平方）
 * <p>
 * 秒差距平方是天文学中的面积单位，符号为pc²。
 * 1秒差距平方定义为边长为1秒差距（parsec）的正方形所围成的面积。
 * 1秒差距约为30,856,775,814,913,700米（约3.26光年）。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 pc² = 9.5214087×10³² m²（平方米）</li>
 *   <li>1 pc² = 9.5214087×10²⁶ km²（平方公里）</li>
 *   <li>1 pc² = 9.5214087×10²⁸ ha（公顷）</li>
 *   <li>1 pc² ≈ 3.676238×10²⁶ mi²（平方英里）</li>
 *   <li>1 m² ≈ 1.050265×10⁻³³ pc²</li>
 * </ul>
 * <p>
 * 秒差距平方单位用于测量宇宙中最巨大的区域面积，
 * 如星系团、超星系团、宇宙大尺度结构等天文学领域。
 * <p>
 * 在观测宇宙学和天体物理学研究中，这是衡量遥远宇宙结构面积的重要单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_pc2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义秒差距平方的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是秒差距平方，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现秒差距平方到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1秒差距 ≈ 3.08567758149×10¹⁶米，所以1秒差距平方 ≈ (3.08567758149×10¹⁶)²平方米
     * 转换因子为9.5214087×10³²。
     */
    private final static double factor = 9.5214087e32;

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
    private final static String description = "pc2";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立秒差距平方面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个秒差距平方面积单位(pc²)实例
     * <p>
     * 初始化秒差距平方面积单位，设置单位符号为"pc2"，基本单位组成为m²，
     * 转换因子为9.5214087e32（即1pc2 = 9.5214087e32m²），无附加偏移量。
     */
    public UArea_pc2() {
        // 调用父类DerivedUnit的构造方法，初始化秒差距平方面积单位
        // 参数依次为：单位描述("pc2")、基本单位元素列表([m^2])、转换因子(9.5214087e32)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}