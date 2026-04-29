package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：AU²（天文单位平方）
 * <p>
 * 天文单位平方是天文学中的面积单位，符号为AU²。
 * 1天文单位平方定义为边长为1天文单位（AU）的正方形所围成的面积。
 * 1天文单位约为149,597,870,700米（地球到太阳的平均距离）。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 AU² = 2.2379522917×10²² m²（平方米）</li>
 *   <li>1 AU² = 2.2379522917×10¹⁶ km²（平方公里）</li>
 *   <li>1 AU² = 2.2379522917×10¹⁸ ha（公顷）</li>
 *   <li>1 AU² ≈ 8.640794×10¹⁵ mi²（平方英里）</li>
 *   <li>1 m² ≈ 4.4683705×10⁻²³ AU²</li>
 * </ul>
 * <p>
 * 天文单位平方单位用于测量太阳系内或星际空间中的巨大区域面积，
 * 如行星轨道盘面、吸积盘面积、恒星风影响范围等天文学领域。
 * <p>
 * 在天体物理学和宇宙学研究中，这是一个有用的面积单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_AU2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义天文单位平方的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是天文单位平方，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现天文单位平方到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1天文单位 = 149,597,870,700米，所以1天文单位平方 = (149,597,870,700)²平方米
     * 转换因子为2.2379522917×10²²。
     */
    private final static double factor = 2.2379522917e22;

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
    private final static String description = "AU2";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立天文单位平方面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个天文单位平方面积单位(AU²)实例
     * <p>
     * 初始化天文单位平方面积单位，设置单位符号为"AU2"，基本单位组成为m²，
     * 转换因子为2.2379522917e22（即1AU2 = 2.2379522917e22m²），无附加偏移量。
     */
    public UArea_AU2() {
        // 调用父类DerivedUnit的构造方法，初始化天文单位平方面积单位
        // 参数依次为：单位描述("AU2")、基本单位元素列表([m^2])、转换因子(2.2379522917e22)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}