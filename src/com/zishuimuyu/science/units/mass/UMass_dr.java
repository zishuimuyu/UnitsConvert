package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：dr（打兰）
 * <P>
 * 打兰是英制质量单位，符号为dr。
 * 1打兰定义为1/256磅，约等于1.772克。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 dr = 1/256 lb（磅）</li>
 *   <li>1 dr = 27.34375 gr（格令）</li>
 *   <li>1 dr ≈ 1.772 g（克）</li>
 *   <li>1 oz = 16 dr</li>
 *   <li>1 lb = 256 dr</li>
 *   <li>1 g ≈ 0.564 dr</li>
 * </ul>
 * <P>
 * 打兰单位在英语国家历史上有应用，
 * 主要用于测量较轻的物品，如药品、化学品等。
 * 在现代，打兰的使用已大大减少，但在某些特殊领域可能仍有使用。
 * 该单位适用于轻质物品的测量。
 * <P>
 * 该单位在历史上的英制系统中常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_dr extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义打兰单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <P>
     * 打兰是质量单位，1打兰等于1/256磅，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将打兰数值转换为标准单位（千克）的数值。
     * 由于1dr = 1/256lb = (1/256)×0.45359237Kg，所以factor = new UMass_lb().getFactor() / 256.0。
     * 这意味着1打兰约等于0.001772千克。
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 质量单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "dr";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立打兰单位与基本单位的关系。
     * 打兰是质量单位，由千克单位构成。
     * 转换因子通过磅的转换因子除以256计算得出。
     */
    static {
        factor = new UMass_lb().getFactor() / 256.0;
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
    }

    public UMass_dr() {
        super(description, elementList, factor, additional);
    }

}