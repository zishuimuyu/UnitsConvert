package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：dm³（立方分米）
 * <p>
 * 立方分米是体积单位，符号为dm³，是国际单位制（SI）中体积的单位。
 * 1立方分米等于边长为1分米的正方体的体积。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 dm³ = 1,000 cm³（立方厘米）</li>
 *   <li>1 dm³ = 0.001 m³（立方米）</li>
 *   <li>1 dm³ = 1 L（升）</li>
 *   <li>1 dm³ ≈ 61.024 in³（立方英寸）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 立方分米是公制系统中体积的一个单位，与升的体积几乎相同。
 * 1964年国际计量大会规定，1升=1立方分米，两者完全等价。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>家庭日常：烹饪配方中的液体计量</li>
 *   <li>水族馆：水体容积测量</li>
 *   <li>小型容器：瓶子、罐子等容器的标注</li>
 *   <li>物流运输：小件货物的体积计算</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_dm3 extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 立方分米 = (分米)^3 = (0.1米)^3 = 10^-3 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示立方分米相对于立方米的关系
     * 1 dm³ = 10^-3 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "dm³";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-3;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建立方分米单位实例
     */
    public UVolume_dm3() {
        super(description, elementList, factor, additional);
    }
}