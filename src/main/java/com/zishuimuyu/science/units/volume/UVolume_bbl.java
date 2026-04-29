package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：bbl（石油桶）
 * <p>
 * 石油桶是体积单位，符号为bbl，是石油工业中用于测量原油和石油产品的标准单位。
 * 1石油桶等于42美制液量加仑。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 bbl = 42 US gal（美制液量加仑）</li>
 *   <li>1 bbl = 158.987 L</li>
 *   <li>1 bbl = 0.136 m³（立方米）</li>
 *   <li>1 bbl ≈ 34.97 UK gal</li>
 *   <li>1 m³ ≈ 6.29 bbl</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 石油桶的起源可以追溯到19世纪宾夕法尼亚州的石油工业。
 * 最初使用木桶运输原油，标准木桶容量约为42加仑。
 * 虽然现代运输已改用管道和油轮，但"桶"仍然是石油行业的标准计量单位。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>石油工业：原油开采、炼制、贸易的计量</li>
 *   <li>能源统计：全球石油产量和消费量的报告</li>
 *   <li>期货交易：石油期货合约的标准单位</li>
 *   <li>能源政策：石油储备和供应的评估</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_bbl extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 石油桶 = 42美制加仑 = 42 × 3.7854×10^-3 = 0.158987 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示石油桶相对于立方米的关系
     * 1 bbl ≈ 0.158987 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "bbl";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 0.158987;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建石油桶单位实例
     */
    public UVolume_bbl() {
        super(description, elementList, factor, additional);
    }
}