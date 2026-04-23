package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：g（克）
 * <P>
 * 克是质量单位，符号为g。
 * 1克定义为0.001千克，即1千克的千分之一。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 g = 0.001 Kg（千克）</li>
 *   <li>1 g = 1000 mg（毫克）</li>
 *   <li>1 Kg = 1000 g</li>
 *   <li>1 t = 1,000,000 g（吨）</li>
 *   <li>1 lb ≈ 453.592 g（磅）</li>
 *   <li>1 oz ≈ 28.35 g（盎司）</li>
 * </ul>
 * <P>
 * 克单位在日常生活、食品、药品、珠宝、实验室等领域有广泛应用，
 * 用于测量较小的质量，如食物重量、药品剂量、小件物品等。
 * 在许多国家，克是衡量小型商品的标准单位。
 * <P>
 * 该单位适合表示小质量物体。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_g extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义克单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <P>
     * 克是质量单位，1克等于0.001千克，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将克数值转换为标准单位（千克）的数值。
     * 由于1g = 0.001Kg = 1×10⁻³Kg，所以factor = 1.0E-3。
     * 这意味着1克等于0.001千克。
     */
    private final static double factor = 1.0E-3;
    
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
    private final static String description = "g";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立克单位与基本单位的关系。
     * 克是质量单位，由千克单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
    }

    public UMass_g() {
        super(description, elementList, factor, additional);
    }

}