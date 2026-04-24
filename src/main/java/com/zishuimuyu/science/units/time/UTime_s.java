package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：s（秒）
 * <p>
 * 秒是国际单位制中时间的基本单位，符号为s。
 * 自1967年起，秒的定义基于铯-133原子基态的两个超精细能级之间的电磁辐射周期。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 s = 1,000 ms（毫秒）</li>
 *   <li>1 s = 1,000,000 μs（微秒）</li>
 *   <li>1 min = 60 s（分钟）</li>
 *   <li>1 h = 3,600 s（小时）</li>
 *   <li>1 day = 86,400 s（天）</li>
 * </ul>
 * <p>
 * 秒是国际单位制(SI)七个基本单位之一，是测量时间间隔的基本单位。
 * 在科学、工程、日常生活等各个领域都有广泛应用。
 * <p>
 * 在现代物理学中，秒的精确定义对于GPS导航、通信同步、科学实验等至关重要。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UTime_s extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义秒单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 秒是时间的基本单位，因此只需包含自身。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 秒是时间的标准单位，因此转换因子为1.0。
     * 用于与其他时间单位进行数值转换。
     */
    private final static double factor = 1.0;

    /**
     * 附加偏移量
     * <p>
     * 时间单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "s";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立秒单位与基本单位的关系。
     * 由于秒本身就是基本单位，所以元素列表只包含自身。
     */
    static {
        // 秒，指数1
        elementList.add(new UnitElement(BasicUnit.s, 1.0));
    }

    /**
     * 构造函数，创建一个秒时间单位(s)实例
     * <p>
     * 初始化秒时间单位，设置单位符号为"s"，基本单位组成为s，
     * 转换因子为1（即1s = 1s），无附加偏移量。
     */
    public UTime_s() {
        // 调用父类DerivedUnit的构造方法，初始化秒时间单位
        // 参数依次为：单位描述("s")、基本单位元素列表([s^1])、转换因子(1.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}