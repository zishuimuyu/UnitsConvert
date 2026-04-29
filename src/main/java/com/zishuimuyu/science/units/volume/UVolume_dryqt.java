package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：dry qt（干量夸脱）
 * <p>
 * 干量夸脱是体积单位，符号为dry qt，是英美用于测量干物质体积的单位。
 * 1干量夸脱等于2干量品脱或1/8干量加仑。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 dry qt = 2 dry pt（干量品脱）</li>
 *   <li>1 dry qt = 1/8 dry gal（干量加仑）</li>
 *   <li>1 US dry qt = 1.101 L</li>
 *   <li>1 US dry qt ≈ 0.969 UK dry qt</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 干量夸脱是英国传统计量单位，用于测量干散货物如谷物、面粉等。
 * "夸脱"意为四分之一，最初是1/4加仑的容量。
 * 美制和英制的干量夸脱大小略有不同。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>农业：粮食、种子的批发计量</li>
 *   <li>食品工业：面粉、糖等干货的采购</li>
 *   <li>历史研究：古代贸易计量研究</li>
 *   <li>教育：计量单位历史和换算教学</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_dryqt extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 美制干量夸脱 = 1.1012×10^-3 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示干量夸脱相对于立方米的关系
     * 1 dry qt ≈ 1.1012×10^-3 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "dry qt";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1.1012e-3;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建干量夸脱单位实例
     */
    public UVolume_dryqt() {
        super(description, elementList, factor, additional);
    }
}