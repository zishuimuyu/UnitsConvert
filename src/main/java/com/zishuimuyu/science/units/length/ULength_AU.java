package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：AU（天文单位）
 * <p>
 * 天文单位是天文学中用于测量太阳系内距离的长度单位，符号为AU。
 * 1天文单位定义为地球到太阳的平均距离，精确值为149,597,870.7公里。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 AU = 149,597,870.7 km（千米）</li>
 *   <li>1 AU ≈ 92,955,807.3 mi（英里）</li>
 *   <li>1 AU ≈ 499.0 光秒</li>
 *   <li>1 AU ≈ 8.317 光分</li>
 *   <li>1 AU ≈ 0.00001581 光年</li>
 *   <li>1 AU ≈ 4.848×10⁻⁶ pc（秒差距）</li>
 *   <li>1 光年 ≈ 63,241 AU</li>
 * </ul>
 * <p>
 * 天文单位主要用于太阳系内的距离测量，如行星轨道半径、太阳系天体之间的距离等。
 * 在天体力学和天文学计算中，天文单位是重要的距离参考标准。
 * <p>
 * 2012年国际天文学联合会(IAU)将天文单位定义为精确值：149,597,870.7公里。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_AU extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义天文单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 天文单位虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现天文单位到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 天文单位的转换因子为149,597,870,700.0。
     * 1 AU = 149,597,870.7 km = 149,597,870,700.0 m
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 149597870700.0;

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
    private final static String description = "AU";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立天文单位与基本单位的关系。
     * 天文单位本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个天文单位(AU)实例
     * <p>
     * 初始化天文单位，设置单位符号为"AU"，基本单位组成为m，
     * 转换因子为149,597,870,700.0（即1AU = 149,597,870,700.0m），
     * 无附加偏移量。
     */
    public ULength_AU() {
        // 调用父类DerivedUnit的构造方法，初始化天文单位
        // 参数依次为：单位描述("AU")、基本单位元素列表([m^1])、转换因子(149597870700.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}