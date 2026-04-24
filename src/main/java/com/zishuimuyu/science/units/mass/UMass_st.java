package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：st（英石）
 * <p>
 * 英石是英制质量单位，符号为st。
 * 1英石定义为14磅，约等于6.35千克。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 st = 14 lb（磅）</li>
 *   <li>1 st = 224 oz（盎司）</li>
 *   <li>1 st ≈ 6.350 Kg（千克）</li>
 *   <li>1 qtr = 2 st（英担/四分之一英担）</li>
 *   <li>1 cwt = 8 st（英担）</li>
 *   <li>1 long ton = 160 st（长吨）</li>
 *   <li>1 Kg ≈ 0.157 st</li>
 * </ul>
 * <p>
 * 英石单位在英国和爱尔兰等地有广泛应用，
 * 主要用于测量人体体重。
 * 在这些国家，人们通常用英石和磅的组合来表示体重，
 * 例如"11石4磅"（11st 4lb）。
 * <p>
 * 该单位在英国和爱尔兰等使用英制系统的国家常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_st extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义英石单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 英石是质量单位，1英石等于14磅，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将英石数值转换为标准单位（千克）的数值。
     * 由于1st = 14lb = 14×0.45359237Kg，所以factor = new UMass_lb().getFactor() * 14.0。
     * 这意味着1英石约等于6.350千克。
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
    private final static String description = "st";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立英石单位与基本单位的关系。
     * 英石是质量单位，由千克单位构成。
     * 转换因子通过磅的转换因子乘以14计算得出。
     */
    static {
        factor = new UMass_lb().getFactor() * 14.0;
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    /**
     * 构造函数，创建一个英石质量单位(st)实例
     * <p>
     * 初始化英石质量单位，设置单位符号为"st"，基本单位组成为千克，
     * 转换因子约为6.350（即1st ≈ 6.350Kg），无附加偏移量。
     */
    public UMass_st() {
        // 调用父类DerivedUnit的构造方法，初始化英石质量单位
        // 参数依次为：单位描述("st")、基本单位元素列表([Kg^1])、转换因子(约为6.350)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}