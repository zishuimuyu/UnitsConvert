package com.zishuimuyu.science.units.accelerate;

import com.zishuimuyu.science.units.ValueWithUnit;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccelerationUnitTest {
    private static final double TOLERANCE = 1e-3; // 容差设为0.001，适应浮点数精度

    /**
     * 测试厘米/秒²与米/秒²的转换
     */
    @Test
    public void testCmPers2ToMPers2() {
        System.out.println("--- Testing cm/s² to m/s² conversion ---");
        
        // 测试100 cm/s² = 1 m/s²
        ValueWithUnit cmValue = new ValueWithUnit(100.0, new UAccelerate_cmPers2());
        ValueWithUnit mValue = cmValue.convertTo(new UAccelerate_mPers2());
        System.out.printf("100.0 cm/s² -> %.3f m/s² (expected: 1.000 m/s²)%n", mValue.getValue());
        assertEquals(1.0, mValue.getValue(), TOLERANCE);
        
        ValueWithUnit mValue2 = new ValueWithUnit(1.0, new UAccelerate_mPers2());
        ValueWithUnit cmValue2 = mValue2.convertTo(new UAccelerate_cmPers2());
        System.out.printf("1.0 m/s² -> %.1f cm/s² (expected: 100.0 cm/s²)%n", cmValue2.getValue());
        assertEquals(100.0, cmValue2.getValue(), TOLERANCE);
        
        System.out.println("✓ cm/s² and m/s² conversion test passed\n");
    }

    /**
     * 测试毫米/秒²与米/秒²的转换
     */
    @Test
    public void testMmPers2ToMPers2() {
        System.out.println("--- Testing mm/s² to m/s² conversion ---");
        
        // 测试1000 mm/s² = 1 m/s²
        ValueWithUnit mmValue = new ValueWithUnit(1000.0, new UAccelerate_mmPers2());
        ValueWithUnit mValue = mmValue.convertTo(new UAccelerate_mPers2());
        System.out.printf("1000.0 mm/s² -> %.3f m/s² (expected: 1.000 m/s²)%n", mValue.getValue());
        assertEquals(1.0, mValue.getValue(), TOLERANCE);
        
        ValueWithUnit mValue2 = new ValueWithUnit(1.0, new UAccelerate_mPers2());
        ValueWithUnit mmValue2 = mValue2.convertTo(new UAccelerate_mmPers2());
        System.out.printf("1.0 m/s² -> %.1f mm/s² (expected: 1000.0 mm/s²)%n", mmValue2.getValue());
        assertEquals(1000.0, mmValue2.getValue(), TOLERANCE);
        
        System.out.println("✓ mm/s² and m/s² conversion test passed\n");
    }

    /**
     * 测试伽与米/秒²的转换
     */
    @Test
    public void testGalToMPers2() {
        System.out.println("--- Testing gal to m/s² conversion ---");
        
        // 测试100 gal = 1 m/s²
        ValueWithUnit galValue = new ValueWithUnit(100.0, new UAccelerate_gal());
        ValueWithUnit mValue = galValue.convertTo(new UAccelerate_mPers2());
        System.out.printf("100.0 gal -> %.3f m/s² (expected: 1.000 m/s²)%n", mValue.getValue());
        assertEquals(1.0, mValue.getValue(), TOLERANCE);
        
        ValueWithUnit mValue2 = new ValueWithUnit(1.0, new UAccelerate_mPers2());
        ValueWithUnit galValue2 = mValue2.convertTo(new UAccelerate_gal());
        System.out.printf("1.0 m/s² -> %.1f gal (expected: 100.0 gal)%n", galValue2.getValue());
        assertEquals(100.0, galValue2.getValue(), TOLERANCE);
        
        System.out.println("✓ gal and m/s² conversion test passed\n");
    }

    /**
     * 测试厘米/秒²与伽的等价关系
     */
    @Test
    public void testCmPers2AndGalEquivalence() {
        System.out.println("--- Testing cm/s² and gal equivalence ---");
        
        // 测试1 cm/s² = 1 gal
        ValueWithUnit cmValue = new ValueWithUnit(1.0, new UAccelerate_cmPers2());
        ValueWithUnit galValue = cmValue.convertTo(new UAccelerate_gal());
        System.out.printf("1.0 cm/s² -> %.6f gal (expected: 1.000000 gal)%n", galValue.getValue());
        assertEquals(1.0, galValue.getValue(), TOLERANCE);
        
        ValueWithUnit galValue2 = new ValueWithUnit(1.0, new UAccelerate_gal());
        ValueWithUnit cmValue2 = galValue2.convertTo(new UAccelerate_cmPers2());
        System.out.printf("1.0 gal -> %.6f cm/s² (expected: 1.000000 cm/s²)%n", cmValue2.getValue());
        assertEquals(1.0, cmValue2.getValue(), TOLERANCE);
        
        System.out.println("✓ cm/s² and gal equivalence test passed\n");
    }

    /**
     * 测试重力加速度(g)与厘米/秒²的转换
     */
    @Test
    public void testGToCmPers2() {
        System.out.println("--- Testing g to cm/s² conversion ---");
        
        // 测试1 g = 980.665 cm/s²
        ValueWithUnit gValue = new ValueWithUnit(1.0, new UAccelerate_g());
        ValueWithUnit cmValue = gValue.convertTo(new UAccelerate_cmPers2());
        System.out.printf("1.0 g -> %.3f cm/s² (expected: 980.665 cm/s²)%n", cmValue.getValue());
        assertEquals(980.665, cmValue.getValue(), 0.01); // 对较大数值增加容差
        
        ValueWithUnit cmValue2 = new ValueWithUnit(980.665, new UAccelerate_cmPers2());
        ValueWithUnit gValue2 = cmValue2.convertTo(new UAccelerate_g());
        System.out.printf("980.665 cm/s² -> %.6f g (expected: 1.000000 g)%n", gValue2.getValue());
        assertEquals(1.0, gValue2.getValue(), 0.00001);
        
        System.out.println("✓ g and cm/s² conversion test passed\n");
    }

    /**
     * 测试所有加速度单位的综合转换
     */
    @Test
    public void testAllAccelerationUnitsConversion() {
        System.out.println("--- Testing comprehensive conversion of all acceleration units ---");
        
        // 使用1 m/s²作为基准，转换为所有其他单位
        ValueWithUnit baseValue = new ValueWithUnit(1.0, new UAccelerate_mPers2());
        
        // 转换为各种单位
        double cmPers2Value = baseValue.convertTo(new UAccelerate_cmPers2()).getValue();
        double mmPers2Value = baseValue.convertTo(new UAccelerate_mmPers2()).getValue();
        double galValue = baseValue.convertTo(new UAccelerate_gal()).getValue();
        double gValue = baseValue.convertTo(new UAccelerate_g()).getValue();
        double ftPers2Value = baseValue.convertTo(new UAccelerate_ftPers2()).getValue();
        double inPers2Value = baseValue.convertTo(new UAccelerate_inPers2()).getValue();
        
        System.out.printf("1.0 m/s² = %.1f cm/s²%n", cmPers2Value);
        System.out.printf("1.0 m/s² = %.1f mm/s²%n", mmPers2Value);
        System.out.printf("1.0 m/s² = %.1f gal%n", galValue);
        System.out.printf("1.0 m/s² = %.6f g%n", gValue);
        System.out.printf("1.0 m/s² = %.3f ft/s²%n", ftPers2Value);
        System.out.printf("1.0 m/s² = %.2f in/s²%n", inPers2Value);
        
        // 验证理论值
        assertEquals(100.0, cmPers2Value, 0.1);
        assertEquals(1000.0, mmPers2Value, 1.0);
        assertEquals(100.0, galValue, 0.1);
        assertEquals(0.10197, gValue, 0.001);
        assertEquals(3.281, ftPers2Value, 0.01);
        assertEquals(39.37, inPers2Value, 0.1);
        
        System.out.println("✓ Comprehensive acceleration units conversion test passed\n");
    }
}