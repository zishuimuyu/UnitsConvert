package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：qing（顷）
 * <p>
 * 顷是中国传统面积单位，符号为qing。
 * 1顷定义为66,667平方米的面积，即100市亩，是中国传统土地测量系统中的大单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 qing = 66,667 m²（平方米）</li>
 *   <li>1 qing = 100 mu（市亩）</li>
 *   <li>1 qing = 6.6667 ha（公顷）</li>
 *   <li>1 qing = 0.066667 km²（平方公里）</li>
 *   <li>1 ha（公顷）≈ 0.15 qing</li>
 *   <li>1 km² ≈ 15 qing</li>
 * </ul>
 * <p>
 * 顷单位在中国古代土地测量、农业税收和土地分配中广泛使用，
 * 虽然现代较少使用，但在历史文献和某些传统场合仍有提及。
 * <p>
 * 在中国古代，顷是衡量大片农田的重要单位，常用于统计农业产量。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_qing extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义顷单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是顷，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现顷到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1顷 = 66,667平方米
     * 转换因子为66667.0。
     */
    private final static double factor = 66667.0;

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
    private final static String description = "qing";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立顷面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个顷面积单位(qing)实例
     * <p>
     * 初始化顷面积单位，设置单位符号为"qing"，基本单位组成为m²，
     * 转换因子为66667.0（即1qing = 66667.0m²），无附加偏移量。
     */
    public UArea_qing() {
        // 调用父类DerivedUnit的构造方法，初始化顷面积单位
        // 参数依次为：单位描述("qing")、基本单位元素列表([m^2])、转换因子(66667.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}