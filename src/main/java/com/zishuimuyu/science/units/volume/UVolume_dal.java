package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：daL（十升）
 * <p>
 * 十升是体积单位，符号为daL，是公制系统中常用的液体体积倍数单位。
 * 1十升等于10升。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 daL = 10 L（升）</li>
 *   <li>1 daL = 10,000 mL（毫升）</li>
 *   <li>1 daL = 0.01 m³（立方米）</li>
 *   <li>1 daL = 10 dm³（立方分米）</li>
 *   <li>1 daL ≈ 2.642 US gal（美制加仑）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 十升是公制系统中的一个倍数单位，但较少在日常生活中使用。
 * 它不是国际单位制（SI）的一部分，但在某些工业和商业领域有应用。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>工业液体测量：化学品的批量计量</li>
 *   <li>食品加工：饮料生产中的容量计量</li>
 *   <li>农业：农药、肥料溶液的配制</li>
 *   <li>能源行业：润滑油的容量测量</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_daL extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 十升 = 10升 = 10^-2 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示十升相对于立方米的关系
     * 1 daL = 10^-2 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "daL";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-2;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建十升单位实例
     */
    public UVolume_daL() {
        super(description, elementList, factor, additional);
    }
}