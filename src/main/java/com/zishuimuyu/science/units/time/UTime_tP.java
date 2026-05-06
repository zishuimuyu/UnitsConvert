package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：tP（普朗克时间）
 * <p>
 * 普朗克时间是自然单位制中的时间单位，符号为tP。
 * 1普朗克时间定义为约5.39×10⁻⁴⁴秒，是宇宙中可测量的最短时间间隔。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 tP ≈ 5.39×10⁻⁴⁴ s（秒）</li>
 *   <li>1 tP 是光传播1普朗克长度所需的时间</li>
 *   <li>1 tP 是时间量子化的最小单位</li>
 * </ul>
 * <p>
 * 普朗克时间单位在量子引力、弦理论、宇宙学等领域有重要应用，
 * 用于描述宇宙大爆炸后的最初时刻、黑洞物理等极端物理条件。
 * 在小于普朗克时间尺度上，现有物理定律可能不再适用。
 * <p>
 * 该单位是理论物理学中的基本常数。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年05月06日
 */
public class UTime_tP extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义普朗克时间单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 普朗克时间与秒具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化普朗克时间单位的转换参数。
     * 普朗克时间与秒的转换因子约为5.39×10⁻⁴⁴。
     */
    public UTime_tP() {
        super(
            "普朗克时间",                        // 描述：普朗克时间
            elementList,                    // 基本单位元素列表
            5.39E-44,                   // 转换因子：1 tP ≈ 5.39×10⁻⁴⁴ s
            0.0                           // 偏移量：无偏移
        );
    }
}