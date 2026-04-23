package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.length.ULength_yd;
import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：yd³（立方码）
 * <P>
 * 立方码是非国际单位制体积单位，符号为yd³。
 * 1立方码定义为边长为1码的立方体所占的空间。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 yd³ ≈ 0.7646 m³（立方米）</li>
 *   <li>1 yd³ = 764.55 L（升）</li>
 *   <li>1 yd³ = 764,555 cm³（立方厘米）</li>
 *   <li>1 yd³ = 27 ft³（立方英尺）</li>
 *   <li>1 yd³ = 46,656 in³（立方英寸）</li>
 *   <li>1 m³ ≈ 1.308 yd³</li>
 *   <li>1 US gal ≈ 0.00495 yd³（美制加仑）</li>
 *   <li>1 imp gal ≈ 0.00595 yd³（英制加仑）</li>
 * </ul>
 * <P>
 * 立方码单位在美国、加拿大等使用英制单位的国家有广泛应用，
 * 用于测量建筑材料（如混凝土、砂石）、土方工程、
 * 土地面积转换等。
 * 在建筑和土木工程领域，立方码是测量大量材料体积的标准单位。
 * <P>
 * 该单位适合表示大体积材料。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVolume_yd3 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义立方码单位的基本单位组成：
     * - 长度单位米(m)，指数为3
     * <P>
     * 立方码是体积单位，1立方码等于(1码)³，需要转换为立方米的三次方。
     * 因此立方码与立方米具有相同的单位维度，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将立方码数值转换为标准单位（立方米）的数值。
     * 由于1yd³ = (1yd)³ = (0.9144m)³，该值通过计算码单位的转换因子的三次方获得。
     * 这意味着1立方码约等于0.7646立方米。
     */
    private final static double factor;
    
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
    private final static String description = "yd3";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算码单位转换因子的三次方来确定立方码的转换因子。
     * 由于体积是长度的三次方，因此需要对长度转换因子进行立方运算。
     */
    static {
        factor = Math.pow(new ULength_yd().getFactor(), 3.0);
        elementList.add(new UnitElement(BasicUnit.m, 3.0));  // 米，指数3
    }

    public UVolume_yd3() {
        super(description, elementList, factor, additional);
    }

}