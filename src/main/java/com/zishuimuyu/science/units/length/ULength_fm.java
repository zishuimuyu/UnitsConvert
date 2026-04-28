package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：fm（飞米）
 * <p>
 * 飞米是国际单位制中的长度单位，符号为fm。
 * 1飞米定义为1米的千万亿分之一，即10⁻¹⁵米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 fm = 10⁻¹⁵ m（米）</li>
 *   <li>1 fm = 10⁻⁶ pm（皮米）</li>
 *   <li>1 fm = 10⁻³ am（阿米）</li>
 *   <li>1 pm = 1000 fm</li>
 *   <li>1 am = 1000 fm</li>
 * </ul>
 * <p>
 * 飞米主要用于测量原子核尺度的长度，如质子、中子等亚原子粒子的大小。
 * 在核物理学和粒子物理学研究中，飞米是一个重要单位。
 * <p>
 * 原子核的直径通常在1-10飞米范围内，核子（质子和中子）的直径约为2飞米。
 * 飞米也被称为费米（fermi），以纪念物理学家恩里科·费米。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_fm extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义飞米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 飞米虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现飞米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 飞米单位的转换因子为1.0E-15。
     * 1 fm = 10⁻¹⁵ meters
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 1.0E-15;

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
    private final static String description = "fm";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立飞米单位与基本单位的关系。
     * 飞米本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个飞米单位(fm)实例
     * <p>
     * 初始化飞米单位，设置单位符号为"fm"，基本单位组成为m，
     * 转换因子为1.0E-15（即1fm = 1.0E-15m），
     * 无附加偏移量。
     */
    public ULength_fm() {
        // 调用父类DerivedUnit的构造方法，初始化飞米单位
        // 参数依次为：单位描述("fm")、基本单位元素列表([m^1])、转换因子(1.0E-15)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}