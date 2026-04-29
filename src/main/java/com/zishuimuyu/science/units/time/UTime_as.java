package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：as（阿托秒）
 * <p>
 * 阿托秒是国际单位制时间单位，符号为as。
 * 1阿托秒定义为10⁻¹⁸秒，是国际单位制中最短的时间单位之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 as = 10⁻¹⁸ s（秒）</li>
 *   <li>1 fs = 1,000,000 as（飞秒）</li>
 *   <li>1 as = 10⁻³ zs（仄秒）</li>
 *   <li>1 as = 10⁻⁶ ys（幺秒）</li>
 *   <li>光在1阿托秒内传播约0.3纳米</li>
 * </ul>
 * <p>
 * 阿托秒单位在阿托秒物理学、原子物理学、化学动力学等领域有广泛应用，
 * 用于测量原子内部电子运动、化学反应中间过程等超快现象。
 * 是研究物质微观动力学过程的重要工具。
 * <p>
 * 该单位是人类所能直接测量的最短时间尺度之一。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTime_as extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义阿托秒单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 阿托秒与秒具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化阿托秒单位的转换参数。
     * 阿托秒与秒的转换因子为10⁻¹⁸。
     */
    public UTime_as() {
        super(
            "阿托秒",                        // 描述：阿托秒
            elementList,                    // 基本单位元素列表
            1.0E-18,                    // 转换因子：1 as = 10⁻¹⁸ s
            0.0                           // 偏移量：无偏移
        );
    }
}