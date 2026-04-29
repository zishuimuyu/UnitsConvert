package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：ly²（光年平方）
 * <p>
 * 光年平方是宇宙学中的面积单位，符号为ly²。
 * 1光年平方定义为边长为1光年（light year）的正方形所围成的面积。
 * 1光年约为9,460,730,472,580,800米（光在一年中传播的距离）。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ly² = 8.95054210748×10³¹ m²（平方米）</li>
 *   <li>1 ly² = 8.95054210748×10²⁵ km²（平方公里）</li>
 *   <li>1 ly² = 8.95054210748×10²⁷ ha（公顷）</li>
 *   <li>1 ly² ≈ 3.455884×10²⁵ mi²（平方英里）</li>
 *   <li>1 m² ≈ 1.117251×10⁻³² ly²</li>
 * </ul>
 * <p>
 * 光年平方单位用于测量宇宙中极其巨大的区域面积，
 * 如星系盘面、超星系团、宇宙大尺度结构等宇宙学领域。
 * <p>
 * 在宇宙学和天体物理学研究中，这是衡量宇宙大尺度结构面积的重要单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_ly2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义光年平方的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是光年平方，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现光年平方到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1光年 ≈ 9.46073047258×10¹⁵米，所以1光年平方 ≈ (9.46073047258×10¹⁵)²平方米
     * 转换因子为8.95054210748×10³¹。
     */
    private final static double factor = 8.95054210748e31;

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
    private final static String description = "ly2";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立光年平方面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个光年平方面积单位(ly²)实例
     * <p>
     * 初始化光年平方面积单位，设置单位符号为"ly2"，基本单位组成为m²，
     * 转换因子为8.95054210748e31（即1ly2 = 8.95054210748e31m²），无附加偏移量。
     */
    public UArea_ly2() {
        // 调用父类DerivedUnit的构造方法，初始化光年平方面积单位
        // 参数依次为：单位描述("ly2")、基本单位元素列表([m^2])、转换因子(8.95054210748e31)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}