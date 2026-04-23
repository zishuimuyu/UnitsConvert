package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：daL（十升）
 * <P>
 * 十升是容积单位，符号为daL（或dal）。
 * 1十升定义为10升的体积，等于0.01立方米。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 daL = 10 L（升）</li>
 *   <li>1 daL = 10,000 mL（毫升）</li>
 *   <li>1 daL = 0.01 m³（立方米）</li>
 *   <li>1 L = 0.1 daL</li>
 *   <li>1 hL = 10 daL</li>
 *   <li>1 dL = 0.01 daL</li>
 *   <li>1 US gal ≈ 0.379 daL（美制加仑）</li>
 *   <li>1 imp gal ≈ 0.455 daL（英制加仑）</li>
 * </ul>
 * <P>
 * 十升单位在一些欧洲国家和农业领域有应用，
 * 用于测量较大的液体体积，如农药配比、肥料溶液等。
 * <P>
 * 该单位在某些专业领域仍然使用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVolume_dal extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义十升单位的基本单位组成：
     * - 长度单位米(m)，指数为3
     * <P>
     * 十升是容积单位，1十升等于10升，即0.01立方米。
     * 因此十升与立方米具有相同的单位维度，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将十升数值转换为标准单位（立方米）的数值。
     * 由于1daL = 10L = 10×0.001m³ = 0.01m³，所以factor = 0.01。
     * 这意味着1十升等于0.01立方米。
     */
    private final static double factor = 0.01;
    
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
    private final static String description = "dal";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立十升单位与基本单位的关系。
     * 十升是三维空间单位，由米单位的三次方构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 3.0));  // 米，指数3
    }

    public UVolume_dal() {
        super(description, elementList, factor, additional);
    }

}