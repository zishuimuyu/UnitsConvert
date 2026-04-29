package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：cho（町）
 * <p>
 * 町是日本传统面积单位，符号为cho。
 * 1町定义为991.736平方米的面积，是日本传统土地测量系统中的重要单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 cho = 991.736 m²（平方米）</li>
 *   <li>1 cho = 10 tan</li>
 *   <li>1 cho = 100 bu</li>
 *   <li>1 cho ≈ 0.0991736 ha（公顷）</li>
 *   <li>1 cho ≈ 0.000991736 km²（平方公里）</li>
 *   <li>1 ha（公顷）≈ 10.08 cho</li>
 *   <li>1 bu = 9.91736 m²</li>
 * </ul>
 * <p>
 * 町单位在日本土地测量、房地产登记和农业中仍有使用，
 * 是日本传统测量系统中的重要面积单位。
 * <p>
 * 在日本的法律文件和土地登记中，町仍然是正式使用的面积单位之一。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_cho extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义町单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是町，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现町到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1町 = 991.736平方米
     * 转换因子为991.736。
     */
    private final static double factor = 991.736;

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
    private final static String description = "cho";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立町面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个町面积单位(cho)实例
     * <p>
     * 初始化町面积单位，设置单位符号为"cho"，基本单位组成为m²，
     * 转换因子为991.736（即1cho = 991.736m²），无附加偏移量。
     */
    public UArea_cho() {
        // 调用父类DerivedUnit的构造方法，初始化町面积单位
        // 参数依次为：单位描述("cho")、基本单位元素列表([m^2])、转换因子(991.736)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}