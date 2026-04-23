package cn.nlte.science.units.length;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：um（微米）
 * <P>
 * 微米是国际单位制中的长度单位，符号为um（有时也写作μm）。
 * 1微米定义为0.000001米，即1米的百万分之一。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 um = 1×10⁻⁶ m（米）</li>
 *   <li>1 um = 0.001 mm（毫米）</li>
 *   <li>1 um = 1000 nm（纳米）</li>
 *   <li>1 mm = 1000 um</li>
 *   <li>1 cm = 10,000 um</li>
 *   <li>1 in ≈ 25,400 um</li>
 * </ul>
 * <P>
 * 微米单位在精密制造、光学、半导体、生物学、医学等领域有广泛应用，
 * 用于测量细胞大小、细菌尺寸、芯片线宽、光纤直径等微小尺寸。
 * 在现代高科技产业中，微米级精度是常见的要求。
 * <P>
 * 该单位适合表示微小的长度。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_um extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义微米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <P>
     * 微米是长度单位，1微米等于1×10⁻⁶米，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将微米数值转换为标准单位（米）的数值。
     * 由于1um = 1×10⁻⁶m，所以factor = 1.0E-6。
     * 这意味着1微米等于0.000001米。
     */
    private final static double factor = 1.0E-6;
    
    /**
     * 附加偏移量
     * <P>
     * 长度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "um";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立微米单位与基本单位的关系。
     * 微米是长度单位，由米单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
    }

    public ULength_um() {
        super(description, elementList, factor, additional);
    }

}