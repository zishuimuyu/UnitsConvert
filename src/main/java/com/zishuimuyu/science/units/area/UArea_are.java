package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：are（公亩）
 * <p>
 * 公亩是公制面积单位，符号为a。
 * 1公亩定义为100平方米的面积，相当于边长为10米的正方形所围成的面积。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 a = 100 m²（平方米）</li>
 *   <li>1 a = 0.01 ha（公顷）</li>
 *   <li>1 a = 0.0001 km²（平方千米）</li>
 *   <li>1 a ≈ 119.599 yd²（平方码）</li>
 *   <li>1 a ≈ 1,196 ft²（平方英尺）</li>
 *   <li>1 ha = 100 a</li>
 *   <li>1 m² = 0.01 a</li>
 * </ul>
 * <p>
 * 公亩单位在许多欧洲国家广泛用于土地测量、农业和房地产，
 * 是平方米和公顷之间常用的面积单位，特别适合表示中等和小规模的土地面积。
 * <p>
 * "are"一词源自拉丁语"ārea"，意为"开放空间"，是公制系统中的重要面积单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_are extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义公亩单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是公亩，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现公亩到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1公亩 = 100平方米
     * 转换因子为100.0。
     */
    private final static double factor = 100.0;

    /**
     * 附加偏移量
     * <p>
     * 面积单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "are";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立公亩面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个公亩面积单位(are)实例
     * <p>
     * 初始化公亩面积单位，设置单位符号为"are"，基本单位组成为m²，
     * 转换因子为100.0（即1are = 100.0m²），无附加偏移量。
     */
    public UArea_are() {
        // 调用父类DerivedUnit的构造方法，初始化公亩面积单位
        // 参数依次为：单位描述("are")、基本单位元素列表([m^2])、转换因子(100.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}