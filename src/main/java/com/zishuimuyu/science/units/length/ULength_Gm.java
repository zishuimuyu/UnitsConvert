package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：Gm（吉米）
 * <p>
 * 吉米是国际单位制中的长度单位，符号为Gm。
 * 1吉米定义为1米的十亿倍，即10⁹米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 Gm = 10⁹ m（米）</li>
 *   <li>1 Gm = 10⁶ km（千米）</li>
 *   <li>1 Gm = 10³ Mm（兆米）</li>
 *   <li>1 km = 10⁻⁶ Gm</li>
 *   <li>1 Mm = 10⁻³ Gm</li>
 * </ul>
 * <p>
 * 吉米主要用于测量极大的距离，如行星间距离、太阳系内天体之间的距离等。
 * 在天文学、航天学和行星科学研究中，吉米是一个有用的单位。
 * <p>
 * 地月平均距离约为0.384 Gm，地日平均距离约为149.6 Gm（约1 AU）。
 * 吉米可用于描述卫星轨道、行星半径等大尺度天体物理现象。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_Gm extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义吉米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 吉米虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现吉米到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 吉米单位的转换因子为1.0E9。
     * 1 Gm = 10⁹ m
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 1.0E9;

    /**
     * 附加偏移量
     * <p>
     * 长度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Gm";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立吉米单位与基本单位的关系。
     * 吉米本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个吉米单位(Gm)实例
     * <p>
     * 初始化吉米单位，设置单位符号为"Gm"，基本单位组成为m，
     * 转换因子为1.0E9（即1Gm = 1.0E9m），
     * 无附加偏移量。
     */
    public ULength_Gm() {
        // 调用父类DerivedUnit的构造方法，初始化吉米单位
        // 参数依次为：单位描述("Gm")、基本单位元素列表([m^1])、转换因子(1.0E9)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}