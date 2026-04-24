package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：cL（厘升）
 * <p>
 * 厘升是容积单位，符号为cL（或cl）。
 * 1厘升定义为0.01升的体积，等于10毫升或1×10⁻⁵立方米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 cL = 0.01 L（升）</li>
 *   <li>1 cL = 10 mL（毫升）</li>
 *   <li>1 cL = 10 cm³（立方厘米）</li>
 *   <li>1 L = 100 cL</li>
 *   <li>1 dL = 10 cL</li>
 *   <li>1 US fl oz ≈ 2.957 cL（美制液盎司）</li>
 *   <li>1 imp fl oz ≈ 2.841 cL（英制液盎司）</li>
 * </ul>
 * <p>
 * 厘升单位在欧洲一些国家的酒类标签、烹饪食谱等领域有应用，
 * 用于测量中等量级的液体体积。
 * <p>
 * 该单位在某些专业领域仍然使用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVolume_cl extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义厘升单位的基本单位组成：
     * - 长度单位米(m)，指数为3
     * <p>
     * 厘升是容积单位，1厘升等于0.01升，即1×10⁻⁵立方米。
     * 因此厘升与立方米具有相同的单位维度，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将厘升数值转换为标准单位（立方米）的数值。
     * 由于1cL = 0.01L = 0.01×0.001m³ = 0.00001m³ = 1×10⁻⁵m³，所以factor = 0.00001。
     * 这意味着1厘升等于0.00001立方米。
     */
    private final static double factor = 0.00001;

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
    private final static String description = "cl";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立厘升单位与基本单位的关系。
     * 厘升是三维空间单位，由米单位的三次方构成。
     */
    static {
        // 添加米基本单位，指数为3
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建一个厘升体积单位(cL)实例
     * <p>
     * 初始化厘升体积单位，设置单位符号为"cl"，基本单位组成为m³，
     * 转换因子为1e-05（即1cL = 0.00001m³ = 0.01L），无附加偏移量。
     */
    public UVolume_cl() {
        // 调用父类DerivedUnit的构造方法，初始化厘升体积单位
        // 参数依次为：单位描述("cl")、基本单位元素列表([m^3])、转换因子(0.00001)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}