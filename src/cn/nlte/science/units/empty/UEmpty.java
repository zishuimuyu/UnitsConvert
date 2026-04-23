package cn.nlte.science.units.empty;

import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 空单位类：UEmpty
 * <P>
 * 空单位类用于表示无单位或维度为空的情况，通常用作特殊标记或默认值。
 * 这个类可能用于处理无量纲量或者作为某些特殊情况下的占位符。
 * <P>
 * 特性：
 * <ul>
 *   <li>单位描述为null，表示无具体单位符号</li>
 *   <li>转换因子为1.0，不改变数值</li>
 *   <li>基本单位元素列表为空，表示无单位维度</li>
 *   <li>附加偏移量为0.0，无额外偏移</li>
 * </ul>
 * <P>
 * 空单位类在单位转换系统中起到重要作用，可以处理无单位量或作为
 * 单位操作中的特殊情况处理。例如在处理纯数字、比例或百分比时可能会用到。
 * <P>
 * 该类主要用于系统内部逻辑处理，一般不需要直接使用。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UEmpty extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 空单位的基本单位元素列表为空，表示该单位没有维度。
     * 这与有实际物理意义的单位不同，空单位不对应任何基本单位的组合。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 空单位的转换因子为1.0，表示不进行任何数值变换。
     * 由于空单位代表无单位情况，因此不需要转换。
     */
    private final static double factor=1.0;
    
    /**
     * 附加偏移量
     * <P>
     * 空单位的附加偏移量为0.0，表示无零点偏移。
     * 所有单位之间的转换通常只有倍数关系，无零点偏移。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 空单位的描述为null，表示该单位没有具体的符号表示。
     * 这与有实际物理意义的单位不同，空单位不对应任何可显示的符号。
     */
    private final static String description = null;

    /**
     * 构造方法
     * <P>
     * 创建空单位实例，初始化其描述、基本单位组成、转换因子和附加偏移量。
     * 所有参数都是静态定义的常量。
     */
    public UEmpty() {
        super(description, elementList, factor, additional);
    }

}