package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：mm（毫米）
 * <p>
 * 毫米是国际单位制中长度的常用单位，1毫米 = 0.001米。
 * 该类继承自DerivedUnit，实现了毫米单位的具体定义。
 * <p>
 * 单位定义：
 * <ul>
 *   <li>基本单位：米（m）</li>
 *   <li>指数：1.0</li>
 *   <li>转换因子：0.001（1mm = 0.001m）</li>
 *   <li>偏移量：0.0</li>
 * </ul>
 * <p>
 * 使用示例：
 * <pre>
 * // 创建毫米单位
 * ULength_mm mm = new ULength_mm();
 *
 * // 创建带毫米单位的数值
 * ValueWithUnit thickness = new ValueWithUnit(5.0, new ULength_mm());
 *
 * // 转换为米
 * ValueWithUnit meters = thickness.convertTo(new ULength_m());
 * // 结果：0.005 m
 * </pre>
 * <p>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_mm extends DerivedUnit {

    /**
     * 单位元素列表，包含构成该单位的基本单位和对应的指数
     * <p>
     * 毫米的基本单位是米（m），指数为1.0，表示长度量纲。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子，表示该单位相对于基本单位的倍数关系
     * <p>
     * factor = 0.001，表示1毫米 = 0.001米。
     * 在单位转换时使用：value_in_meters = value_in_mm * factor
     */
    private final static double factor = 0.001;

    /**
     * 偏移量，表示该单位相对于基本单位的零点偏移
     * <p>
     * additional = 0.0，表示毫米和米的零点相同。
     * 该参数主要用于温度等有绝对零点的单位转换。
     */
    private final static double additional = 0.0;

    /**
     * 单位的描述字符串
     * <p>
     * description = "mm"，用于显示和标识该单位。
     */
    private final static String description = "mm";

    /**
     * 静态初始化块，初始化单位元素列表
     * <P>
     * 在类加载时执行，向elementList中添加基本单位元素。
     * 毫米的基本单位是米（m），指数为1.0。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个毫米长度单位(mm)实例
     * <p>
     * 初始化毫米长度单位，设置单位符号为"mm"，基本单位组成为米，
     * 转换因子为0.001（即1mm = 0.001m），无附加偏移量。
     */
    public ULength_mm() {
        // 调用父类DerivedUnit的构造方法，初始化毫米长度单位
        // 参数依次为：单位描述("mm")、基本单位元素列表([m^1])、转换因子(0.001)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}