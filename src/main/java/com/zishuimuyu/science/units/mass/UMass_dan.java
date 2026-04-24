package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：dan（市担）
 * <p>
 * 市担是中国传统的质量单位，符号为dan。
 * 1市担定义为50千克。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 dan = 50 Kg（千克）</li>
 *   <li>1 dan = 50,000 g（克）</li>
 *   <li>1 dan = 0.05 t（吨）</li>
 *   <li>1 t = 20 dan</li>
 *   <li>1 dan = 100 jin（斤）</li>
 *   <li>1 dan ≈ 110.23 lb（磅）</li>
 * </ul>
 * <p>
 * 市担单位在中国传统商业和农业中曾广泛使用，
 * 特别是在农产品交易、粮食称重等场合。
 * 虽然现在逐渐被国际单位制取代，但在某些传统市场中仍可见到。
 * <p>
 * 该单位在中国传统商业领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_dan extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义市担单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 市担是质量单位，1市担等于50千克，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将市担数值转换为标准单位（千克）的数值。
     * 由于1dan = 50Kg，所以factor = 50.0。
     * 这意味着1市担等于50千克。
     */
    private final static double factor = 50.0;

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
    private final static String description = "dan";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立市担单位与基本单位的关系。
     * 市担是质量单位，由千克单位构成。
     */
    static {
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    /**
     * 构造函数，创建一个市担质量单位(dan)实例
     * <p>
     * 初始化市担质量单位，设置单位符号为"dan"，基本单位组成为千克，
     * 转换因子为50（即1dan = 50Kg），无附加偏移量。
     */
    public UMass_dan() {
        // 调用父类DerivedUnit的构造方法，初始化市担质量单位
        // 参数依次为：单位描述("dan")、基本单位元素列表([Kg^1])、转换因子(50.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}