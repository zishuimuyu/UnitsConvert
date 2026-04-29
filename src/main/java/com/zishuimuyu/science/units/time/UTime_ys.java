package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：ys（幺秒）
 * <p>
 * 幺秒是国际单位制时间单位，符号为ys。
 * 1幺秒定义为10⁻²⁴秒，是国际单位制中最短的时间单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ys = 10⁻²⁴ s（秒）</li>
 *   <li>1 zs = 1,000 ys（仄秒）</li>
 *   <li>1 ys = 10⁻³ zs（仄秒）</li>
 *   <li>光在1幺秒内传播约0.3飞米</li>
 *   <li>1 ys ≈ 10²⁰ Planck time（普朗克时间）</li>
 * </ul>
 * <p>
 * 幺秒单位在理论物理学、宇宙学、量子力学等领域有重要应用，
 * 用于描述极端时间尺度上的物理现象和理论预测。
 * 是研究时间和空间最小尺度结构的重要概念。
 * <p>
 * 该单位代表了目前物理学理论中考虑的最短时间尺度之一。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTime_ys extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义幺秒单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 幺秒与秒具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，设置单位的量纲构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.s, 1));  // 秒：时间维度
    }

    /**
     * 构造函数
     * <p>
     * 初始化幺秒单位的转换参数。
     * 幺秒与秒的转换因子为10⁻²⁴。
     */
    public UTime_ys() {
        super(
            "幺秒",                          // 描述：幺秒
            elementList,                    // 基本单位元素列表
            1.0E-24,                   // 转换因子：1 ys = 10⁻²⁴ s
            0.0                           // 偏移量：无偏移
        );
    }
}