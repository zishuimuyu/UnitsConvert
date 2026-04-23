package cn.nlte.science.units.volume;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import cn.nlte.science.units.length.ULength_in;
import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：in³（立方英寸）
 * <P>
 * 立方英寸是非国际单位制体积单位，符号为in³。
 * 1立方英寸定义为边长为1英寸的立方体所占的空间。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 in³ ≈ 16.387 cm³（立方厘米）</li>
 *   <li>1 in³ ≈ 0.01639 L（升）</li>
 *   <li>1 in³ ≈ 1.639×10⁻⁵ m³（立方米）</li>
 *   <li>1 ft³ = 1728 in³（立方英尺）</li>
 *   <li>1 US gal ≈ 231 in³（美制加仑）</li>
 *   <li>1 imp gal ≈ 277.42 in³（英制加仑）</li>
 *   <li>1 mL ≈ 0.061 in³</li>
 * </ul>
 * <P>
 * 立方英寸单位在美国等使用英制单位的国家有广泛应用，
 * 用于测量小体积物体、发动机排量、精密零件尺寸等。
 * 在机械工程和制造业中，立方英寸用于表示发动机的汽缸容积。
 * <P>
 * 该单位适合表示小体积空间。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVolume_in3 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义立方英寸单位的基本单位组成：
     * - 长度单位米(m)，指数为3
     * <P>
     * 立方英寸是体积单位，1立方英寸等于(1英寸)³，需要转换为立方米的三次方。
     * 因此立方英寸与立方米具有相同的单位维度，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将立方英寸数值转换为标准单位（立方米）的数值。
     * 由于1in³ = (1in)³ = (0.0254m)³，该值通过计算英寸单位的转换因子的三次方获得。
     * 这意味着1立方英寸约等于1.639×10⁻⁵立方米。
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
    private final static String description = "in3";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算英寸单位转换因子的三次方来确定立方英寸的转换因子。
     * 由于体积是长度的三次方，因此需要对长度转换因子进行立方运算。
     */
    static {
        factor = Math.pow(new ULength_in().getFactor(), 3.0);
        elementList.add(new UnitElement(BasicUnit.m, 3.0));  // 米，指数3
    }

    public UVolume_in3() {
        super(description, elementList, factor, additional);
    }

}