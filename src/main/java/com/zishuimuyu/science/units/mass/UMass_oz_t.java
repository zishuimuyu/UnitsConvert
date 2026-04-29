package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：oz t（金衡盎司）
 * <p>
 * 金衡盎司是非国际单位制质量单位，符号为oz t（troy ounce）。
 * 金衡盎司主要用于贵金属（黄金、白银、铂金等）的计量。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 oz t = 31.1034768 g = 0.0311034768 kg（千克）</li>
 *   <li>1 lb t = 12 oz t（金衡磅）</li>
 *   <li>1 kg ≈ 32.151 oz t</li>
 *   <li>1 oz ≈ 0.9115 oz t（常衡盎司）</li>
 *   <li>1 dwt = 0.05 oz t（英钱）</li>
 * </ul>
 * <p>
 * 金衡盎司单位在贵金属交易、珠宝业、货币收藏等领域有广泛应用，
 * 是国际贵金属市场的标准计量单位。
 * 与常衡盎司（28.35g）不同，金衡盎司稍重，专门用于贵重金属计量。
 * <p>
 * 该单位在金融和投资领域非常重要，是贵金属定价的基础单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_oz_t extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义金衡盎司单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 金衡盎司与千克具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，设置单位的量纲构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1));  // 千克：质量维度
    }

    /**
     * 构造函数
     * <p>
     * 初始化金衡盎司单位的转换参数。
     * 金衡盎司与千克的转换因子为0.0311034768。
     */
    public UMass_oz_t() {
        super(
            "金衡盎司",                       // 描述：金衡盎司
            elementList,                    // 基本单位元素列表
            0.0311034768,                 // 转换因子：1 oz t = 0.0311034768 kg
            0.0                           // 偏移量：无偏移
        );
    }
}