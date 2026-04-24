package com.zishuimuyu.science.units.velocity;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 速度单位：c（光速）
 * <p>
 * 光速是物理学中的基本常数，符号为c。
 * 真空中光速的精确值为299,792,458米/秒。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 c = 299,792,458 m/s（米/秒）</li>
 *   <li>1 c ≈ 1,079,252,848.8 km/h（千米/小时）</li>
 *   <li>1 c ≈ 670,616,629 mph（英里/小时）</li>
 *   <li>1 c ≈ 582,749,918 kn（节）</li>
 *   <li>1 c = 1 光速</li>
 *   <li>相对论速度 β = v/c</li>
 * </ul>
 * <p>
 * 光速单位在物理学、天文学、相对论研究等领域有重要应用，
 * 用于表示电磁波传播速度、粒子加速器中的粒子速度、
 * 天体物理学中的速度比较等。
 * 根据爱因斯坦的相对论，光速是物质和信息传递的速度上限。
 * <p>
 * 该单位是物理学中的基本常数。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVelocity_c extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义光速单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-1
     * <p>
     * 根据v=s/t（速度=距离/时间），速度单位 = 距离/时间 = m/s
     * 光速与米每秒具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将光速数值转换为标准单位（米每秒）的数值。
     * 由于1c = 299,792,458 m/s，该值通过光速的精确值计算得出。
     * 这意味着1光速等于299,792,458米每秒。
     * 此处使用的值是将光速转换为特定单位制后的结果。
     */
    private final static double factor = 33356409.408550202;

    /**
     * 附加偏移量
     * <p>
     * 速度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "c";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立光速单位与基本单位的关系。
     * 根据v=s/t，速度单位由米和秒两个基本单位按特定指数组合而成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 秒，指数-1
        elementList.add(new UnitElement(BasicUnit.s, -1.0));
    }

    /**
     * 构造函数，创建一个光速单位(c)实例
     * <p>
     * 初始化光速单位，设置单位符号为"c"，基本单位组成为m·s⁻¹，
     * 转换因子为33356409.408550202（即1c = 299,792,458m/s），无附加偏移量。
     */
    public UVelocity_c() {
        // 调用父类DerivedUnit的构造方法，初始化光速单位
        // 参数依次为：单位描述("c")、基本单位元素列表([m^1, s^-1])、转换因子(33356409.408550202)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}