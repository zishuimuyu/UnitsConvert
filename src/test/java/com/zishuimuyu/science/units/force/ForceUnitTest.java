package com.zishuimuyu.science.units.force;

import com.zishuimuyu.science.units.ValueWithUnit;

/**
 * 力单位转换测试类
 * 测试新增的力单位转换功能
 */
public class ForceUnitTest {
    private static final double TOLERANCE = 1e-3; // 设置容差为0.001

    public static void main(String[] args) {
        System.out.println("=== 力单位转换测试 ===\n");

        // 测试兆牛顿与牛顿的转换
        testMNToN();
        
        // 测试毫牛顿与牛顿的转换
        testmNToN();
        
        // 测试微牛顿与牛顿的转换
        testuNToN();
        
        // 测试盎司力与牛顿的转换
        testOzfToN();
        
        // 测试短吨力与牛顿的转换
        testSTfToN();
        
        // 测试新单位与其他单位的转换
        testNewUnitsToOtherUnits();

        System.out.println("=== 所有测试通过! ===");
    }

    /**
     * 测试兆牛顿与牛顿的转换
     */
    private static void testMNToN() {
        System.out.println("--- 测试 兆牛顿(MN) 与 牛顿(N) 转换 ---");
        
        // 测试1 MN = 1,000,000 N
        ValueWithUnit mn1 = new ValueWithUnit(1.0, new UForce_MegaNewton());
        ValueWithUnit n1 = mn1.convertTo(new UForce_N());
        System.out.printf("1.0 MN -> %.2f N (期望: 1000000.00 N)%n", n1.getValue());
        assert Math.abs(n1.getValue() - 1000000.0) < TOLERANCE : "兆牛顿转换错误!";
        
        ValueWithUnit n2 = new ValueWithUnit(1000000.0, new UForce_N());
        ValueWithUnit mn2 = n2.convertTo(new UForce_MegaNewton());
        System.out.printf("1000000.0 N -> %.2f MN (期望: 1.00 MN)%n", mn2.getValue());
        assert Math.abs(mn2.getValue() - 1.0) < TOLERANCE : "兆牛顿反向转换错误!";
        
        System.out.println("✓ 兆牛顿与牛顿转换测试通过\n");
    }
    
    /**
     * 测试毫牛顿与牛顿的转换
     */
    private static void testmNToN() {
        System.out.println("--- 测试 毫牛顿(mN) 与 牛顿(N) 转换 ---");
        
        // 测试1 N = 1000 mN
        ValueWithUnit n1 = new ValueWithUnit(1.0, new UForce_N());
        ValueWithUnit mn1 = n1.convertTo(new UForce_mN());
        System.out.printf("1.0 N -> %.2f mN (期望: 1000.00 mN)%n", mn1.getValue());
        assert Math.abs(mn1.getValue() - 1000.0) < TOLERANCE : "毫牛顿转换错误!";
        
        ValueWithUnit mn2 = new ValueWithUnit(1000.0, new UForce_mN());
        ValueWithUnit n2 = mn2.convertTo(new UForce_N());
        System.out.printf("1000.0 mN -> %.3f N (期望: 1.000 N)%n", n2.getValue());
        assert Math.abs(n2.getValue() - 1.0) < TOLERANCE : "毫牛顿反向转换错误!";
        
        System.out.println("✓ 毫牛顿与牛顿转换测试通过\n");
    }
    
    /**
     * 测试微牛顿与牛顿的转换
     */
    private static void testuNToN() {
        System.out.println("--- 测试 微牛顿(uN) 与 牛顿(N) 转换 ---");
        
        // 测试1 N = 1,000,000 uN
        ValueWithUnit n1 = new ValueWithUnit(1.0, new UForce_N());
        ValueWithUnit un1 = n1.convertTo(new UForce_uN());
        System.out.printf("1.0 N -> %.2f uN (期望: 1000000.00 uN)%n", un1.getValue());
        assert Math.abs(un1.getValue() - 1000000.0) < TOLERANCE : "微牛顿转换错误!";
        
        ValueWithUnit un2 = new ValueWithUnit(1000000.0, new UForce_uN());
        ValueWithUnit n2 = un2.convertTo(new UForce_N());
        System.out.printf("1000000.0 uN -> %.6f N (期望: 1.000000 N)%n", n2.getValue());
        assert Math.abs(n2.getValue() - 1.0) < TOLERANCE : "微牛顿反向转换错误!";
        
        System.out.println("✓ 微牛顿与牛顿转换测试通过\n");
    }
    
    /**
     * 测试盎司力与牛顿的转换
     */
    private static void testOzfToN() {
        System.out.println("--- 测试 盎司力(ozf) 与 牛顿(N) 转换 ---");
        
        // 测试1 ozf = 0.278013851 N
        ValueWithUnit ozf1 = new ValueWithUnit(1.0, new UForce_ozf());
        ValueWithUnit n1 = ozf1.convertTo(new UForce_N());
        System.out.printf("1.0 ozf -> %.6f N (期望: 0.278014 N)%n", n1.getValue());
        assert Math.abs(n1.getValue() - 0.278013851) < TOLERANCE : "盎司力转换错误!";
        
        ValueWithUnit n2 = new ValueWithUnit(0.278013851, new UForce_N());
        ValueWithUnit ozf2 = n2.convertTo(new UForce_ozf());
        System.out.printf("0.278013851 N -> %.2f ozf (期望: 1.00 ozf)%n", ozf2.getValue());
        assert Math.abs(ozf2.getValue() - 1.0) < TOLERANCE : "盎司力反向转换错误!";
        
        System.out.println("✓ 盎司力与牛顿转换测试通过\n");
    }
    
    /**
     * 测试短吨力与牛顿的转换
     */
    private static void testSTfToN() {
        System.out.println("--- 测试 短吨力(STf) 与 牛顿(N) 转换 ---");
        
        // 测试1 STf = 8896.44323052 N
        ValueWithUnit stf1 = new ValueWithUnit(1.0, new UForce_STf());
        ValueWithUnit n1 = stf1.convertTo(new UForce_N());
        System.out.printf("1.0 STf -> %.2f N (期望: 8896.44 N)%n", n1.getValue());
        assert Math.abs(n1.getValue() - 8896.44323052) < TOLERANCE : "短吨力转换错误!";
        
        ValueWithUnit n2 = new ValueWithUnit(8896.44323052, new UForce_N());
        ValueWithUnit stf2 = n2.convertTo(new UForce_STf());
        System.out.printf("8896.44323052 N -> %.2f STf (期望: 1.00 STf)%n", stf2.getValue());
        assert Math.abs(stf2.getValue() - 1.0) < TOLERANCE : "短吨力反向转换错误!";
        
        System.out.println("✓ 短吨力与牛顿转换测试通过\n");
    }
    
    /**
     * 测试新单位与其他单位的转换
     */
    private static void testNewUnitsToOtherUnits() {
        System.out.println("--- 测试 新单位与其他单位的转换 ---");
        
        // 测试1 MN = 1000 KN
        ValueWithUnit mn1 = new ValueWithUnit(1.0, new UForce_MegaNewton());
        ValueWithUnit kn1 = mn1.convertTo(new UForce_KN());
        System.out.printf("1.0 MN -> %.2f KN (期望: 1000.00 KN)%n", kn1.getValue());
        assert Math.abs(kn1.getValue() - 1000.0) < TOLERANCE : "兆牛顿到千牛顿转换错误!";
        
        // 测试1 N = 1000 mN
        ValueWithUnit n1 = new ValueWithUnit(1.0, new UForce_N());
        ValueWithUnit mn3 = n1.convertTo(new UForce_mN());
        System.out.printf("1.0 N -> %.2f mN (期望: 1000.00 mN)%n", mn3.getValue());
        assert Math.abs(mn3.getValue() - 1000.0) < TOLERANCE : "牛顿到毫牛顿转换错误!";
        
        // 测试1 lbf = 16 ozf
        ValueWithUnit lbf1 = new ValueWithUnit(1.0, new UForce_lbf());
        ValueWithUnit ozf1 = lbf1.convertTo(new UForce_ozf());
        System.out.printf("1.0 lbf -> %.2f ozf (期望: 16.00 ozf)%n", ozf1.getValue());
        assert Math.abs(ozf1.getValue() - 16.0) < TOLERANCE : "磅力到盎司力转换错误!";
        
        System.out.println("✓ 新单位与其他单位转换测试通过\n");
    }
}