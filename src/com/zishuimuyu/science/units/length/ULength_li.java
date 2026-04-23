package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：li（里）
 * <P>
 * 里是中国传统的长度单位，符号为li。
 * 1里定义为500米。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 li = 500 m（米）</li>
 *   <li>1 li = 1500 chi（尺）</li>
 *   <li>1 li = 1/2 km（公里）</li>
 *   <li>1 km = 2 li</li>
 *   <li>1 mi ≈ 3.2187 li（英里）</li>
 *   <li>1 nmi ≈ 1.852 li（海里）</li>
 * </ul>
 * <P>
 * 里单位在中国历史上是重要的长度单位，虽然现在主要使用国际单位制，
 * 但在某些场合仍会提及。在古代，里是道路距离的常用单位。
 * 该单位在中国传统文化中具有重要意义。
 * <P>
 * 该单位在中国历史文化领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_li extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义里单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <P>
     * 里是长度单位，1里等于500米，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将里数值转换为标准单位（米）的数值。
     * 由于1li = 500m，所以factor = 500.0。
     * 这意味着1里等于500米。
     */
    private final static double factor = 500.0;
    
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
    private final static String description = "li";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立里单位与基本单位的关系。
     * 里是长度单位，由米单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
    }

    public ULength_li() {
        super(description, elementList, factor, additional);
    }

}