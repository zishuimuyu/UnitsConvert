package cn.nlte.science.units.force;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 力单位：dyn（达因）
 * <P>
 * 达因是厘米-克-秒制(CGS)中的力单位，符号为dyn。
 * 1达因定义为使质量为1克的物体产生1厘米/秒²加速度所需的力。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 dyn = 1 g·cm·s⁻²（克·厘米·秒⁻²）</li>
 *   <li>1 dyn = 10⁻⁵ N（牛顿）</li>
 *   <li>1 N = 100,000 dyn（十万达因）</li>
 *   <li>1 kgf ≈ 980,665 dyn</li>
 *   <li>1 lbf ≈ 444,822 dyn</li>
 * </ul>
 * <P>
 * 达因单位在物理学研究、特别是理论物理和天体物理学中仍有使用，
 * 主要用于测量微小的力值，如分子间作用力、表面张力等。
 * 虽然国际单位制已普及，但在某些科学文献中仍可见到达因单位。
 * <P>
 * CGS制是历史上重要的单位制，在电磁学领域曾有广泛应用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UForce_dyn extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义达因单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为1  
     * - 时间单位秒(s)，指数为-2
     * <P>
     * 虽然达因是CGS制单位（基于克、厘米、秒），但在内部表示中仍然使用基本单位千克和米，
     * 通过转换因子factor来实现CGS单位到SI单位的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将达因数值转换为标准单位（牛顿）的数值。
     * 由于1dyn = 1g·cm/s² = 0.001kg × 0.01m/s² = 1×10⁻⁵kg·m/s² = 1×10⁻⁵N，
     * 所以factor = 1.0E-5 = 0.00001。这表示1达因等于0.00001牛顿。
     */
    private final static double factor = 1.0E-5;
    
    /**
     * 附加偏移量
     * <P>
     * 力单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "dyn";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立达因单位与基本单位的关系。
     * 虽然达因是CGS制单位，但其本质仍是质量×长度/时间²的形式，
     * 因此由千克、米、秒三个基本单位按特定指数组合而成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));   // 米，指数1
        elementList.add(new UnitElement(BasicUnit.s, -2.0));  // 秒，指数-2
    }

    public UForce_dyn() {
        super(description, elementList, factor, additional);
    }

}