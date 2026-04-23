package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：liang（两）
 * <P>
 * 两是中国传统的质量单位，符号为liang。
 * 1两定义为0.05千克，即50克。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 liang = 0.05 Kg（千克）</li>
 *   <li>1 liang = 50 g（克）</li>
 *   <li>1 liang = 10 qian（钱）</li>
 *   <li>1 jin = 10 liang（斤）</li>
 *   <li>1 Kg = 20 liang</li>
 *   <li>1 lb ≈ 8.818 liang</li>
 * </ul>
 * <P>
 * 两单位在中国传统商业、中医药、贵金属交易等领域有广泛应用，
 * 特别是在中药配方、贵重金属称重等需要较精细计量的场合。
 * 在中医药方中，药材的用量常常使用两作为单位。
 * <P>
 * 该单位在中医药和贵金属交易领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_liang extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义两单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <P>
     * 两是质量单位，1两等于0.05千克，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将两数值转换为标准单位（千克）的数值。
     * 由于1liang = 0.05Kg = 50g，所以factor = 0.05。
     * 这意味着1两等于0.05千克。
     */
    private final static double factor = 0.05;
    
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
    private final static String description = "liang";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立两单位与基本单位的关系。
     * 两是质量单位，由千克单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
    }

    public UMass_liang() {
        super(description, elementList, factor, additional);
    }

}