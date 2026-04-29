package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：dam³（立方十米）
 * <p>
 * 立方十米是体积单位，符号为dam³，是国际单位制（SI）中体积的倍数单位。
 * 1立方十米等于边长为1十米的正方体的体积。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 dam³ = 1,000 m³（立方米）</li>
 *   <li>1 dam³ = 0.001 hm³（立方百米）</li>
 *   <li>1 dam³ = 1,000,000 L（升）</li>
 *   <li>1 dam³ ≈ 35,315 ft³（立方英尺）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 立方十米是SI单位制中较少使用的一个倍数单位。
 * 虽然不常见，但在大型工程和水体测量中有其应用价值。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>水利工程：水库、湖泊的蓄水量</li>
 *   <li>大型容器：工业储罐的容积</li>
 *   <li>环境评估：区域性的废气、废液体积</li>
 *   <li>建筑工程：大型土方工程量计算</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_dam3 extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 立方十米 = (十米)^3 = (10米)^3 = 10^3 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示立方十米相对于立方米的关系
     * 1 dam³ = 10^3 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "dam³";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e3;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建立方十米单位实例
     */
    public UVolume_dam3() {
        super(description, elementList, factor, additional);
    }
}