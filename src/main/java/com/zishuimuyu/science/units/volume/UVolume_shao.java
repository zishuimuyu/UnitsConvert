package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：勺（市勺）
 * <p>
 * 市勺是中国传统计量单位体系中体积的单位。
 * 1市勺等于10毫升。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 勺 = 10 mL（毫升）</li>
 *   <li>1 勺 = 10 撮（市撮）</li>
 *   <li>1 勺 = 0.1 合（市合）</li>
 *   <li>1 勺 = 0.01 L（升）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 市勺是中国市制单位体系中体积的单位。
 * 中国传统计量中，"勺"是一个常用的容量单位，
 * 相当于西方的小汤匙容量。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>烹饪：食谱中的液体配料计量</li>
 *   <li>中医中药：药液的配制和服用</li>
 *   <li>餐饮服务：调味品的添加量</li>
 *   <li>家庭日常：食用油、酱油等的用量</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_shao extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 市勺 = 10毫升 = 10^-5 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示市勺相对于立方米的关系
     * 1 勺 = 10^-5 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "勺";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-5;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建市勺单位实例
     */
    public UVolume_shao() {
        super(description, elementList, factor, additional);
    }
}