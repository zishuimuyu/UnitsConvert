package cn.nlte.science.units.mass;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：qian（钱）
 * <P>
 * 钱是中国传统的质量单位，符号为qian。
 * 1钱定义为0.005千克，即5克。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 qian = 0.005 Kg（千克）</li>
 *   <li>1 qian = 5 g（克）</li>
 *   <li>1 qian = 5000 mg（毫克）</li>
 *   <li>1 liang = 10 qian（两）</li>
 *   <li>1 jin = 100 qian（斤）</li>
 *   <li>1 Kg = 200 qian</li>
 *   <li>1 lb ≈ 88.18 qian</li>
 * </ul>
 * <P>
 * 钱单位在中国传统商业、中医药等领域有广泛应用，
 * 特别是在中药配方中，药材的用量常使用钱作为单位。
 * 在贵金属交易和精密称重中，钱也是一个常用的单位。
 * <P>
 * 该单位在中医药和传统商业领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_qian extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义钱单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <P>
     * 钱是质量单位，1钱等于0.005千克，因此与千克具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将钱数值转换为标准单位（千克）的数值。
     * 由于1qian = 5g = 0.005Kg，所以factor = 0.005。
     * 这意味着1钱等于0.005千克。
     */
    private final static double factor = 0.005;
    
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
    private final static String description = "qian";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立钱单位与基本单位的关系。
     * 钱是质量单位，由千克单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
    }

    public UMass_qian() {
        super(description, elementList, factor, additional);
    }

}