package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：fl dr（液量打兰）
 * <p>
 * 液量打兰是体积单位，符号为fl dr，是英美常用的液体体积单位。
 * 主要在制药和香水行业使用。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 UK fl dr = 3.552 mL</li>
 *   <li>1 US fl dr = 3.697 mL</li>
 *   <li>1 fl dr = 1/8 fl oz（液量盎司）</li>
 *   <li>1 US fl dr = 1/128 US gal</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 液量打兰是英制单位制中用于测量液体的单位。
 * "打兰"一词来源于古希腊的重量单位"dram"，原本是重量单位，
 * 后来也用于表示液体的容量。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>制药行业：处方药剂量表示</li>
 *   <li>香水行业：香料容量的精确计量</li>
 *   <li>传统医学：中药液体制剂的剂量</li>
 *   <li>调酒：鸡尾酒配方中的微量液体</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_fldr extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 液量打兰 = 1/8液量盎司 = 3.5516×10^-6 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示液量打兰相对于立方米的关系
     * 1 fl dr ≈ 3.5516×10^-6 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "fl dr";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 3.5516e-6;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建液量打兰单位实例
     */
    public UVolume_fldr() {
        super(description, elementList, factor, additional);
    }
}