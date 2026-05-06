package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：zm（仄米）
 * <p>
 * 仄米是国际单位制中的长度单位，符号为zm。
 * 1仄米定义为10⁻²¹米，是国际单位制中极小的长度单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 zm = 10⁻²¹ m（米）</li>
 *   <li>1 zm = 10⁻³ am（阿米）</li>
 *   <li>1 am = 1000 zm</li>
 *   <li>1 fm = 10⁶ zm（飞米）</li>
 *   <li>1 pm = 10⁹ zm（皮米）</li>
 * </ul>
 * <p>
 * 仄米单位在理论物理学、量子力学等领域有潜在应用，
 * 用于描述极其微小的距离尺度。
 * 该单位目前主要用于理论计算和科学研究。
 * <p>
 * 该单位是国际单位制中最小的长度单位之一。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年05月06日
 */
public class ULength_zm extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义仄米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 仄米虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现仄米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 仄米单位的转换因子为1.0E-21。
     * 1 zm = 10⁻²¹ m
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 1.0E-21;

    /**
     * 附加偏移量
     * <p>
     * 长度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "zm";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立仄米单位与基本单位的关系。
     * 仄米本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个仄米单位(zm)实例
     * <p>
     * 初始化仄米单位，设置单位符号为"zm"，基本单位组成为m，
     * 转换因子为1.0E-21（即1zm = 1.0E-21m），
     * 无附加偏移量。
     */
    public ULength_zm() {
        // 调用父类DerivedUnit的构造方法，初始化仄米单位
        // 参数依次为：单位描述("zm")、基本单位元素列表([m^1])、转换因子(1.0E-21)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}