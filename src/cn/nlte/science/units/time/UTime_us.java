package cn.nlte.science.units.time;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：μs（微秒）
 * <P>
 * 微秒是时间单位，符号为μs（有时也写作us）。
 * 1微秒定义为0.000001秒，即1秒的百万分之一。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 μs = 1×10⁻⁶ s（秒）</li>
 *   <li>1 μs = 0.001 ms（毫秒）</li>
 *   <li>1 μs = 1000 ns（纳秒）</li>
 *   <li>1 s = 1,000,000 μs</li>
 *   <li>1 ms = 1000 μs</li>
 * </ul>
 * <P>
 * 微秒单位在电子技术、计算机科学、通信、精密仪器等领域有广泛应用，
 * 用于测量极短的时间间隔，如电路响应时间、信号传输延迟、
 * 高速数据处理时间等。
 * 在高精度定时和高速数据采集系统中，微秒是很重要的时间单位。
 * <P>
 * 该单位适合表示极短的时间间隔。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UTime_us extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义微秒单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <P>
     * 微秒是时间单位，1微秒等于1×10⁻⁶秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将微秒数值转换为标准单位（秒）的数值。
     * 由于1μs = 1×10⁻⁶s，所以factor = 1.0E-6。
     * 这意味着1微秒等于0.000001秒。
     */
    private final static double factor = 1.0E-6;
    
    /**
     * 附加偏移量
     * <P>
     * 时间单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "us";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立微秒单位与基本单位的关系。
     * 微秒是时间单位，由秒单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.s, 1.0));  // 秒，指数1
    }

    public UTime_us() {
        super(description, elementList, factor, additional);
    }

}