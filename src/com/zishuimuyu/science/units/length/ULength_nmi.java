package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：nmi（海里）
 * <P>
 * 海里是用于航海和航空的距离单位，符号为nmi（nautical mile）。
 * 1海里定义为1852米，这是国际标准值。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 nmi = 1852 m（米）</li>
 *   <li>1 nmi = 1.852 km（千米）</li>
 *   <li>1 nmi ≈ 1.151 mi（英里）</li>
 *   <li>1 nmi = 10 cables（电缆长度）</li>
 *   <li>1 degree of latitude ≈ 60 nmi</li>
 *   <li>1 km ≈ 0.540 nmi</li>
 *   <li>1 mi ≈ 0.869 nmi</li>
 * </ul>
 * <P>
 * 海里单位在航海、航空、海洋测量等领域有广泛应用，
 * 用于测量海上和空中距离。
 * 海里最初定义为地球椭球面上纬度1分（1/60度）所对应的弧长，
 * 现代采用国际标准值1852米。
 * <P>
 * 该单位在航海和航空领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_nmi extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义海里单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <P>
     * 海里是长度单位，1海里等于1852米，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将海里数值转换为标准单位（米）的数值。
     * 由于1nmi = 1852m，所以factor = 1852.0。
     * 这是国际标准定义的海里长度。
     */
    private final static double factor = 1852.0;
    
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
    private final static String description = "nmi";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立海里单位与基本单位的关系。
     * 海里是长度单位，由米单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
    }

    public ULength_nmi() {
        super(description, elementList, factor, additional);
    }

}