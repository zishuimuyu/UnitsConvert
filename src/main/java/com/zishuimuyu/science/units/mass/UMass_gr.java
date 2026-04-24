package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：gr（格令）
 * <p>
 * 格令是英制质量单位，符号为gr。
 * 1格令定义为1/7000磅，约等于64.799毫克。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 gr = 1/7000 lb（磅）</li>
 *   <li>1 gr = 64.79891 mg（毫克）</li>
 *   <li>1 gr = 0.06479891 g（克）</li>
 *   <li>1 oz = 437.5 gr</li>
 *   <li>1 lb = 7000 gr</li>
 *   <li>1 g ≈ 15.43 gr</li>
 * </ul>
 * <p>
 * 格令单位在英语国家有历史上的应用，
 * 主要用于测量子弹重量、弓箭箭头重量、药剂重量等需要精密测量的场合。
 * 在弹药制造和射击运动中，格令仍是一个重要的质量单位。
 * 该单位特别适用于极轻物品的精确计量。
 * <p>
 * 该单位在弹药制造和射击运动领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_gr extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义格令单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 格令是质量单位，1格令等于1/7000磅，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将格令数值转换为标准单位（千克）的数值。
     * 由于1gr = 1/7000lb = (1/7000)×0.45359237Kg，所以factor = new UMass_lb().getFactor() / 7000.0。
     * 这意味着1格令约等于0.0000648千克。
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
    private final static String description = "gr";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立格令单位与基本单位的关系。
     * 格令是质量单位，由千克单位构成。
     * 转换因子通过磅的转换因子除以7000计算得出。
     */
    static {
        factor = new UMass_lb().getFactor() / 7000.0;
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    /**
     * 构造函数，创建一个格令质量单位(gr)实例
     * <p>
     * 初始化格令质量单位，设置单位符号为"gr"，基本单位组成为千克，
     * 转换因子约为0.0000648（即1gr ≈ 0.0000648Kg），无附加偏移量。
     */
    public UMass_gr() {
        // 调用父类DerivedUnit的构造方法，初始化格令质量单位
        // 参数依次为：单位描述("gr")、基本单位元素列表([Kg^1])、转换因子(约为0.0000648)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}