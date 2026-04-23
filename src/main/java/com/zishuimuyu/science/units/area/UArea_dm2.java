package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.length.ULength_dm;
import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：dm²（平方分米）
 * <P>
 * 平方分米是面积的常用单位，符号为dm²。
 * 1平方分米定义为边长为1分米的正方形所围成的面积。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 dm² = 0.01 m²（平方米）</li>
 *   <li>1 dm² = 100 cm²（平方厘米）</li>
 *   <li>1 dm² = 10,000 mm²（平方毫米）</li>
 *   <li>1 cm² = 0.01 dm²</li>
 *   <li>1 m² = 100 dm²</li>
 *   <li>1 ha（公顷）= 1,000,000 dm²</li>
 * </ul>
 * <P>
 * 平方分米单位常用于中等规模的面积测量，如家具尺寸、小型房间面积、包装箱表面积等。
 * 在教育和日常生活中，平方分米是一个便于理解和使用的面积单位。
 * <P>
 * 平方分米也被称为"公寸"，在某些地区仍有使用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UArea_dm2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义平方分米单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <P>
     * 虽然该单位是平方分米，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现分米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将平方分米数值转换为标准单位（平方米）的数值。
     * 由于1dm = 0.1m，所以1dm² = (0.1m)² = 0.01m²，因此factor = 0.01。
     * 该值在静态初始化块中通过计算获得：factor = Math.pow(new ULength_dm().getFactor(), 2.0)
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
    private final static String description = "dm2";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过获取分米长度单位的转换因子，然后计算其平方得到面积单位的转换因子。
     * 由于平方分米是二维单位，所以转换因子是长度单位转换因子的平方。
     */
    static {
        factor = Math.pow(new ULength_dm().getFactor(), 2.0);
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造方法
     * <P>
     * 创建平方分米单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     */
    public UArea_dm2() {
        super(description, elementList, factor, additional);
    }

}