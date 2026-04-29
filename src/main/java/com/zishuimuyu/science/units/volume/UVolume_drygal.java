package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：dry gal（干量加仑）
 * <p>
 * 干量加仑是体积单位，符号为dry gal，是英美用于测量干物质体积的单位。
 * 干量加仑与液量加仑不同，干量加仑用于测量固体和干散货物。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 dry gal = 4 dry qt（干量夸脱）</li>
 *   <li>1 dry gal = 8 dry pt（干量品脱）</li>
 *   <li>1 US dry gal = 4.405 L</li>
 *   <li>1 dry gal ≈ 0.969 液量加仑</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 干量加仑是英国传统计量单位，最初用于测量谷物等干货物。
 * 美制干量加仑与液量加仑大小不同，干量加仑更大。
 * 在美国主要用于农业和粮食测量。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>农业：谷物、种子的收购和销售</li>
 *   <li>粮食储存：粮仓容量的标注</li>
 *   <li>历史研究：古代度量研究</li>
 *   <li>教育：计量单位历史教学</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_drygal extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 美制干量加仑 = 4.4048×10^-3 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示干量加仑相对于立方米的关系
     * 1 dry gal ≈ 4.4048×10^-3 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "dry gal";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 4.4048e-3;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建干量加仑单位实例
     */
    public UVolume_drygal() {
        super(description, elementList, factor, additional);
    }
}