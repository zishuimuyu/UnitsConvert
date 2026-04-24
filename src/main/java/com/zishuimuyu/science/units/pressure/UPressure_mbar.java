package com.zishuimuyu.science.units.pressure;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 压强单位：mbar（毫巴）
 * <p>
 * 毫巴是压强的非国际单位制单位，符号为mbar。
 * 1毫巴定义为0.001巴，即100帕斯卡。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 mbar = 100 Pa（帕斯卡）</li>
 *   <li>1 mbar = 0.1 kPa（千帕）</li>
 *   <li>1 bar = 1000 mbar</li>
 *   <li>1 atm ≈ 1013.25 mbar</li>
 *   <li>1 mmHg ≈ 1.333 mbar</li>
 *   <li>1 hPa = 1 mbar（百帕与毫巴数值相等）</li>
 * </ul>
 * <p>
 * 毫巴单位在气象学中非常常见，用于测量大气压力，
 * 在天气预报、气候研究等领域有重要应用。
 * 毫巴与百帕（hPa）数值上相等，因此在气象学中经常互换使用。
 * <p>
 * 该单位在航空、航海等领域也有应用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPressure_mbar extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义毫巴单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为-1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据P=F/A（压强=力/面积），压强单位 = 力/面积 = (Kg·m·s⁻²)/m² = Kg·m⁻¹·s⁻²
     * 毫巴与帕斯卡具有相同的基本单位组成，只是转换因子不同（100倍关系）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将毫巴数值转换为标准单位（帕斯卡）的数值。
     * 由于1mbar = 0.001bar = 0.001×100,000Pa = 100Pa，所以factor = 100.0。
     * 这意味着1毫巴等于100帕斯卡。
     */
    private final static double factor = 100.0;

    /**
     * 附加偏移量
     * <p>
     * 压强单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "mbar";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立毫巴单位与基本单位的关系。
     * 根据P=F/A，压强单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与帕斯卡单位具有相同的单位构成，仅数值上相差100倍。
     */
    static {
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为-1
        elementList.add(new UnitElement(BasicUnit.m, -1.0));
        // 添加秒基本单位，指数为-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个毫巴压强单位(mbar)实例
     * <p>
     * 初始化毫巴压强单位，设置单位符号为"mbar"，基本单位组成为Kg·m⁻¹·s⁻²，
     * 转换因子为100（即1mbar = 100Pa），无附加偏移量。
     */
    public UPressure_mbar() {
        super(description, elementList, factor, additional);
    }


}