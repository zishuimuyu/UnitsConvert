package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：fortnight（两周）
 * <p>
 * 两周是英制时间单位，符号为fortnight。
 * 1 fortnight定义为1209600秒，相当于14天，是英语国家的常用时间单位。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 fortnight = 1,209,600 s（秒）</li>
 *   <li>1 fortnight = 2 week（周）</li>
 *   <li>1 fortnight = 14 day（天）</li>
 *   <li>1 fortnight = 336 h（小时）</li>
 *   <li>1 fortnight = 20,160 min（分钟）</li>
 * </ul>
 * <p>
 * 两周单位在英国、澳大利亚、新西兰等英语国家广泛应用于工资发放、
 * 租赁合同、休假安排等场合，是一种非正式但常用的时间计量方式。
 * 词源来自"fourteen nights"（十四夜）的缩写。
 * <p>
 * 该单位体现了英语文化中的时间习惯，在现代仍然有一定的使用价值。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTime_fortnight extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义两周单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 两周与秒具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化两周单位的转换参数。
     * 两周与秒的转换因子为1,209,600。
     */
    public UTime_fortnight() {
        super(
            "两周期",                        // 描述：两周期
            elementList,                    // 基本单位元素列表
            1209600.0,                    // 转换因子：1 fortnight = 1,209,600 s
            0.0                           // 偏移量：无偏移
        );
    }
}