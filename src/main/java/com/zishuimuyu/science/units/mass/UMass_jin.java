package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：jin（市斤）
 * <p>
 * 市斤是中国传统的质量单位，符号为jin。
 * 1市斤定义为0.5千克，即500克。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 jin = 0.5 Kg（千克）</li>
 *   <li>1 jin = 500 g（克）</li>
 *   <li>1 jin = 10 liang（两）</li>
 *   <li>1 jin = 100 qian（钱）</li>
 *   <li>1 dan = 100 jin（担）</li>
 *   <li>1 Kg = 2 jin</li>
 *   <li>1 lb ≈ 2.205 jin</li>
 * </ul>
 * <p>
 * 市斤单位在中国大陆广泛用于市场购物、农产品销售、肉类称重等日常生活场景，
 * 是中国人民熟悉的传统计量单位。
 * 在菜市场、超市等场所经常可以看到使用市斤的秤具。
 * <p>
 * 该单位在中国地区常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_jin extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义市斤单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 市斤是质量单位，1市斤等于0.5千克，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将市斤数值转换为标准单位（千克）的数值。
     * 由于1jin = 0.5Kg，所以factor = 0.5。
     * 这意味着1市斤等于0.5千克。
     */
    private final static double factor = 0.5;

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
    private final static String description = "jin";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立市斤单位与基本单位的关系。
     * 市斤是质量单位，由千克单位构成。
     */
    static {
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    /**
     * 构造函数，创建一个市斤质量单位(jin)实例
     * <p>
     * 初始化市斤质量单位，设置单位符号为"jin"，基本单位组成为千克，
     * 转换因子为0.5（即1jin = 0.5Kg），无附加偏移量。
     */
    public UMass_jin() {
        // 调用父类DerivedUnit的构造方法，初始化市斤质量单位
        // 参数依次为：单位描述("jin")、基本单位元素列表([Kg^1])、转换因子(0.5)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}