package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：yd³（立方码）
 * <p>
 * 立方码是体积单位，符号为yd³，是英制单位制中体积的常用单位。
 * 1立方码等于边长为1码的正方体的体积。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 yd³ = 0.7646 m³（立方米）</li>
 *   <li>1 yd³ = 764,555 cm³（立方厘米）</li>
 *   <li>1 yd³ = 27 ft³（立方英尺）</li>
 *   <li>1 yd³ = 46,656 in³（立方英寸）</li>
 *   <li>1 yd³ = 764.6 L（升）</li>
 *   <li>1 yd³ ≈ 201.97 US gal（美制加仑）</li>
 *   <li>1 m³ ≈ 1.308 yd³</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 立方码起源于英制单位制，基于码这一长度单位。
 * 码的传统定义是英国国王亨利一世从鼻尖到伸直手臂拇指尖的距离。
 * 现代码定义为3英尺，1959年被正式确定为0.9144米。
 * 立方码作为体积单位在英制单位使用国家广泛使用。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>土木工程：混凝土用量、挖掘土方量</li>
 *   <li>建筑工程：建筑材料的计量</li>
 *   <li> landscaping：园林绿化工程中的土壤、石料计量</li>
 *   <li>道路工程：沥青、碎石用量</li>
 *   <li>废弃物处理：垃圾箱容量</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_yd3 extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 立方码 = (码)^3 = (0.9144米)^3 = 0.7646 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示立方码相对于立方米的关系
     * 1 yd³ = 0.7646 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串，用于显示和标识
     */
    private final static String description = "yd\u00B3";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 0.7646;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建立方码单位实例
     * 调用父类DerivedUnit构造函数，传入单位描述、元素列表、转换因子和附加量
     */
    public UVolume_yd3() {
        super(description, elementList, factor, additional);
    }
}