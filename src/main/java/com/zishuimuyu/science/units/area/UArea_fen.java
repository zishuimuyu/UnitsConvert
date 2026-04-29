package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：fen（分）
 * <p>
 * 分是中国传统面积单位，符号为fen。
 * 1分定义为66.667平方米的面积，是中国传统土地测量系统中的重要单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 fen = 66.667 m²（平方米）</li>
 *   <li>1 mu（市亩）= 10 fen</li>
 *   <li>1 fen = 0.0066667 ha（公顷）</li>
 *   <li>1 fen = 0.000066667 km²（平方公里）</li>
 *   <li>1 ha（公顷）≈ 150 fen</li>
 *   <li>1 m² = 0.015 fen</li>
 * </ul>
 * <p>
 * 分单位在中国农村地区的土地测量、农业统计和土地承包合同中仍有使用，
 * 是中国传统测量系统中连接亩和厘的重要单位。
 * <p>
 * 在农村土地分配和农业统计中，分是一个常用的面积计量单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_fen extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义分单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是分，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现分到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1分 = 66.667平方米
     * 转换因子为66.667。
     */
    private final static double factor = 66.667;

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
    private final static String description = "fen";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立分面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个分面积单位(fen)实例
     * <p>
     * 初始化分面积单位，设置单位符号为"fen"，基本单位组成为m²，
     * 转换因子为66.667（即1fen = 66.667m²），无附加偏移量。
     */
    public UArea_fen() {
        // 调用父类DerivedUnit的构造方法，初始化分面积单位
        // 参数依次为：单位描述("fen")、基本单位元素列表([m^2])、转换因子(66.667)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}