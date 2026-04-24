package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：cal（卡路里/卡）
 * <p>
 * 卡路里是非国际单位制的能量单位，符号为cal。
 * 1卡路里定义为将1克水在1个大气压下提升1摄氏度所需的热量。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 cal ≈ 4.184 J（焦耳）</li>
 *   <li>1 kcal = 1000 cal（千卡/大卡）</li>
 *   <li>1 cal = 4.184×10⁷ erg（尔格）</li>
 *   <li>1 BTU ≈ 252.16 cal（英热单位）</li>
 *   <li>1 Wh ≈ 860.05 cal（瓦时）</li>
 *   <li>1 J ≈ 0.239 cal</li>
 * </ul>
 * <p>
 * 卡路里单位在营养学、食品科学、生物化学等领域有广泛应用，
 * 用于测量食物的能量含量和人体代谢能量。
 * 在许多国家，食品包装上标注的食物热量通常使用千卡（kcal）。
 * <p>
 * 该单位也被称为"小卡"以区别于"大卡"（kilocalorie）。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UEnergy_cal extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义卡路里单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据W=F·s（功=力×距离），能量单位 = 力×距离 = (Kg·m·s⁻²)·m = Kg·m²·s⁻²
     * 卡路里与焦耳具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将卡路里数值转换为标准单位（焦耳）的数值。
     * 由于1cal ≈ 4.184J，所以factor = 4.185851820846。
     * 这是国际标准定义的卡路里到焦耳的转换系数。
     */
    private final static double factor = 4.185851820846;

    /**
     * 附加偏移量
     * <p>
     * 能量单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "cal";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立卡路里单位与基本单位的关系。
     * 根据W=F·s，能量单位由千克、米、秒三个基本单位按特定指数组合而成，
     * 与焦耳单位具有相同的单位构成，仅数值上相差约4.184倍。
     */
    static {
        // 添加千克基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
        // 添加米基本单位，指数为2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
        // 添加秒基本单位，指数为-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个卡路里能量单位(cal)实例
     * <p>
     * 初始化卡路里能量单位，设置单位符号为"cal"，基本单位组成为Kg·m²·s⁻²，
     * 转换因子约为4.184（即1cal ≈ 4.184J），无附加偏移量。
     */
    public UEnergy_cal() {
        // 调用父类DerivedUnit的构造方法，初始化卡路里能量单位
        // 参数依次为：单位描述("cal")、基本单位元素列表([Kg^1, m^2, s^-2])、转换因子(4.185851820846)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}