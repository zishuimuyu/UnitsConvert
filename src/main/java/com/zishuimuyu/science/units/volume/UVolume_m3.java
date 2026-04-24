package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：m³（立方米）
 * <p>
 * 立方米是国际单位制中体积的基本导出单位，符号为m³。
 * 1立方米定义为边长为1米的立方体所占的空间。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 m³ = 1,000 dm³ = 1,000 L（立方分米 = 升）</li>
 *   <li>1 m³ = 1,000,000 cm³ = 1,000,000 mL（立方厘米 = 毫升）</li>
 *   <li>1 m³ = 0.001 km³（立方千米）</li>
 *   <li>1 m³ ≈ 35.3147 ft³（立方英尺）</li>
 *   <li>1 m³ ≈ 1.30795 yd³（立方码）</li>
 *   <li>1 L = 0.001 m³（升）</li>
 * </ul>
 * <p>
 * 立方米单位广泛应用于工程、建筑、物流、化工等领域，用于测量各种物体或空间的体积。
 * 在日常生活中，它常用于表示房间大小、货物运输容量、液体存储量等。
 * <p>
 * 体积是三维空间的度量，在SI单位制中，体积单位是通过长度单位的三次方来定义的。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UVolume_m3 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义立方米单位的基本单位组成：
     * - 长度单位米(m)，指数为3
     * <p>
     * 根据V=l×w×h（体积=长×宽×高），m³ = m³
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 立方米是体积的标准单位，因此转换因子为1.0。
     * 用于与其他体积单位进行数值转换。
     */
    private final static double factor = 1.0;

    /**
     * 附加偏移量
     * <p>
     * 体积单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "m3";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立立方米单位与基本单位的关系。
     * 根据V=l×w×h，体积单位由米单位的三次方组成。
     */
    static {
        // 米，指数3
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建一个立方米体积单位(m³)实例
     * <p>
     * 初始化立方米体积单位，设置单位符号为"m3"，基本单位组成为m³，
     * 转换因子为1（即1m³ = 1m³），无附加偏移量。
     */
    public UVolume_m3() {
        // 调用父类DerivedUnit的构造方法，初始化立方米体积单位
        // 参数依次为：单位描述("m3")、基本单位元素列表([m^3])、转换因子(1.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}