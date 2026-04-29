package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：Mm（兆米）
 * <p>
 * 兆米是国际单位制中的长度单位，符号为Mm。
 * 1兆米定义为1米的一百万倍，即10⁶米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 Mm = 10⁶ m（米）</li>
 *   <li>1 Mm = 10³ km（千米）</li>
 *   <li>1 Mm = 10⁹ mm（毫米）</li>
 *   <li>1 km = 0.001 Mm</li>
 *   <li>1 m = 10⁻⁶ Mm</li>
 * </ul>
 * <p>
 * 兆米主要用于测量极大的距离，如天文距离、地质结构、行星半径等。
 * 在地理学、天文学和大型工程项目中，兆米是一个有用的单位。
 * <p>
 * 地球的平均半径约为6.371 Mm，地球的赤道周长约为40.075 Mm。
 * 兆米也可用于描述大陆板块移动距离等大地测量学应用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_MegaMeter extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义兆米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 兆米虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现兆米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 兆米单位的转换因子为1.0E6。
     * 1 Mm = 10⁶ m
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 1.0E6;

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
    private final static String description = "Mm";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立兆米单位与基本单位的关系。
     * 兆米本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个兆米单位(Mm)实例
     * <p>
     * 初始化兆米单位，设置单位符号为"Mm"，基本单位组成为m，
     * 转换因子为1.0E6（即1Mm = 1.0E6m），
     * 无附加偏移量。
     */
    public ULength_MegaMeter() {
        // 调用父类DerivedUnit的构造方法，初始化兆米单位
        // 参数依次为：单位描述("Mm")、基本单位元素列表([m^1])、转换因子(1.0E6)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}