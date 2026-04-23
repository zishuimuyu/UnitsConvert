package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：day（天）
 * <P>
 * 天是时间单位，符号为day。
 * 1天定义为24小时，即86400秒。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 day = 86,400 s（秒）</li>
 *   <li>1 day = 1,440 min（分钟）</li>
 *   <li>1 day = 24 h（小时）</li>
 *   <li>1 day = 86,400,000 ms（毫秒）</li>
 *   <li>1 week = 7 days（周）</li>
 *   <li>1 month ≈ 30.44 days（平均月）</li>
 *   <li>1 year ≈ 365.25 days（平年）</li>
 * </ul>
 * <P>
 * 天单位在日常生活、天文、历法、计划安排等领域有广泛应用，
 * 用于测量较长的时间间隔，如工作日、休息日、项目周期等。
 * 天是人类生活和社会活动的基本时间单位。
 * <P>
 * 该单位适合表示一天左右的时间间隔。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UTime_day extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义天单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <P>
     * 天是时间单位，1天等于86400秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将天数值转换为标准单位（秒）的数值。
     * 由于1day = 24h = 24×3600s = 86400s，所以factor = 3600.0 * 24.0。
     * 这意味着1天等于86400秒。
     */
    private final static double factor = 3600.0 * 24.0;
    
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
    private final static String description = "day";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立天单位与基本单位的关系。
     * 天是时间单位，由秒单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.s, 1.0));  // 秒，指数1
    }

    public UTime_day() {
        super(description, elementList, factor, additional);
    }

}