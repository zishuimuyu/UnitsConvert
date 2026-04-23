package cn.nlte.science.units.area;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import cn.nlte.science.units.length.ULength_Km;
import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：km²（平方公里）
 * <P>
 * 平方公里是面积的大规模单位，符号为km²。
 * 1平方公里定义为边长为1公里的正方形所围成的面积。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 km² = 1,000,000 m²（平方米）</li>
 *   <li>1 km² = 100 ha（公顷）</li>
 *   <li>1 km² = 1,000,000,000,000 mm²（平方毫米）</li>
 *   <li>1 km² = 1,000,000 dm²（平方分米）</li>
 *   <li>1 km² = 10,000,000,000 cm²（平方厘米）</li>
 *   <li>1 ha（公顷）= 0.01 km²</li>
 *   <li>1 m² = 0.000001 km²</li>
 * </ul>
 * <P>
 * 平方公里单位广泛应用于地理测量、城市规划、土地管理、国家面积统计等领域，
 * 适用于测量大范围的区域，如城市面积、湖泊面积、森林面积、国家领土面积等。
 * <P>
 * 平方公里是衡量大面积区域最常用的单位之一。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UArea_Km2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义平方公里单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <P>
     * 虽然该单位是平方公里，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现公里到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将平方公里数值转换为标准单位（平方米）的数值。
     * 由于1km = 1000m，所以1km² = (1000m)² = 1,000,000m²，因此factor = 1,000,000。
     * 该值在静态初始化块中通过计算获得：factor = Math.pow(new ULength_Km().getFactor(), 2.0)
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
    private final static String description = "Km2";

    /**
     * 静态初始化块
     * <P>
     * 初始化转换因子和基本单位元素列表。
     * 通过获取公里长度单位的转换因子，然后计算其平方得到面积单位的转换因子。
     * 由于平方公里是二维单位，所以转换因子是长度单位转换因子的平方。
     */
    static {
        factor = Math.pow(new ULength_Km().getFactor(), 2.0);
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造方法
     * <P>
     * 创建平方公里单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     */
    public UArea_Km2() {
        super(description, elementList, factor, additional);
    }

}