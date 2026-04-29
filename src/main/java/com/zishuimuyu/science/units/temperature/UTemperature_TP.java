package com.zishuimuyu.science.units.temperature;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 温度单位：TP（普朗克温度）
 * <p>
 * 普朗克温度是自然单位制中的温度单位，是物理学中的基本单位之一。
 * 它定义为温度的自然单位，约为1.416×10³²K。
 * 普朗克温度代表了理论物理学中温度的上限，超过此温度，
 * 现有的物理定律可能不再适用。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 TP = 1.416784×10³² K（开尔文）</li>
 *   <li>1 TP ≈ 1.416784×10³² °C（摄氏度）</li>
 *   <li>1 TP ≈ 2.550211×10³² °F（华氏度）</li>
 *   <li>1 K = 7.058217×10⁻³³ TP</li>
 *   <li>普朗克温度是理论物理学中的温度上限</li>
 * </ul>
 * <p>
 * 普朗克温度在以下领域有重要应用：
 * <ul>
 *   <li>宇宙学：大爆炸初期的温度估计</li>
 *   <li>量子引力理论：时空量子化的研究</li>
 *   <li>粒子物理学：极高能量碰撞的研究</li>
 *   <li>弦理论：额外维度的紧致化研究</li>
 * </ul>
 * <p>
 * 该单位适用于理论物理、宇宙学、高能物理等前沿科学研究。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTemperature_TP extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义普朗克温度单位的基本单位组成：
     * - 温度单位开尔文(K)，指数为1
     * <p>
     * 普朗克温度与开尔文具有相同的单位增量，但比例因子极大。
     * 因此普朗克温度与开尔文具有相同的基本单位组成。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于普朗克温度数值转换的比例因子。
     * 1普朗克温度 = 1.416784×10³² 开尔文，因此转换因子为 1.416784e32。
     */
    private final static double factor = 1.416784e32;

    /**
     * 附加偏移量
     * <p>
     * 普朗克温度与开尔文的零点相同（都是绝对零度），因此附加偏移量为0.0。
     * 这是因为普朗克温度和开尔文都以绝对零度为起点。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "TP";

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，建立普朗克温度单位与基本单位的关系。
     * 普朗克温度使用开尔文作为基本温度单位。
     */
    static {
        // 开尔文，指数1
        elementList.add(new UnitElement(BasicUnit.K, 1.0));
    }

    /**
     * 构造函数，创建一个普朗克温度单位(TP)实例
     * <p>
     * 初始化普朗克温度单位，设置单位符号为"TP"，基本单位组成为K，
     * 转换因子为1.416784e32（每单位普朗克温度变化对应1.416784e32K变化），
     * 附加偏移量为0.0。
     */
    public UTemperature_TP() {
        // 调用父类DerivedUnit的构造方法，初始化普朗克温度单位
        // 参数依次为：单位描述("TP")、基本单位元素列表、转换因子(1.416784e32)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}