package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：ms（毫秒）
 * <p>
 * 毫秒是时间单位，符号为ms。
 * 1毫秒定义为0.001秒，即1秒的千分之一。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ms = 0.001 s（秒）</li>
 *   <li>1 ms = 1000 μs（微秒）</li>
 *   <li>1 s = 1000 ms</li>
 *   <li>1 min = 60,000 ms（分钟）</li>
 *   <li>1 h = 3,600,000 ms（小时）</li>
 *   <li>1 day = 86,400,000 ms（天）</li>
 * </ul>
 * <p>
 * 毫秒单位在计算机科学、电子技术、体育计时等领域有广泛应用，
 * 用于测量短时间间隔，如程序执行时间、网络延迟、反应时间等。
 * 在计算机系统中，毫秒是常用的时间精度单位。
 * <p>
 * 该单位适合表示较短的时间间隔。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UTime_ms extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义毫秒单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 毫秒是时间单位，1毫秒等于0.001秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将毫秒数值转换为标准单位（秒）的数值。
     * 由于1ms = 0.001s = 1×10⁻³s，所以factor = 1.0E-3。
     * 这意味着1毫秒等于0.001秒。
     */
    private final static double factor = 1.0E-3;

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
    private final static String description = "ms";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立毫秒单位与基本单位的关系。
     * 毫秒是时间单位，由秒单位构成。
     */
    static {
        // 秒，指数1
        elementList.add(new UnitElement(BasicUnit.s, 1.0));
    }

    /**
     * 构造函数，创建一个毫秒时间单位(ms)实例
     * <p>
     * 初始化毫秒时间单位，设置单位符号为"ms"，基本单位组成为s，
     * 转换因子为1e-03（即1ms = 0.001s），无附加偏移量。
     */
    public UTime_ms() {
        // 调用父类DerivedUnit的构造方法，初始化毫秒时间单位
        // 参数依次为：单位描述("ms")、基本单位元素列表([s^1])、转换因子(1.0E-3)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}