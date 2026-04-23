package cn.nlte.science.units.energy;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：kcal（千卡/大卡）
 * <P>
 * 千卡是非国际单位制的能量单位，符号为kcal或Cal（大卡）。
 * 1千卡定义为将1千克水在1个大气压下提升1摄氏度所需的热量，
 * 等于1000卡路里。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 kcal = 1000 cal（卡路里）</li>
 *   <li>1 kcal ≈ 4184 J（焦耳）</li>
 *   <li>1 kcal ≈ 4.184 kJ（千焦）</li>
 *   <li>1 BTU ≈ 0.252 kcal（英热单位）</li>
 *   <li>1 Wh ≈ 0.860 kcal（瓦时）</li>
 *   <li>1 J ≈ 0.000239 kcal</li>
 * </ul>
 * <P>
 * 千卡单位在营养学、食品科学、运动医学等领域有广泛应用，
 * 用于测量食物的能量含量和人体活动消耗的能量。
 * 在许多国家，食品包装上标注的食物热量通常使用千卡（kcal），
 * 在美国有时也标记为"Calories"（大卡）。
 * <P>
 * 该单位也被称为"大卡"以区别于"小卡"（calorie）。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UEnergy_Kcal extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义千卡单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据W=F·s（功=力×距离），能量单位 = 力×距离 = (Kg·m·s⁻²)·m = Kg·m²·s⁻²
     * 千卡与焦耳具有相同的基本单位组成，只是转换因子不同（1000倍卡路里的关系）。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将千卡数值转换为标准单位（焦耳）的数值。
     * 由于1kcal = 1000cal，该值通过计算卡路里的转换因子乘以1000获得。
     * 这意味着1千卡等于1000卡路里，约等于4184焦耳。
     */
    private final static double factor;
    
    /**
     * 附加偏移量
     * <P>
     * 能量单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Kcal";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过计算1000倍卡路里的转换因子来确定千卡的转换因子。
     * 1千卡等于1000卡路里，因此转换因子为卡路里转换因子的1000倍。
     */
    static {
        factor = new UEnergy_cal().getFactor() * 1000.0;
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 2.0));   // 米，指数2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    public UEnergy_Kcal() {
        super(description, elementList, factor, additional);
    }

}