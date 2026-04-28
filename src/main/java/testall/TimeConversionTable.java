package testall;

import com.zishuimuyu.science.units.UnitUtils;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.time.*;

public class TimeConversionTable {
    public static void main(String[] args) {
        System.out.println("=== 时间单位换算关系表 ===\n");

        // 创建所有时间单位的实例
        ValueWithUnit fs = new ValueWithUnit(1.0, new UTime_fs());      // 1飞秒
        ValueWithUnit ps = new ValueWithUnit(1.0, new UTime_ps());      // 1皮秒
        ValueWithUnit ns = new ValueWithUnit(1.0, new UTime_ns());      // 1纳秒
        ValueWithUnit us = new ValueWithUnit(1.0, new UTime_us());      // 1微秒
        ValueWithUnit ms = new ValueWithUnit(1.0, new UTime_ms());      // 1毫秒
        ValueWithUnit s = new ValueWithUnit(1.0, new UTime_s());        // 1秒
        ValueWithUnit min = new ValueWithUnit(1.0, new UTime_min());    // 1分钟
        ValueWithUnit h = new ValueWithUnit(1.0, new UTime_h());        // 1小时
        ValueWithUnit day = new ValueWithUnit(1.0, new UTime_day());    // 1天
        ValueWithUnit week = new ValueWithUnit(1.0, new UTime_week());  // 1周
        ValueWithUnit month = new ValueWithUnit(1.0, new UTime_month()); // 1月
        ValueWithUnit quarter = new ValueWithUnit(1.0, new UTime_quarter()); // 1季度
        ValueWithUnit year = new ValueWithUnit(1.0, new UTime_year());  // 1年
        ValueWithUnit century = new ValueWithUnit(1.0, new UTime_century()); // 1世纪
        ValueWithUnit millennium = new ValueWithUnit(1.0, new UTime_millennium()); // 1千年
        ValueWithUnit megaannum = new ValueWithUnit(1.0, new UTime_megaannum()); // 1百万年

        // 输出换算关系表
        System.out.println("| 单位名称 | 符号 | 换算关系（秒） | 典型应用场景 |");
        System.out.println("|---------|------|---------------|-------------|");

        // 飞秒
        ValueWithUnit fsToS = fs.convertTo(new UTime_s());
        System.out.printf("| 飞秒 | fs | %.0E s (千万亿分之一秒) | 化学键断裂与形成的瞬间、阿秒物理学的门槛 |\n", fsToS.getValue());

        // 皮秒
        ValueWithUnit psToS = ps.convertTo(new UTime_s());
        System.out.printf("| 皮秒 | ps | %.0E s (万亿分之一秒) | 超高频激光脉冲、半导体物理研究 |\n", psToS.getValue());

        // 纳秒
        ValueWithUnit nsToS = ns.convertTo(new UTime_s());
        System.out.printf("| 纳秒 | ns | %.0E s (十亿分之一秒) | 现代CPU/内存读写速度、光速传播极短距离的时间 |\n", nsToS.getValue());

        // 微秒
        ValueWithUnit usToS = us.convertTo(new UTime_s());
        System.out.printf("| 微秒 | μs | %.0E s (百万分之一秒) | 高速摄像头帧间隔、早期CPU时钟周期 |\n", usToS.getValue());

        // 毫秒
        ValueWithUnit msToS = ms.convertTo(new UTime_s());
        System.out.printf("| 毫秒 | ms | %.3f s (千分之一秒) | 计算机响应时间、日常网络延迟（Ping值） |\n", msToS.getValue());

        // 秒
        System.out.printf("| 秒 | s | %s s (基本单位) | 日常时间计量、国际单位制基本单位 |\n", s.getValue());

        // 分钟
        ValueWithUnit minToS = min.convertTo(new UTime_s());
        System.out.printf("| 分钟 | min | %.0f s | 日常时间段、会议时长 |\n", minToS.getValue());

        // 小时
        ValueWithUnit hToS = h.convertTo(new UTime_s());
        System.out.printf("| 小时 | h | %.0f s | 工作时间、旅行时间 |\n", hToS.getValue());

        // 天
        ValueWithUnit dayToS = day.convertTo(new UTime_s());
        System.out.printf("| 天 | day | %.0f s | 日常生活周期、工作日 |\n", dayToS.getValue());

        // 周
        ValueWithUnit weekToS = week.convertTo(new UTime_s());
        System.out.printf("| 周 | week | %.0f s | 工作周期、学校周次 |\n", weekToS.getValue());

        // 月
        ValueWithUnit monthToS = month.convertTo(new UTime_s());
        System.out.printf("| 月 | month | ~%.0f s | 合同期限、财务结算 |\n", monthToS.getValue());

        // 季度
        ValueWithUnit quarterToS = quarter.convertTo(new UTime_s());
        System.out.printf("| 季度 | quarter | ~%.0f s | 财务报告、预算周期 |\n", quarterToS.getValue());

        // 年
        ValueWithUnit yearToS = year.convertTo(new UTime_s());
        System.out.printf("| 年 | year | ~%.0f s | 年龄计算、历史纪年 |\n", yearToS.getValue());

        // 世纪
        ValueWithUnit centuryToS = century.convertTo(new UTime_s());
        System.out.printf("| 世纪 | century | ~%.0f s | 历史时期、长期规划 |\n", centuryToS.getValue());

        // 千年
        ValueWithUnit millenniumToS = millennium.convertTo(new UTime_s());
        System.out.printf("| 千年 | millennium | ~%.0f s | 文明发展、地质年代 |\n", millenniumToS.getValue());

        // 百万年
        ValueWithUnit megaannumToS = megaannum.convertTo(new UTime_s());
        System.out.printf("| 百万年 | megaannum | ~%.0f s | 地质演化、物种进化 |\n", megaannumToS.getValue());

        System.out.println("\n=== 时间单位换算关系表完成 ===");
    }
}