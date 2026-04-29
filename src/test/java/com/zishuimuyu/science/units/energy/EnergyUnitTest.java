package com.zishuimuyu.science.units.energy;

import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.ValueWithUnit;

public class EnergyUnitTest {
    
    private static int passed = 0;
    private static int failed = 0;
    
    public static void main(String[] args) {
        System.out.println("=== 能量单位转换测试 ===\n");
        
        testJoule();
        testElectronVolt();
        testWattHour();
        testBTU();
        testKilocalorie();
        testKilowattHour();
        testTonTNT();
        testGigaJoule();
        testKilogramCoalEquivalent();
        testTonneOilEquivalent();
        testStandardCubicFoot();
        
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
    
    private static void testJoule() {
        System.out.println("--- 测试 焦耳(J) ---");
        testConversion("1 J -> J", new UEnergy_J(), 1.0, new UEnergy_J(), 1.0);
    }
    
    private static void testElectronVolt() {
        System.out.println("--- 测试 电子伏特(eV) ---");
        double evToJ = 1.602176634E-19;
        testConversion("1 eV -> J", new UEnergy_eV(), 1.0, new UEnergy_J(), evToJ);
        testConversion("1 J -> eV", new UEnergy_J(), 1.0, new UEnergy_eV(), 1.0/evToJ);
    }
    
    private static void testWattHour() {
        System.out.println("--- 测试 瓦时(Wh) ---");
        testConversion("1 Wh -> J", new UEnergy_Wh(), 1.0, new UEnergy_J(), 3600.0);
        testConversion("3600 J -> Wh", new UEnergy_J(), 3600.0, new UEnergy_Wh(), 1.0);
    }
    
    private static void testBTU() {
        System.out.println("--- 测试 英热单位(BTU) ---");
        testConversion("1 BTU -> J", new UEnergy_Btn(), 1.0, new UEnergy_J(), 1055.0558526);
        testConversion("1055.0558526 J -> BTU", new UEnergy_J(), 1055.0558526, new UEnergy_Btn(), 1.0);
    }
    
    private static void testKilocalorie() {
        System.out.println("--- 测试 千卡(kcal) ---");
        double kcalToJ = new UEnergy_Kcal().getFactor(); // 获取实际的转换因子
        testConversion("1 kcal -> J", new UEnergy_Kcal(), 1.0, new UEnergy_J(), kcalToJ);
        testConversion(kcalToJ + " J -> kcal", new UEnergy_J(), kcalToJ, new UEnergy_Kcal(), 1.0);
    }
    
    private static void testKilowattHour() {
        System.out.println("--- 测试 千瓦时(kWh) ---");
        testConversion("1 kWh -> J", new UEnergy_KWh(), 1.0, new UEnergy_J(), 3600000.0);
        testConversion("3600000 J -> kWh", new UEnergy_J(), 3600000.0, new UEnergy_KWh(), 1.0);
    }
    
    private static void testTonTNT() {
        System.out.println("--- 测试 吨TNT当量(t TNT) ---");
        double tTNTToJ = 4.184E9;
        testConversion("1 t TNT -> J", new UEnergy_tTNT(), 1.0, new UEnergy_J(), tTNTToJ);
        testConversion("4.184E9 J -> t TNT", new UEnergy_J(), tTNTToJ, new UEnergy_tTNT(), 1.0);
    }
    
    private static void testGigaJoule() {
        System.out.println("--- 测试 吉焦(GJ) ---");
        testConversion("1 GJ -> J", new UEnergy_GJ(), 1.0, new UEnergy_J(), 1.0E9);
        testConversion("1.0E9 J -> GJ", new UEnergy_J(), 1.0E9, new UEnergy_GJ(), 1.0);
    }
    
    private static void testKilogramCoalEquivalent() {
        System.out.println("--- 测试 千克标准煤当量(kgce) ---");
        double kgceToJ = 29260000.0; // 29.26 MJ
        testConversion("1 kgce -> J", new UEnergy_kgce(), 1.0, new UEnergy_J(), kgceToJ);
        testConversion(kgceToJ + " J -> kgce", new UEnergy_J(), kgceToJ, new UEnergy_kgce(), 1.0);
    }
    
    private static void testTonneOilEquivalent() {
        System.out.println("--- 测试 吨油当量(toe) ---");
        double toeToJ = 41868000000.0; // 41.868 GJ
        testConversion("1 toe -> J", new UEnergy_toe(), 1.0, new UEnergy_J(), toeToJ);
        testConversion(toeToJ + " J -> toe", new UEnergy_J(), toeToJ, new UEnergy_toe(), 1.0);
    }
    
    private static void testStandardCubicFoot() {
        System.out.println("--- 测试 标准立方英尺天然气(scf) ---");
        double scfToJ = 1094000.0; // ~1037 BTU
        testConversion("1 scf -> J", new UEnergy_scf(), 1.0, new UEnergy_J(), scfToJ);
        testConversion(scfToJ + " J -> scf", new UEnergy_J(), scfToJ, new UEnergy_scf(), 1.0);
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