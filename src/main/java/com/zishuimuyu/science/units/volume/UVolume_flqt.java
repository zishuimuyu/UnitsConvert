package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：fl qt（液量夸脱）
 * <p>
 * 液量夸脱是体积单位，符号为fl qt，是英美常用的液体体积单位。
 * "夸脱"意为四分之一加仑。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 US fl qt = 946.353 mL</li>
 *   <li>1 UK fl qt = 1.137 L</li>
 *   <li>1 US fl qt = 1/4 US gal</li>
 *   <li>1 US fl qt = 2 pt（品脱）</li>
 *   <li>1 US fl qt = 32 fl oz</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 夸脱是英国传统计量单位，"夸脱"意为四分之一，
 * 最初是1/4加仑的液体容量。在不同地区和时期，夸脱的定义有所不同。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>食品包装：牛奶、果汁的纸盒包装</li>
 *   <li>餐饮服务：大容量饮料的计量</li>
 *   <li>化工行业：溶剂、试剂的容量</li>
 *   <li>日常生活：某些液体的家庭采购</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_flqt extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 美制液量夸脱 = 1/4美制加仑 = 9.4635×10^-4 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示液量夸脱相对于立方米的关系
     * 1 fl qt ≈ 9.4635×10^-4 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "fl qt";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 9.4635e-4;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建液量夸脱单位实例
     */
    public UVolume_flqt() {
        super(description, elementList, factor, additional);
    }
}