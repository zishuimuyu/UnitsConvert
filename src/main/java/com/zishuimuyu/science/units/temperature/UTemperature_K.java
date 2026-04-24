package com.zishuimuyu.science.units.temperature;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 温度单位：K（开尔文温度）
 * <p>
 * 开尔文是国际单位制中温度的基本单位，也是热力学温标的单位。
 * 该类继承自DerivedUnit，实现了开尔文温度单位的具体定义。
 * <p>
 * 开尔文与其他温度单位的关系：
 * <ul>
 *   <li>开尔文是热力学温标的基本单位</li>
 *   <li>0 K = -273.15 ℃（绝对零度）</li>
 *   <li>开尔文与摄氏度的刻度相同，但零点不同</li>
 * </ul>
 * <p>
 * 单位定义：
 * <ul>
 *   <li>基本单位：开尔文（K）</li>
 *   <li>指数：1.0</li>
 *   <li>转换因子：1.0（开尔文是基本单位）</li>
 *   <li>偏移量：0.0（开尔文是基本单位）</li>
 * </ul>
 * <p>
 * 使用示例：
 * <pre>
 * // 创建开尔文温度单位
 * UTemperature_K kelvin = new UTemperature_K();
 *
 * // 创建带开尔文温度的数值
 * ValueWithUnit tempK = new ValueWithUnit(300.0, new UTemperature_K());
 *
 * // 转换为摄氏温度
 * ValueWithUnit tempC = tempK.convertTo(new UTemperature_C());
 * // 结果：26.85 ℃
 * </pre>
 * <p>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UTemperature_K extends DerivedUnit {

    /**
     * 单位元素列表，包含构成该单位的基本单位和对应的指数
     * <p>
     * 开尔文本身就是基本单位，所以基本单位是开尔文（K），指数为1.0，表示温度量纲。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子，表示该单位相对于基本单位的倍数关系
     * <p>
     * factor = 1.0，表示开尔文是基本单位，转换因子为1。
     * 在单位转换时使用：value_in_base = value_in_kelvin * factor
     */
    private final static double factor = 1.0;

    /**
     * 偏移量，表示该单位相对于基本单位的零点偏移
     * <p>
     * additional = 0.0，表示开尔文是基本单位，没有偏移。
     * 该参数主要用于其他温度单位转换到开尔文时的计算。
     */
    private final static double additional = 0.0;

    /**
     * 单位的描述字符串
     * <p>
     * description = "K"，用于显示和标识该单位。
     */
    private final static String description = "K";

    /**
     * 静态初始化块，初始化单位元素列表
     * <P>
     * 在类加载时执行，向elementList中添加基本单位元素。
     * 开尔文本身就是基本单位，所以添加开尔文（K），指数为1.0。
     */
    static {
        // 开尔文，指数1
        elementList.add(new UnitElement(BasicUnit.K, 1.0));
    }

    /**
     * 构造函数，创建一个开尔文温度单位(K)实例
     * <p>
     * 初始化开尔文温度单位，设置单位符号为"K"，基本单位组成为K，
     * 转换因子为1（即1K = 1K），无附加偏移量。
     */
    public UTemperature_K() {
        // 调用父类DerivedUnit的构造方法，初始化开尔文温度单位
        // 参数依次为：单位描述("K")、基本单位元素列表([K^1])、转换因子(1.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}