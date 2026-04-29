package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：cL（厘升）
 * <p>
 * 厘升是体积单位，符号为cL，是公制系统中常用的液体体积分数单位。
 * 1厘升等于1升的百分之一。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 cL = 0.01 L（升）</li>
 *   <li>1 cL = 10 mL（毫升）</li>
 *   <li>1 cL = 10 cm³（立方厘米）</li>
 *   <li>1 cL ≈ 0.338 fl oz（美制液量盎司）</li>
 *   <li>1 cL ≈ 0.352 UK fl oz（英制液量盎司）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 厘升是公制系统中的一个导出单位，主要在欧洲国家使用。
 * 它不是国际单位制（SI）的一部分，但在日常生活中仍有广泛应用。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>酒类行业：葡萄酒、烈酒的容量标注（特别是在欧洲）</li>
 *   <li>餐饮服务：鸡尾酒、饮料的容量计量</li>
 *   <li>食品标签：部分欧洲国家的食品营养标签</li>
 *   <li>医药领域：某些液体制剂的剂量表示</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_cL extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 厘升 = 0.01升 = 10毫升 = 10^-5 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示厘升相对于立方米的关系
     * 1 cL = 10^-5 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "cL";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-5;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建厘升单位实例
     */
    public UVolume_cL() {
        super(description, elementList, factor, additional);
    }
}