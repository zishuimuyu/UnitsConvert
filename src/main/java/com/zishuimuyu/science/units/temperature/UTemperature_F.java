package com.zishuimuyu.science.units.temperature;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 温度单位：℉（华氏温度）
 * <p>
 * 华氏温度是常用的温度单位之一，主要用于美国等国家。
 * 该类继承自DerivedUnit，实现了华氏温度单位的具体定义。
 * <p>
 * 华氏温度与开尔文的转换关系：
 * <ul>
 *   <li>华氏温度转开尔文：K = (℉ - 32) × 5/9 + 273.15</li>
 *   <li>开尔文转华氏温度：℉ = (K - 273.15) × 9/5 + 32</li>
 * </ul>
 * <p>
 * 单位定义：
 * <ul>
 *   <li>基本单位：开尔文（K）</li>
 *   <li>指数：1.0</li>
 *   <li>转换因子：5.0/9.0（华氏温度每度变化对应开尔文的变化比例）</li>
 *   <li>偏移量：273.15 - 32.0 × 5.0/9.0（华氏温度零度对应的开尔文值）</li>
 * </ul>
 * <p>
 * 使用示例：
 * <pre>
 * // 创建华氏温度单位
 * UTemperature_F fahrenheit = new UTemperature_F();
 *
 * // 创建带华氏温度的数值
 * ValueWithUnit tempF = new ValueWithUnit(100.0, new UTemperature_F());
 *
 * // 转换为摄氏温度
 * ValueWithUnit tempC = tempF.convertTo(new UTemperature_C());
 * // 结果约为：37.78 ℃
 * </pre>
 * <p>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UTemperature_F extends DerivedUnit {

    /**
     * 单位元素列表，包含构成该单位的基本单位和对应的指数
     * <p>
     * 华氏温度的基本单位是开尔文（K），指数为1.0，表示温度量纲。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子，表示该单位相对于基本单位的倍数关系
     * <p>
     * factor = 5.0/9.0，表示华氏温度每度变化对应开尔文的变化比例。
     * 在单位转换时使用：value_in_kelvin = value_in_fahrenheit * factor + additional
     */
    private final static double factor = 5.0 / 9.0;

    /**
     * 偏移量，表示该单位相对于基本单位的零点偏移
     * <p>
     * additional = 273.15 - 32.0 * 5.0/9.0，表示华氏温度零度对应的开尔文值。
     * 这个值是华氏温度转换为开尔文时的基准点。
     */
    private final static double additional = 273.15 - 32.0 * 5.0 / 9.0;

    /**
     * 单位的描述字符串
     * <p>
     * description = "F"，用于显示和标识该单位。
     */
    private final static String description = "F";

    /**
     * 静态初始化块，初始化单位元素列表
     * <P>
     * 在类加载时执行，向elementList中添加基本单位元素。
     * 华氏温度的基本单位是开尔文（K），指数为1.0。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.K, 1.0));
    }

    /**
     * 构造函数，创建一个华氏温度单位(℉)实例
     * <p>
     * 初始化华氏温度单位，设置单位符号为"F"，基本单位组成为K，
     * 转换因子为0.5555555555555556（即5/9，每度华氏度变化对应开尔文的变化比例），附加偏移量为255.37222222222223。
     */
    public UTemperature_F() {
        // 调用父类DerivedUnit的构造方法，初始化华氏温度单位
        // 参数依次为：单位描述("F")、基本单位元素列表([K^1])、转换因子(5.0/9.0)、附加偏移量(273.15 - 32.0 * 5.0/9.0)
        super(description, elementList, factor, additional);
    }

}