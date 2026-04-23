package com.zishuimuyu.science;

import com.zishuimuyu.science.units.UnitUtils;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.accelerate.UAccelerate_g;
import com.zishuimuyu.science.units.force.UForce_N;
import com.zishuimuyu.science.units.mass.UMass_Kg;

/**
 * 单位转换系统测试类
 * <P>
 * 该类演示了单位转换库的基本使用方法，包括：
 * <ul>
 *   <li>创建带单位的数值对象</li>
 *   <li>进行带单位的数学运算</li>
 *   <li>在不同单位之间进行转换</li>
 *   <li>使用工厂方法获取单位实例</li>
 * </ul>
 * <P>
 * 示例：测试质量、加速度、力等不同物理量的单位转换
 * 通过该示例可以了解如何使用库中的各种单位转换功能。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class TestUse {

    /**
     * 测试程序入口点
     * <P>
     * 测试流程：
     * 1. 创建带单位的质量和加速度值
     * 2. 计算数值（F = m * a）
     * 3. 将数值转换为不同的单位制
     * 4. 验证转换结果的准确性
     *
     * @param args 命令行参数，未使用
     */
    public static void main(String[] args) {
        // 定义带单位的数据 - 2.0千克的质量
        ValueWithUnit mass = new ValueWithUnit(2.0, new UMass_Kg());
        // 定义带单位的数据 - 1.0重力加速度(g)
        ValueWithUnit accelerate = new ValueWithUnit(1.0, new UAccelerate_g());
        
        // 带单位的数据计算 - 质量乘以加速度得到力 (F = m * a)
        ValueWithUnit force = mass.multiply(accelerate);
        
        // 将结果转化为牛顿(N)单位制
        force = force.convertTo(new UForce_N());
        System.out.println("Force :" + force.getValue() + force.getUnit().getDescription());
        
        // 采用工厂方法获取单位类，将力值转换为千牛顿(KN)
        force = force.convertTo(UnitUtils.getUnit("UForce_KN"));
        System.out.println("Force :" + force.getValue() + force.getUnit().getDescription());

        // 测试兆帕(MPa)与磅/平方英寸(lbf/in²)的压力单位转换
        ValueWithUnit stress = new ValueWithUnit(1.0, UnitUtils.getUnit("UPressure_MPa"));
        stress = stress.convertTo(UnitUtils.getUnit("UPressure_lbfPerin2"));
        System.out.println("Stress :" + stress.getValue() + stress.getUnit().getDescription());
    }
}