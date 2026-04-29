package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：um2（平方微米）
 * <p>
 * 平方微米是测量微小面积的单位，符号为um2。
 * 1平方微米定义为边长为1微米的正方形所围成的面积。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 um2 = 10^-12 m²（平方米）</li>
 *   <li>1 um2 = 1,000,000 nm²（平方纳米）</li>
 *   <li>1 um2 = 0.000001 mm²（平方毫米）</li>
 *   <li>1 mm² = 1,000,000 um2</li>
 *   <li>1 cm² = 100,000,000 um2</li>
 * </ul>
 * <p>
 * 平方微米单位在显微镜学、细胞生物学、材料科学等领域广泛使用，
 * 用于测量细胞面积、薄膜厚度、微观颗粒表面积和其他微观尺度的面积。
 * <p>
 * 在生物医学和材料科学中，平方微米是一个重要的面积测量单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_um2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义平方微米单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是平方微米，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现微米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1微米 = 10⁻⁶米，所以1平方微米 = (10⁻⁶)²平方米 = 10⁻¹²平方米
     * 转换因子为1E-12。
     */
    private final static double factor = 1e-12;

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
    private final static String description = "um2";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立平方微米面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个平方微米面积单位(μm²)实例
     * <p>
     * 初始化平方微米面积单位，设置单位符号为"um2"，基本单位组成为m²，
     * 转换因子为1E-12（即1um² = 1E-12m²），无附加偏移量。
     */
    public UArea_um2() {
        // 调用父类DerivedUnit的构造方法，初始化平方微米面积单位
        // 参数依次为：单位描述("um2")、基本单位元素列表([m^2])、转换因子(1E-12)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}