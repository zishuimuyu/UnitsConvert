package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import com.zishuimuyu.science.units.length.ULength_mi;
import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：mi²（平方英里）
 * <P>
 * 平方英里是英制面积单位，符号为mi²。
 * 1平方英里定义为边长为1英里的正方形所围成的面积。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 mi² = 640 acres（英亩）</li>
 *   <li>1 mi² ≈ 258.999 hectares（公顷）</li>
 *   <li>1 mi² ≈ 2.59 km²（平方公里）</li>
 *   <li>1 mi² = 3,097,600 yd²（平方码）</li>
 *   <li>1 mi² = 27,878,400 ft²（平方英尺）</li>
 *   <li>1 km² ≈ 0.3861 mi²</li>
 * </ul>
 * <P>
 * 平方英里单位广泛应用于美国、英国等使用英制单位的国家，
 * 主要用于大规模的土地测量、地理区域划分、城市规划、国家面积统计等领域，
 * 适用于测量州、县、大型自然区域等大面积区域。
 * <P>
 * 在地理和测绘领域，平方英里是重要的面积计量单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UArea_mi2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义平方英里单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <P>
     * 虽然该单位是平方英里，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现英里到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将平方英里数值转换为标准单位（平方米）的数值。
     * 由于1mi = 1609.344m，所以1mi² = (1609.344m)² = 2,589,988.110336m²，因此factor ≈ 2,589,988。
     * 该值在静态初始化块中通过计算获得：factor = Math.pow(new ULength_mi().getFactor(), 2.0)
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
    private final static String description = "mi2";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过获取英里长度单位的转换因子，然后计算其平方得到面积单位的转换因子。
     * 由于平方英里是二维单位，所以转换因子是长度单位转换因子的平方。
     */
    static {
        factor = Math.pow(new ULength_mi().getFactor(), 2.0);
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造方法
     * <P>
     * 创建平方英里单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     */
    public UArea_mi2() {
        super(description, elementList, factor, additional);
    }

}