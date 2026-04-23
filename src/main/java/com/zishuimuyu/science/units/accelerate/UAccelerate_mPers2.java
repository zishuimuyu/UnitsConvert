package com.zishuimuyu.science.units.accelerate;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 加速度单位：m/s²（米每二次方秒）
 * <P>
 * 米每二次方秒是国际单位制中加速度的基本导出单位，符号为m/s²。
 * 1米每二次方秒定义为物体在1秒内速度增加1米/秒的加速度。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 m/s² = 1 m·s⁻²（米·秒⁻²）</li>
 *   <li>标准重力加速度 g ≈ 9.80665 m/s²</li>
 *   <li>1 g ≈ 9.80665 m/s²（重力加速度单位）</li>
 *   <li>1 ft/s² ≈ 0.3048 m/s²（英尺/秒²）</li>
 * </ul>
 * <P>
 * 米每二次方秒单位广泛应用于物理学、工程学、航空航天等领域，
 * 用于测量各种运动物体的加速度，如车辆加速、自由落体、圆周运动等。
 * 在工程设计中，加速度是分析动力学系统的重要参数。
 * <P>
 * 加速度是矢量量，既有大小也有方向，米每二次方秒单位仅表示加速度的大小部分。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UAccelerate_mPers2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义米每二次方秒单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据a=Δv/Δt（加速度=速度变化量/时间），m/s² = m·s⁻²
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 米每二次方秒是加速度的标准单位，因此转换因子为1.0。
     * 用于与其他加速度单位进行数值转换。
     */
    private final static double factor = 1.0;
    
    /**
     * 附加偏移量
     * <P>
     * 加速度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "m/s^2";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立米每二次方秒单位与基本单位的关系。
     * 根据a=Δv/Δt，加速度单位由米和秒两个基本单位按特定指数组合而成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 1.0));   // 米，指数1
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    /**
     * 构造方法
     * <P>
     * 创建米每二次方秒单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     */
    public UAccelerate_mPers2() {
        super(description, elementList, factor, additional);
    }

}