package cn.nlte.science.units.volume;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：hL（百升/公石）
 * <P>
 * 百升（公石）是容积单位，符号为hL（或hl）。
 * 1百升（公石）定义为100升的体积，等于0.1立方米。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 hL = 100 L（升）</li>
 *   <li>1 hL = 100,000 mL（毫升）</li>
 *   <li>1 hL = 0.1 m³（立方米）</li>
 *   <li>1 L = 0.01 hL</li>
 *   <li>1 daL = 0.1 hL</li>
 *   <li>1 US gal ≈ 0.038 hL（美制加仑）</li>
 *   <li>1 imp gal ≈ 0.045 hL（英制加仑）</li>
 *   <li>1 m³ = 10 hL</li>
 * </ul>
 * <P>
 * 百升（公石）单位在欧洲的啤酒、葡萄酒等行业有广泛应用，
 * 用于测量大批量液体体积，如酿酒、乳制品生产等。
 * 在德国等国家，啤酒产量和销售量常以百升为单位统计。
 * <P>
 * 该单位在某些专业领域仍然使用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVolume_hl extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义百升（公石）单位的基本单位组成：
     * - 长度单位米(m)，指数为3
     * <P>
     * 百升（公石）是容积单位，1百升等于100升，即0.1立方米。
     * 因此百升与立方米具有相同的单位维度，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将百升（公石）数值转换为标准单位（立方米）的数值。
     * 由于1hL = 100L = 100×0.001m³ = 0.1m³，所以factor = 0.1。
     * 这意味着1百升（公石）等于0.1立方米。
     */
    private final static double factor = 0.1;
    
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
    private final static String description = "hl";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立百升（公石）单位与基本单位的关系。
     * 百升是三维空间单位，由米单位的三次方构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 3.0));  // 米，指数3
    }

    public UVolume_hl() {
        super(description, elementList, factor, additional);
    }

}