package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：h（小时）
 * <P>
 * 小时是时间单位，符号为h。
 * 1小时定义为3600秒，即60分钟。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 h = 3600 s（秒）</li>
 *   <li>1 h = 60 min（分钟）</li>
 *   <li>1 h = 3,600,000 ms（毫秒）</li>
 *   <li>1 day = 24 h（天）</li>
 *   <li>1 week = 168 h（周）</li>
 *   <li>1 s = 1/3600 h</li>
 * </ul>
 * <P>
 * 小时单位在日常生活、工作、交通、天文等领域有广泛应用，
 * 用于测量中等长度的时间间隔，如工作时间、旅行时间、日程安排等。
 * 小时是除了秒以外最常用的时间单位之一。
 * <P>
 * 该单位适合表示中等长度的时间间隔。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UTime_h extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义小时单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <P>
     * 小时是时间单位，1小时等于3600秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将小时数值转换为标准单位（秒）的数值。
     * 由于1h = 60min = 60×60s = 3600s，所以factor = 3600.0。
     * 这意味着1小时等于3600秒。
     */
    private final static double factor = 3600.0;
    
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
    private final static String description = "h";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立小时单位与基本单位的关系。
     * 小时是时间单位，由秒单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.s, 1.0));  // 秒，指数1
    }

    public UTime_h() {
        super(description, elementList, factor, additional);
    }

}