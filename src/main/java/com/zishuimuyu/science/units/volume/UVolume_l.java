package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：L（升）
 * <p>
 * 升是体积单位，符号为L（或小写l），是公制系统中常用的液体体积单位。
 * 1升等于1立方分米的体积，是国际单位制（SI）的可接受并用的单位。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 L = 1,000 mL（毫升）</li>
 *   <li>1 L = 100 cL（厘升）</li>
 *   <li>1 L = 10 dL（分升）</li>
 *   <li>1 L = 0.01 daL（十升）</li>
 *   <li>1 L = 0.001 m³（立方米）</li>
 *   <li>1 L = 1 dm³（立方分米）</li>
 *   <li>1 L ≈ 0.2642 US gal（美制加仑）</li>
 *   <li>1 L ≈ 0.21997 UK gal（英制加仑）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 升的起源可以追溯到法国大革命时期的公制系统。
 * 最初定义为1千克纯水在4°C时的体积，即1立方分米。
 * 1964年国际计量大会重新定义，1升=1立方分米，两者完全等价。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>日常生活：饮料、食用油、牛奶等液体的包装标注</li>
 *   <li>烹饪：食谱中的液体配料计量</li>
 *   <li>化学实验：试剂配制、溶液制备</li>
 *   <li>医药领域：药液、注射液的剂量</li>
 *   <li>汽车工业：发动机排量表示（如1.6L、2.0L）</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_L extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 升 = 立方分米 = (分米)^3 = (0.1米)^3 = 10^-3 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示升相对于立方米的关系
     * 1 L = 10^-3 m³ = 0.001 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "L";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-3;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建升单位实例
     */
    public UVolume_L() {
        super(description, elementList, factor, additional);
    }
}