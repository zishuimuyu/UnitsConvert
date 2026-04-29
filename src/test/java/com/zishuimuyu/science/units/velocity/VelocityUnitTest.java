package com.zishuimuyu.science.units.velocity;

import com.zishuimuyu.science.units.ValueWithUnit;
import org.junit.Test;
import static org.junit.Assert.*;

public class VelocityUnitTest {
    private static final double TOLERANCE = 1e-3;

    @Test
    public void testBasicConversions() {
        System.out.println("--- Testing basic velocity conversions ---");
        
        ValueWithUnit mPerS = new ValueWithUnit(1.0, new UVelocity_mPerS());
        
        double kmPerh = mPerS.convertTo(new UVelocity_KmPerh()).getValue();
        System.out.printf("1.0 m/s = %.4f km/h (expected: 3.6 km/h)%n", kmPerh);
        assertEquals(3.6, kmPerh, 0.01);
        
        double miPerh = mPerS.convertTo(new UVelocity_miPerh()).getValue();
        System.out.printf("1.0 m/s = %.4f mi/h (expected: 2.237 mi/h)%n", miPerh);
        assertEquals(2.237, miPerh, 0.01);
        
        double ftPerS = mPerS.convertTo(new UVelocity_ftPerS()).getValue();
        System.out.printf("1.0 m/s = %.4f ft/s (expected: 3.281 ft/s)%n", ftPerS);
        assertEquals(3.281, ftPerS, 0.01);
        
        System.out.println("✓ Basic velocity conversions test passed\n");
    }

    @Test
    public void testHighSpeedConversions() {
        System.out.println("--- Testing high speed conversions ---");
        
        ValueWithUnit kmPerS = new ValueWithUnit(1.0, new UVelocity_KmPerS());
        double mPerS = kmPerS.convertTo(new UVelocity_mPerS()).getValue();
        System.out.printf("1.0 Km/s = %.4f m/s (expected: 1000 m/s)%n", mPerS);
        assertEquals(1000.0, mPerS, 0.1);
        
        double c = kmPerS.convertTo(new UVelocity_c()).getValue();
        System.out.printf("1.0 Km/s = %.10f c (expected: ~3.34e-6 c, 光速的1000分之一)%n", c);
        assertEquals(3.34e-6, c, 1e-8);
        
        System.out.println("✓ High speed conversions test passed\n");
    }

    @Test
    public void testMachConversions() {
        System.out.println("--- Testing Mach number conversions ---");
        
        ValueWithUnit mach1 = new ValueWithUnit(1.0, new UVelocity_Mach());
        double mPerS = mach1.convertTo(new UVelocity_mPerS()).getValue();
        System.out.printf("1.0 Mach = %.4f m/s (expected: 343 m/s)%n", mPerS);
        assertEquals(343.0, mPerS, 1.0);
        
        double kmPerh = mach1.convertTo(new UVelocity_KmPerh()).getValue();
        System.out.printf("1.0 Mach = %.4f km/h (expected: 1234.8 km/h)%n", kmPerh);
        assertEquals(1234.8, kmPerh, 1.0);
        
        System.out.println("✓ Mach conversions test passed\n");
    }

    @Test
    public void testNauticalSpeedConversions() {
        System.out.println("--- Testing nautical speed conversions ---");
        
        ValueWithUnit kn = new ValueWithUnit(1.0, new UVelocity_kn());
        double mPerS = kn.convertTo(new UVelocity_mPerS()).getValue();
        System.out.printf("1.0 knot = %.4f m/s (expected: 0.5144 m/s)%n", mPerS);
        assertEquals(0.5144, mPerS, 0.001);
        
        double nmiPerh = kn.convertTo(new UVelocity_nmiPerh()).getValue();
        System.out.printf("1.0 knot = %.4f nmi/h (expected: 1.0 nmi/h)%n", nmiPerh);
        assertEquals(1.0, nmiPerh, 0.001);
        
        double kmPerh = kn.convertTo(new UVelocity_KmPerh()).getValue();
        System.out.printf("1.0 knot = %.4f km/h (expected: 1.852 km/h)%n", kmPerh);
        assertEquals(1.852, kmPerh, 0.01);
        
        System.out.println("✓ Nautical speed conversions test passed\n");
    }

    @Test
    public void testMetricSubunitConversions() {
        System.out.println("--- Testing metric subunit conversions ---");
        
        ValueWithUnit mPerS = new ValueWithUnit(1.0, new UVelocity_mPerS());
        
        double mmPerS = mPerS.convertTo(new UVelocity_mmPerS()).getValue();
        System.out.printf("1.0 m/s = %.4f mm/s (expected: 1000 mm/s)%n", mmPerS);
        assertEquals(1000.0, mmPerS, 0.1);
        
        double cmPerS = mPerS.convertTo(new UVelocity_cmPerS()).getValue();
        System.out.printf("1.0 m/s = %.4f cm/s (expected: 100 cm/s)%n", cmPerS);
        assertEquals(100.0, cmPerS, 0.1);
        
        double dmPerS = mPerS.convertTo(new UVelocity_dmPerS()).getValue();
        System.out.printf("1.0 m/s = %.4f dm/s (expected: 10 dm/s)%n", dmPerS);
        assertEquals(10.0, dmPerS, 0.1);
        
        System.out.println("✓ Metric subunit conversions test passed\n");
    }

    @Test
    public void testImperialConversions() {
        System.out.println("--- Testing imperial unit conversions ---");
        
        ValueWithUnit ftPerS = new ValueWithUnit(1.0, new UVelocity_ftPerS());
        double mPerS = ftPerS.convertTo(new UVelocity_mPerS()).getValue();
        System.out.printf("1.0 ft/s = %.4f m/s (expected: 0.3048 m/s)%n", mPerS);
        assertEquals(0.3048, mPerS, 0.001);
        
        ValueWithUnit miPerh = new ValueWithUnit(1.0, new UVelocity_miPerh());
        double kmPerh = miPerh.convertTo(new UVelocity_KmPerh()).getValue();
        System.out.printf("1.0 mi/h = %.4f km/h (expected: 1.60934 km/h)%n", kmPerh);
        assertEquals(1.60934, kmPerh, 0.01);
        
        ValueWithUnit ydPerS = new ValueWithUnit(1.0, new UVelocity_ydPerS());
        double mPerS2 = ydPerS.convertTo(new UVelocity_mPerS()).getValue();
        System.out.printf("1.0 yd/s = %.4f m/s (expected: 0.9144 m/s)%n", mPerS2);
        assertEquals(0.9144, mPerS2, 0.001);
        
        System.out.println("✓ Imperial unit conversions test passed\n");
    }

    @Test
    public void testComprehensiveConversion() {
        System.out.println("--- Testing comprehensive velocity conversion ---");
        
        ValueWithUnit baseValue = new ValueWithUnit(1.0, new UVelocity_mPerS());
        
        System.out.println("1 m/s equivalent to:");
        System.out.printf("  - %.2f km/h%n", baseValue.convertTo(new UVelocity_KmPerh()).getValue());
        System.out.printf("  - %.2f mi/h%n", baseValue.convertTo(new UVelocity_miPerh()).getValue());
        System.out.printf("  - %.2f ft/s%n", baseValue.convertTo(new UVelocity_ftPerS()).getValue());
        System.out.printf("  - %.2f in/s%n", baseValue.convertTo(new UVelocity_inPerS()).getValue());
        System.out.printf("  - %.6f Mach%n", baseValue.convertTo(new UVelocity_Mach()).getValue());
        System.out.printf("  - %.6f kn%n", baseValue.convertTo(new UVelocity_kn()).getValue());
        System.out.printf("  - %.0f mm/s%n", baseValue.convertTo(new UVelocity_mmPerS()).getValue());
        System.out.printf("  - %.0f cm/s%n", baseValue.convertTo(new UVelocity_cmPerS()).getValue());
        
        System.out.println("✓ Comprehensive conversion test passed\n");
    }
}