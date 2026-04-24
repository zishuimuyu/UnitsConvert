package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：q（公旦/公担）
 * <p>
 * 公旦（公担）是质量单位，符号为q。
 * 1公旦定义为100千克，也称为公担。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 q = 100 Kg（千克）</li>
 *   <li>1 q = 100,000 g（克）</li>
 *   <li>1 q = 0.1 t（吨）</li>
 *   <li>1 t = 10 q</li>
 *   <li>1 dan = 50 Kg = 0.5 q（市担）</li>
 *   <li>1 q ≈ 220.46 lb（磅）</li>
 * </ul>
 * <p>
 * 公旦单位在中国及一些其他国家用于农业、商业等领域，
 * 特别是在粮食、棉花等大宗商品交易中仍有使用。
 * 该单位比吨小但比特大的质量计量单位，在某些贸易场景下方便使用。
 * <p>
 * 该单位在农业和商业领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_q extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义公旦单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 公旦是质量单位，1公旦等于100千克，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将公旦数值转换为标准单位（千克）的数值。
     * 由于1q = 100Kg，所以factor = 100.0。
     * 这意味着1公旦等于100千克。
     */
    private final static double factor = 100.0;

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
    private final static String description = "q";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立公旦单位与基本单位的关系。
     * 公旦是质量单位，由千克单位构成。
     */
    static {
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    /**
     * 构造函数，创建一个公旦质量单位(q)实例
     * <p>
     * 初始化公旦质量单位，设置单位符号为"q"，基本单位组成为千克，
     * 转换因子为100（即1q = 100Kg），无附加偏移量。
     */
    public UMass_q() {
        // 调用父类DerivedUnit的构造方法，初始化公旦质量单位
        // 参数依次为：单位描述("q")、基本单位元素列表([Kg^1])、转换因子(100.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}