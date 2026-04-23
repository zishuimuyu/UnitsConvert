package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：ha（公顷）
 * <P>
 * 公顷是面积的常用公制单位，符号为ha。
 * 1公顷定义为10,000平方米的面积，相当于边长为100米的正方形的面积。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 ha = 10,000 m²（平方米）</li>
 *   <li>1 ha = 100 a（公亩）</li>
 *   <li>1 ha = 0.01 km²（平方公里）</li>
 *   <li>1 ha ≈ 2.471 acre（英亩）</li>
 *   <li>1 km² = 100 ha</li>
 *   <li>1 m² = 0.0001 ha</li>
 * </ul>
 * <P>
 * 公顷单位广泛应用于农业、林业、土地规划、房地产等领域，
 * 是测量中等规模土地面积的标准单位，特别适合表示农田、森林、公园等区域的面积。
 * <P>
 * 公顷一词源于法语"hectare"，是"hecto"（百）和"are"（公亩）的组合，表示100公亩。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UArea_ha extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义公顷单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <P>
     * 公顷虽然不是基本单位，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现公顷到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将公顷数值转换为标准单位（平方米）的数值。
     * 由于1ha = 10,000m²，所以factor = 10,000.0。
     * 这意味着1公顷等于10,000平方米。
     */
    private final static double factor = 10000.0;
    
    /**
     * 附加偏移量
     * <P>
     * 面积单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "ha";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表。
     * 由于公顷本质上是平方米的倍数单位，所以基本单位元素仍然是米的平方。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造方法
     * <P>
     * 创建公顷单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     */
    public UArea_ha() {
        super(description, elementList, factor, additional);
    }

}