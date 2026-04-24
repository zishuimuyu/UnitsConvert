package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：lb（磅）
 * <p>
 * 磅是英制质量单位，符号为lb。
 * 1磅定义为0.45359237千克，这是一个精确的国际标准值。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 lb = 0.45359237 Kg（千克）</li>
 *   <li>1 lb = 453.59237 g（克）</li>
 *   <li>1 lb = 16 oz（盎司）</li>
 *   <li>1 st = 14 lb（英石）</li>
 *   <li>1 short ton = 2000 lb（美吨）</li>
 *   <li>1 long ton = 2240 lb（英吨）</li>
 *   <li>1 Kg ≈ 2.205 lb</li>
 * </ul>
 * <p>
 * 磅单位在美国、英国等使用英制单位的国家有广泛应用，
 * 用于测量人体体重、食品重量、包裹重量等。
 * 在国际贸易和航空等领域，磅也是常用的质量单位。
 * <p>
 * 该单位在使用英制系统的国家和地区常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_lb extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义磅单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 磅是质量单位，1磅等于0.45359237千克，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将磅数值转换为标准单位（千克）的数值。
     * 由于1lb = 0.45359237Kg，所以factor = 0.45359237。
     * 这是国际公认的磅与千克的精确转换系数。
     */
    private final static double factor = 0.45359237;

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
    private final static String description = "lb";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立磅单位与基本单位的关系。
     * 磅是质量单位，由千克单位构成。
     */
    static {
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    /**
     * 构造函数，创建一个磅质量单位(lb)实例
     * <p>
     * 初始化磅质量单位，设置单位符号为"lb"，基本单位组成为千克，
     * 转换因子为0.45359237（即1lb = 0.45359237Kg），无附加偏移量。
     */
    public UMass_lb() {
        // 调用父类DerivedUnit的构造方法，初始化磅质量单位
        // 参数依次为：单位描述("lb")、基本单位元素列表([Kg^1])、转换因子(0.45359237)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}