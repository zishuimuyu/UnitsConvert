package com.zishuimuyu.science.units.temperature;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 温度单位：°N（牛氏度）
 * <p>
 * 牛氏度是艾萨克·牛顿(Issac Newton)大约在1701年提出的一种温度标度。
 * 该温度标度以雪融化时的温度为0°N，水沸腾时的温度为33°N。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>0 °N = 0 °C（雪融化温度）</li>
 *   <li>33 °N = 100 °C（水沸点）</li>
 *   <li>°N 与 °C 的转换：°C = °N × 100/33</li>
 *   <li>°C 与 °N 的转换：°N = °C × 33/100</li>
 *   <li>绝对零度 = -90.14 °N</li>
 * </ul>
 * <p>
 * 牛氏度单位虽然简单易懂，但因精度不够而很快被淘汰。
 * 牛顿曾用此温标进行过一些热学实验，为后来的温度研究奠定了基础。
 * 虽然现在已不再使用，但在物理学史和科学史研究中有一定意义。
 * <p>
 * 该单位适用于历史科学研究和温度标度发展史的研究。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTemperature_N extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义牛氏度单位的基本单位组成：
     * - 温度单位开尔文(K)，指数为1
     * <p>
     * 牛氏度与开尔文具有相同的单位增量比例，但零点不同。
     * 因此牛氏度与开尔文具有相同的基本单位组成。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于牛氏度数值转换的比例因子。
     * 根据转换关系 °C = °N × 100/33，可得：
     * °N 到 K 的转换：K = °N × 100/33 + 273.15
     * 因此转换因子为 100/33 ≈ 3.0303030303030303
     */
    private final static double factor = 100.0 / 33.0;

    /**
     * 附加偏移量
     * <p>
     * 牛氏度与开尔文的零点差值为273.15，因此附加偏移量为273.15。
     * 这是因为 0°N = 0°C = 273.15K。
     */
    private final static double additional = 273.15;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "N";

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，建立牛氏度单位与基本单位的关系。
     * 牛氏度使用开尔文作为基本温度单位。
     */
    static {
        // 开尔文，指数1
        elementList.add(new UnitElement(BasicUnit.K, 1.0));
    }

    /**
     * 构造函数，创建一个牛氏度温度单位(°N)实例
     * <p>
     * 初始化牛氏度温度单位，设置单位符号为"N"，基本单位组成为K，
     * 转换因子为3.0303030303030303（即100/33，每度牛氏度变化对应开尔文的变化比例），
     * 附加偏移量为273.15。
     */
    public UTemperature_N() {
        // 调用父类DerivedUnit的构造方法，初始化牛氏度温度单位
        // 参数依次为：单位描述("N")、基本单位元素列表、转换因子(100/33)、附加偏移量(273.15)
        super(description, elementList, factor, additional);
    }

}