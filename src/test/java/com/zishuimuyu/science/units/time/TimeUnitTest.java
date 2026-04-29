package com.zishuimuyu.science.units.time;

import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.ValueWithUnit;

public class TimeUnitTest {

    private static int passCount = 0;
    private static int failCount = 0;
    private static final double TOLERANCE = 1.0E-10;

    public static void main(String[] args) {
        System.out.println("=== 时间单位转换测试 ===\n");

        testYoctosecond();
        testZeptosecond();
        testAttosecond();
        testFemtosecond();
        testPicosecond();
        testNanosecond();
        testMicrosecond();
        testMillisecond();
        testSecond();
        testMinute();
        testHour();
        testDay();
        testWeek();
        testFortnight();
        testMonth();
        testQuarter();
        testKe();
        testShichen();
        testLunarMonth();
        testYear();
        testCentury();
        testMillennium();
        testMegaannum();
        testPlanckTime();

        System.out.println("\n=== 测试结果汇总 ===");
        System.out.println("通过: " + passCount);
        System.out.println("失败: " + failCount);
        System.out.println("总计: " + (passCount + failCount));

        if (failCount == 0) {
            System.out.println("\n✓ 所有测试通过！");
        } else {
            System.out.println("\n✗ 有测试失败！");
        }
    }

    private static void testYoctosecond() {
        System.out.println("--- 测试 幺秒(ys) ---");
        testConversion("1 ys -> s", new UTime_ys(), 1.0, new UTime_s(), 1.0E-24);
        testConversion("1.0E-24 s -> ys", new UTime_s(), 1.0E-24, new UTime_ys(), 1.0);
    }

    private static void testZeptosecond() {
        System.out.println("--- 测试 仄秒(zs) ---");
        testConversion("1 zs -> s", new UTime_zs(), 1.0, new UTime_s(), 1.0E-21);
        testConversion("1.0E-21 s -> zs", new UTime_s(), 1.0E-21, new UTime_zs(), 1.0);
    }

    private static void testAttosecond() {
        System.out.println("--- 测试 阿托秒(as) ---");
        testConversion("1 as -> s", new UTime_as(), 1.0, new UTime_s(), 1.0E-18);
        testConversion("1.0E-18 s -> as", new UTime_s(), 1.0E-18, new UTime_as(), 1.0);
    }

    private static void testFemtosecond() {
        System.out.println("--- 测试 飞秒(fs) ---");
        testConversion("1 fs -> s", new UTime_fs(), 1.0, new UTime_s(), 1.0E-15);
        testConversion("1.0E-15 s -> fs", new UTime_s(), 1.0E-15, new UTime_fs(), 1.0);
    }

    private static void testPicosecond() {
        System.out.println("--- 测试 皮秒(ps) ---");
        testConversion("1 ps -> s", new UTime_ps(), 1.0, new UTime_s(), 1.0E-12);
        testConversion("1.0E-12 s -> ps", new UTime_s(), 1.0E-12, new UTime_ps(), 1.0);
    }

    private static void testNanosecond() {
        System.out.println("--- 测试 纳秒(ns) ---");
        testConversion("1 ns -> s", new UTime_ns(), 1.0, new UTime_s(), 1.0E-9);
        testConversion("1.0E-9 s -> ns", new UTime_s(), 1.0E-9, new UTime_ns(), 1.0);
    }

    private static void testMicrosecond() {
        System.out.println("--- 测试 微秒(μs) ---");
        testConversion("1 μs -> s", new UTime_us(), 1.0, new UTime_s(), 1.0E-6);
        testConversion("1.0E-6 s -> μs", new UTime_s(), 1.0E-6, new UTime_us(), 1.0);
    }

    private static void testMillisecond() {
        System.out.println("--- 测试 毫秒(ms) ---");
        testConversion("1 ms -> s", new UTime_ms(), 1.0, new UTime_s(), 1.0E-3);
        testConversion("1.0E-3 s -> ms", new UTime_s(), 1.0E-3, new UTime_ms(), 1.0);
    }

    private static void testSecond() {
        System.out.println("--- 测试 秒(s) ---");
        testConversion("1 s -> s", new UTime_s(), 1.0, new UTime_s(), 1.0);
    }

    private static void testMinute() {
        System.out.println("--- 测试 分钟(min) ---");
        testConversion("1 min -> s", new UTime_min(), 1.0, new UTime_s(), 60.0);
        testConversion("60 s -> min", new UTime_s(), 60.0, new UTime_min(), 1.0);
    }

    private static void testHour() {
        System.out.println("--- 测试 小时(h) ---");
        testConversion("1 h -> s", new UTime_h(), 1.0, new UTime_s(), 3600.0);
        testConversion("3600 s -> h", new UTime_s(), 3600.0, new UTime_h(), 1.0);
    }

    private static void testDay() {
        System.out.println("--- 测试 天(day) ---");
        testConversion("1 day -> s", new UTime_day(), 1.0, new UTime_s(), 86400.0);
        testConversion("86400 s -> day", new UTime_s(), 86400.0, new UTime_day(), 1.0);
    }

    private static void testWeek() {
        System.out.println("--- 测试 周(week) ---");
        testConversion("1 week -> s", new UTime_week(), 1.0, new UTime_s(), 604800.0);
        testConversion("604800 s -> week", new UTime_s(), 604800.0, new UTime_week(), 1.0);
    }

    private static void testFortnight() {
        System.out.println("--- 测试 两周(fortnight) ---");
        testConversion("1 fortnight -> s", new UTime_fortnight(), 1.0, new UTime_s(), 1209600.0);
        testConversion("1209600 s -> fortnight", new UTime_s(), 1209600.0, new UTime_fortnight(), 1.0);
    }

    private static void testMonth() {
        System.out.println("--- 测试 月(month) ---");
        double monthToS = 2629800.0;  // 原项目实现：30.44天
        testConversion("1 month -> s", new UTime_month(), 1.0, new UTime_s(), monthToS);
        testConversion(monthToS + " s -> month", new UTime_s(), monthToS, new UTime_month(), 1.0);
    }

    private static void testQuarter() {
        System.out.println("--- 测试 季度(quarter) ---");
        double quarterToS = 2629800.0 * 3;  // 原项目实现：3个月
        testConversion("1 quarter -> s", new UTime_quarter(), 1.0, new UTime_s(), quarterToS);
        testConversion(quarterToS + " s -> quarter", new UTime_s(), quarterToS, new UTime_quarter(), 1.0);
    }

    private static void testKe() {
        System.out.println("--- 测试 刻(ke) ---");
        testConversion("1 ke -> s", new UTime_ke(), 1.0, new UTime_s(), 900.0);
        testConversion("900 s -> ke", new UTime_s(), 900.0, new UTime_ke(), 1.0);
    }

    private static void testShichen() {
        System.out.println("--- 测试 时辰(shichen) ---");
        testConversion("1 shichen -> s", new UTime_shichen(), 1.0, new UTime_s(), 7200.0);
        testConversion("7200 s -> shichen", new UTime_s(), 7200.0, new UTime_shichen(), 1.0);
    }

    private static void testLunarMonth() {
        System.out.println("--- 测试 朔望月(lunarMonth) ---");
        double lunarMonthToS = 2551443.0;  // 原项目实现：29.53059天
        testConversion("1 lunarMonth -> s", new UTime_lunarMonth(), 1.0, new UTime_s(), lunarMonthToS);
        testConversion(lunarMonthToS + " s -> lunarMonth", new UTime_s(), lunarMonthToS, new UTime_lunarMonth(), 1.0);
    }

    private static void testYear() {
        System.out.println("--- 测试 年(year) ---");
        double yearToS = 31557600.0;  // 原项目实现：365.25天
        testConversion("1 year -> s", new UTime_year(), 1.0, new UTime_s(), yearToS);
        testConversion(yearToS + " s -> year", new UTime_s(), yearToS, new UTime_year(), 1.0);
    }

    private static void testCentury() {
        System.out.println("--- 测试 世纪(century) ---");
        double centuryToS = 31557600.0 * 100;  // 原项目实现：100年
        testConversion("1 century -> s", new UTime_century(), 1.0, new UTime_s(), centuryToS);
        testConversion(centuryToS + " s -> century", new UTime_s(), centuryToS, new UTime_century(), 1.0);
    }

    private static void testMillennium() {
        System.out.println("--- 测试 千年(millennium) ---");
        double millenniumToS = 31557600.0 * 1000;  // 原项目实现：1000年
        testConversion("1 millennium -> s", new UTime_millennium(), 1.0, new UTime_s(), millenniumToS);
        testConversion(millenniumToS + " s -> millennium", new UTime_s(), millenniumToS, new UTime_millennium(), 1.0);
    }

    private static void testMegaannum() {
        System.out.println("--- 测试 百万年(megaannum) ---");
        double megaannumToS = 31557600.0 * 1000000;  // 原项目实现：100万年
        testConversion("1 megaannum -> s", new UTime_megaannum(), 1.0, new UTime_s(), megaannumToS);
        testConversion(megaannumToS + " s -> megaannum", new UTime_s(), megaannumToS, new UTime_megaannum(), 1.0);
    }

    private static void testPlanckTime() {
        System.out.println("--- 测试 普朗克时间(tP) ---");
        double planckToS = 5.39E-44;
        testConversion("1 tP -> s", new UTime_tP(), 1.0, new UTime_s(), planckToS);
        testConversion(planckToS + " s -> tP", new UTime_s(), planckToS, new UTime_tP(), 1.0);
    }

    private static void testConversion(String description, DerivedUnit fromUnit, double fromValue, DerivedUnit toUnit, double expectedValue) {
        try {
            ValueWithUnit from = new ValueWithUnit(fromValue, fromUnit);
            ValueWithUnit result = from.convertTo(toUnit);
            double actualValue = result.getValue();

            double relativeError = Math.abs((actualValue - expectedValue) / expectedValue);
            boolean passed = relativeError < TOLERANCE || Math.abs(actualValue - expectedValue) < TOLERANCE;

            if (passed) {
                System.out.println("✓ " + description + ": " + actualValue + " (期望: " + expectedValue + ")");
                passCount++;
            } else {
                System.out.println("✗ " + description + ": " + actualValue + " (期望: " + expectedValue + ")");
                failCount++;
            }
        } catch (Exception e) {
            System.out.println("✗ " + description + ": 错误 - " + e.getMessage());
            failCount++;
        }
    }
}