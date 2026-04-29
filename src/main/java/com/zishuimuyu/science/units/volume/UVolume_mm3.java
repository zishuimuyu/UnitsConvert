package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：mm³（立方毫米）
 * <p>
 * 立方毫米是体积单位，符号为mm³，是国际单位制（SI）中体积的分数单位。
 * 1立方毫米等于边长为1毫米的正方体的体积。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 mm³ = 0.001 cm³（立方厘米）</li>
 *   <li>1 mm³ = 0.000001 m³（立方米）</li>
 *   <li>1 mm³ = 0.001 mL（毫升）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 立方毫米是公制系统的导出单位，随着米制系统在19世纪的广泛采用而确立。
 * 它是立方米的一个极小分数单位，用于测量微小体积。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>医学领域：注射器、药物剂量的精确测量</li>
 *   <li>微电子：芯片制造、电路板元件体积</li>
 *   <li>材料科学：微观结构分析、纳米材料体积</li>
 *   <li>精密工程：小尺寸零件、精密零件的容积</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_mm3 extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 立方毫米 = (毫米)^3 = (0.001米)^3 = 10^-9 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示立方毫米相对于立方米的关系
     * 1 mm³ = 10^-9 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "mm³";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-9;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建立方毫米单位实例
     */
    public UVolume_mm3() {
        super(description, elementList, factor, additional);
    }
}