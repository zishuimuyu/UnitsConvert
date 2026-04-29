package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：lunarMonth（朔望月）
 * <p>
 * 朔望月是天文时间单位，符号为lunarMonth。
 * 1朔望月定义为2,551,443秒，相当于约29.53天，是月相变化的周期。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 lunarMonth ≈ 2,551,443 s（秒）</li>
 *   <li>1 lunarMonth ≈ 29.53 day（天）</li>
 *   <li>1 lunarMonth ≈ 4.22 week（周）</li>
 *   <li>1 year ≈ 12.37 lunarMonth（年）</li>
 *   <li>1 lunarMonth ≈ 708.7 h（小时）</li>
 * </ul>
 * <p>
 * 朔望月单位在天文学、历法制定、潮汐预测、农业安排等领域有重要应用，
 * 用于描述月球相位变化周期、潮汐力影响周期等自然现象。
 * 是许多传统历法（如农历、伊斯兰历）的基础。
 * <p>
 * 该单位反映了月球绕地球运行的自然周期，是人类最早认识的时间单位之一。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UTime_lunarMonth extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义朔望月单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <p>
     * 朔望月与秒具有相同的基本单位组成，只是转换因子不同。
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
     * 初始化朔望月单位的转换参数。
     * 朔望月与秒的转换因子为2,551,443。
     */
    public UTime_lunarMonth() {
        super(
            "朔望月",                        // 描述：朔望月
            elementList,                    // 基本单位元素列表
            2551443.0,                    // 转换因子：1 lunarMonth ≈ 2,551,443 s
            0.0                           // 偏移量：无偏移
        );
    }
}