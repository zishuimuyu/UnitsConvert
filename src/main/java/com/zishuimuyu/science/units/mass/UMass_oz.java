package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：oz（盎司）
 * <P>
 * 盎司是英制质量单位，符号为oz。
 * 1盎司定义为1/16磅，约等于28.35克。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 oz = 1/16 lb（磅）</li>
 *   <li>1 oz = 28.349523125 g（克）</li>
 *   <li>1 oz = 437.5 gr（格令）</li>
 *   <li>1 lb = 16 oz</li>
 *   <li>1 kg ≈ 35.27 oz</li>
 *   <li>1 troy oz（金衡盎司）≈ 1.097 oz（常衡盎司）</li>
 * </ul>
 * <P>
 * 盎司单位在英语国家有广泛应用，
 * 用于测量食品重量、邮包重量、贵金属（如黄金、白银）等。
 * 在美国，食品包装上常标注盎司为单位。
 * 该单位特别适用于测量较轻的物品。
 * <P>
 * 该单位在使用英制系统的国家和地区常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_oz extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义盎司单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <P>
     * 盎司是质量单位，1盎司等于1/16磅，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将盎司数值转换为标准单位（千克）的数值。
     * 由于1oz = 1/16lb = (1/16)×0.45359237Kg，所以factor = new UMass_lb().getFactor() / 16.0。
     * 这意味着1盎司约等于0.02835千克。
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
    private final static String description = "oz";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立盎司单位与基本单位的关系。
     * 盎司是质量单位，由千克单位构成。
     * 转换因子通过磅的转换因子除以16计算得出。
     */
    static {
        factor = new UMass_lb().getFactor() / 16.0;
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
    }

    public UMass_oz() {
        super(description, elementList, factor, additional);
    }

}