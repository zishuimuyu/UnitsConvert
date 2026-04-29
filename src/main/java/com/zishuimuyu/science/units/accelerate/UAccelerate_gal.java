package com.zishuimuyu.science.units.accelerate;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.length.ULength_cm;
import com.zishuimuyu.science.units.time.UTime_s;

import java.util.ArrayList;
import java.util.List;

/**
 * 加速度单位：gal（伽）
 * <p>
 * 伽是CGS制中的加速度单位，符号为gal，以纪念意大利物理学家伽利略(Galileo Galilei)。
 * 1伽定义为1厘米/秒²，即物体在1秒内速度增加1厘米/秒的加速度。
 * 该单位在地球物理学、地质勘探、地震学等领域广泛应用。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 gal = 1 cm/s² = 0.01 m/s²（米/秒²）</li>
 *   <li>1 gal ≈ 0.00102 g（重力加速度）</li>
 *   <li>1 m/s² = 100 gal</li>
 *   <li>1 g ≈ 980.665 gal</li>
 *   <li>1 mm/s² = 0.1 gal</li>
 * </ul>
 * <p>
 * 伽单位在地球物理学、地质勘探、地震学等领域有广泛应用，
 * 特别是在重力测量、地壳形变研究和地震监测中。
 * 该单位便于表示相对于标准重力场的微小变化，如重力异常和地壳运动。
 * 在精密重力测量中，通常使用其子单位毫伽(mGal)和微伽(µGal)。
 * <p>
 * 该单位便于在CGS制系统中进行物理计算。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UAccelerate_gal extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义伽单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据a=Δv/Δt（加速度=速度变化量/时间），gal需要转换为m/s²的基本单位形式。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将伽数值转换为标准单位（米每二次方秒）的数值。
     * 1 gal = 1 cm/s² = 0.01 m/s²。
     */
    private final static double factor;

    /**
     * 附加偏移量
     * <p>
     * 加速度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "gal";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 计算1伽对应的米每二次方秒值。
     */
    static {
        // 1 gal = 1 cm/s² = 0.01 m/s²
        factor = 0.01;
        
        // 添加米基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 添加秒基本单位，指数为-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个伽加速度单位(gal)实例
     * <p>
     * 初始化伽加速度单位，设置单位符号为"gal"，基本单位组成为m·s⁻²，
     * 转换因子为0.01（即1gal = 0.01m/s²），无附加偏移量。
     */
    public UAccelerate_gal() {
        // 调用父类DerivedUnit的构造方法，初始化伽加速度单位
        // 参数依次为：单位描述("gal")、基本单位元素列表([m^1, s^-2])、转换因子(0.01)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}