package com.zishuimuyu.science.units.power;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 功率单位：W（瓦特）
 * <P>
 * 瓦特是国际单位制中功率的基本导出单位，符号为W。
 * 1瓦特定义为1秒内完成1焦耳的功，即1W = 1J/s。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 W = 1 J/s = 1 Kg·m²·s⁻³（千克·米²·秒⁻³）</li>
 *   <li>1 kW = 1,000 W（千瓦）</li>
 *   <li>1 MW = 1,000,000 W（兆瓦）</li>
 *   <li>1 hp ≈ 745.7 W（马力）</li>
 *   <li>1 PS ≈ 735.5 W（公制马力）</li>
 * </ul>
 * <P>
 * 瓦特单位广泛应用于物理学、工程学、电气工程等领域，用于测量各种设备的功率输出，
 * 如电动机、发电机、加热器、灯泡等。在日常生活中，电器的耗电量通常以瓦特或千瓦表示。
 * <P>
 * 该单位以苏格兰工程师詹姆斯·瓦特的名字命名，他是蒸汽机的重要改进者。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UPower_W extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义瓦特单位的基本单位组成：
     * - 质量单位千克(Kg)，指数为1
     * - 长度单位米(m)，指数为2  
     * - 时间单位秒(s)，指数为-3
     * <P>
     * 根据P=W/t（功率=功/时间），W = J/s = (Kg·m²·s⁻²)/s = Kg·m²·s⁻³
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 瓦特是功率的标准单位，因此转换因子为1.0。
     * 用于与其他功率单位进行数值转换。
     */
    private final static double factor = 1.0;
    
    /**
     * 附加偏移量
     * <P>
     * 功率单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "W";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立瓦特单位与基本单位的关系。
     * 根据P=W/t，功率单位由千克、米、秒三个基本单位按特定指数组合而成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));  // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.m, 2.0));   // 米，指数2
        elementList.add(new UnitElement(BasicUnit.s, -3.0));  // 秒，指数-3
    }

    /**
     * 构造方法
     * <P>
     * 创建瓦特单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     */
    public UPower_W() {
        super(description, elementList, factor, additional);
    }

}