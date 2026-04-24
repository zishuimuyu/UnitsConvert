package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.length.ULength_ft;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：ft²（平方英尺）
 * <p>
 * 平方英尺是英制面积单位，符号为ft²。
 * 1平方英尺定义为边长为1英尺的正方形所围成的面积。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ft² ≈ 0.0929 m²（平方米）</li>
 *   <li>1 ft² = 144 in²（平方英寸）</li>
 *   <li>1 ft² = 0.1111 yd²（平方码）</li>
 *   <li>1 yd²（平方码）= 9 ft²</li>
 *   <li>1 acre（英亩）= 4,840 yd² = 43,560 ft²</li>
 *   <li>1 m² ≈ 10.764 ft²</li>
 * </ul>
 * <p>
 * 平方英尺单位广泛应用于美国、加拿大、英国等使用英制单位的国家，
 * 主要用于房地产、建筑、室内设计等领域，如房屋面积、地板面积、地毯面积等。
 * <p>
 * 在房地产市场中，平方英尺是报价和计算价格的重要基准单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UArea_ft2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义平方英尺单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是平方英尺，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现英尺到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将平方英尺数值转换为标准单位（平方米）的数值。
     * 由于1ft = 0.3048m，所以1ft² = (0.3048m)² = 0.09290304m²，因此factor ≈ 0.0929。
     * 该值在静态初始化块中通过计算获得：factor = Math.pow(new ULength_ft().getFactor(), 2.0)
     */
    private final static double factor;

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
    private final static String description = "ft2";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过获取英尺长度单位的转换因子，然后计算其平方得到面积单位的转换因子。
     * 由于平方英尺是二维单位，所以转换因子是长度单位转换因子的平方。
     */
    static {
        factor = Math.pow(new ULength_ft().getFactor(), 2.0);
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个平方英尺面积单位(ft²)实例
     * <p>
     * 初始化平方英尺面积单位，设置单位符号为"ft2"，基本单位组成为m²，
     * 转换因子约为0.0929（即1ft² ≈ 0.0929m²），无附加偏移量。
     */
    public UArea_ft2() {
        // 调用父类DerivedUnit的构造方法，初始化平方英尺面积单位
        // 参数依次为：单位描述("ft2")、基本单位元素列表([m^2])、转换因子(约为0.0929)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}