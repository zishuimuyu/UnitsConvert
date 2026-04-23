package com.zishuimuyu.science.units.pressure;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 压强单位：Pa（帕斯卡）
 * <P>
 * 帕斯卡是国际单位制中压强的基本导出单位，符号为Pa。
 * 1帕斯卡定义为1牛顿的力作用在1平方米面积上所产生的压强。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 Pa = 1 N/m² = 1 Kg·m⁻¹·s⁻²（千克·米⁻¹·秒⁻²）</li>
 *   <li>1 MPa = 1,000,000 Pa（兆帕）</li>
 *   <li>1 bar = 100,000 Pa</li>
 *   <li>1 atm = 101,325 Pa（标准大气压）</li>
 *   <li>1 psi ≈ 6,895 Pa（磅/平方英寸）</li>
 * </ul>
 * <P>
 * 帕斯卡单位广泛应用于科学和工程领域，特别是在流体力学、材料科学、气象学等领域。
 * 在工程实践中，常用更大的单位如kPa（千帕）或MPa（兆帕）来表示较大的压强值。
 * <P>
 * 该单位以法国数学家、物理学家布莱兹·帕斯卡的名字命名，
 * 他在流体静力学方面做出了重要贡献，提出了著名的帕斯卡定律。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPressure_Pa extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义帕斯卡单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为-1  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据P=F/A（压强=力/面积），Pa = N/m² = (Kg·m·s⁻²)/m² = Kg·m⁻¹·s⁻²
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 帕斯卡是压强的标准单位，因此转换因子为1.0。
     * 用于与其他压强单位进行数值转换。
     */
    private final static double factor = 1.0;
    
    /**
     * 附加偏移量
     * <P>
     * 压强单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "Pa";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立帕斯卡单位与基本单位的关系。
     * 根据P=F/A，压强单位由千克、米、秒三个基本单位按特定指数组合而成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, -1.0));  // 米，指数-1
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    /**
     * 构造方法
     * <P>
     * 创建帕斯卡单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     */
    public UPressure_Pa() {
        super(description, elementList, factor, additional);
    }

}