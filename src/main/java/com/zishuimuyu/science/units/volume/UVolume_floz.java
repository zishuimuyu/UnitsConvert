package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：fl oz（液量盎司）
 * <p>
 * 液量盎司是体积单位，符号为fl oz，是英美常用的液体体积单位。
 * 注意液量盎司与常衡盎司（重量单位）不同。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 UK fl oz = 0.0284 L（升）</li>
 *   <li>1 US fl oz = 0.0296 L（升）</li>
 *   <li>1 UK fl oz = 28.413 mL</li>
 *   <li>1 US fl oz = 29.574 mL</li>
 *   <li>1 US fl oz = 1/128 US gal</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 液量盎司起源于英国，用于测量液体的容量。
 * 英制液量盎司和美制液量盎司的数值不同，美制较小。
 * 英国在1995年后在食品标签上逐渐废弃液量盎司，改用毫升。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>酒水服务：啤酒、葡萄酒、鸡尾酒的容量</li>
 *   <li>烹饪：西餐食谱中的液体配料</li>
 *   <li>医药：某些药品的剂量表示</li>
 *   <li>化妆品：香水、精华液的容量标注</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_floz extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 英制液量盎司 = 1/160英制加仑 = 28.4131 mL = 2.8413×10^-5 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示英制液量盎司相对于立方米的关系
     * 1 fl oz ≈ 2.8413×10^-5 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "fl oz";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 2.8413e-5;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建液量盎司单位实例
     */
    public UVolume_floz() {
        super(description, elementList, factor, additional);
    }
}