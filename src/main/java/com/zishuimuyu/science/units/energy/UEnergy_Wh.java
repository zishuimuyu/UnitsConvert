package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：Wh（瓦时）
 * <p>
 * 瓦时是非国际单位制的能量单位，符号为Wh。
 * 1瓦时定义为功率为1瓦的电器在1小时内所消耗的电能。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 Wh = 3600 J（焦耳）</li>
 *   <li>1 kWh = 1000 Wh（千瓦时）</li>
 *   <li>1 MWh = 1,000,000 Wh（兆瓦时）</li>
 *   <li>1 Wh = 3.6 kJ（千焦）</li>
 *   <li>1 Wh ≈ 860.42 cal（卡路里）</li>
 *   <li>1 Wh ≈ 3.412 BTU（英热单位）</li>
 * </ul>
 * <p>
 * 瓦时单位在电力、电池技术、可再生能源等领域有广泛应用，
 * 用于测量小型电池容量、太阳能板发电量、便携式电子设备功耗等。
 * 在电动汽车、手机、笔记本电脑等产品的电池容量标注中经常使用。
 * <p>
 * 该单位特别适合描述中小型储能设备的能量容量。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UEnergy_Wh extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义瓦时单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据W=P·t（功=功率×时间），能量单位 = 功率×时间 = (kg·m²·s⁻³)·s = kg·m²·s⁻²
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，设置单位的量纲构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1));  // 千克：质量维度
        elementList.add(new UnitElement(BasicUnit.m, 2));   // 米：长度维度
        elementList.add(new UnitElement(BasicUnit.s, -2));  // 秒：时间维度（负二次方）
    }

    /**
     * 构造函数
     * <p>
     * 初始化瓦时单位的转换参数。
     * 瓦时与焦耳的转换因子为3600（1小时=3600秒）。
     */
    public UEnergy_Wh() {
        super(
            "瓦时",                          // 描述：瓦时
            elementList,                    // 基本单位元素列表
            3600.0,                       // 转换因子：1 Wh = 3600 J
            0.0                           // 偏移量：无偏移
        );
    }
}