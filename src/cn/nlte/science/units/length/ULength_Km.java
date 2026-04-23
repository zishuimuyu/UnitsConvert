package cn.nlte.science.units.length;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：Km（千米）
 * <P>
 * 千米是国际单位制中长度的常用单位，1千米 = 1000米。
 * 该类继承自DerivedUnit，实现了千米单位的具体定义。
 * <P>
 * 单位定义：
 * <ul>
 *   <li>基本单位：米（m）</li>
 *   <li>指数：1.0</li>
 *   <li>转换因子：1000.0（1Km = 1000m）</li>
 *   <li>偏移量：0.0</li>
 * </ul>
 * <P>
 * 使用示例：
 * <pre>
 * // 创建千米单位
 * ULength_Km km = new ULength_Kg();
 *
 * // 创建带千米单位的数值
 * ValueWithUnit distance = new ValueWithUnit(5.0, new ULength_Km());
 *
 * // 转换为米
 * ValueWithUnit meters = distance.convertTo(new ULength_m());
 * // 结果：5000.0 m
 * </pre>
 * <P>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_Km extends DerivedUnit {

    /**
     * 单位元素列表，包含构成该单位的基本单位和对应的指数
     * <P>
     * 千米的基本单位是米（m），指数为1.0，表示长度量纲。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子，表示该单位相对于基本单位的倍数关系
     * <P>
     * factor = 1000.0，表示1千米 = 1000米。
     * 在单位转换时使用：value_in_meters = value_in_km * factor
     */
    private final static double factor = 1000.0;

    /**
     * 偏移量，表示该单位相对于基本单位的零点偏移
     * <P>
     * additional = 0.0，表示千米和米的零点相同。
     * 该参数主要用于温度等有绝对零点的单位转换。
     */
    private final static double additional = 0.0;

    /**
     * 单位的描述字符串
     * <P>
     * description = "Km"，用于显示和标识该单位。
     */
    private final static String description = "Km";

    /**
     * 静态初始化块，初始化单位元素列表
     * <P>
     * 在类加载时执行，向elementList中添加基本单位元素。
     * 千米的基本单位是米（m），指数为1.0。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造方法，创建一个千米单位实例
     * <P>
     * 调用父类DerivedUnit的构造方法，传入单位的描述、元素列表、转换因子和偏移量。
     */
    public ULength_Km() {
        super(description, elementList, factor, additional);
    }

}