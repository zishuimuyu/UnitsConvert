package com.zishuimuyu.science.units.temperature;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 温度单位：°W（湿球温度）
 * <p>
 * 湿球温度是空气动力学和气象学中的一个重要参数，
 * 表示在绝热饱和过程中湿空气达到饱和状态时的温度。
 * 该温度反映了空气的湿度含量和蒸发冷却效应。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>湿球温度通常以摄氏度为基准单位进行测量</li>
 *   <li>湿球温度 ≤ 干球温度（实际空气温度）</li>
 *   <li>当相对湿度为100%时，湿球温度 = 干球温度</li>
 *   <li>湿球温度与干球温度差值越大，空气越干燥</li>
 *   <li>湿球温度可用于计算露点温度、焓值等参数</li>
 * </ul>
 * <p>
 * 湿球温度单位在以下领域有重要应用：
 * <ul>
 *   <li>暖通空调(HVAC)系统设计与控制</li>
 *   <li>气象学和气候学研究</li>
 *   <li>工业干燥过程控制</li>
 *   <li>农业灌溉与作物生长环境监测</li>
 *   <li>发电厂冷却塔效率评估</li>
 * </ul>
 * <p>
 * 该单位适用于气象工程、暖通空调工程、工业过程控制等领域。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTemperature_TW extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义湿球温度单位的基本单位组成：
     * - 温度单位开尔文(K)，指数为1
     * <p>
     * 湿球温度与开尔文具有相同的单位增量，但零点可能因测量方式略有差异。
     * 因此湿球温度与开尔文具有相同的基本单位组成。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于湿球温度数值转换的比例因子。
     * 湿球温度理论上与摄氏度具有相同的刻度，因此转换因子为1.0。
     */
    private final static double factor = 1.0;

    /**
     * 附加偏移量
     * <p>
     * 湿球温度与开尔文的零点差值为273.15，因此附加偏移量为273.15。
     * 这是因为 0°C（湿球温度）= 273.15K。
     */
    private final static double additional = 273.15;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "W";

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，建立湿球温度单位与基本单位的关系。
     * 湿球温度使用开尔文作为基本温度单位。
     */
    static {
        // 开尔文，指数1
        elementList.add(new UnitElement(BasicUnit.K, 1.0));
    }

    /**
     * 构造函数，创建一个湿球温度单位(°W)实例
     * <p>
     * 初始化湿球温度单位，设置单位符号为"W"，基本单位组成为K，
     * 转换因子为1.0（每度湿球温度变化对应1K变化），附加偏移量为273.15。
     */
    public UTemperature_TW() {
        // 调用父类DerivedUnit的构造方法，初始化湿球温度单位
        // 参数依次为：单位描述("W")、基本单位元素列表、转换因子(1.0)、附加偏移量(273.15)
        super(description, elementList, factor, additional);
    }

}