package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：Mg（兆克）
 * <p>
 * 兆克是国际单位制质量单位，符号为Mg。
 * 1兆克定义为1000000克，即1000千克，等同于1吨。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 Mg = 1000 kg = 10⁶ g（千克、克）</li>
 *   <li>1 t = 1 Mg（吨）</li>
 *   <li>1 kg = 0.001 Mg（千克）</li>
 *   <li>1 g = 0.000001 Mg（克）</li>
 *   <li>1 UStf ≈ 0.907 Mg（美吨）</li>
 * </ul>
 * <p>
 * 兆克单位在工业、科学、工程等领域有广泛应用，
 * 提供了比千克更大的质量单位，常用于科学文献中。
 * 在某些情况下比使用吨更规范，特别是在科学计算中。
 * <p>
 * 该单位是千克的倍数单位，便于表达大型物体的质量。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_MegaGram extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义兆克单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * <p>
     * 兆克与千克具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化兆克单位的转换参数。
     * 兆克与千克的转换因子为1000。
     */
    public UMass_MegaGram() {
        super(
            "兆克",                          // 描述：兆克
            elementList,                    // 基本单位元素列表
            1000.0,                       // 转换因子：1 Mg = 1000 kg
            0.0                           // 偏移量：无偏移
        );
    }
}