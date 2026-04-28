package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：min（分钟）
 * <p>
 * 分钟是时间单位，符号为min。
 * 1分钟定义为60秒。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 min = 60 s（秒）</li>
 *   <li>1 h = 60 min（小时）</li>
 *   <li>1 day = 1440 min（天）</li>
 *   <li>1 s = 1/60 min</li>
 *   <li>1 ms = 0.001 s = 0.001/60 min</li>
 * </ul>
 * <p>
 * 分钟单位在日常生活、工作、交通、天文等领域有广泛应用，
 * 用于测量中等长度的时间间隔，如会议时间、课程时间、烹饪时间等。
 * 分钟是除了秒以外最常用的时间单位之一。
 * <p>
 * 该单位适合表示中等长度的时间间隔。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月28日
 */
public class UTime_min extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义分钟单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 分钟是时间单位，1分钟等于60秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将分钟数值转换为标准单位（秒）的数值。
     * 由于1min = 60s，所以factor = 60.0。
     * 这意味着1分钟等于60秒。
     */
    private final static double factor = 60.0;

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
    private final static String description = "min";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立分钟单位与基本单位的关系。
     * 分钟是时间单位，由秒单位构成。
     */
    static {
        // 秒，指数1
        elementList.add(new UnitElement(BasicUnit.s, 1.0));
    }

    /**
     * 构造函数，创建一个分钟时间单位(min)实例
     * <p>
     * 初始化分钟时间单位，设置单位符号为"min"，基本单位组成为s，
     * 转换因子为60（即1min = 60s），无附加偏移量。
     */
    public UTime_min() {
        // 调用父类DerivedUnit的构造方法，初始化分钟时间单位
        // 参数依次为：单位描述("min")、基本单位元素列表([s^1])、转换因子(60.0)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}