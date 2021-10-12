/*
 * 本源代码知识产权属于北京新叶至恒软件技术有限公司（NLTE）所有。
 * <P>
 * 本项目以Apache License Version 2.0协议发布，鼓励代码共享和尊重原作者的著作权，
 * <P>
 * 同样允许代码修改，再发布（作为开源或商业软件）。
 * <P>
 * 在延伸的代码中（修改和有源代码衍生的代码中）需要带有原来代码中的协议，
 * <P>
 * 商标，不得以任何形式删去“北京新叶至恒软件技术有限公司（NLTE）”的版权声明。
 * <P>
 * 北京新叶至恒软件技术有限公司官方网址：
 * <P>
 *
 *     http://www.nlte.cn
 *
 * <P>
 * NLTE主要服务于石油、化工、核电、建筑等传统企业，致力于传统行业的现代科技化转型，
 * <P>
 * 提供软件培训、软件研发（包括二次研发）、研发咨询、系统架构、高性能计算集群（HPC）搭建等一体化的专业服务。
 * <P>
 * 公司以“专于行业应用，用心铸造永恒”为核心价值。
 */
package cn.nlte.science.units.mass;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：q，公旦
 * <P>
 *
 * @author yetao
 */
public class UMass_q extends DerivedUnit {

    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor = 100.0;
    private final static double additional = 0.0;
    private final static String description = "q";

    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    public UMass_q() {
        super(description, elementList, factor, additional);
    }

}
