package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.ValueWithUnit;
import org.junit.Test;
import static org.junit.Assert.*;

public class VolumeUnitTest {
    private static final double TOLERANCE = 1e-6;

    @Test
    public void testBasicVolumeConversions() {
        System.out.println("--- Testing basic volume conversions ---");
        
        ValueWithUnit m3 = new ValueWithUnit(1.0, new UVolume_m3());
        
        double cm3 = m3.convertTo(new UVolume_cm3()).getValue();
        System.out.printf("1.0 m³ = %.4f cm³ (expected: 1,000,000 cm³)%n", cm3);
        assertEquals(1e6, cm3, 1000);
        
        double mm3 = m3.convertTo(new UVolume_mm3()).getValue();
        System.out.printf("1.0 m³ = %.4f mm³ (expected: 1,000,000,000 mm³)%n", mm3);
        assertEquals(1e9, mm3, 1e6);
        
        double L = m3.convertTo(new UVolume_L()).getValue();
        System.out.printf("1.0 m³ = %.4f L (expected: 1000 L)%n", L);
        assertEquals(1000.0, L, 1.0);
        
        System.out.println("✓ Basic volume conversions test passed\n");
    }

    @Test
    public void testLiterConversions() {
        System.out.println("--- Testing liter-based unit conversions ---");
        
        ValueWithUnit L = new ValueWithUnit(1.0, new UVolume_L());
        
        double mL = L.convertTo(new UVolume_mL()).getValue();
        System.out.printf("1.0 L = %.4f mL (expected: 1000 mL)%n", mL);
        assertEquals(1000.0, mL, 1.0);
        
        double cL = L.convertTo(new UVolume_cL()).getValue();
        System.out.printf("1.0 L = %.4f cL (expected: 100 cL)%n", cL);
        assertEquals(100.0, cL, 0.1);
        
        double dL = L.convertTo(new UVolume_dL()).getValue();
        System.out.printf("1.0 L = %.4f dL (expected: 10 dL)%n", dL);
        assertEquals(10.0, dL, 0.01);
        
        double hL = L.convertTo(new UVolume_hL()).getValue();
        System.out.printf("1.0 L = %.6f hL (expected: 0.01 hL)%n", hL);
        assertEquals(0.01, hL, 0.0001);
        
        double daL = L.convertTo(new UVolume_daL()).getValue();
        System.out.printf("1.0 L = %.4f daL (expected: 0.1 daL)%n", daL);
        assertEquals(0.1, daL, 0.001);
        
        System.out.println("✓ Liter conversions test passed\n");
    }

    @Test
    public void testImperialVolumeConversions() {
        System.out.println("--- Testing imperial volume unit conversions ---");
        
        ValueWithUnit gal = new ValueWithUnit(1.0, new UVolume_gal());
        
        double L = gal.convertTo(new UVolume_L()).getValue();
        System.out.printf("1.0 gal = %.4f L (expected: 3.7854 L)%n", L);
        assertEquals(3.7854, L, 0.01);
        
        double flqt = gal.convertTo(new UVolume_flqt()).getValue();
        System.out.printf("1.0 gal = %.4f fl qt (expected: 4 fl qt)%n", flqt);
        assertEquals(4.0, flqt, 0.01);
        
        double flpt = gal.convertTo(new UVolume_flpt()).getValue();
        System.out.printf("1.0 gal = %.4f fl pt (expected: 8 fl pt)%n", flpt);
        assertEquals(8.0, flpt, 0.01);
        
        double floz = gal.convertTo(new UVolume_floz()).getValue();
        System.out.printf("1.0 gal = %.4f fl oz (expected: 133.228 fl oz)%n", floz);
        assertEquals(133.228, floz, 0.1);
        
        System.out.println("✓ Imperial volume conversions test passed\n");
    }

    @Test
    public void testUSDryVolumeConversions() {
        System.out.println("--- Testing US dry volume unit conversions ---");
        
        ValueWithUnit pk = new ValueWithUnit(1.0, new UVolume_pk());
        
        double L = pk.convertTo(new UVolume_L()).getValue();
        System.out.printf("1.0 pk = %.4f L (expected: 8.8098 L)%n", L);
        assertEquals(8.8098, L, 0.01);
        
        double dryqt = pk.convertTo(new UVolume_dryqt()).getValue();
        System.out.printf("1.0 pk = %.4f dry qt (expected: 8 dry qt)%n", dryqt);
        assertEquals(8.0, dryqt, 0.01);
        
        double drygal = pk.convertTo(new UVolume_drygal()).getValue();
        System.out.printf("1.0 pk = %.4f dry gal (expected: 2 dry gal)%n", drygal);
        assertEquals(2.0, drygal, 0.01);
        
        System.out.println("✓ US dry volume conversions test passed\n");
    }

    @Test
    public void testChineseVolumeConversions() {
        System.out.println("--- Testing Chinese traditional volume unit conversions ---");
        
        ValueWithUnit dou = new ValueWithUnit(1.0, new UVolume_dou());
        
        double L = dou.convertTo(new UVolume_L()).getValue();
        System.out.printf("1.0 斗 = %.4f L (expected: 10 L)%n", L);
        assertEquals(10.0, L, 0.01);
        
        double shi = dou.convertTo(new UVolume_shi()).getValue();
        System.out.printf("1.0 斗 = %.4f 石 (expected: 0.1 石)%n", shi);
        assertEquals(0.1, shi, 0.001);
        
        double sheng = dou.convertTo(new UVolume_sheng()).getValue();
        System.out.printf("1.0 斗 = %.4f 合 (expected: 100 合)%n", sheng);
        assertEquals(100.0, sheng, 1.0);
        
        System.out.println("✓ Chinese volume conversions test passed\n");
    }

    @Test
    public void testOilBarrelConversions() {
        System.out.println("--- Testing oil barrel conversions ---");
        
        ValueWithUnit bbl = new ValueWithUnit(1.0, new UVolume_bbl());
        
        double L = bbl.convertTo(new UVolume_L()).getValue();
        System.out.printf("1.0 bbl = %.4f L (expected: 158.987 L)%n", L);
        assertEquals(158.987, L, 0.1);
        
        double gal = bbl.convertTo(new UVolume_gal()).getValue();
        System.out.printf("1.0 bbl = %.4f gal (expected: 42 gal)%n", gal);
        assertEquals(42.0, gal, 0.1);
        
        double m3 = bbl.convertTo(new UVolume_m3()).getValue();
        System.out.printf("1.0 bbl = %.6f m³ (expected: 0.158987 m³)%n", m3);
        assertEquals(0.158987, m3, 0.0001);
        
        System.out.println("✓ Oil barrel conversions test passed\n");
    }

    @Test
    public void testMetricCubicConversions() {
        System.out.println("--- Testing metric cubic unit conversions ---");
        
        ValueWithUnit m3 = new ValueWithUnit(1.0, new UVolume_m3());
        
        double dm3 = m3.convertTo(new UVolume_dm3()).getValue();
        System.out.printf("1.0 m³ = %.4f dm³ (expected: 1000 dm³)%n", dm3);
        assertEquals(1000.0, dm3, 1.0);
        
        double dam3 = m3.convertTo(new UVolume_dam3()).getValue();
        System.out.printf("1.0 m³ = %.6f dam³ (expected: 0.001 dam³)%n", dam3);
        assertEquals(0.001, dam3, 0.000001);
        
        double hm3 = m3.convertTo(new UVolume_hm3()).getValue();
        System.out.printf("1.0 m³ = %.9f hm³ (expected: 1e-6 hm³)%n", hm3);
        assertEquals(1e-6, hm3, 1e-9);
        
        double Km3 = m3.convertTo(new UVolume_Km3()).getValue();
        System.out.printf("1.0 m³ = %.12f Km³ (expected: 1e-9 Km³)%n", Km3);
        assertEquals(1e-9, Km3, 1e-12);
        
        System.out.println("✓ Metric cubic conversions test passed\n");
    }

    @Test
    public void testComprehensiveVolumeConversion() {
        System.out.println("--- Testing comprehensive volume conversion ---");
        
        ValueWithUnit baseValue = new ValueWithUnit(1.0, new UVolume_L());
        
        System.out.println("1 L equivalent to:");
        System.out.printf("  - %.0f mL%n", baseValue.convertTo(new UVolume_mL()).getValue());
        System.out.printf("  - %.1f cm³%n", baseValue.convertTo(new UVolume_cm3()).getValue());
        System.out.printf("  - %.4f gal (US liquid)%n", baseValue.convertTo(new UVolume_gal()).getValue());
        System.out.printf("  - %.3f fl oz (UK)%n", baseValue.convertTo(new UVolume_floz()).getValue());
        System.out.printf("  - %.6f m³%n", baseValue.convertTo(new UVolume_m3()).getValue());
        System.out.printf("  - %.1f 合 (Chinese)%n", baseValue.convertTo(new UVolume_sheng()).getValue());
        
        System.out.println("✓ Comprehensive volume conversion test passed\n");
    }
}