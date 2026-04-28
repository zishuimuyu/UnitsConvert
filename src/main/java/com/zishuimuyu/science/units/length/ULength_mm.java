package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：mm（毫米）
 * <p>
 * 毫米是国际单位制中的长度单位，符号为mm。
 * 1毫米定义为0.001米，即1米的千分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 mm = 10⁻³ m（米）</li>
 *   <li>1 mm = 0.1 cm（厘米）</li>
 *   <li>1 mm = 1000 μm（微米）</li>
 *   <li>1 cm = 10 mm</li>
 *   <li>1 m = 1000 mm</li>
 *   <li>1 km = 1,000,000 mm</li>
 * </ul>
 * <p>
 * 毫米单位在工程、制造、建筑、日常生活等领域有广泛应用，
 * 用于测量精密零件、建筑材料、机械图纸等的尺寸。
 * 在制造业中，毫米是常见的精度单位。
 * <p>
 * 该单位适合表示较小的长度。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_mm extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义毫米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 毫米虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现毫米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 毫米单位的转换因子为0.001。
     * 1 mm = 10⁻³ meters
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 0.001;

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
    private final static String description = "mm";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立毫米单位与基本单位的关系。
     * 毫米本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个毫米单位(mm)实例
     * <p>
     * 初始化毫米单位，设置单位符号为"mm"，基本单位组成为m，
     * 转换因子为0.001（即1mm = 0.001m），
     * 无附加偏移量。
     */
    public ULength_mm() {
        // 调用父类DerivedUnit的构造方法，初始化毫米单位
        // 参数依次为：单位描述("mm")、基本单位元素列表([m^1])、转换因子(0.001)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}