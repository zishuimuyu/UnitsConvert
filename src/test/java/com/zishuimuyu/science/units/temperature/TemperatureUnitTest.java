package com.zishuimuyu.science.units.temperature;

import com.zishuimuyu.science.units.ValueWithUnit;

/**
 * 温度单位转换测试类
 * <p>
 * 该类用于测试所有温度单位之间的相互转换功能，
 * 验证新添加的温度单位是否能正确与其他温度单位转换。
 * <p>
 * 测试包括：
 * <ul>
 *   <li>新温度单位与现有温度单位的相互转换</li>
 *   <li>转换精度验证</li>
 *   <li>特殊温度点验证（如水的冰点、沸点等）</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class TemperatureUnitTest {

    // 测试容差值，用于浮点数比较
    private static final double TOLERANCE = 1e-10;

    /**
     * 测试罗氏度与摄氏度的转换
     */
    private static void testRoToC() {
        System.out.println("--- 测试 罗氏度(Rø) 与 摄氏度(C) 转换 ---");
        
        // 测试水的冰点：0°C = 7.5°Rø
        ValueWithUnit roIce = new ValueWithUnit(7.5, new UTemperature_Ro());
        ValueWithUnit cIce = roIce.convertTo(new UTemperature_C());
        System.out.printf("7.5°Rø -> %.2f°C (期望: 0.00°C)%n", cIce.getValue());
        assert Math.abs(cIce.getValue() - 0.0) < TOLERANCE : "冰点转换错误!";
        
        ValueWithUnit cIce2 = new ValueWithUnit(0.0, new UTemperature_C());
        ValueWithUnit roIce2 = cIce2.convertTo(new UTemperature_Ro());
        System.out.printf("0.0°C -> %.1f°Rø (期望: 7.5°Rø)%n", roIce2.getValue());
        assert Math.abs(roIce2.getValue() - 7.5) < TOLERANCE : "冰点反向转换错误!";
        
        // 测试水的沸点：100°C = 60°Rø
        ValueWithUnit roBoil = new ValueWithUnit(60.0, new UTemperature_Ro());
        ValueWithUnit cBoil = roBoil.convertTo(new UTemperature_C());
        System.out.printf("60.0°Rø -> %.2f°C (期望: 100.00°C)%n", cBoil.getValue());
        assert Math.abs(cBoil.getValue() - 100.0) < TOLERANCE : "沸点转换错误!";
        
        ValueWithUnit cBoil2 = new ValueWithUnit(100.0, new UTemperature_C());
        ValueWithUnit roBoil2 = cBoil2.convertTo(new UTemperature_Ro());
        System.out.printf("100.0°C -> %.1f°Rø (期望: 60.0°Rø)%n", roBoil2.getValue());
        assert Math.abs(roBoil2.getValue() - 60.0) < TOLERANCE : "沸点反向转换错误!";
        
        System.out.println("✓ 罗氏度与摄氏度转换测试通过\n");
    }

    /**
     * 测试牛氏度与摄氏度的转换
     */
    private static void testNToC() {
        System.out.println("--- 测试 牛氏度(N) 与 摄氏度(C) 转换 ---");
        
        // 测试雪融化温度：0°C = 0°N
        ValueWithUnit nZero = new ValueWithUnit(0.0, new UTemperature_N());
        ValueWithUnit cZero = nZero.convertTo(new UTemperature_C());
        System.out.printf("0.0°N -> %.2f°C (期望: 0.00°C)%n", cZero.getValue());
        assert Math.abs(cZero.getValue() - 0.0) < TOLERANCE : "零点转换错误!";
        
        ValueWithUnit cZero2 = new ValueWithUnit(0.0, new UTemperature_C());
        ValueWithUnit nZero2 = cZero2.convertTo(new UTemperature_N());
        System.out.printf("0.0°C -> %.1f°N (期望: 0.0°N)%n", nZero2.getValue());
        assert Math.abs(nZero2.getValue() - 0.0) < TOLERANCE : "零点反向转换错误!";
        
        // 测试水的沸点：100°C = 33°N
        ValueWithUnit nBoil = new ValueWithUnit(33.0, new UTemperature_N());
        ValueWithUnit cBoil = nBoil.convertTo(new UTemperature_C());
        System.out.printf("33.0°N -> %.2f°C (期望: 100.00°C)%n", cBoil.getValue());
        assert Math.abs(cBoil.getValue() - 100.0) < TOLERANCE : "沸点转换错误!";
        
        ValueWithUnit cBoil2 = new ValueWithUnit(100.0, new UTemperature_C());
        ValueWithUnit nBoil2 = cBoil2.convertTo(new UTemperature_N());
        System.out.printf("100.0°C -> %.1f°N (期望: 33.0°N)%n", nBoil2.getValue());
        assert Math.abs(nBoil2.getValue() - 33.0) < TOLERANCE : "沸点反向转换错误!";
        
        System.out.println("✓ 牛氏度与摄氏度转换测试通过\n");
    }

    /**
     * 测试湿球温度与摄氏度的转换
     */
    private static void testTWToC() {
        System.out.println("--- 测试 湿球温度(W) 与 摄氏度(C) 转换 ---");
        
        // 湿球温度理论上与摄氏度具有相同刻度，转换应为1:1
        ValueWithUnit twTemp = new ValueWithUnit(25.0, new UTemperature_TW());
        ValueWithUnit cTemp = twTemp.convertTo(new UTemperature_C());
        System.out.printf("25.0°W -> %.2f°C (期望: 25.00°C)%n", cTemp.getValue());
        assert Math.abs(cTemp.getValue() - 25.0) < TOLERANCE : "湿球温度转换错误!";
        
        ValueWithUnit cTemp2 = new ValueWithUnit(25.0, new UTemperature_C());
        ValueWithUnit twTemp2 = cTemp2.convertTo(new UTemperature_TW());
        System.out.printf("25.0°C -> %.2f°W (期望: 25.00°W)%n", twTemp2.getValue());
        assert Math.abs(twTemp2.getValue() - 25.0) < TOLERANCE : "湿球温度反向转换错误!";
        
        System.out.println("✓ 湿球温度与摄氏度转换测试通过\n");
    }

    /**
     * 测试罗氏度与华氏度的转换
     */
    private static void testRoToF() {
        System.out.println("--- 测试 罗氏度(Rø) 与 华氏度(F) 转换 ---");
        
        // 测试水的冰点：32°F = 7.5°Rø
        ValueWithUnit roIce = new ValueWithUnit(7.5, new UTemperature_Ro());
        ValueWithUnit fIce = roIce.convertTo(new UTemperature_F());
        System.out.printf("7.5°Rø -> %.2f°F (期望: 32.00°F)%n", fIce.getValue());
        assert Math.abs(fIce.getValue() - 32.0) < TOLERANCE : "冰点转换错误!";
        
        ValueWithUnit fIce2 = new ValueWithUnit(32.0, new UTemperature_F());
        ValueWithUnit roIce2 = fIce2.convertTo(new UTemperature_Ro());
        System.out.printf("32.0°F -> %.1f°Rø (期望: 7.5°Rø)%n", roIce2.getValue());
        assert Math.abs(roIce2.getValue() - 7.5) < TOLERANCE : "冰点反向转换错误!";
        
        System.out.println("✓ 罗氏度与华氏度转换测试通过\n");
    }

    /**
     * 测试牛氏度与华氏度的转换
     */
    private static void testNToF() {
        System.out.println("--- 测试 牛氏度(N) 与 华氏度(F) 转换 ---");
        
        // 测试雪融化温度：32°F = 0°N
        ValueWithUnit nZero = new ValueWithUnit(0.0, new UTemperature_N());
        ValueWithUnit fZero = nZero.convertTo(new UTemperature_F());
        System.out.printf("0.0°N -> %.2f°F (期望: 32.00°F)%n", fZero.getValue());
        assert Math.abs(fZero.getValue() - 32.0) < TOLERANCE : "零点转换错误!";
        
        ValueWithUnit fZero2 = new ValueWithUnit(32.0, new UTemperature_F());
        ValueWithUnit nZero2 = fZero2.convertTo(new UTemperature_N());
        System.out.printf("32.0°F -> %.1f°N (期望: 0.0°N)%n", nZero2.getValue());
        assert Math.abs(nZero2.getValue() - 0.0) < TOLERANCE : "零点反向转换错误!";
        
        System.out.println("✓ 牛氏度与华氏度转换测试通过\n");
    }

    /**
     * 测试德氏度与摄氏度的转换
     */
    private static void testDeToC() {
        System.out.println("--- 测试 德氏度(De) 与 摄氏度(C) 转换 ---");
        
        // 测试水的沸点：100°C = 0°De
        ValueWithUnit deBoil = new ValueWithUnit(0.0, new UTemperature_De());
        ValueWithUnit cBoil = deBoil.convertTo(new UTemperature_C());
        System.out.printf("0.0°De -> %.2f°C (期望: 100.00°C)%n", cBoil.getValue());
        assert Math.abs(cBoil.getValue() - 100.0) < TOLERANCE : "沸点转换错误!";
        
        ValueWithUnit cBoil2 = new ValueWithUnit(100.0, new UTemperature_C());
        ValueWithUnit deBoil2 = cBoil2.convertTo(new UTemperature_De());
        System.out.printf("100.0°C -> %.1f°De (期望: 0.0°De)%n", deBoil2.getValue());
        assert Math.abs(deBoil2.getValue() - 0.0) < TOLERANCE : "沸点反向转换错误!";
        
        // 测试水的融点：0°C = 150°De
        ValueWithUnit deMelt = new ValueWithUnit(150.0, new UTemperature_De());
        ValueWithUnit cMelt = deMelt.convertTo(new UTemperature_C());
        System.out.printf("150.0°De -> %.2f°C (期望: 0.00°C)%n", cMelt.getValue());
        assert Math.abs(cMelt.getValue() - 0.0) < TOLERANCE : "融点转换错误!";
        
        ValueWithUnit cMelt2 = new ValueWithUnit(0.0, new UTemperature_C());
        ValueWithUnit deMelt2 = cMelt2.convertTo(new UTemperature_De());
        System.out.printf("0.0°C -> %.1f°De (期望: 150.0°De)%n", deMelt2.getValue());
        assert Math.abs(deMelt2.getValue() - 150.0) < TOLERANCE : "融点反向转换错误!";
        
        System.out.println("✓ 德氏度与摄氏度转换测试通过\n");
    }

    /**
     * 测试普朗克温度与摄氏度的转换
     */
    private static void testTPToC() {
        System.out.println("--- 测试 普朗克温度(TP) 与 摄氏度(C) 转换 ---");
        
        // 测试绝对零度：0 K = -273.15°C
        // 由于普朗克温度数值非常大，我们测试小数值转换
        ValueWithUnit tpZero = new ValueWithUnit(1.0, new UTemperature_TP());
        ValueWithUnit cZero = tpZero.convertTo(new UTemperature_C());
        double expectedC = 1.416784e32 - 273.15; // 1 TP = 1.416784e32 K, so in °C it's (1.416784e32 - 273.15)
        System.out.printf("1.0 TP -> %.2e°C (期望: %.2e°C)%n", cZero.getValue(), expectedC);
        assert Math.abs(cZero.getValue() - expectedC) < 1e10 : "普朗克温度转换错误!";
        
        ValueWithUnit cLarge = new ValueWithUnit(1.416784e32 - 273.15, new UTemperature_C());
        ValueWithUnit tpFromC = cLarge.convertTo(new UTemperature_TP());
        System.out.printf("%.2e°C -> %.2f TP (期望: 1.00 TP)%n", (1.416784e32 - 273.15), tpFromC.getValue());
        assert Math.abs(tpFromC.getValue() - 1.0) < 1e-33 : "普朗克温度反向转换错误!";
        
        System.out.println("✓ 普朗克温度与摄氏度转换测试通过\n");
    }

    /**
     * 主方法，运行所有测试
     */
    public static void main(String[] args) {
        System.out.println("=== 温度单位转换测试 ===\n");

        try {
            testRoToC();
            testNToC();
            testTWToC();
            testRoToF();
            testNToF();
            testDeToC();
            testTPToC();

            System.out.println("=== 所有测试通过! ===");
        } catch (AssertionError e) {
            System.err.println("❌ 测试失败: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("❌ 测试异常: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}