package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：升（市升）
 * <p>
 * 市升是中国传统计量单位体系中体积的基本单位。
 * 1市升等于1升，与国际单位制的升完全等价。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 升 = 1 L（升）</li>
 *   <li>1 升 = 10 合（市合）</li>
 *   <li>1 升 = 100 勺（市勺）</li>
 *   <li>1 升 = 1000 撮（市撮）</li>
 *   <li>1 升 = 0.1 斗（市斗）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 市升是中国市制单位体系中体积的基本单位。
 * 中国的"升"与公制升的容量非常接近，
 * 这也是公制单位能够在中国快速推广的原因之一。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>日常生活：米、油、酱油等液体的购买</li>
 *   <li>烹饪：食谱中的配料计量</li>
 *   <li>餐饮服务：饮料、酒水的容量</li>
 *   <li>传统市场：集市贸易中的计量</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_sheng_L extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 市升 = 1升 = 10^-3 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示市升相对于立方米的关系
     * 1 升 = 10^-3 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "升";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-3;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建市升单位实例
     */
    public UVolume_sheng_L() {
        super(description, elementList, factor, additional);
    }
}