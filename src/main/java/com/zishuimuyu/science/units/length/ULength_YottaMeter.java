package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：Ym（尧米）
 * <p>
 * 尧米是国际单位制中的长度单位，符号为Ym。
 * 1尧米定义为1米的10²⁴倍，是国际单位制中最大的长度前缀。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 Ym = 10²⁴ m（米）</li>
 *   <li>1 Ym = 10¹⁵ Gm（吉米）</li>
 *   <li>1 Ym = 10⁶ Zm（泽米）</li>
 *   <li>1 Gm = 10⁻⁹ Ym</li>
 *   <li>1 Mm = 10⁻¹⁸ Ym</li>
 * </ul>
 * <p>
 * 尧米主要用于宇宙学中的极大距离测量，如可观测宇宙的尺度。
 * 目前在实际测量中几乎不使用，更多是理论概念。
 * <p>
 * 尧米的名称来源于法语"yotta"，表示10²⁴。
 * 这个单位在描述宇宙大尺度结构时偶尔会提及。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_YottaMeter extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义尧米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 尧米虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现尧米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 尧米单位的转换因子为1.0E24。
     * 1 Ym = 10²⁴ m
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 1.0E24;

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
    private final static String description = "Ym";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立尧米单位与基本单位的关系。
     * 尧米本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个尧米单位(Ym)实例
     * <p>
     * 初始化尧米单位，设置单位符号为"Ym"，基本单位组成为m，
     * 转换因子为1.0E24（即1Ym = 1.0E24m），
     * 无附加偏移量。
     */
    public ULength_YottaMeter() {
        // 调用父类DerivedUnit的构造方法，初始化尧米单位
        // 参数依次为：单位描述("Ym")、基本单位元素列表([m^1])、转换因子(1.0E24)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}