package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：dm（分米）
 * <P>
 * 分米是国际单位制的十进制倍数单位，符号为dm。
 * 1分米定义为0.1米，即1米的十分之一。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 dm = 0.1 m（米）</li>
 *   <li>1 dm = 10 cm（厘米）</li>
 *   <li>1 dm = 100 mm（毫米）</li>
 *   <li>1 dm = 0.0001 Km（千米）</li>
 *   <li>1 m = 10 dm</li>
 *   <li>1 cm = 0.1 dm</li>
 *   <li>1 in ≈ 2.54 dm（英寸）</li>
 * </ul>
 * <P>
 * 分米单位在日常测量和教学中有一定应用，
 * 主要用于补充厘米和米之间的长度单位间隔。
 * 在实际应用中，分米单位使用频率相对较低，
 * 但在某些测量场合仍有其作用。
 * <P>
 * 该单位是国际单位制的合法十进制倍数单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_dm extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义分米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <P>
     * 分米是长度单位，1分米等于0.1米，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将分米数值转换为标准单位（米）的数值。
     * 由于1dm = 0.1m，所以factor = 0.1。
     * 这意味着1分米等于0.1米。
     */
    private final static double factor = 0.1;
    
    /**
     * 附加偏移量
     * <P>
     * 长度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "dm";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立分米单位与基本单位的关系。
     * 分米是长度单位，由米单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
    }

    public ULength_dm() {
        super(description, elementList, factor, additional);
    }

}