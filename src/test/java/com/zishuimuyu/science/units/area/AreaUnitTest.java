package com.zishuimuyu.science.units.area;

import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.ValueWithUnit;

public class AreaUnitTest {
    
    private static int passed = 0;
    private static int failed = 0;
    
    public static void main(String[] args) {
        System.out.println("=== 面积单位转换测试 ===\n");
        
        testSquareMegameter();
        testSquareKilometer();
        testHectare();
        testSquareMeter();
        testSquareDecimeter();
        testSquareCentimeter();
        testSquareMillimeter();
        testSquareMicrometer();
        testSquareNanometer();
        testSquareFoot();
        testSquareInch();
        testSquareYard();
        testSquareMile();
        testAcre();
        testMu();
        testBarn();
        testAre();
        testCho();
        testFen();
        testQing();
        testRd2();
        testAU2();
        testLy2();
        testPc2();
        
        System.out.println("\n=== 测试结果汇总 ===");
        System.out.println("通过: " + passed);
        System.out.println("失败: " + failed);
        System.out.println("总计: " + (passed + failed));
        
        if (failed > 0) {
            System.out.println("\n⚠ 有测试失败，请检查上述输出！");
            System.exit(1);
        } else {
            System.out.println("\n✓ 所有测试通过！");
        }
    }
    
    private static void testSquareMegameter() {
        System.out.println("--- 测试 平方兆米(Mm²) ---");
        testConversion("1 m² -> Mm²", new UArea_m2(), 1.0, new UArea_SquareMegameter(), 1e-12);
        testConversion("1 Mm² -> m²", new UArea_SquareMegameter(), 1.0, new UArea_m2(), 1e12);
    }
    
    private static void testSquareKilometer() {
        System.out.println("--- 测试 平方公里(km²) ---");
        testConversion("1 m² -> km²", new UArea_m2(), 1.0, new UArea_Km2(), 1e-6);
        testConversion("1 km² -> m²", new UArea_Km2(), 1.0, new UArea_m2(), 1e6);
        testConversion("1 km² -> ha", new UArea_Km2(), 1.0, new UArea_ha(), 100.0);
    }
    
    private static void testHectare() {
        System.out.println("--- 测试 公顷(ha) ---");
        testConversion("1 m² -> ha", new UArea_m2(), 1.0, new UArea_ha(), 1e-4);
        testConversion("1 ha -> m²", new UArea_ha(), 1.0, new UArea_m2(), 10000.0);
    }
    
    private static void testSquareMeter() {
        System.out.println("--- 测试 平方米(m²) ---");
        testConversion("1 m² -> m²", new UArea_m2(), 1.0, new UArea_m2(), 1.0);
    }
    
    private static void testSquareDecimeter() {
        System.out.println("--- 测试 平方分米(dm²) ---");
        testConversion("1 m² -> dm²", new UArea_m2(), 1.0, new UArea_dm2(), 100.0);
        testConversion("1 dm² -> m²", new UArea_dm2(), 1.0, new UArea_m2(), 0.01);
    }
    
    private static void testSquareCentimeter() {
        System.out.println("--- 测试 平方厘米(cm²) ---");
        testConversion("1 m² -> cm²", new UArea_m2(), 1.0, new UArea_cm2(), 10000.0);
        testConversion("1 cm² -> m²", new UArea_cm2(), 1.0, new UArea_m2(), 1e-4);
    }
    
    private static void testSquareMillimeter() {
        System.out.println("--- 测试 平方毫米(mm²) ---");
        testConversion("1 m² -> mm²", new UArea_mm2(), 1.0, new UArea_mm2(), 1.0);
        testConversion("1 mm² -> m²", new UArea_mm2(), 1.0, new UArea_m2(), 1e-6);
    }
    
    private static void testSquareMicrometer() {
        System.out.println("--- 测试 平方微米(μm²) ---");
        testConversion("1 m² -> μm²", new UArea_m2(), 1.0, new UArea_um2(), 1e12);
        testConversion("1 μm² -> m²", new UArea_um2(), 1.0, new UArea_m2(), 1e-12);
    }
    
    private static void testSquareNanometer() {
        System.out.println("--- 测试 平方纳米(nm²) ---");
        testConversion("1 m² -> nm²", new UArea_m2(), 1.0, new UArea_nm2(), 1e18);
        testConversion("1 nm² -> m²", new UArea_nm2(), 1.0, new UArea_m2(), 1e-18);
    }
    
    private static void testSquareFoot() {
        System.out.println("--- 测试 平方英尺(ft²) ---");
        testConversion("1 ft² -> m²", new UArea_ft2(), 1.0, new UArea_m2(), 0.09290304);
        testConversion("1 m² -> ft²", new UArea_m2(), 1.0, new UArea_ft2(), 10.763910417);
    }
    
    private static void testSquareInch() {
        System.out.println("--- 测试 平方英寸(in²) ---");
        testConversion("1 in² -> m²", new UArea_in2(), 1.0, new UArea_m2(), 0.00064516);
        testConversion("1 m² -> in²", new UArea_m2(), 1.0, new UArea_in2(), 1550.0031);
    }
    
    private static void testSquareYard() {
        System.out.println("--- 测试 平方码(yd²) ---");
        testConversion("1 yd² -> m²", new UArea_yd2(), 1.0, new UArea_m2(), 0.83612736);
        testConversion("1 m² -> yd²", new UArea_m2(), 1.0, new UArea_yd2(), 1.195990046);
    }
    
    private static void testSquareMile() {
        System.out.println("--- 测试 平方英里(mi²) ---");
        testConversion("1 mi² -> m²", new UArea_mi2(), 1.0, new UArea_m2(), 2589988.110336);
        testConversion("1 km² -> mi²", new UArea_Km2(), 1.0, new UArea_mi2(), 0.38610215854255);
    }
    
    private static void testAcre() {
        System.out.println("--- 测试 英亩(acre) ---");
        testConversion("1 acre -> m²", new UArea_acre(), 1.0, new UArea_m2(), 4046.8564224);
        testConversion("1 ha -> acre", new UArea_ha(), 1.0, new UArea_acre(), 2.4710538146717);
    }
    
    private static void testMu() {
        System.out.println("--- 测试 市亩(mu) ---");
        testConversion("1 mu -> m²", new UArea_mu(), 1.0, new UArea_m2(), 666.666666667);
        testConversion("1 m² -> mu", new UArea_m2(), 1.0, new UArea_mu(), 0.0015);
        testConversion("1 ha -> mu", new UArea_ha(), 1.0, new UArea_mu(), 15.0);
    }
    
    private static void testBarn() {
        System.out.println("--- 测试 靶恩(barn) ---");
        testConversion("1 barn -> m²", new UArea_barn(), 1.0, new UArea_m2(), 1e-28);
        testConversion("1 m² -> barn", new UArea_m2(), 1.0, new UArea_barn(), 1e28);
    }
    
    private static void testAre() {
        System.out.println("--- 测试 公亩(are) ---");
        testConversion("1 are -> m²", new UArea_are(), 1.0, new UArea_m2(), 100.0);
        testConversion("1 m² -> are", new UArea_m2(), 1.0, new UArea_are(), 0.01);
        testConversion("1 ha -> are", new UArea_ha(), 1.0, new UArea_are(), 100.0);
    }
    
    private static void testCho() {
        System.out.println("--- 测试 町(cho) ---");
        testConversion("1 cho -> m²", new UArea_cho(), 1.0, new UArea_m2(), 991.736);
    }
    
    private static void testFen() {
        System.out.println("--- 测试 分(fen) ---");
        testConversion("1 fen -> m²", new UArea_fen(), 1.0, new UArea_m2(), 66.667);
        testConversion("1 mu -> fen", new UArea_mu(), 1.0, new UArea_fen(), 10.0);
    }
    
    private static void testQing() {
        System.out.println("--- 测试 顷(qing) ---");
        testConversion("1 qing -> m²", new UArea_qing(), 1.0, new UArea_m2(), 66667.0);
        testConversion("1 ha -> qing", new UArea_ha(), 1.0, new UArea_qing(), 0.15);
    }
    
    private static void testRd2() {
        System.out.println("--- 测试 平方杆(rd²) ---");
        testConversion("1 rd² -> m²", new UArea_rd2(), 1.0, new UArea_m2(), 25.29285264);
    }
    
    private static void testAU2() {
        System.out.println("--- 测试 平方天文单位(AU²) ---");
        testConversion("1 AU² -> m²", new UArea_AU2(), 1.0, new UArea_m2(), 2.2379522917974e22);
    }
    
    private static void testLy2() {
        System.out.println("--- 测试 平方光年(ly²) ---");
        testConversion("1 ly² -> m²", new UArea_ly2(), 1.0, new UArea_m2(), 8.95054210748e31);
    }
    
    private static void testPc2() {
        System.out.println("--- 测试 平方秒差距(pc²) ---");
        testConversion("1 pc² -> m²", new UArea_pc2(), 1.0, new UArea_m2(), 9.521408748e32);
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
            System.out.println("✓ " + testName + ": " + actual + " (期望: " + expected + ")");
            passed++;
        } else {
            System.out.println("✗ " + testName + ": " + actual + " (期望: " + expected + ", 误差: " + (relativeError * 100) + "%)");
            failed++;
        }
    }
}