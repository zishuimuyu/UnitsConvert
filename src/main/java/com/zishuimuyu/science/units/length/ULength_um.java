package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：um（微米）
 * <p>
 * 微米是国际单位制中的长度单位，符号为um（有时也写作μm）。
 * 1微米定义为0.000001米，即1米的百万分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 um = 1×10⁻⁶ m（米）</li>
 *   <li>1 um = 0.001 mm（毫米）</li>
 *   <li>1 um = 1000 nm（纳米）</li>
 *   <li>1 mm = 1000 um</li>
 *   <li>1 cm = 10,000 um</li>
 *   <li>1 in ≈ 25,400 um</li>
 * </ul>
 * <p>
 * 微米单位在精密制造、光学、半导体、生物学、医学等领域有广泛应用，
 * 用于测量细胞大小、细菌尺寸、芯片线宽、光纤直径等微小尺寸。
 * 在现代高科技产业中，微米级精度是常见的要求。
 * <p>
 * 该单位适合表示微小的长度。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_um extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义微米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 微米是长度单位，1微米等于1×10⁻⁶米，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将微米数值转换为标准单位（米）的数值。
     * 由于1um = 1×10⁻⁶m，所以factor = 1.0E-6。
     * 这意味着1微米等于0.000001米。
     */
    private final static double factor = 1.0E-6;

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
    private final static String description = "um";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立微米单位与基本单位的关系。
     * 微米是长度单位，由米单位构成。
     */
    static {
        // 添加米基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个微米长度单位(um)实例
     * <p>
     * 初始化微米长度单位，设置单位符号为"um"，基本单位组成为米，
     * 转换因子为0.000001（即1um = 0.000001m），无附加偏移量。
     */
    public ULength_um() {
        // 调用父类DerivedUnit的构造方法，初始化微米长度单位
        // 参数依次为：单位描述("um")、基本单位元素列表([m^1])、转换因子(1.0E-6)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}