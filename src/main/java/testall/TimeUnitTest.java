package testall;

import com.zishuimuyu.science.units.UnitUtils;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.time.*;

public class TimeUnitTest {
    public static void main(String[] args) {
        System.out.println("=== 时间单位测试 ===");

        // 测试飞秒
        ValueWithUnit fs = new ValueWithUnit(1.0, new UTime_fs());
        ValueWithUnit fs_to_s = fs.convertTo(new UTime_s());
        System.out.println("1 飞秒 = " + fs_to_s.getValue() + " 秒");

        // 测试皮秒
        ValueWithUnit ps = new ValueWithUnit(1.0, new UTime_ps());
        ValueWithUnit ps_to_s = ps.convertTo(new UTime_s());
        System.out.println("1 皮秒 = " + ps_to_s.getValue() + " 秒");

        // 测试纳秒
        ValueWithUnit ns = new ValueWithUnit(1.0, new UTime_ns());
        ValueWithUnit ns_to_s = ns.convertTo(new UTime_s());
        System.out.println("1 纳秒 = " + ns_to_s.getValue() + " 秒");

        // 测试微秒
        ValueWithUnit us = new ValueWithUnit(1.0, new UTime_us());
        ValueWithUnit us_to_s = us.convertTo(new UTime_s());
        System.out.println("1 微秒 = " + us_to_s.getValue() + " 秒");

        // 测试毫秒
        ValueWithUnit ms = new ValueWithUnit(1.0, new UTime_ms());
        ValueWithUnit ms_to_s = ms.convertTo(new UTime_s());
        System.out.println("1 毫秒 = " + ms_to_s.getValue() + " 秒");

        // 测试分钟
        ValueWithUnit min = new ValueWithUnit(1.0, new UTime_min());
        ValueWithUnit min_to_s = min.convertTo(new UTime_s());
        System.out.println("1 分钟 = " + min_to_s.getValue() + " 秒");

        // 测试小时
        ValueWithUnit h = new ValueWithUnit(1.0, new UTime_h());
        ValueWithUnit h_to_s = h.convertTo(new UTime_s());
        System.out.println("1 小时 = " + h_to_s.getValue() + " 秒");

        // 测试天
        ValueWithUnit day = new ValueWithUnit(1.0, new UTime_day());
        ValueWithUnit day_to_s = day.convertTo(new UTime_s());
        System.out.println("1 天 = " + day_to_s.getValue() + " 秒");

        // 测试周
        ValueWithUnit week = new ValueWithUnit(1.0, new UTime_week());
        ValueWithUnit week_to_s = week.convertTo(new UTime_s());
        System.out.println("1 周 = " + week_to_s.getValue() + " 秒");

        // 测试月
        ValueWithUnit month = new ValueWithUnit(1.0, new UTime_month());
        ValueWithUnit month_to_s = month.convertTo(new UTime_s());
        System.out.println("1 月 ≈ " + month_to_s.getValue() + " 秒");

        // 测试季度
        ValueWithUnit quarter = new ValueWithUnit(1.0, new UTime_quarter());
        ValueWithUnit quarter_to_s = quarter.convertTo(new UTime_s());
        System.out.println("1 季度 ≈ " + quarter_to_s.getValue() + " 秒");

        // 测试年
        ValueWithUnit year = new ValueWithUnit(1.0, new UTime_year());
        ValueWithUnit year_to_s = year.convertTo(new UTime_s());
        System.out.println("1 年 ≈ " + year_to_s.getValue() + " 秒");

        // 测试世纪
        ValueWithUnit century = new ValueWithUnit(1.0, new UTime_century());
        ValueWithUnit century_to_s = century.convertTo(new UTime_s());
        System.out.println("1 世纪 ≈ " + century_to_s.getValue() + " 秒");

        // 测试千年
        ValueWithUnit millennium = new ValueWithUnit(1.0, new UTime_millennium());
        ValueWithUnit millennium_to_s = millennium.convertTo(new UTime_s());
        System.out.println("1 千年 ≈ " + millennium_to_s.getValue() + " 秒");

        // 测试百万年
        ValueWithUnit megaannum = new ValueWithUnit(1.0, new UTime_megaannum());
        ValueWithUnit megaannum_to_s = megaannum.convertTo(new UTime_s());
        System.out.println("1 百万年 ≈ " + megaannum_to_s.getValue() + " 秒");

        System.out.println("\n=== 时间单位测试完成 ===");
    }
}