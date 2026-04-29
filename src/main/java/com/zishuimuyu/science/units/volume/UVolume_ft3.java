package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：ft³（立方英尺）
 * <p>
 * 立方英尺是体积单位，符号为ft³，是英制单位制中体积的常用单位。
 * 1立方英尺等于边长为1英尺的正方体的体积。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 ft³ = 0.02832 m³（立方米）</li>
 *   <li>1 ft³ = 28,317 cm³（立方厘米）</li>
 *   <li>1 ft³ = 1,728 in³（立方英寸）</li>
 *   <li>1 ft³ = 28.317 L（升）</li>
 *   <li>1 ft³ ≈ 6.228 US gal（美制加仑）</li>
 *   <li>1 ft³ ≈ 7.481 US gal（美制液量加仑）</li>
 *   <li>1 m³ ≈ 35.315 ft³</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 立方英尺起源于英制单位制，基于英尺这一长度单位。
 * 英尺的起源可以追溯到古罗马时期，当时"pes"（罗马尺）约为29.57厘米。
 * 现代英尺定义为12英寸，1959年被正式确定为30.48厘米。
 * 立方英尺作为体积单位在英制单位使用国家广泛使用。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>建筑工程：房屋容积、通风管道、空调系统容量</li>
 *   <li>房地产：房间面积和体积的测量与描述</li>
 *   <li>天然气行业：天然气交易和计量的常用单位</li>
 *   <li> HVAC系统：暖气、通风和空调系统的容量计算</li>
 *   <li>货运物流：货柜容积计算</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_ft3 extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 立方英尺 = (英尺)^3 = (0.3048米)^3 = 0.028317 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示立方英尺相对于立方米的关系
     * 1 ft³ = 0.028317 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串，用于显示和标识
     */
    private final static String description = "ft\u00B3";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 0.02832;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建立方英尺单位实例
     * 调用父类DerivedUnit构造函数，传入单位描述、元素列表、转换因子和附加量
     */
    public UVolume_ft3() {
        super(description, elementList, factor, additional);
    }
}