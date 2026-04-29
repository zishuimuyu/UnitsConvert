package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：合（市合）
 * <p>
 * 市合是中国传统计量单位体系中体积的单位。
 * 1市合等于100毫升。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 合 = 100 mL（毫升）</li>
 *   <li>1 合 = 10 勺（市勺）</li>
 *   <li>1 合 = 100 撮（市撮）</li>
 *   <li>1 合 = 0.1 L（升）</li>
 *   <li>1 合 = 0.01 斗（市斗）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 市合是中国市制单位体系中体积的单位。
 * "合"是古代容量单位，汉代开始使用，
 * 历朝历代略有变化，但基本相近。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>烹饪：食谱中的液体配料（特别是汤品）</li>
 *   <li>中医中药：中药汤剂的煎煮和服用</li>
 *   <li>酒文化：传统酿酒和饮酒的计量</li>
 *   <li>家庭日常：米酒的酿制</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_sheng extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 市合 = 100毫升 = 10^-4 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示市合相对于立方米的关系
     * 1 合 = 10^-4 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "合";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-4;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建市合单位实例
     */
    public UVolume_sheng() {
        super(description, elementList, factor, additional);
    }
}