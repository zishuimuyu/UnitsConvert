package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.ValueWithUnit;

public class MassUnitTest {
    
    private static int passed = 0;
    private static int failed = 0;
    
    public static void main(String[] args) {
        System.out.println("=== 完整质量单位转换测试 ===\n");
        
        testKilogram();
        testGram();
        testMilligram();
        testMicrogram();
        testNanogram();
        testPicogram();
        testFemtogram();
        testAttogram();
        testAtomicMassUnit();
        testTroyOunce();
        testQuintal();
        testSolarMass();
        testEarthMass();
        testLunarMass();
        testMegagram();
        
        System.out.println("\n=== 测试结果汇总 ===");
        System.out.println("通过: " + passed);
        System.out.println("失败: " + failed);
        System.out.println("总计: " + (passed + failed));
        
        if (failed > 0) {
            System.out.println("\n\u26A0 有测试失败，请检查上述输出！");
            System.exit(1);
        } else {
            System.out.println("\n\u2713 所有测试通过！");
        }
    }
    
    private static void testKilogram() {
        System.out.println("--- 测试 千克(Kg) ---");
        testConversion("1 Kg -> Kg", new UMass_Kg(), 1.0, new UMass_Kg(), 1.0);
    }
    
    private static void testGram() {
        System.out.println("--- 测试 克(g) ---");
        testConversion("1 g -> Kg", new UMass_g(), 1.0, new UMass_Kg(), 0.001);
        testConversion("0.001 Kg -> g", new UMass_Kg(), 0.001, new UMass_g(), 1.0);
    }
    
    private static void testMilligram() {
        System.out.println("--- 测试 毫克(mg) ---");
        testConversion("1 mg -> Kg", new UMass_mg(), 1.0, new UMass_Kg(), 1.0E-6);
        testConversion("1.0E-6 Kg -> mg", new UMass_Kg(), 1.0E-6, new UMass_mg(), 1.0);
    }
    
    private static void testMicrogram() {
        System.out.println("--- 测试 微克(μg) ---");
        testConversion("1 μg -> Kg", new UMass_ug(), 1.0, new UMass_Kg(), 1.0E-9);
        testConversion("1.0E-9 Kg -> μg", new UMass_Kg(), 1.0E-9, new UMass_ug(), 1.0);
    }
    
    private static void testNanogram() {
        System.out.println("--- 测试 纳克(ng) ---");
        testConversion("1 ng -> Kg", new UMass_ng(), 1.0, new UMass_Kg(), 1.0E-12);
        testConversion("1.0E-12 Kg -> ng", new UMass_Kg(), 1.0E-12, new UMass_ng(), 1.0);
    }
    
    private static void testPicogram() {
        System.out.println("--- 测试 皮克(pg) ---");
        testConversion("1 pg -> Kg", new UMass_pg(), 1.0, new UMass_Kg(), 1.0E-15);
        testConversion("1.0E-15 Kg -> pg", new UMass_Kg(), 1.0E-15, new UMass_pg(), 1.0);
    }
    
    private static void testFemtogram() {
        System.out.println("--- 测试 飞克(fg) ---");
        testConversion("1 fg -> Kg", new UMass_fg(), 1.0, new UMass_Kg(), 1.0E-18);
        testConversion("1.0E-18 Kg -> fg", new UMass_Kg(), 1.0E-18, new UMass_fg(), 1.0);
    }
    
    private static void testAttogram() {
        System.out.println("--- 测试 阿托克(ag) ---");
        testConversion("1 ag -> Kg", new UMass_ag(), 1.0, new UMass_Kg(), 1.0E-21);
        testConversion("1.0E-21 Kg -> ag", new UMass_Kg(), 1.0E-21, new UMass_ag(), 1.0);
    }
    
    private static void testAtomicMassUnit() {
        System.out.println("--- 测试 原子质量单位(u) ---");
        double uToKg = 1.66053906660E-27;
        testConversion("1 u -> Kg", new UMass_u(), 1.0, new UMass_Kg(), uToKg);
        testConversion(uToKg + " Kg -> u", new UMass_Kg(), uToKg, new UMass_u(), 1.0);
    }
    
    private static void testTroyOunce() {
        System.out.println("--- 测试 金衡盎司(oz t) ---");
        double ozTToKg = 0.0311034768;
        testConversion("1 oz t -> Kg", new UMass_oz_t(), 1.0, new UMass_Kg(), ozTToKg);
        testConversion(ozTToKg + " Kg -> oz t", new UMass_Kg(), ozTToKg, new UMass_oz_t(), 1.0);
    }
    
    private static void testQuintal() {
        System.out.println("--- 测试 公担(q) ---");
        testConversion("1 q -> Kg", new UMass_q2(), 1.0, new UMass_Kg(), 100.0);
        testConversion("100.0 Kg -> q", new UMass_Kg(), 100.0, new UMass_q2(), 1.0);
    }
    
    private static void testSolarMass() {
        System.out.println("--- 测试 太阳质量(M\u2609) ---");
        double solarMassToKg = 1.98847E30;
        testConversion("1 M\u2609 -> Kg", new UMass_MSun(), 1.0, new UMass_Kg(), solarMassToKg);
        testConversion(solarMassToKg + " Kg -> M\u2609", new UMass_Kg(), solarMassToKg, new UMass_MSun(), 1.0);
    }
    
    private static void testEarthMass() {
        System.out.println("--- 测试 地球质量(ME) ---");
        double earthMassToKg = 5.972E24;
        testConversion("1 ME -> Kg", new UMass_ME(), 1.0, new UMass_Kg(), earthMassToKg);
        testConversion(earthMassToKg + " Kg -> ME", new UMass_Kg(), earthMassToKg, new UMass_ME(), 1.0);
    }
    
    private static void testLunarMass() {
        System.out.println("--- 测试 月球质量(ML) ---");
        double lunarMassToKg = 7.342E22;
        testConversion("1 ML -> Kg", new UMass_ML(), 1.0, new UMass_Kg(), lunarMassToKg);
        testConversion(lunarMassToKg + " Kg -> ML", new UMass_Kg(), lunarMassToKg, new UMass_ML(), 1.0);
    }
    
    private static void testMegagram() {
        System.out.println("--- 测试 兆克(Mg) ---");
        testConversion("1 Mg -> Kg", new UMass_MegaGram(), 1.0, new UMass_Kg(), 1000.0);
        testConversion("1000.0 Kg -> Mg", new UMass_Kg(), 1000.0, new UMass_MegaGram(), 1.0);
    }
    
    private static void testConversion(String testName, DerivedUnit fromUnit, double fromValue, DerivedUnit toUnit, double expected) {
        ValueWithUnit source = new ValueWithUnit(fromValue, fromUnit);
        ValueWithUnit result = source.convertTo(toUnit);
        double actual = result.getValue();
        double absoluteError = Math.abs(actual - expected);
        double tolerance;
        if (expected == 0) {
            tolerance = 1e-20;
        } else if (Math.abs(expected) < 0.1) {
            tolerance = Math.max(1e-10, Math.abs(expected * 1e-3));
        } else if (Math.abs(expected) < 10) {
            tolerance = Math.max(1e-6, Math.abs(expected * 1e-6));
        } else {
            tolerance = Math.abs(expected * 1e-6);
        }
        double relativeError = absoluteError / Math.max(Math.abs(expected), 1e-10);
        
        if (relativeError < tolerance || absoluteError < 1e-6) {
            System.out.println("\u2713 " + testName + ": " + actual + " (期望: " + expected + ")");
            passed++;
        } else {
            System.out.println("\u2717 " + testName + ": " + actual + " (期望: " + expected + ", 误差: " + (relativeError * 100) + "%)");
            failed++;
        }
    }
}