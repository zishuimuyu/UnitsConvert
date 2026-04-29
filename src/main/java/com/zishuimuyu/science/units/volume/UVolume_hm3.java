package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：hm³（立方百米）
 * <p>
 * 立方百米是体积单位，符号为hm³，是国际单位制（SI）中体积的倍数单位。
 * 1立方百米等于边长为1百米的正方体的体积。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 hm³ = 1,000,000 m³（立方米）</li>
 *   <li>1 hm³ = 1,000 dam³（立方十米）</li>
 *   <li>1 hm³ = 0.001 Km³（立方千米）</li>
 *   <li>1 hm³ = 10^9 L（升）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 立方百米是SI单位制中的较大倍数单位，通常用于测量非常大的体积。
 * 在水文和地理学中较为常见。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>水文地理：大型水库蓄水量</li>
 *   <li>海洋科学：海湾、海峡的容积</li>
 *   <li>城市规划：地下空间的体积计算</li>
 *   <li>矿业工程：矿坑、采石场的体积</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_hm3 extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 立方百米 = (百米)^3 = (100米)^3 = 10^6 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示立方百米相对于立方米的关系
     * 1 hm³ = 10^6 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "hm³";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e6;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建立方百米单位实例
     */
    public UVolume_hm3() {
        super(description, elementList, factor, additional);
    }
}