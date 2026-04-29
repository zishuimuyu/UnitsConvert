package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：石（市石）
 * <p>
 * 市石是中国传统计量单位体系中体积的最大单位。
 * 1市石等于100升。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 石 = 100 L（升）</li>
 *   <li>1 石 = 10 斗（市斗）</li>
 *   <li>1 石 = 100 市升</li>
 *   <li>1 石 = 0.1 m³（立方米）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 市石是中国市制单位体系中体积的最大单位。
 * "石"在古代既是容量单位也是重量单位。
 * 作为容量单位时，主要用于测量粮食。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>农业：大地主、粮商的粮食计量</li>
 *   <li>地租：古代地租的计算单位</li>
 *   <li>官员俸禄：古代官员俸禄的计量</li>
 *   <li>历史研究：古代社会经济研究</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_shi extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 市石 = 100升 = 10^-1 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示市石相对于立方米的关系
     * 1 石 = 10^-1 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "石";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-1;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建市石单位实例
     */
    public UVolume_shi() {
        super(description, elementList, factor, additional);
    }
}