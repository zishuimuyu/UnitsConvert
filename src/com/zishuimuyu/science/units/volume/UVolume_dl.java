package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：dL（分升）
 * <P>
 * 分升是容积单位，符号为dL（或dl）。
 * 1分升定义为0.1升的体积，等于100毫升或1×10⁻⁴立方米。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 dL = 0.1 L（升）</li>
 *   <li>1 dL = 100 mL（毫升）</li>
 *   <li>1 dL = 100 cm³（立方厘米）</li>
 *   <li>1 L = 10 dL</li>
 *   <li>1 cL = 0.1 dL</li>
 *   <li>1 daL = 10 dL</li>
 *   <li>1 US fl oz ≈ 0.296 dL（美制液盎司）</li>
 *   <li>1 imp fl oz ≈ 0.284 dL（英制液盎司）</li>
 * </ul>
 * <P>
 * 分升单位在一些欧洲国家和实验室环境中有应用，
 * 用于测量中等量级的液体体积。
 * <P>
 * 该单位在某些专业领域仍然使用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVolume_dl extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义分升单位的基本单位组成：
     * - 长度单位米(m)，指数为3
     * <P>
     * 分升是容积单位，1分升等于0.1升，即1×10⁻⁴立方米。
     * 因此分升与立方米具有相同的单位维度，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将分升数值转换为标准单位（立方米）的数值。
     * 由于1dL = 0.1L = 0.1×0.001m³ = 0.0001m³ = 1×10⁻⁴m³，所以factor = 0.0001。
     * 这意味着1分升等于0.0001立方米。
     */
    private final static double factor = 0.0001;
    
    /**
     * 附加偏移量
     * <P>
     * 体积单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "dl";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立分升单位与基本单位的关系。
     * 分升是三维空间单位，由米单位的三次方构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 3.0));  // 米，指数3
    }

    public UVolume_dl() {
        super(description, elementList, factor, additional);
    }

}