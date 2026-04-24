package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.length.ULength_cm;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：cm²（平方厘米）
 * <p>
 * 平方厘米是面积的常用单位，符号为cm²。
 * 1平方厘米定义为边长为1厘米的正方形所围成的面积。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 cm² = 0.0001 m²（平方米）</li>
 *   <li>1 cm² = 0.01 dm²（平方分米）</li>
 *   <li>1 cm² = 100 mm²（平方毫米）</li>
 *   <li>1 dm² = 100 cm²</li>
 *   <li>1 m² = 10,000 cm²</li>
 *   <li>1 ha（公顷）= 100,000,000 cm²</li>
 * </ul>
 * <p>
 * 平方厘米单位广泛应用于精密测量、小型制图、电子电路板设计等领域，
 * 特别适用于测量较小的平面区域，如电子元件面积、精密零件表面等。
 * <p>
 * 在科学实验和精密工程中，平方厘米是一个重要的面积单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UArea_cm2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义平方厘米单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是平方厘米，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现厘米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将平方厘米数值转换为标准单位（平方米）的数值。
     * 由于1cm = 0.01m，所以1cm² = (0.01m)² = 0.0001m²，因此factor = 0.0001。
     * 该值在静态初始化块中通过计算获得：factor = Math.pow(new ULength_cm().getFactor(), 2.0)
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
    private final static String description = "cm2";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过获取厘米长度单位的转换因子，然后计算其平方得到面积单位的转换因子。
     * 由于平方厘米是二维单位，所以转换因子是长度单位转换因子的平方。
     */
    static {
        factor = Math.pow(new ULength_cm().getFactor(), 2.0);
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个平方厘米面积单位(cm²)实例
     * <p>
     * 初始化平方厘米面积单位，设置单位符号为"cm2"，基本单位组成为m²，
     * 转换因子为0.0001（即1cm² = 0.0001m²），无附加偏移量。
     */
    public UArea_cm2() {
        // 调用父类DerivedUnit的构造方法，初始化平方厘米面积单位
        // 参数依次为：单位描述("cm2")、基本单位元素列表([m^2])、转换因子(0.0001)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}