package testall;

import cn.nlte.science.units.UnitUtils;
import cn.nlte.science.units.ValueWithUnit;
import cn.nlte.science.units.accelerate.UAccelerate_g;
import cn.nlte.science.units.force.UForce_N;
import cn.nlte.science.units.mass.UMass_Kg;

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
 * 示例涵盖了质量、加速度、力、压力等不同类型物理量的单位转换。
 * 通过这个测试类可以了解如何在实际应用中使用单位转换库。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class TestUse {

    /**
     * 主方法，运行单位转换库的功能测试
     * <P>
     * 测试流程：
     * 1. 创建带单位的质量和加速度值
     * 2. 计算力值（F = m * a）
     * 3. 将力值转换为不同的单位制
     * 4. 测试压力单位之间的转换
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