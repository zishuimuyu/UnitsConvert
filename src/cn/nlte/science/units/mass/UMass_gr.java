package cn.nlte.science.units.mass;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：gr（格令）
 * <P>
 * 格令是英制质量单位，符号为gr。
 * 1格令定义为1/7000磅，约等于64.799毫克。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 gr = 1/7000 lb（磅）</li>
 *   <li>1 gr = 64.79891 mg（毫克）</li>
 *   <li>1 gr = 0.06479891 g（克）</li>
 *   <li>1 oz = 437.5 gr</li>
 *   <li>1 lb = 7000 gr</li>
 *   <li>1 g ≈ 15.43 gr</li>
 * </ul>
 * <P>
 * 格令单位在英语国家有历史上的应用，
 * 主要用于测量子弹重量、弓箭箭头重量、药剂重量等需要精密测量的场合。
 * 在弹药制造和射击运动中，格令仍是一个重要的质量单位。
 * 该单位特别适用于极轻物品的精确计量。
 * <P>
 * 该单位在弹药制造和射击运动领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_gr extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义格令单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <P>
     * 格令是质量单位，1格令等于1/7000磅，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将格令数值转换为标准单位（千克）的数值。
     * 由于1gr = 1/7000lb = (1/7000)×0.45359237Kg，所以factor = new UMass_lb().getFactor() / 7000.0。
     * 这意味着1格令约等于0.0000648千克。
     */
    private final static double factor;
    
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
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
    }

    public UMass_gr() {
        super(description, elementList, factor, additional);
    }

}