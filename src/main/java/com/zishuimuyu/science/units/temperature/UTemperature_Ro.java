package com.zishuimuyu.science.units.temperature;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 温度单位：°Rø（罗氏度）
 * <p>
 * 罗氏度是丹麦天文学家奥勒·罗默(Ole Rømer)于1701年发明的温度标度。
 * 该温度标度以盐水混合物的冰点为0°Rø，水的沸点为60°Rø。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>0 °Rø = -14.063 °C（盐水冰点）</li>
 *   <li>60 °Rø = 100 °C（水沸点）</li>
 *   <li>°Rø 与 °C 的转换：°C = (°Rø - 7.5) × 40/21</li>
 *   <li>°C 与 °Rø 的转换：°Rø = °C × 21/40 + 7.5</li>
 *   <li>绝对零度 = -355.88 °Rø</li>
 * </ul>
 * <p>
 * 罗氏度单位在历史上具有重要意义，曾被用于航海、气象等领域。
 * 丹尼尔·加布里埃尔·华伦海特曾参考罗氏温标设计自己的温标。
 * 虽然现在已不再广泛使用，但在历史科学文献中仍有记载。
 * <p>
 * 该单位适用于历史科学研究和温度标度发展史的研究。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTemperature_Ro extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义罗氏度单位的基本单位组成：
     * - 温度单位开尔文(K)，指数为1
     * <p>
     * 罗氏度与开尔文具有相同的单位增量比例，但零点不同。
     * 因此罗氏度与开尔文具有相同的基本单位组成。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于罗氏度数值转换的比例因子。
     * 根据转换关系 °C = (°Rø - 7.5) × 40/21，可得：
     * °Rø 到 K 的转换：K = (°Rø - 7.5) × 40/21 + 273.15
     * 因此转换因子为 40/21 ≈ 1.9047619047619047
     */
    private final static double factor = 40.0 / 21.0;

    /**
     * 附加偏移量
     * <p>
     * 罗氏度与开尔文的零点差值经过换算后为259.087，因此附加偏移量为259.087。
     * 这是因为 0°Rø = -14.063°C = 259.087K。
     * 换算过程：-7.5 × 40/21 + 273.15 = -14.285714 + 273.15 = 258.864286
     * 更精确地：0°Rø = -14.063°C，所以偏移量为 273.15 - 14.063 = 259.087
     */
    private final static double additional = 273.15 - (7.5 * 40.0 / 21.0);

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Rø";

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，建立罗氏度单位与基本单位的关系。
     * 罗氏度使用开尔文作为基本温度单位。
     */
    static {
        // 开尔文，指数1
        elementList.add(new UnitElement(BasicUnit.K, 1.0));
    }

    /**
     * 构造函数，创建一个罗氏度温度单位(°Rø)实例
     * <p>
     * 初始化罗氏度温度单位，设置单位符号为"Rø"，基本单位组成为K，
     * 转换因子为1.9047619047619047（即40/21，每度罗氏度变化对应开尔文的变化比例），
     * 附加偏移量为259.08714285714286。
     */
    public UTemperature_Ro() {
        // 调用父类DerivedUnit的构造方法，初始化罗氏度温度单位
        // 参数依次为：单位描述("Rø")、基本单位元素列表、转换因子(40/21)、附加偏移量(273.15 - 7.5*40/21)
        super(description, elementList, factor, additional);
    }

}