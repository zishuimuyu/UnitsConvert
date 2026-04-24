package com.zishuimuyu.science.units.accelerate;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 加速度单位：g（重力加速度）
 * <p>
 * 重力加速度是常用物理单位，符号为g。
 * 1重力加速度定义为标准重力加速度，数值为9.80665 m/s²。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 g = 9.80665 m/s²（米/秒²）</li>
 *   <li>1 g ≈ 32.174 ft/s²（英尺/秒²）</li>
 *   <li>1 m/s² ≈ 0.10197 g</li>
 *   <li>标准重力加速度 = 1 g = 9.80665 m/s²</li>
 * </ul>
 * <p>
 * 重力加速度单位在航空、航天、汽车测试、地震工程等领域有广泛应用，
 * 用于表示相对于地球重力加速度的加速度值。
 * 在飞机机动性能测试、过山车设计、碰撞测试等场景中，常用g值来描述加速度。
 * <p>
 * 该单位便于直观理解加速度的大小，因为1g等于地球表面的重力加速度。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UAccelerate_g extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义重力加速度单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据a=Δv/Δt（加速度=速度变化量/时间），g = m·s⁻²
     * 重力加速度与米每二次方秒具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将重力加速度数值转换为标准单位（米每二次方秒）的数值。
     * 由于1g = 9.80665 m/s²，所以factor = 9.80665。
     * 这意味着1重力加速度等于9.80665米每二次方秒。
     */
    private final static double factor = 9.80665;

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
    private final static String description = "g";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立重力加速度单位与基本单位的关系。
     * 根据a=Δv/Δt，加速度单位由米和秒两个基本单位按特定指数组合而成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 秒，指数-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个重力加速度单位(g)实例
     * <p>
     * 初始化重力加速度单位，设置单位符号为"g"，基本单位组成为米·秒⁻²，
     * 转换因子为9.80665（即1g = 9.80665 m/s²），无附加偏移量。
     */
    public UAccelerate_g() {
        // 调用父类DerivedUnit的构造方法，初始化重力加速度单位
        // 参数依次为：单位描述("g")、基本单位元素列表([m^1, s^-2])、转换因子(9.80665)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}