package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：pm（皮米）
 * <p>
 * 皮米是国际单位制中的长度单位，符号为pm。
 * 1皮米定义为1米的一万亿分之一，即10⁻¹²米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 pm = 10⁻¹² m（米）</li>
 *   <li>1 pm = 10⁻⁹ nm（纳米）</li>
 *   <li>1 pm = 10⁻⁶ μm（微米）</li>
 *   <li>1 pm = 0.01 Å（埃）</li>
 *   <li>1 nm = 1000 pm</li>
 *   <li>1 Å = 100 pm</li>
 * </ul>
 * <p>
 * 皮米主要用于测量原子尺度的长度，如原子半径、化学键长等。
 * 在原子物理学、量子力学和分子生物学研究中，皮米是一个重要单位。
 * <p>
 * 许多化学键的长度在100-200皮米范围内，原子半径通常在30-300皮米之间。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_pm extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义皮米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 皮米虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现皮米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 皮米单位的转换因子为1.0E-12。
     * 1 pm = 10⁻¹² meters
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 1.0E-12;

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
    private final static String description = "pm";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立皮米单位与基本单位的关系。
     * 皮米本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个皮米单位(pm)实例
     * <p>
     * 初始化皮米单位，设置单位符号为"pm"，基本单位组成为m，
     * 转换因子为1.0E-12（即1pm = 1.0E-12m），
     * 无附加偏移量。
     */
    public ULength_pm() {
        // 调用父类DerivedUnit的构造方法，初始化皮米单位
        // 参数依次为：单位描述("pm")、基本单位元素列表([m^1])、转换因子(1.0E-12)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}