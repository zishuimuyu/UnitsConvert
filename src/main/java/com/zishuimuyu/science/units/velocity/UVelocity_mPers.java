package com.zishuimuyu.science.units.velocity;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 速度单位：m/s（米每秒）
 * <p>
 * 米每秒是国际单位制中速度的基本导出单位，符号为m/s。
 * 1米每秒定义为物体在1秒内移动1米的距离。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 m/s = 1 m·s⁻¹（米·秒⁻¹）</li>
 *   <li>1 km/h ≈ 0.2778 m/s（千米/小时）</li>
 *   <li>1 m/s = 3.6 km/h</li>
 *   <li>1 knot ≈ 0.5144 m/s（节）</li>
 *   <li>光速 c ≈ 299,792,458 m/s</li>
 * </ul>
 * <p>
 * 米每秒单位广泛应用于物理学、工程学、交通运输等领域，用于测量各种运动物体的速度。
 * 在科学研究中，这是表示速度的标准单位。在日常生活中，虽然常用km/h表示车速，
 * 但在科学计算和技术文档中仍使用m/s。
 * <p>
 * 速度是矢量量，既有大小也有方向，米每秒单位仅表示速度的大小部分。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVelocity_mPers extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义米每秒单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-1
     * <p>
     * 根据v=s/t（速度=距离/时间），m/s = m·s⁻¹
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 米每秒是速度的标准单位，因此转换因子为1.0。
     * 用于与其他速度单位进行数值转换。
     */
    private final static double factor = 1.0;

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
    private final static String description = "m/s";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立米每秒单位与基本单位的关系。
     * 根据v=s/t，速度单位由米和秒两个基本单位按特定指数组合而成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 秒，指数-1
        elementList.add(new UnitElement(BasicUnit.s, -1.0));
    }

    /**
     * 构造函数，创建一个米每秒速度单位(m/s)实例
     * <p>
     * 初始化米每秒速度单位，设置单位符号为"m/s"，基本单位组成为m·s⁻¹，
     * 转换因子为1（即1m/s = 1m/s），无附加偏移量。
     */
    public UVelocity_mPers() {
        // 调用父类DerivedUnit的构造方法，初始化米每秒速度单位
        // 参数依次为：单位描述("m/s")、基本单位元素列表([m^1, s^-1])、转换因子(1.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}