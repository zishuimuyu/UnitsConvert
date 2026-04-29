package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：hL（百升）
 * <p>
 * 百升是体积单位，符号为hL，是公制系统中常用的液体体积倍数单位。
 * 1百升等于100升。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 hL = 100 L（升）</li>
 *   <li>1 hL = 0.1 m³（立方米）</li>
 *   <li>1 hL = 100 dm³（立方分米）</li>
 *   <li>1 hL ≈ 26.417 US gal（美制加仑）</li>
 *   <li>1 hL ≈ 21.997 UK gal（英制加仑）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 百升是公制系统中的一个倍数单位，主要在商业和工业领域使用。
 * 它不是国际单位制（SI）的一部分，但在某些行业中是标准单位。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>酿酒行业：啤酒、葡萄酒的产量计量（欧洲常用）</li>
 *   <li>乳制品：牛奶、奶油等产品的批量测量</li>
 *   <li>化工行业：化学试剂的批量采购和销售</li>
 *   <li>水资源管理：灌溉用水的计量</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_hL extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 百升 = 100升 = 10^-1 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示百升相对于立方米的关系
     * 1 hL = 10^-1 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "hL";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-1;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建百升单位实例
     */
    public UVolume_hL() {
        super(description, elementList, factor, additional);
    }
}