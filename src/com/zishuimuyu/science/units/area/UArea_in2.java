package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.length.ULength_in;
import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：in²（平方英寸）
 * <P>
 * 平方英寸是英制面积单位，符号为in²。
 * 1平方英寸定义为边长为1英寸的正方形所围成的面积。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 in² ≈ 6.4516 cm²（平方厘米）</li>
 *   <li>1 in² ≈ 0.00064516 m²（平方米）</li>
 *   <li>1 in² = 645.16 mm²（平方毫米）</li>
 *   <li>1 in² = (1/144) ft² ≈ 0.006944 ft²（平方英尺）</li>
 *   <li>1 ft² = 144 in²</li>
 *   <li>1 cm² ≈ 0.155 in²</li>
 * </ul>
 * <P>
 * 平方英寸单位广泛应用于美国、加拿大、英国等使用英制单位的国家，
 * 主要用于精密工程、制造业、电子工业等领域，如印刷电路板面积、精密零件面积、屏幕尺寸等。
 * <P>
 * 在电子和精密制造领域，平方英寸是重要的面积计量单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UArea_in2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义平方英寸单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <P>
     * 虽然该单位是平方英寸，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现英寸到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将平方英寸数值转换为标准单位（平方米）的数值。
     * 由于1in = 0.0254m，所以1in² = (0.0254m)² = 0.00064516m²，因此factor = 0.00064516。
     * 该值在静态初始化块中通过计算获得：factor = Math.pow(new ULength_in().getFactor(), 2.0)
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 面积单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "in2";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过获取英寸长度单位的转换因子，然后计算其平方得到面积单位的转换因子。
     * 由于平方英寸是二维单位，所以转换因子是长度单位转换因子的平方。
     */
    static {
        factor = Math.pow(new ULength_in().getFactor(), 2.0);
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造方法
     * <P>
     * 创建平方英寸单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     */
    public UArea_in2() {
        super(description, elementList, factor, additional);
    }

}