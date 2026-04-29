package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：fl pt（液量品脱）
 * <p>
 * 液量品脱是体积单位，符号为fl pt，是英美常用的液体体积单位。
 * 美制液量品脱和英制液量品脱大小不同。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 US fl pt = 473.176 mL</li>
 *   <li>1 UK fl pt = 568.261 mL</li>
 *   <li>1 US fl pt = 1/8 US gal</li>
 *   <li>1 UK fl pt = 1/6 UK gal</li>
 *   <li>1 US fl pt = 16 fl oz</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 品脱是英国传统计量单位，最初用于测量啤酒和牛奶。
 * "品脱"一词来自古法语"pinte"，可能源自拉丁语"picta"。
 * 美国继承了英制单位的传统，但进行了调整。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>餐饮服务：啤酒、饮料的容量</li>
 *   <li>乳制品：牛奶的零售（部分地区）</li>
 *   <li>食品加工：酱料、调味品的包装</li>
 *   <li>日常生活：某些液体的家庭用量</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_flpt extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 美制液量品脱 = 1/8美制加仑 = 4.7318×10^-4 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示液量品脱相对于立方米的关系
     * 1 fl pt ≈ 4.7318×10^-4 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "fl pt";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 4.7318e-4;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建液量品脱单位实例
     */
    public UVolume_flpt() {
        super(description, elementList, factor, additional);
    }
}