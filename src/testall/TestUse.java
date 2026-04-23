package testall;

import cn.nlte.science.units.UnitUtils;
import cn.nlte.science.units.ValueWithUnit;
import cn.nlte.science.units.accelerate.UAccelerate_g;
import cn.nlte.science.units.force.UForce_N;
import cn.nlte.science.units.mass.UMass_Kg;
/*
 * 本源代码知识产权属于斯塔克工业（STK）所有。
 * <P>
 * 本项目以Apache License Version 2.0协议发布，鼓励代码共享和尊重原作者的著作权，
 * <P>
 * 同样允许代码修改，再发布（作为开源或商业软件）。
 * <P>
 * 在延伸的代码中（修改和有源代码衍生的代码中）需要带有原来代码中的协议，
 * <P>
 * 商标，不得以任何形式删去“斯塔克工业（STK）”的版权声明。
 * <P>
 * 斯塔克工业官方网址：
 * <P>
 *
 *     http://www.stk.cn
 *
 * <P>
 * STK主要服务于石油、化工、核电、建筑等传统企业，致力于传统行业的现代科技化转型，
 * <P>
 * 提供软件培训、软件研发（包括二次研发）、研发咨询、系统架构、高性能计算集群（HPC）搭建等一体化的专业服务。
 * <P>
 * 公司以“专于行业应用，用心铸造永恒”为核心价值。
 */
/**
 *
 * @author 紫水木鱼
 */
public class TestUse {

    public static void main(String[] args) {
        // 定义带单位的数据
        ValueWithUnit mass = new ValueWithUnit(2.0, new UMass_Kg());
        ValueWithUnit accelerate = new ValueWithUnit(1.0, new UAccelerate_g());
        // 带单位的数据计算
        ValueWithUnit force = mass.multiply(accelerate);
        // 将结果转化为指定的单位制
        force = force.convertTo(new UForce_N());
        System.out.println("Force :" + force.getValue() + force.getUnit().getDescription());
        // 采用工厂方法获取单位类
        force = force.convertTo(UnitUtils.getUnit("UForce_KN"));
        System.out.println("Force :" + force.getValue() + force.getUnit().getDescription());

        // 测试MPa与Ksi的转化
        ValueWithUnit stress = new ValueWithUnit(1.0, UnitUtils.getUnit("UPressure_MPa"));
        stress = stress.convertTo(UnitUtils.getUnit("UPressure_lbfPerin2"));
        System.out.println("Stress :" + stress.getValue() + stress.getUnit().getDescription());
    }
}
