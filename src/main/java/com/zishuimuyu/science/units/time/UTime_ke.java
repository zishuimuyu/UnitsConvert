package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：ke（刻）
 * <p>
 * 刻是中国古代计时单位，符号为ke。
 * 1刻定义为900秒，相当于15分钟，是古代计时系统的基本单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ke = 900 s（秒）</li>
 *   <li>1 ke = 15 min（分钟）</li>
 *   <li>1 h = 4 ke（小时）</li>
 *   <li>1 shichen = 8 ke（时辰）</li>
 *   <li>1 day = 96 ke（天）</li>
 * </ul>
 * <p>
 * 刻单位在中国古代广泛应用于宫廷计时、日常生活、军事调度等领域，
 * 是古代中国时间测量系统的重要组成部分。
 * 与日晷、水钟等计时工具配合使用。
 * <p>
 * 该单位体现了中国古代对时间分割的智慧，至今仍在中国文化中有所体现。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTime_ke extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义刻单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 刻与秒具有相同的基本单位组成，只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 静态初始化块
     * <p>
     * 初始化基本单位元素列表，设置单位的量纲构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.s, 1));  // 秒：时间维度
    }

    /**
     * 构造函数
     * <p>
     * 初始化刻单位的转换参数。
     * 刻与秒的转换因子为900。
     */
    public UTime_ke() {
        super(
            "刻",                          // 描述：刻
            elementList,                    // 基本单位元素列表
            900.0,                        // 转换因子：1 ke = 900 s
            0.0                           // 偏移量：无偏移
        );
    }
}