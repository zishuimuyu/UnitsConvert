package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：撮（市撮）
 * <p>
 * 市撮是中国传统计量单位体系中体积的最小单位。
 * 1市撮等于1毫升，与毫升完全等价。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 撮 = 1 mL（毫升）</li>
 *   <li>1 撮 = 0.1 勺（市勺）</li>
 *   <li>1 撮 = 0.01 合（市合）</li>
 *   <li>1 撮 = 0.001 L（升）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 市撮是中国市制单位体系中体积的最小单位。
 * 市制是中国传统的计量系统，1915年北洋政府公布《权度法》正式确立。
 * 1959年中国废除市制，改用公制单位，但传统计量在民间仍有使用。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>中医中药：中药方剂中的药液剂量</li>
 *   <li>烹饪调味：少量调味品的精确添加</li>
 *   <li>民间计量：日常生活中的微小液体计量</li>
 *   <li>文化研究：中国传统计量单位研究</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_cuo extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 市撮 = 1毫升 = 10^-6 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示市撮相对于立方米的关系
     * 1 撮 = 10^-6 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "撮";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-6;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建市撮单位实例
     */
    public UVolume_cuo() {
        super(description, elementList, factor, additional);
    }
}