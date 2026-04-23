package cn.nlte.science.units.volume;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：L（升）
 * <P>
 * 升是容积单位，符号为L（或l）。
 * 1升定义为1立方分米（dm³）的体积，等于0.001立方米。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 L = 1 dm³ = 0.001 m³（立方米）</li>
 *   <li>1 L = 1000 mL（毫升）</li>
 *   <li>1 L = 100 cL（厘升）</li>
 *   <li>1 L = 10 dL（分升）</li>
 *   <li>1 L = 0.1 daL（十升）</li>
 *   <li>1 L = 0.01 hL（百升）</li>
 *   <li>1 US gal ≈ 3.785 L（美制加仑）</li>
 *   <li>1 imp gal ≈ 4.546 L（英制加仑）</li>
 * </ul>
 * <P>
 * 升单位在日常生活和科学实验中有广泛应用，
 * 用于测量液体体积、气体体积、容器容量等。
 * 在许多国家，升是测量饮料、燃油、化学品等液体的标准单位。
 * <P>
 * 该单位与国际单位制兼容，1升等于1立方分米。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVolume_l extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义升单位的基本单位组成：
     * - 长度单位米(m)，指数为3
     * <P>
     * 升是容积单位，1升等于1立方分米(dm³)，即(0.1m)³ = 0.001m³。
     * 因此升与立方米具有相同的单位维度，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将升数值转换为标准单位（立方米）的数值。
     * 由于1L = 1dm³ = (0.1m)³ = 0.001m³，所以factor = 0.001。
     * 这意味着1升等于0.001立方米。
     */
    private final static double factor = 0.001;
    
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
    private final static String description = "l";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立升单位与基本单位的关系。
     * 升是三维空间单位，由米单位的三次方构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 3.0));  // 米，指数3
    }

    public UVolume_l() {
        super(description, elementList, factor, additional);
    }

}