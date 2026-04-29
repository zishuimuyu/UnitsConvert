package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 面积单位：rd2（平方杆）
 * <p>
 * 平方杆是英制面积单位，符号为rd2。
 * 1平方杆定义为边长为1杆（pole/rod/perch）的正方形所围成的面积。
 * 1杆等于16.5英尺或5.0292米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 rd2 = 25.2928526 m²（平方米）</li>
 *   <li>1 rd2 = 0.00252928526 ha（公顷）</li>
 *   <li>1 rd2 = 30.25 yd²（平方码）</li>
 *   <li>1 rd2 = 272.25 ft²（平方英尺）</li>
 *   <li>1 acre = 160 rd2</li>
 *   <li>1 mi² = 40,000 rd2</li>
 * </ul>
 * <p>
 * 平方杆单位主要用于传统的土地测量，在英国及其前殖民地仍有使用，
 * 特别是在测量小块土地、田界等方面。
 * <p>
 * 该单位在现代土地登记和历史土地记录中仍有一定的应用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UArea_rd2 extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义平方杆单位的基本单位组成：
     * - 长度单位米(m)，指数为2
     * <p>
     * 虽然该单位是平方杆，但在内部表示中仍然使用基本单位米，
     * 通过转换因子factor来实现平方杆到平方米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1杆 = 5.0292米，所以1平方杆 = (5.0292)²平方米 = 25.2928526平方米
     * 转换因子为25.2928526。
     */
    private final static double factor = 25.2928526;

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
    private final static String description = "rd2";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立平方杆面积单位与基本单位的关系。
     */
    static {
        // 米，指数2
        elementList.add(new UnitElement(BasicUnit.m, 2.0));
    }

    /**
     * 构造函数，创建一个平方杆面积单位(rd²)实例
     * <p>
     * 初始化平方杆面积单位，设置单位符号为"rd2"，基本单位组成为m²，
     * 转换因子为25.2928526（即1rd² = 25.2928526m²），无附加偏移量。
     */
    public UArea_rd2() {
        // 调用父类DerivedUnit的构造方法，初始化平方杆面积单位
        // 参数依次为：单位描述("rd2")、基本单位元素列表([m^2])、转换因子(25.2928526)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}