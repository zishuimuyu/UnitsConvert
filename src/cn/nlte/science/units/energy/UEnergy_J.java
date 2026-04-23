package cn.nlte.science.units.energy;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 能量单位：J（焦耳）
 * <P>
 * 焦耳是国际单位制中能量、功和热量的基本导出单位，符号为J。
 * 1焦耳定义为用1牛顿的力使物体在力的方向上移动1米所做的功。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 J = 1 N·m = 1 Kg·m²·s⁻²（千克·米²·秒⁻²）</li>
 *   <li>1 J = 1 W·s（瓦特·秒）</li>
 *   <li>1 kJ = 1000 J（千焦）</li>
 *   <li>1 MJ = 1,000,000 J（兆焦）</li>
 *   <li>1 cal ≈ 4.184 J（卡路里）</li>
 *   <li>1 kWh = 3,600,000 J（千瓦时）</li>
 * </ul>
 * <P>
 * 焦耳单位广泛应用于物理学、化学、生物学、工程学等领域，用于测量各种形式的能量，
 * 如机械能、热能、电能、化学能等。在日常生活中，食物的能量含量常以kJ为单位标注。
 * <P>
 * 该单位以英国物理学家詹姆斯·普雷斯科特·焦耳的名字命名，
 * 他研究了热和机械功之间的关系，确立了能量守恒定律。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UEnergy_J extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义焦耳单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 根据W=F·s（功=力×距离），J = N·m = (Kg·m·s⁻²)·m = Kg·m²·s⁻²
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 焦耳是能量的标准单位，因此转换因子为1.0。
     * 用于与其他能量单位进行数值转换。
     */
    private final static double factor = 1.0;
    
    /**
     * 附加偏移量
     * <P>
     * 能量单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "J";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立焦耳单位与基本单位的关系。
     * 根据W=F·s，能量单位由千克、米、秒三个基本单位按特定指数组合而成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 2.0));   // 米，指数2
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    /**
     * 构造方法
     * <P>
     * 创建焦耳单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     */
    public UEnergy_J() {
        super(description, elementList, factor, additional);
    }

}