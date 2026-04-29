package com.zishuimuyu.science.units.temperature;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 温度单位：°De（德利斯托温度）
 * <p>
 * 德利斯托温度是由法国天文学家约瑟夫-尼古拉斯·德利斯托(Joseph-Nicolas Delisle)
 * 于1732年发明的温度标度。该温度标度以水的沸点为0°De，融点为150°De。
 * 因此，德利斯托温标是一个倒置的温标，温度升高时数值减小。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>0 °De = 100 °C（水沸点）</li>
 *   <li>150 °De = 0 °C（水融点）</li>
 *   <li>°De 与 °C 的转换：°C = 100 - °De × 2/3</li>
 *   <li>°C 与 °De 的转换：°De = (100 - °C) × 3/2</li>
 *   <li>绝对零度 = 559.725 °De</li>
 * </ul>
 * <p>
 * 德利斯托温标在18世纪的欧洲曾被广泛使用，尤其是在俄罗斯帝国。
 * 直到20世纪初，圣彼得堡科学院仍在使用这种温标。
 * 虽然现在已不再广泛使用，但在历史科学文献中仍有记载。
 * <p>
 * 该单位适用于历史科学研究和温度标度发展史的研究。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTemperature_De extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义德利斯托温度单位的基本单位组成：
     * - 温度单位开尔文(K)，指数为1
     * <p>
     * 德利斯托温度与开尔文具有相同的单位增量比例，但零点和方向不同。
     * 因此德利斯托温度与开尔文具有相同的基本单位组成。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于德利斯托温度数值转换的比例因子。
     * 根据转换关系 °C = 100 - °De × 2/3，可得：
     * °De 到 K 的转换：K = 100 - °De × 2/3 + 273.15
     * 因此转换因子为 -2/3 ≈ -0.6666666666666666（负值表示温标方向相反）
     */
    private final static double factor = -2.0 / 3.0;

    /**
     * 附加偏移量
     * <p>
     * 德利斯托温度与开尔文的零点差值经过换算后为373.15，因此附加偏移量为373.15。
     * 这是因为 0°De = 100°C = 373.15K。
     * 换算过程：100 + 273.15 = 373.15
     */
    private final static double additional = 373.15;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "De";

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，建立德利斯托温度单位与基本单位的关系。
     * 德利斯托温度使用开尔文作为基本温度单位。
     */
    static {
        // 开尔文，指数1
        elementList.add(new UnitElement(BasicUnit.K, 1.0));
    }

    /**
     * 构造函数，创建一个德利斯托温度单位(°De)实例
     * <p>
     * 初始化德利斯托温度单位，设置单位符号为"De"，基本单位组成为K，
     * 转换因子为-0.6666666666666666（即-2/3，每度德利斯托温度变化对应开尔文的反向变化比例），
     * 附加偏移量为373.15。
     */
    public UTemperature_De() {
        // 调用父类DerivedUnit的构造方法，初始化德利斯托温度单位
        // 参数依次为：单位描述("De")、基本单位元素列表、转换因子(-2/3)、附加偏移量(373.15)
        super(description, elementList, factor, additional);
    }

}