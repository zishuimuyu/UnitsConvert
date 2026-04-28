package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：ly（光年）
 * <p>
 * 光年是天文学中用于测量宇宙中遥远距离的长度单位，符号为ly或l.y.。
 * 1光年定义为光在真空中不受引力场影响的一年时间内传播的距离。
 * 由于儒略年被定义为365.25天，每天86400秒，所以1光年等于9,460,730,472,580.8公里。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ly = 9,460,730,472,580.8 km（千米）</li>
 *   <li>1 ly ≈ 63,241.077 AU（天文单位）</li>
 *   <li>1 ly ≈ 0.3066 parsecs（秒差距）</li>
 *   <li>1 ly = 9.4607×10¹⁵ m（米）</li>
 *   <li>1 ly ≈ 5.8786×10¹² miles（英里）</li>
 *   <li>1 parsec ≈ 3.2616 ly</li>
 * </ul>
 * <p>
 * 光年主要用于测量恒星之间的距离、银河系的大小以及其他宇宙尺度的距离。
 * 在天文学和科幻作品中，光年是最常见的距离单位之一。
 * <p>
 * 光年是一个真正的距离单位，而不是时间单位，它表示的是光在一年中行进的距离。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_ly extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义光年单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 光年虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现光年到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 光年单位的转换因子为9,460,730,472,580,800.0。
     * 1 ly = 9,460,730,472,580.8 km = 9,460,730,472,580,800.0 m
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 9460730472580800.0;

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
    private final static String description = "ly";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立光年单位与基本单位的关系。
     * 光年本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个光年单位(ly)实例
     * <p>
     * 初始化光年单位，设置单位符号为"ly"，基本单位组成为m，
     * 转换因子为9,460,730,472,580,800.0（即1ly = 9,460,730,472,580,800.0m），
     * 无附加偏移量。
     */
    public ULength_ly() {
        // 调用父类DerivedUnit的构造方法，初始化光年单位
        // 参数依次为：单位描述("ly")、基本单位元素列表([m^1])、转换因子(9460730472580800.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}