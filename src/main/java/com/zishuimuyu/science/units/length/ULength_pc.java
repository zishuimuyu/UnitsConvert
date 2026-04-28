package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：pc（秒差距）
 * <p>
 * 秒差距是天文学中用于测量恒星距离的重要长度单位，符号为pc。
 * 1秒差距定义为当天体的周年视差为1角秒时，该天体与观测者之间的距离。
 * 1秒差距约等于3.26光年或206,265天文单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 pc = 30,856,775,814,913.7 km（千米）</li>
 *   <li>1 pc ≈ 3.2616 ly（光年）</li>
 *   <li>1 pc ≈ 206,265 AU（天文单位）</li>
 *   <li>1 pc = 3.08567758149137×10¹⁶ m（米）</li>
 *   <li>1 pc ≈ 1.9174×10¹³ miles（英里）</li>
 *   <li>1 ly ≈ 0.3066 pc</li>
 * </ul>
 * <p>
 * 秒差距主要用于测量恒星和银河系内天体的距离，是天文学中最常用的距离单位之一。
 * 它基于三角视差原理，是测量宇宙距离阶梯中的重要环节。
 * <p>
 * 名称"parsec"来源于"parallax of one arcsecond"（一秒差距的视差）。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_pc extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义秒差距单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 秒差距虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现秒差距到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 秒差距单位的转换因子为30856775814913700.0。
     * 1 pc = 30,856,775,814,913.7 km = 30,856,775,814,913,700.0 m
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 30856775814913700.0;

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
    private final static String description = "pc";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立秒差距单位与基本单位的关系。
     * 秒差距本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个秒差距单位(pc)实例
     * <p>
     * 初始化秒差距单位，设置单位符号为"pc"，基本单位组成为m，
     * 转换因子为30,856,775,814,913,700.0（即1pc = 30,856,775,814,913,700.0m），
     * 无附加偏移量。
     */
    public ULength_pc() {
        // 调用父类DerivedUnit的构造方法，初始化秒差距单位
        // 参数依次为：单位描述("pc")、基本单位元素列表([m^1])、转换因子(30856775814913700.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}