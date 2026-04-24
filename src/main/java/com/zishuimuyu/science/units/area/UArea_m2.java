package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：m²（平方米）
 * <p>
 * 平方米是国际单位制中面积的基本导出单位，符号为m²。
 * 1平方米定义为边长为1米的正方形所围成的面积。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 m² = 100 dm²（平方分米）</li>
 *   <li>1 m² = 10,000 cm²（平方厘米）</li>
 *   <li>1 m² = 1,000,000 mm²（平方毫米）</li>
 *   <li>1 dam² = 100 m²（平方十米，公亩）</li>
 *   <li>1 hm² = 10,000 m²（平方百米，公顷）</li>
 *   <li>1 km² = 1,000,000 m²（平方千米）</li>
 *   <li>1 ft² ≈ 0.0929 m²（平方英尺）</li>
 *   <li>1 acre ≈ 4,046.86 m²（英亩）</li>
 * </ul>
 * <p>
 * 平方米单位广泛应用于建筑、房地产、土地测量、制造等领域，
 * 用于测量平面图形的面积，如房间、土地、板材等。
 * <p>
 * 面积是二维空间的度量，在SI单位制中，面积单位是通过长度单位的平方来定义的。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UArea_m2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义平方米单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 根据A=l×w（面积=长×宽），m² = m²
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 平方米是面积的标准单位，因此转换因子为1.0。
     * 用于与其他面积单位进行数值转换。
     */
    private final static double factor = 1.0;

    /**
     * 附加偏移量
     * <p>
     * 面积单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "m2";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立平方米单位与基本单位的关系。
     * 根据A=l×w，面积单位由米单位的平方组成。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个平方米面积单位(m²)实例
     * <p>
     * 初始化平方米面积单位，设置单位符号为"m2"，基本单位组成为m²，
     * 转换因子为1（即1m² = 1m²），无附加偏移量。
     */
    public UArea_m2() {
        // 调用父类DerivedUnit的构造方法，初始化平方米面积单位
        // 参数依次为：单位描述("m2")、基本单位元素列表([m^2])、转换因子(1.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}