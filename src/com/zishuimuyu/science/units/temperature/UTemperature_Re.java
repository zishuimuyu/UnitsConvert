package com.zishuimuyu.science.units.temperature;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 温度单位：°Re（列氏度）
 * <P>
 * 列氏度是温度单位，符号为°Re或°Rø。
 * 列氏温标以水的冰点为0度，沸点为80度（在标准大气压下）。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>0 °Re = 0 °C（水的冰点）</li>
 *   <li>80 °Re = 100 °C（水的沸点）</li>
 *   <li>1 °Re = 1.25 °C</li>
 *   <li>°Re 与 °C 的转换：°C = °Re × 1.25</li>
 *   <li>°Re 与 °F 的转换：°F = °Re × 2.25 + 32</li>
 *   <li>°Re 与 K 的转换：K = °Re × 1.25 + 273.15</li>
 * </ul>
 * <P>
 * 列氏度单位以丹麦天文学家奥勒·罗默（Ole Rømer）命名，
 * 虽然现在很少使用，但在历史文献和某些特殊领域仍有提及。
 * 在历史上，列氏度是较早的标准化温标之一。
 * <P>
 * 该单位主要用于历史参考或特殊用途。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UTemperature_Re extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义列氏度单位的基本单位组成：
     * - 温度单位开尔文(K)，指数为1
     * <P>
     * 列氏度与开尔文具有相同的单位增量比例关系，
     * 但零点位置不同。因此列氏度与开尔文具有相同的基本单位组成。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于列氏度数值转换的比例因子。
     * 由于1°Re = 1.25°C，而摄氏度的转换因子为1.0，
     * 所以列氏度的转换因子为 1.0 * 1.25 = 1.25。
     * 这决定了列氏度与开尔文之间的比例关系。
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 列氏度与摄氏度的零点相同（都是以水的冰点为零度），
     * 因此列氏度的附加偏移量与摄氏度相同，即273.15。
     * 这是因为水的冰点为0°C或273.15K。
     */
    private final static double additional;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Re";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和附加偏移量。
     * 通过摄氏度单位获取其转换参数，并根据列氏度与摄氏度的关系进行调整：
     * - 列氏度的刻度是摄氏度的1.25倍
     * - 列氏度与摄氏度的零点相同，所以偏移量相同
     * 初始化基本单位元素列表，建立列氏度单位与基本单位的关系。
     */
    static {
        UTemperature_C tempC = new UTemperature_C();
        factor = tempC.getFactor() * 1.25;
        additional = tempC.getAddition();
        elementList.add(new UnitElement(BasicUnit.K, 1.0));  // 开尔文，指数1
    }

    public UTemperature_Re() {
        super(description, elementList, factor, additional);
    }

}