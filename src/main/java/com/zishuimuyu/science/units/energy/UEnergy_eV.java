package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：eV（电子伏特）
 * <p>
 * 电子伏特是非国际单位制的能量单位，符号为eV。
 * 1电子伏特定义为一个电子经过1伏特电势差加速后获得的动能。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 eV ≈ 1.602176634×10⁻¹⁹ J（焦耳）</li>
 *   <li>1 J ≈ 6.241509074×10¹⁸ eV</li>
 *   <li>1 keV = 1000 eV（千电子伏特）</li>
 *   <li>1 MeV = 1,000,000 eV（兆电子伏特）</li>
 *   <li>1 GeV = 1,000,000,000 eV（吉电子伏特）</li>
 * </ul>
 * <p>
 * 电子伏特单位在原子物理、核物理、粒子物理、半导体物理等领域有广泛应用，
 * 用于测量原子、分子、电子的能量级别，以及粒子加速器中的粒子能量。
 * <p>
 * 该单位特别适合描述微观粒子的能量，因为其数值适中便于理解和计算。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UEnergy_eV extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义电子伏特单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据W=qV（功=电荷×电压），能量单位 = 电荷×电压 = (A·s)·(kg·m²·s⁻³·A⁻¹) = kg·m²·s⁻²
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
     * 初始化电子伏特单位的转换参数。
     * 电子伏特与焦耳的转换因子约为1.602176634×10⁻¹⁹。
     */
    public UEnergy_eV() {
        super(
            "电子伏特",                       // 描述：电子伏特
            elementList,                    // 基本单位元素列表
            1.602176634E-19,              // 转换因子：1 eV = 1.602176634×10⁻¹⁹ J
            0.0                           // 偏移量：无偏移
        );
    }
}