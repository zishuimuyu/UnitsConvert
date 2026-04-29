package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：dry pt（干量品脱）
 * <p>
 * 干量品脱是体积单位，符号为dry pt，是英美用于测量干物质体积的单位。
 * 与液量品脱不同，干量品脱用于测量固体和干散货物。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 dry pt = 1/64 US bu（美制蒲式耳）</li>
 *   <li>1 dry pt = 1/2 dry qt（干量夸脱）</li>
 *   <li>1 US dry pt = 550.61 mL</li>
   * <li>1 US dry pt ≈ 0.968 UK pt</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 干量品脱是英美传统计量单位，用于测量干散货物如谷物、种子等。
 * 它与液量品脱大小不同，美制干量品脱约为550.6毫升。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>农业：种子、谷物的零售计量</li>
 *   <li>食品加工：干货原料的配料</li>
 *   <li>历史研究：古代贸易和计量研究</li>
 *   <li>教育：计量单位历史教学</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_drypt extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 美制干量品脱 = 1/2干量夸脱 = 5.506×10^-4 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示干量品脱相对于立方米的关系
     * 1 dry pt ≈ 5.506×10^-4 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "dry pt";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 5.506e-4;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建干量品脱单位实例
     */
    public UVolume_drypt() {
        super(description, elementList, factor, additional);
    }
}