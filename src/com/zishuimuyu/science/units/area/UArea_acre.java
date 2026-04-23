package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：acre（英亩）
 * <P>
 * 英亩是英制面积单位，符号为acre。
 * 1英亩定义为43,560平方英尺的面积，约等于4,046.856平方米。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 acre = 43,560 ft²（平方英尺）</li>
 *   <li>1 acre ≈ 4,046.856 m²（平方米）</li>
 *   <li>1 acre ≈ 0.4047 ha（公顷）</li>
 *   <li>1 acre = 0.004047 km²（平方公里）</li>
 *   <li>1 mi²（平方英里）= 640 acres</li>
 *   <li>1 ha（公顷）≈ 2.471 acres</li>
 * </ul>
 * <P>
 * 英亩单位广泛应用于美国、英国等使用英制单位的国家，
 * 主要用于土地测量、房地产交易、农业用地面积计算等领域。
 * 在历史上，1英亩曾被定义为一个犁一天能够耕作的土地面积。
 * <P>
 * 英亩是英制系统中最重要的面积单位之一。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UArea_acre extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义英亩单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <P>
     * 英亩虽然源自英制单位，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现英亩到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将英亩数值转换为标准单位（平方米）的数值。
     * 由于1acre = 43,560 ft²，而1 ft²有对应的平方米转换因子，
     * 所以factor = new UArea_ft2().getFactor() * 43560.0
     * 这意味着1英亩等于43,560平方英尺所对应的平方米数。
     */
    private final static double factor;
    
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
    private final static String description = "acre";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过获取平方英尺单位的转换因子，然后乘以43,560（1英亩包含的平方英尺数），
     * 得到英亩单位的转换因子。
     */
    static {
        factor = new UArea_ft2().getFactor() * 43560.0;
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造方法
     * <P>
     * 创建英亩单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     */
    public UArea_acre() {
        super(description, elementList, factor, additional);
    }

}