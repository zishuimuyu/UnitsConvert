package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：mg（毫克）
 * <p>
 * 毫克是国际单位制中的质量单位，符号为mg。
 * 1毫克定义为0.000001千克，即1千克的百万分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 mg = 1×10⁻⁶ Kg（千克）</li>
 *   <li>1 mg = 0.001 g（克）</li>
 *   <li>1 mg = 1000 μg（微克）</li>
 *   <li>1 g = 1000 mg</li>
 *   <li>1 kg = 1,000,000 mg</li>
 *   <li>1 lb ≈ 453,592 mg</li>
 * </ul>
 * <p>
 * 毫克单位在医药、化学、生物、珠宝等领域有广泛应用，
 * 用于测量药物剂量、化学试剂、微量物质等。
 * 在处方和实验中，毫克是一个重要的精密计量单位。
 * <p>
 * 该单位适合表示极小的质量。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_mg extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义毫克单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 毫克是质量单位，1毫克等于1×10⁻⁶千克，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将毫克数值转换为标准单位（千克）的数值。
     * 由于1mg = 1×10⁻⁶Kg，所以factor = 1.0E-6。
     * 这意味着1毫克等于0.000001千克。
     */
    private final static double factor = 1.0E-6;

    /**
     * 附加偏移量
     * <p>
     * 质量单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "mg";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立毫克单位与基本单位的关系。
     * 毫克是质量单位，由千克单位构成。
     */
    static {
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    /**
     * 构造函数，创建一个毫克质量单位(mg)实例
     * <p>
     * 初始化毫克质量单位，设置单位符号为"mg"，基本单位组成为千克，
     * 转换因子为0.000001（即1mg = 0.000001Kg），无附加偏移量。
     */
    public UMass_mg() {
        super(description, elementList, factor, additional);
    }

}