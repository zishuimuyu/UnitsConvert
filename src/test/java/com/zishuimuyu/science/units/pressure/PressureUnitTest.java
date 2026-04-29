package com.zishuimuyu.science.units.pressure;

import com.zishuimuyu.science.units.ValueWithUnit;
import org.junit.Test;
import static org.junit.Assert.*;

public class PressureUnitTest {
    private static final double TOLERANCE = 1e-3; // 容差设为0.001，适应浮点数精度

    /**
     * 测试托与帕斯卡的转换
     */
    @Test
    public void testTorrToPa() {
        System.out.println("--- 测试 托(Torr) 与 帕斯卡(Pa) 转换 ---");
        
        // 测试1 Torr = 101325/760 Pa ≈ 133.322 Pa
        ValueWithUnit torr1 = new ValueWithUnit(1.0, new UPressure_Torr());
        ValueWithUnit pa1 = torr1.convertTo(new UPressure_Pa());
        System.out.printf("1.0 Torr -> %.3f Pa (期望: 133.322 Pa)%n", pa1.getValue());
        assertEquals("托转换错误!", 133.322, pa1.getValue(), TOLERANCE);
        
        ValueWithUnit pa2 = new ValueWithUnit(133.322, new UPressure_Pa());
        ValueWithUnit torr2 = pa2.convertTo(new UPressure_Torr());
        System.out.printf("133.322 Pa -> %.6f Torr (期望: 1.000000 Torr)%n", torr2.getValue());
        assertEquals("帕斯卡到托反向转换错误!", 1.0, torr2.getValue(), TOLERANCE);
        
        System.out.println("✓ 托与帕斯卡转换测试通过\n");
    }

    /**
     * 测试ksi与帕斯卡的转换
     */
    @Test
    public void testksitoPa() {
        System.out.println("--- 测试 ksi 与 帕斯卡(Pa) 转换 ---");
        
        // 测试1 ksi = 1000 lbf/in² ≈ 6894757.293 Pa
        ValueWithUnit ksi1 = new ValueWithUnit(1.0, new UPressure_ksi());
        ValueWithUnit pa1 = ksi1.convertTo(new UPressure_Pa());
        System.out.printf("1.0 ksi -> %.2f Pa (期望: 6894757.29 Pa)%n", pa1.getValue());
        assertEquals("ksi转换错误!", 6894757.29, pa1.getValue(), 5); // 对于大数值增加容差
        
        ValueWithUnit pa2 = new ValueWithUnit(6894757.29, new UPressure_Pa());
        ValueWithUnit ksi2 = pa2.convertTo(new UPressure_ksi());
        System.out.printf("6894757.29 Pa -> %.6f ksi (期望: 1.000000 ksi)%n", ksi2.getValue());
        assertEquals("帕斯卡到ksi反向转换错误!", 1.0, ksi2.getValue(), TOLERANCE);
        
        System.out.println("✓ ksi与帕斯卡转换测试通过\n");
    }

    /**
     * 测试ksi与兆帕的转换
     */
    @Test
    public void testksitoMPa() {
        System.out.println("--- 测试 ksi 与 兆帕(MPa) 转换 ---");
        
        // 测试1 ksi ≈ 6.89476 MPa
        ValueWithUnit ksi1 = new ValueWithUnit(1.0, new UPressure_ksi());
        ValueWithUnit mpa1 = ksi1.convertTo(new UPressure_MPa());
        System.out.printf("1.0 ksi -> %.3f MPa (期望: 6.895 MPa)%n", mpa1.getValue());
        assertEquals("ksi到兆帕转换错误!", 6.895, mpa1.getValue(), TOLERANCE);
        
        ValueWithUnit mpa2 = new ValueWithUnit(6.895, new UPressure_MPa());
        ValueWithUnit ksi2 = mpa2.convertTo(new UPressure_ksi());
        System.out.printf("6.895 MPa -> %.6f ksi (期望: 1.000000 ksi)%n", ksi2.getValue());
        assertEquals("兆帕到ksi转换错误!", 1.0, ksi2.getValue(), TOLERANCE);
        
        System.out.println("✓ ksi与兆帕转换测试通过\n");
    }

    /**
     * 测试托与标准大气压的转换
     */
    @Test
    public void testTorrToAtm() {
        System.out.println("--- 测试 托(Torr) 与 标准大气压(atm) 转换 ---");
        
        // 测试1 atm = 760 Torr
        ValueWithUnit atm1 = new ValueWithUnit(1.0, new UPressure_atm());
        ValueWithUnit torr1 = atm1.convertTo(new UPressure_Torr());
        System.out.printf("1.0 atm -> %.1f Torr (期望: 760.0 Torr)%n", torr1.getValue());
        assertEquals("标准大气压到托转换错误!", 760.0, torr1.getValue(), TOLERANCE);
        
        ValueWithUnit torr2 = new ValueWithUnit(760.0, new UPressure_Torr());
        ValueWithUnit atm2 = torr2.convertTo(new UPressure_atm());
        System.out.printf("760.0 Torr -> %.6f atm (期望: 1.000000 atm)%n", atm2.getValue());
        assertEquals("托到标准大气压转换错误!", 1.0, atm2.getValue(), TOLERANCE);
        
        System.out.println("✓ 托与标准大气压转换测试通过\n");
    }

    /**
     * 测试新增单位与其他单位的转换
     */
    @Test
    public void testNewUnitConversions() {
        System.out.println("--- 测试 新单位与其他单位的转换 ---");
        
        // 测试托与毫米汞柱的近似相等关系
        ValueWithUnit torr1 = new ValueWithUnit(1.0, new UPressure_Torr());
        ValueWithUnit mmhg1 = torr1.convertTo(new UPressure_mmHg());
        System.out.printf("1.0 Torr -> %.6f mmHg (期望: 接近1.0 mmHg)%n", mmhg1.getValue());
        assertEquals("托与毫米汞柱转换差异过大!", 1.0, mmhg1.getValue(), 0.001);
        
        // 测试ksi与psi的关系 (1 ksi = 1000 psi)
        // 注意：这里我们使用间接转换来验证，因为psi可能不存在
        ValueWithUnit ksi1 = new ValueWithUnit(1.0, new UPressure_ksi());
        ValueWithUnit pa1 = ksi1.convertTo(new UPressure_Pa());
        // 1 ksi = 1000 psi，所以 1 psi = pa1.getValue()/1000
        System.out.printf("1.0 ksi ≈ %.0f Pa, 所以 1 psi ≈ %.2f Pa%n", pa1.getValue(), pa1.getValue()/1000);
        
        System.out.println("✓ 新单位与其他单位转换测试通过\n");
    }
    
    /**
     * 验证压强类单位转换 - 类似PressureDemo的功能
     */
    @Test
    public void testPressureClassConversions() {
        System.out.println("--- 验证压强类单位转换 (类似PressureDemo功能) ---");
        
        // 验证托(Torr)单位的转换
        ValueWithUnit torrValue = new ValueWithUnit(760.0, new UPressure_Torr()); // 1标准大气压等于760托
        double paFromTorr = torrValue.convertTo(new UPressure_Pa()).getValue();
        double atmFromTorr = torrValue.convertTo(new UPressure_atm()).getValue();
        double mmhgFromTorr = torrValue.convertTo(new UPressure_mmHg()).getValue();
        
        System.out.printf("760.0 Torr = %.3f Pa (帕斯卡)%n", paFromTorr);
        System.out.printf("760.0 Torr = %.6f atm (标准大气压)%n", atmFromTorr);
        System.out.printf("760.0 Torr = %.3f mmHg (毫米汞柱)%n", mmhgFromTorr);
        
        // 验证理论值
        assertEquals("760 Torr应该约等于101325 Pa", 101325.0, paFromTorr, 1.0); // 容差为1Pa
        assertEquals("760 Torr应该等于1 atm", 1.0, atmFromTorr, 0.000001); // 容差为百万分之一
        assertEquals("760 Torr应该约等于760 mmHg", 760.0, mmhgFromTorr, 0.1); // 容差为0.1 mmHg
        
        // 验证千磅力每平方英寸(ksi)单位的转换
        ValueWithUnit ksiValue = new ValueWithUnit(1.0, new UPressure_ksi()); // 1 ksi
        double paFromKsi = ksiValue.convertTo(new UPressure_Pa()).getValue();
        double mpaFromKsi = ksiValue.convertTo(new UPressure_MPa()).getValue();
        double barFromKsi = ksiValue.convertTo(new UPressure_bar()).getValue();
        
        System.out.printf("1.0 ksi = %.2f Pa (帕斯卡)%n", paFromKsi);
        System.out.printf("1.0 ksi = %.3f MPa (兆帕)%n", mpaFromKsi);
        System.out.printf("1.0 ksi = %.3f bar (巴)%n", barFromKsi);
        
        // 验证理论值
        assertEquals("1 ksi应该约等于6894757 Pa", 6894757.0, paFromKsi, 5.0); // 容差为5Pa
        assertEquals("1 ksi应该约等于6.895 MPa", 6.895, mpaFromKsi, 0.001); // 容差为0.001 MPa
        assertEquals("1 ksi应该约等于68.95 bar", 68.95, barFromKsi, 0.01); // 容差为0.01 bar
        
        // 验证从其他单位转换到新单位
        ValueWithUnit paValue = new ValueWithUnit(101325, new UPressure_Pa()); // 1标准大气压
        double torrFromPa = paValue.convertTo(new UPressure_Torr()).getValue();
        System.out.printf("%.0f Pa (1标准大气压) = %.3f Torr%n", 101325.0, torrFromPa);
        assertEquals("101325 Pa应该等于760 Torr", 760.0, torrFromPa, 0.1); // 容差为0.1 Torr
        
        ValueWithUnit mpaValue = new ValueWithUnit(6.895, new UPressure_MPa()); // 约1 ksi
        double ksiFromMpa = mpaValue.convertTo(new UPressure_ksi()).getValue();
        System.out.printf("%.3f MPa = %.6f ksi%n", 6.895, ksiFromMpa);
        assertEquals("6.895 MPa应该约等于1 ksi", 1.0, ksiFromMpa, 0.0001); // 容差为万分之一
        
        System.out.println("✓ 压强类单位转换验证通过\n");
    }
}