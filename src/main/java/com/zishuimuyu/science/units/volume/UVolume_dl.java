package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：dL（分升）
 * <p>
 * 分升是体积单位，符号为dL，是公制系统中常用的液体体积分数单位。
 * 1分升等于1升的十分之一。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 dL = 0.1 L（升）</li>
 *   <li>1 dL = 100 mL（毫升）</li>
 *   <li>1 dL = 0.1 dm³（立方分米）</li>
 *   <li>1 dL ≈ 3.381 fl oz（美制液量盎司）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 分升是公制系统中的一个导出单位，主要在欧洲国家使用。
 * 它不是国际单位制（SI）的一部分，但在日常生活中和某些行业中仍有应用。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>医学检测：血液样本的容量（血糖测试等）</li>
 *   <li>食品标签：部分欧洲国家的食品营养标签</li>
 *   <li>酿酒业：啤酒、葡萄酒的容量计量</li>
 *   <li>化学实验：培养基、试剂的配制</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_dL extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 分升 = 0.1升 = 100毫升 = 10^-4 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示分升相对于立方米的关系
     * 1 dL = 10^-4 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "dL";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-4;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建分升单位实例
     */
    public UVolume_dL() {
        super(description, elementList, factor, additional);
    }
}