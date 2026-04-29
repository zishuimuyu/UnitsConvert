package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：m³（立方米）
 * <p>
 * 立方米是体积单位，符号为m³，是国际单位制（SI）中体积的基本单位。
 * 1立方米等于长、宽、高各为1米的立方体的体积。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 m³ = 1,000,000 cm³（立方厘米）</li>
 *   <li>1 m³ = 1,000,000,000 mm³（立方毫米）</li>
 *   <li>1 m³ = 1,000 L（升）</li>
 *   <li>1 m³ = 264.172 US gal（美制加仑）</li>
 *   <li>1 m³ = 35.315 ft³（立方英尺）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 立方米作为体积的基本单位，起源于法国米制系统，于1799年正式确立。
 * 它是基于米制长度单位定义的，属于国际单位制的一部分。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>建筑工程：混凝土、砂石等建筑材料的计量</li>
 *   <li>工业生产：大型容器、储罐的容积测量</li>
 *   <li>环境科学：污染物排放量、废气废水体积</li>
 *   <li>科学研究：实验室大规模反应器的容积</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_m3 extends DerivedUnit {

    /**
     * 单位元素列表，用于表示体积由长度单位的三次方组成
     * 体积 = 长度³，因此元素为 (米, 3.0)
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示该单位相对于基本单位（立方米）的换算系数
     * 对于立方米本身，因子为1.0
     */
    private final static double factor;
    
    /**
     * 附加量，用于温度等有偏移量的单位转换
     * 体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串，用于显示和标识
     */
    private final static String description = "m³";

    /**
     * 静态初始化块，设置转换因子和单位元素
     * 立方米是基本单位，转换因子为1.0
     */
    static {
        factor = 1.0;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建立方米单位实例
     * 调用父类DerivedUnit构造函数，传入单位描述、元素列表、转换因子和附加量
     */
    public UVolume_m3() {
        super(description, elementList, factor, additional);
    }
}