package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：ct（克拉）
 * <P>
 * 克拉是用于衡量宝石和珍珠质量的专用单位，符号为ct。
 * 1克拉定义为0.0002千克，即200毫克。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 ct = 0.0002 Kg（千克）</li>
 *   <li>1 ct = 0.2 g（克）</li>
 *   <li>1 ct = 200 mg（毫克）</li>
 *   <li>1 g = 5 ct</li>
 *   <li>1 carat = 200 mg（精确值）</li>
 *   <li>1 lb ≈ 2267.96 ct</li>
 * </ul>
 * <P>
 * 克拉单位在珠宝首饰行业有广泛应用，
 * 用于衡量钻石、红宝石、蓝宝石、祖母绿等贵重宝石的质量。
 * 该单位起源于古代地中海地区的角豆树种子，因其重量相对一致而被用作衡量宝石的标准。
 * 现代克拉是标准化的国际单位。
 * <P>
 * 该单位在珠宝首饰行业常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_ct extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义克拉单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <P>
     * 克拉是质量单位，1克拉等于0.0002千克，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将克拉数值转换为标准单位（千克）的数值。
     * 由于1ct = 0.2g = 0.0002Kg，所以factor = 0.0002。
     * 这意味着1克拉等于0.0002千克。
     */
    private final static double factor = 0.0002;
    
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
    private final static String description = "ct";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立克拉单位与基本单位的关系。
     * 克拉是质量单位，由千克单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
    }

    public UMass_ct() {
        super(description, elementList, factor, additional);
    }

}