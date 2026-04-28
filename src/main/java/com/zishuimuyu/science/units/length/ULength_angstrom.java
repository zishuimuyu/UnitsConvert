package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：Å（埃格斯特朗）
 * <p>
 * 埃格斯特朗是长度单位，符号为Å（或angstrom），以瑞典物理学家安德斯·埃格斯特朗命名。
 * 1埃格斯特朗定义为0.1纳米，即10⁻¹⁰米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 Å = 10⁻¹⁰ m（米）</li>
 *   <li>1 Å = 10⁻⁷ mm（毫米）</li>
 *   <li>1 Å = 10⁻⁴ μm（微米）</li>
 *   <li>1 Å = 0.1 nm（纳米）</li>
 *   <li>1 nm = 10 Å</li>
 *   <li>1 μm = 10⁴ Å</li>
 * </ul>
 * <p>
 * 埃格斯特朗主要用于描述原子尺度的长度，如原子半径、化学键长、晶格常数等。
 * 在晶体学、原子物理学、分子生物学和光谱学中，埃格斯特朗是一个重要单位。
 * <p>
 * 许多化学键的长度在1-3埃之间，原子半径通常在0.5-3埃之间。
 * DNA双螺旋的螺距约为34埃，蛋白质α螺旋的螺距约为5.4埃。
 * 虽然国际单位制推荐使用纳米，但埃在某些领域仍广泛使用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_angstrom extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义埃格斯特朗单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 埃格斯特朗虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现埃格斯特朗到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 埃格斯特朗单位的转换因子为1.0E-10。
     * 1 Å = 10⁻¹⁰ meters
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 1.0E-10;

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
    private final static String description = "Å";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立埃格斯特朗单位与基本单位的关系。
     * 埃格斯特朗本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个埃格斯特朗单位(Å)实例
     * <p>
     * 初始化埃格斯特朗单位，设置单位符号为"Å"，基本单位组成为m，
     * 转换因子为1.0E-10（即1Å = 1.0E-10m），
     * 无附加偏移量。
     */
    public ULength_angstrom() {
        // 调用父类DerivedUnit的构造方法，初始化埃格斯特朗单位
        // 参数依次为：单位描述("Å")、基本单位元素列表([m^1])、转换因子(1.0E-10)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}