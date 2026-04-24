package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：mL（毫升）
 * <p>
 * 毫升是容积单位，符号为mL（或ml）。
 * 1毫升定义为1立方厘米（cm³）的体积，等于0.001升或1×10⁻⁶立方米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 mL = 1 cm³ = 0.001 L（升）</li>
 *   <li>1 mL = 1000 μL（微升）</li>
 *   <li>1 mL = 0.001 dL（分升）</li>
 *   <li>1 L = 1000 mL</li>
 *   <li>1 US fl oz ≈ 29.574 mL（美制液盎司）</li>
 *   <li>1 imp fl oz ≈ 28.413 mL（英制液盎司）</li>
 *   <li>1 tsp ≈ 5 mL（茶匙）</li>
 *   <li>1 tbsp ≈ 15 mL（汤匙）</li>
 * </ul>
 * <p>
 * 毫升单位在医疗、实验室、烹饪等领域有广泛应用，
 * 用于测量小量液体体积，如药物剂量、试剂用量、
 * 食谱中的液体成分等。
 * <p>
 * 该单位特别适合表示小体积液体。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVolume_ml extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义毫升单位的基本单位组成：
     * - 长度单位米(m)，指数为3
     * <p>
     * 毫升是容积单位，1毫升等于1立方厘米(cm³)，即(0.01m)³ = 1×10⁻⁶m³。
     * 因此毫升与立方米具有相同的单位维度，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将毫升数值转换为标准单位（立方米）的数值。
     * 由于1mL = 1cm³ = (0.01m)³ = 0.000001m³ = 1×10⁻⁶m³，所以factor = 1.0E-6。
     * 这意味着1毫升等于0.000001立方米。
     */
    private final static double factor = 1.0E-6;

    /**
     * 附加偏移量
     * <p>
     * 体积单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "ml";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立毫升单位与基本单位的关系。
     * 毫升是三维空间单位，由米单位的三次方构成。
     */
    static {
        // 米，指数3
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建一个毫升体积单位(mL)实例
     * <p>
     * 初始化毫升体积单位，设置单位符号为"ml"，基本单位组成为m³，
     * 转换因子为1e-06（即1mL = 0.000001m³ = 1cm³），无附加偏移量。
     */
    public UVolume_ml() {
        // 调用父类DerivedUnit的构造方法，初始化毫升体积单位
        // 参数依次为：单位描述("ml")、基本单位元素列表([m^3])、转换因子(1.0E-6)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}