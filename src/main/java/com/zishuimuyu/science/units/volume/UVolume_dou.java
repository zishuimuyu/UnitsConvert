package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：斗（市斗）
 * <p>
 * 市斗是中国传统计量单位体系中体积的单位。
 * 1市斗等于10升。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 斗 = 10 L（升）</li>
 *   <li>1 斗 = 10 市升</li>
 *   <li>1 斗 = 100 合（市合）</li>
 *   <li>1 斗 = 0.1 石（市石）</li>
 *   <li>1 斗 = 0.01 m³（立方米）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 市斗是中国市制单位体系中体积的单位。
 * "斗"是中国古代最常用的粮食计量单位，
 * 也是影视剧和文学作品中经常出现的计量单位。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>农业：粮食收购和销售</li>
 *   <li>酿酒：传统酿酒原料计量</li>
 *   <li>民俗：红包、酒席等场合的代称</li>
 *   <li>文化研究：古代文学和历史研究</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_dou extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 市斗 = 10升 = 10^-2 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示市斗相对于立方米的关系
     * 1 斗 = 10^-2 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "斗";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-2;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建市斗单位实例
     */
    public UVolume_dou() {
        super(description, elementList, factor, additional);
    }
}