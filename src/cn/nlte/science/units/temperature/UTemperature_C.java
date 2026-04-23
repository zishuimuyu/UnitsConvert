package cn.nlte.science.units.temperature;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 温度单位：°C（摄氏度）
 * <P>
 * 摄氏度是常用的温度计量单位，符号为°C。
 * 水的冰点为0°C，沸点为100°C（在标准大气压下）。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>0 °C = 273.15 K（开尔文）</li>
 *   <li>0 °C = 32 °F（华氏度）</li>
 *   <li>100 °C = 212 °F</li>
 *   <li>°C 与 K 的转换：K = °C + 273.15</li>
 *   <li>°C 与 °F 的转换：°F = °C × 9/5 + 32</li>
 *   <li>绝对零度 = -273.15 °C</li>
 * </ul>
 * <P>
 * 摄氏度单位在全世界大部分国家广泛使用，特别是在日常生活、
 * 气象预报、科学研究等领域。它是最常见的温度计量单位之一。
 * 摄氏度的刻度间隔与开尔文相同，但零点不同。
 * <P>
 * 该单位适用于大多数日常温度测量。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UTemperature_C extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义摄氏度单位的基本单位组成：
     * - 温度单位开尔文(K)，指数为1
     * <P>
     * 摄氏度与开尔文具有相同的单位增量，但零点不同。
     * 因此摄氏度与开尔文具有相同的基本单位组成。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于摄氏度数值转换的比例因子。
     * 摄氏度与开尔文的刻度间隔相同，因此转换因子为1.0。
     * 摄氏度与开尔文的转换关系为：K = °C + 273.15
     */
    private final static double factor = 1.0;
    
    /**
     * 附加偏移量
     * <P>
     * 摄氏度与开尔文的零点差值为273.15，因此附加偏移量为273.15。
     * 这是因为绝对零度为-273.15°C或0K。
     */
    private final static double additional = 273.15;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "C";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立摄氏度单位与基本单位的关系。
     * 摄氏度使用开尔文作为基本温度单位。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.K, 1.0));  // 开尔文，指数1
    }

    public UTemperature_C() {
        super(description, elementList, factor, additional);
    }

}