package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：nm（纳米）
 * <p>
 * 纳米是国际单位制中的长度单位，符号为nm。
 * 1纳米定义为1米的十亿分之一，即10⁻⁹米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 nm = 10⁻⁹ m（米）</li>
 *   <li>1 nm = 10⁻⁶ mm（毫米）</li>
 *   <li>1 nm = 10⁻³ μm（微米）</li>
 *   <li>1 nm = 10 Å（埃）</li>
 *   <li>1 μm = 1000 nm</li>
 *   <li>1 mm = 1,000,000 nm</li>
 * </ul>
 * <p>
 * 纳米主要用于测量极小的物体，如原子、分子、DNA链、病毒、纳米材料等。
 * 在纳米技术、生物学、物理学和化学研究中，纳米是一个重要单位。
 * <p>
 * 纳米技术是指在纳米尺度上操纵物质的技术，涉及材料科学、电子学等多个领域。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_nm extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义纳米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 纳米虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现纳米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 纳米单位的转换因子为1.0E-9。
     * 1 nm = 10⁻⁹ meters
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 1.0E-9;

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
    private final static String description = "nm";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立纳米单位与基本单位的关系。
     * 纳米本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个纳米单位(nm)实例
     * <p>
     * 初始化纳米单位，设置单位符号为"nm"，基本单位组成为m，
     * 转换因子为1.0E-9（即1nm = 1.0E-9m），
     * 无附加偏移量。
     */
    public ULength_nm() {
        // 调用父类DerivedUnit的构造方法，初始化纳米单位
        // 参数依次为：单位描述("nm")、基本单位元素列表([m^1])、转换因子(1.0E-9)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}