package com.zishuimuyu.science.units.temperature;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 温度单位：°Ra（兰氏度）
 * <p>
 * 兰氏度是绝对温度单位，符号为°Ra或°R。
 * 兰氏温标以绝对零度为零点，每度的增量与华氏度相同。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>0 °Ra = 0 K（绝对零度）</li>
 *   <li>491.67 °Ra = 0 °F（华氏零度）</li>
 *   <li>°Ra 与 K 的转换：K = °Ra × 5/9</li>
 *   <li>°Ra 与 °F 的转换：°F = °Ra - 459.67</li>
 *   <li>°Ra 与 °C 的转换：°C = (°Ra - 491.67) × 5/9</li>
 *   <li>绝对零度 = 0 °Ra</li>
 * </ul>
 * <p>
 * 兰氏度单位在美国工程领域有少量应用，主要用于热力学计算。
 * 与开尔文温标类似，兰氏温标也是绝对温标，但使用华氏度的刻度间隔。
 * 在一些特定的工程计算中，使用兰氏度可以简化公式。
 * <p>
 * 该单位适用于某些工程热力学计算。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UTemperature_Ra extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义兰氏度单位的基本单位组成：
     * - 温度单位开尔文(K)，指数为1
     * <p>
     * 兰氏度与开尔文具有相同的零点（绝对零度），但刻度间隔不同。
     * 因此兰氏度与开尔文具有相同的基本单位组成。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于兰氏度数值转换的比例因子。
     * 由于1°Ra = 5/9 K，所以转换因子为5.0/9.0。
     * 兰氏度与开尔文的转换关系为：K = °Ra × 5/9
     */
    private final static double factor = 5.0 / 9.0;

    /**
     * 附加偏移量
     * <p>
     * 兰氏度与开尔文的零点相同（都是绝对零度），因此附加偏移量为0.0。
     * 所有温度变化量的转换只需要考虑比例因子。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Ra";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立兰氏度单位与基本单位的关系。
     * 兰氏度使用开尔文作为基本温度单位。
     */
    static {
        // 开尔文，指数1
        elementList.add(new UnitElement(BasicUnit.K, 1.0));
    }

    /**
     * 构造函数，创建一个兰氏度温度单位(°Ra)实例
     * <p>
     * 初始化兰氏度温度单位，设置单位符号为"Ra"，基本单位组成为K，
     * 转换因子为0.5555555555555556（即5/9，1°Ra = 5/9K），无附加偏移量。
     */
    public UTemperature_Ra() {
        super(description, elementList, factor, additional);
    }

}