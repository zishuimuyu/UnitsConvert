package cn.nlte.science.units.mass;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：Kg（千克）
 * <P>
 * 千克是国际单位制中质量的基本单位，也是质量的SI基本单位。
 * 该类继承自DerivedUnit，实现了千克单位的具体定义。
 * <P>
 * 单位定义：
 * <ul>
 *   <li>基本单位：千克（Kg）</li>
 *   <li>指数：1.0</li>
 *   <li>转换因子：1.0（千克是基本单位）</li>
 *   <li>偏移量：0.0</li>
 * </ul>
 * <P>
 * 使用示例：
 * <pre>
 * // 创建千克单位
 * UMass_Kg kg = new UMass_Kg();
 *
 * // 创建带千克单位的数值
 * ValueWithUnit mass = new ValueWithUnit(2.5, new UMass_Kg());
 *
 * // 转换为克
 * ValueWithUnit grams = mass.convertTo(new UMass_g());
 * // 结果：2500.0 g
 * </pre>
 * <P>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UMass_Kg extends DerivedUnit {

    /**
     * 单位元素列表，包含构成该单位的基本单位和对应的指数
     * <P>
     * 千克本身就是基本单位，所以基本单位是千克（Kg），指数为1.0，表示质量量纲。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子，表示该单位相对于基本单位的倍数关系
     * <P>
     * factor = 1.0，表示千克是基本单位，转换因子为1。
     * 在单位转换时使用：value_in_base = value_in_kg * factor
     */
    private final static double factor = 1.0;

    /**
     * 偏移量，表示该单位相对于基本单位的零点偏移
     * <P>
     * additional = 0.0，表示千克和基本单位的零点相同。
     * 该参数主要用于温度等有绝对零点的单位转换。
     */
    private final static double additional = 0.0;

    /**
     * 单位的描述字符串
     * <P>
     * description = "Kg"，用于显示和标识该单位。
     */
    private final static String description = "Kg";

    /**
     * 静态初始化块，初始化单位元素列表
     * <P>
     * 在类加载时执行，向elementList中添加基本单位元素。
     * 千克本身就是基本单位，所以添加千克（Kg），指数为1.0。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    /**
     * 构造方法，创建一个千克单位实例
     * <P>
     * 调用父类DerivedUnit的构造方法，传入单位的描述、元素列表、转换因子和偏移量。
     */
    public UMass_Kg() {
        super(description, elementList, factor, additional);
    }

}