package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：q（公担/百千克）
 * <p>
 * 公担是非国际单位制质量单位，符号为q（quintal）。
 * 1公担定义为100千克，是国际通用的农业和贸易计量单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 q = 100 kg（千克）</li>
 *   <li>1 t = 10 q（吨）</li>
 *   <li>1 kg = 0.01 q</li>
 *   <li>1 g = 0.00001 q（克）</li>
 *   <li>1 cwt UK ≈ 0.9842 q（英担）</li>
 * </ul>
 * <p>
 * 公担单位在农业、贸易、大宗商品计量等领域有广泛应用，
 * 特别是在农产品（如谷物、棉花、糖）的国际贸易中。
 * 在欧盟等地区，公担是法定的农业计量单位。
 * <p>
 * 该单位提供了一种方便的中间级质量计量方式，介于千克和吨之间。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_q2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义公担单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 公担与千克具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化公担单位的转换参数。
     * 公担与千克的转换因子为100。
     */
    public UMass_q2() {
        super(
            "公担",                          // 描述：公担
            elementList,                    // 基本单位元素列表
            100.0,                        // 转换因子：1 q = 100 kg
            0.0                           // 偏移量：无偏移
        );
    }
}