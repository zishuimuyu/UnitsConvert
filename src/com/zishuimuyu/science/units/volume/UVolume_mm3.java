package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.length.ULength_mm;
import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：mm³（立方毫米）
 * <P>
 * 立方毫米是国际单位制的体积单位，符号为mm³。
 * 1立方毫米定义为边长为1毫米的立方体所占的空间。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 mm³ = 1×10⁻⁹ m³（立方米）</li>
 *   <li>1 mm³ = 1 μL（微升）</li>
 *   <li>1 mm³ = 0.001 mL（毫升）</li>
 *   <li>1 mm³ = 1×10⁻⁶ L（升）</li>
 *   <li>1 cm³ = 1,000 mm³（立方厘米）</li>
 *   <li>1 dm³ = 1,000,000 mm³（立方分米）</li>
 *   <li>1 in³ ≈ 16,387 mm³（立方英寸）</li>
 *   <li>1 mm³ = 0.001 cm³</li>
 * </ul>
 * <P>
 * 立方毫米单位在精密工程、医学、微流体学等领域有广泛应用，
 * 用于测量极小体积的物体，如微小零件、细胞体积、
 * 微量液体等。
 * <P>
 * 该单位特别适合表示极小的体积。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVolume_mm3 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义立方毫米单位的基本单位组成：
     * - 长度单位米(m)，指数为3
     * <P>
     * 立方毫米是体积单位，1立方毫米等于(1毫米)³，需要转换为立方米的三次方。
     * 因此立方毫米与立方米具有相同的单位维度，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将立方毫米数值转换为标准单位（立方米）的数值。
     * 由于1mm³ = (1mm)³ = (0.001m)³ = 1×10⁻⁹m³，该值通过计算毫米单位的转换因子的三次方获得。
     * 这意味着1立方毫米等于1×10⁻⁹立方米。
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 体积单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "mm3";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算毫米单位转换因子的三次方来确定立方毫米的转换因子。
     * 由于体积是长度的三次方，因此需要对长度转换因子进行立方运算。
     */
    static {
        factor = Math.pow(new ULength_mm().getFactor(), 3.0);
        elementList.add(new UnitElement(BasicUnit.m, 3.0));  // 米，指数3
    }

    public UVolume_mm3() {
        super(description, elementList, factor, additional);
    }

}