package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：cm³（立方厘米）
 * <p>
 * 立方厘米是体积单位，符号为cm³，是国际单位制（SI）中体积的分数单位。
 * 1立方厘米等于边长为1厘米的正方体的体积。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 cm³ = 1,000 mm³（立方毫米）</li>
 *   <li>1 cm³ = 0.001 m³（立方米）</li>
 *   <li>1 cm³ = 1 mL（毫升）</li>
 *   <li>1 cm³ ≈ 0.061 in³（立方英寸）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 立方厘米是CGS（厘米-克-秒）制中的体积基本单位，
 * 该单位制在科学和工程领域广泛使用，直到被SI单位制取代。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>医学领域：血液样本、药物溶液的体积测量</li>
 *   <li>化学实验：试剂配制、溶液体积</li>
 *   <li>汽车工程：发动机排量（如2.0L = 2000cm³）</li>
 *   <li>食品工业：小包装食品、调味品的容积</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_cm3 extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 立方厘米 = (厘米)^3 = (0.01米)^3 = 10^-6 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示立方厘米相对于立方米的关系
     * 1 cm³ = 10^-6 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "cm³";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-6;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建立方厘米单位实例
     */
    public UVolume_cm3() {
        super(description, elementList, factor, additional);
    }
}