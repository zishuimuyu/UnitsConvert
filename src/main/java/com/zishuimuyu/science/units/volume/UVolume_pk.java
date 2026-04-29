package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：pk（配克）
 * <p>
 * 配克是体积单位，符号为pk，是英美用于测量干物质的单位。
 * 1配克等于8干量夸脱或2干量加仑。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 pk = 8 dry qt（干量夸脱）</li>
 *   <li>1 pk = 2 dry gal（干量加仑）</li>
 *   <li>1 US pk = 8.810 L（升）</li>
 *   <li>1 UK pk = 9.092 L（升）</li>
 *   <li>1 US pk ≈ 0.968 UK pk</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 配克是英国传统计量单位，用于测量干物质如谷物、蔬菜等。
 * "配克"一词来源于古法语"peck"，可能源自中世纪拉丁语"picotus"。
 * 美国沿用了这一单位，但与英国的配克大小略有不同。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>农业：谷物、蔬菜等农产品的计量</li>
 *   <li>食品零售：干货、坚果的包装和销售</li>
 *   <li>历史计量：在文学作品和历史研究中遇到的计量单位</li>
 *   <li>教育：计量单位历史和换算的教学</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_pk extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 美制配克 = 2干量加仑 = 2 × 4.4048×10^-3 = 8.8098×10^-3 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示配克相对于立方米的关系
     * 1 US pk ≈ 8.8098×10^-3 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "pk";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 8.8098e-3;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建配克单位实例
     */
    public UVolume_pk() {
        super(description, elementList, factor, additional);
    }
}