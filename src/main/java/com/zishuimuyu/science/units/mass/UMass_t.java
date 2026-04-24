package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：t（吨）
 * <p>
 * 吨是质量单位，符号为t。
 * 1吨定义为1000千克，即10³千克。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 t = 1000 Kg（千克）</li>
 *   <li>1 t = 1,000,000 g（克）</li>
 *   <li>1 t = 1,000,000,000 mg（毫克）</li>
 *   <li>1 short ton ≈ 0.907 t（美吨）</li>
 *   <li>1 long ton ≈ 1.016 t（英吨）</li>
 *   <li>1 Kg = 0.001 t</li>
 * </ul>
 * <p>
 * 吨单位广泛用于衡量大型货物、车辆载重、建筑材料、工业产品等大质量物体，
 * 在物流、运输、工程、贸易等领域有重要应用。
 * 在国际交易中，吨是重要的质量计量单位。
 * <p>
 * 该单位适合表示大质量物体。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_t extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义吨单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 吨是质量单位，1吨等于1000千克，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将吨数值转换为标准单位（千克）的数值。
     * 由于1t = 1000Kg = 1×10³Kg，所以factor = 1.0E3。
     * 这意味着1吨等于1000千克。
     */
    private final static double factor = 1.0E3;

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
    private final static String description = "t";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立吨单位与基本单位的关系。
     * 吨是质量单位，由千克单位构成。
     */
    static {
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    /**
     * 构造函数，创建一个吨质量单位(t)实例
     * <p>
     * 初始化吨质量单位，设置单位符号为"t"，基本单位组成为千克，
     * 转换因子为1000（即1t = 1000Kg），无附加偏移量。
     */
    public UMass_t() {
        // 调用父类DerivedUnit的构造方法，初始化吨质量单位
        // 参数依次为：单位描述("t")、基本单位元素列表([Kg^1])、转换因子(1.0E3)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}