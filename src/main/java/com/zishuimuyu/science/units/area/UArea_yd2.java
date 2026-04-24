package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.length.ULength_yd;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：yd²（平方码）
 * <p>
 * 平方码是英制面积单位，符号为yd²。
 * 1平方码定义为边长为1码的正方形所围成的面积。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 yd² = 9 ft²（平方英尺）</li>
 *   <li>1 yd² ≈ 0.8361 m²（平方米）</li>
 *   <li>1 yd² = 1,296 in²（平方英寸）</li>
 *   <li>1 ft² = 0.1111 yd²</li>
 *   <li>1 m² ≈ 1.196 yd²</li>
 *   <li>1 acre（英亩）= 4,840 yd²</li>
 * </ul>
 * <p>
 * 平方码单位广泛应用于美国、加拿大、英国等使用英制单位的国家，
 * 主要用于地毯、地板、织物等材料的面积测量，也用于某些土地测量场合。
 * <p>
 * 在纺织业和室内装修行业中，平方码是常用的面积计量单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UArea_yd2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义平方码单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是平方码，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现码到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将平方码数值转换为标准单位（平方米）的数值。
     * 由于1yd = 0.9144m，所以1yd² = (0.9144m)² = 0.83612736m²，因此factor ≈ 0.8361。
     * 该值在静态初始化块中通过计算获得：factor = Math.pow(new ULength_yd().getFactor(), 2.0)
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
    private final static String description = "yd2";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过获取码长度单位的转换因子，然后计算其平方得到面积单位的转换因子。
     * 由于平方码是二维单位，所以转换因子是长度单位转换因子的平方。
     */
    static {
        factor = Math.pow(new ULength_yd().getFactor(), 2.0);
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个平方码面积单位(yd²)实例
     * <p>
     * 初始化平方码面积单位，设置单位符号为"yd2"，基本单位组成为m²，
     * 转换因子约为0.8361（即1yd² ≈ 0.8361m²），无附加偏移量。
     */
    public UArea_yd2() {
        // 调用父类DerivedUnit的构造方法，初始化平方码面积单位
        // 参数依次为：单位描述("yd2")、基本单位元素列表([m^2])、转换因子(约为0.8361)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}