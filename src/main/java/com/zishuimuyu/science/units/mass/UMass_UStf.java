package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：UStf（美吨/短吨）
 * <p>
 * 美吨是美制质量单位，符号为UStf（US short ton）。
 * 1美吨定义为2000磅，约等于907.185千克。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 UStf = 2000 lb（磅）</li>
 *   <li>1 UStf ≈ 907.185 Kg（千克）</li>
 *   <li>1 UStf ≈ 0.907 t（公吨）</li>
 *   <li>1 lt ≈ 1.120 UStf（长吨）</li>
 *   <li>1 t ≈ 1.102 UStf（公吨）</li>
 * </ul>
 * <p>
 * 美吨单位在美国有广泛应用，
 * 主要用于货物运输、工程计算、重型机械等领域。
 * 美吨与长吨（2240磅）和公吨（1000千克）不同，
 * 1美吨小于1长吨和1公吨。
 * <p>
 * 该单位在美国工业和贸易领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年05月06日
 */
public class UMass_UStf extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义美吨单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 美吨是质量单位，1美吨等于2000磅，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将美吨数值转换为标准单位（千克）的数值。
     * 由于1UStf = 2000lb = 2000×0.45359237Kg，所以factor = new UMass_lb().getFactor() * 2000.0。
     * 这意味着1美吨约等于907.185千克。
     */
    private final static double factor;

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
    private final static String description = "UStf";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立美吨单位与基本单位的关系。
     * 美吨是质量单位，由千克单位构成。
     * 转换因子通过磅的转换因子乘以2000计算得出。
     */
    static {
        factor = new UMass_lb().getFactor() * 2000.0;
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    /**
     * 构造函数，创建一个美吨质量单位(UStf)实例
     * <p>
     * 初始化美吨质量单位，设置单位符号为"UStf"，基本单位组成为千克，
     * 转换因子约为907.185（即1UStf ≈ 907.185Kg），无附加偏移量。
     */
    public UMass_UStf() {
        // 调用父类DerivedUnit的构造方法，初始化美吨质量单位
        // 参数依次为：单位描述("UStf")、基本单位元素列表([Kg^1])、转换因子(约为907.185)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}