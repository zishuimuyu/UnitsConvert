package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：Km³（立方千米）
 * <p>
 * 立方千米是体积单位，符号为Km³，是国际单位制（SI）中体积的倍数单位。
 * 1立方千米等于边长为1千米的正方体的体积。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 Km³ = 10^9 m³（立方米）</li>
 *   <li>1 Km³ = 10^6 dam³（立方十米）</li>
 *   <li>1 Km³ = 10^3 hm³（立方百米）</li>
 *   <li>1 Km³ = 10^12 L（升）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 立方千米是SI单位制中用于测量极大体积的单位。
 * 主要在天文地理、海洋科学等领域使用。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>地质学：岩浆体、火山喷发物的体积</li>
 *   <li>海洋学：海洋水体容积</li>
 *   <li>天文地理：大型峡谷、陨石坑的容积</li>
 *   <li>环境科学：区域性大气污染物体积</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_Km3 extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 立方千米 = (千米)^3 = (1000米)^3 = 10^9 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示立方千米相对于立方米的关系
     * 1 Km³ = 10^9 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "Km³";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e9;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建立方千米单位实例
     */
    public UVolume_Km3() {
        super(description, elementList, factor, additional);
    }
}