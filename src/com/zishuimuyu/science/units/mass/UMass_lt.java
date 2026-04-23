package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：lt（长吨）
 * <P>
 * 长吨是英制质量单位，符号为lt（long ton）。
 * 1长吨定义为2240磅，约等于1016.05千克。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 lt = 2240 lb（磅）</li>
 *   <li>1 lt = 160 st（英石）</li>
 *   <li>1 lt ≈ 1016.05 Kg（千克）</li>
 *   <li>1 lt ≈ 1.016 t（公吨）</li>
 *   <li>1 short ton ≈ 0.893 lt（短吨）</li>
 *   <li>1 t ≈ 0.984 lt（公吨）</li>
 * </ul>
 * <P>
 * 长吨单位在英国和其他使用英制单位的国家有应用，
 * 主要用于海运、大宗商品贸易、造船等领域。
 * 长吨与短吨（2000磅）和公吨（1000千克）不同，
 * 1长吨大于1短吨和1公吨。
 * <P>
 * 该单位在海运和大宗商品贸易领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_lt extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义长吨单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <P>
     * 长吨是质量单位，1长吨等于2240磅，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将长吨数值转换为标准单位（千克）的数值。
     * 由于1lt = 2240lb = 2240×0.45359237Kg，所以factor = new UMass_lb().getFactor() * 2240.0。
     * 这意味着1长吨约等于1016.05千克。
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
    private final static String description = "lt";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立长吨单位与基本单位的关系。
     * 长吨是质量单位，由千克单位构成。
     * 转换因子通过磅的转换因子乘以2240计算得出。
     */
    static {
        factor = new UMass_lb().getFactor() * 2240.0;
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
    }

    public UMass_lt() {
        super(description, elementList, factor, additional);
    }

}