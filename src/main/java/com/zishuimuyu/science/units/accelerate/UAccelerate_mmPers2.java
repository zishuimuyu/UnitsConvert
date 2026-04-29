package com.zishuimuyu.science.units.accelerate;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.length.ULength_mm;
import com.zishuimuyu.science.units.time.UTime_s;

import java.util.ArrayList;
import java.util.List;

/**
 * 加速度单位：mm/s²（毫米每二次方秒）
 * <p>
 * 毫米每二次方秒是国际单位制衍生的加速度单位，符号为mm/s²。
 * 1毫米每二次方秒定义为物体在1秒内速度增加1毫米/秒的加速度。
 * 1 mm/s² = 0.001 m/s²，常用于精密工程和微小加速度测量。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 mm/s² = 0.001 m/s²（米/秒²）</li>
 *   <li>1 mm/s² ≈ 0.000102 g（重力加速度）</li>
 *   <li>1 m/s² = 1000 mm/s²</li>
 *   <li>1 g ≈ 9806.65 mm/s²</li>
 *   <li>1 cm/s² = 10 mm/s²</li>
 * </ul>
 * <p>
 * 毫米每二次方秒单位在精密工程、微机电系统(MEMS)、振动分析、地震监测等领域有广泛应用，
 * 用于测量较小的加速度值。在地震学中，该单位可用于记录微小的地表运动。
 * 在精密制造和自动化控制中，毫米/秒²提供了适当的精度级别。
 * <p>
 * 该单位适合表达介于厘米/秒²和米/秒²之间的加速度值。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UAccelerate_mmPers2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义毫米每二次方秒单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * - 时间单位秒(s)，指数为-2
     * <p>
     * 根据a=Δv/Δt（加速度=速度变化量/时间），mm/s²需要转换为m/s²的基本单位形式。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将毫米每二次方秒数值转换为标准单位（米每二次方秒）的数值。
     * 1毫米 = 0.001米，因此1 mm/s² = 0.001 m/s²。
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
    private final static String description = "mm/s²";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 计算1毫米每二次方秒对应的米每二次方秒值。
     */
    static {
        // 1毫米 = 0.001米
        // 因此 1 mm/s² = 0.001 m/s²
        factor = 0.001;
        
        // 添加米基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
        // 添加秒基本单位，指数为-2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));
    }

    /**
     * 构造函数，创建一个毫米每二次方秒加速度单位(mm/s²)实例
     * <p>
     * 初始化毫米每二次方秒加速度单位，设置单位符号为"mm/s²"，基本单位组成为m·s⁻²，
     * 转换因子为0.001（即1mm/s² = 0.001m/s²），无附加偏移量。
     */
    public UAccelerate_mmPers2() {
        // 调用父类DerivedUnit的构造方法，初始化毫米每二次方秒加速度单位
        // 参数依次为：单位描述("mm/s²")、基本单位元素列表([m^1, s^-2])、转换因子(0.001)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}