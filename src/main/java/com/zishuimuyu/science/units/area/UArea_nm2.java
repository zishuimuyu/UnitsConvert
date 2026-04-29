package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：nm2（平方纳米）
 * <p>
 * 平方纳米是测量极小面积的单位，符号为nm2。
 * 1平方纳米定义为边长为1纳米的正方形所围成的面积。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 nm2 = 10^-18 m²（平方米）</li>
 *   <li>1 nm2 = 10^-12 mm²（平方毫米）</li>
 *   <li>1 nm2 = 10^-10 cm²（平方厘米）</li>
 *   <li>1 μm² = 1,000,000 nm²（平方微米）</li>
 *   <li>1 mm² = 10^12 nm2</li>
 * </ul>
 * <p>
 * 平方纳米单位在纳米技术、分子生物学、半导体制造等领域广泛使用，
 * 用于测量分子表面积、纳米材料表面积、原子级结构和其他极小的面积。
 * <p>
 * 在纳米科学研究中，平方纳米是一个重要的面积测量单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_nm2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义平方纳米单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是平方纳米，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现纳米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1纳米 = 10⁻⁹米，所以1平方纳米 = (10⁻⁹)²平方米 = 10⁻¹⁸平方米
     * 转换因子为1E-18。
     */
    private final static double factor = 1e-18;

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
    private final static String description = "nm2";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立平方纳米面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个平方纳米面积单位(nm²)实例
     * <p>
     * 初始化平方纳米面积单位，设置单位符号为"nm2"，基本单位组成为m²，
     * 转换因子为1E-18（即1nm² = 1E-18m²），无附加偏移量。
     */
    public UArea_nm2() {
        // 调用父类DerivedUnit的构造方法，初始化平方纳米面积单位
        // 参数依次为：单位描述("nm2")、基本单位元素列表([m^2])、转换因子(1E-18)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}