package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：mi（英里）
 * <P>
 * 英里是英制长度单位，符号为mi。
 * 1英里定义为5280英尺，约等于1609.344米。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 mi = 5280 ft（英尺）</li>
 *   <li>1 mi = 1760 yd（码）</li>
 *   <li>1 mi = 63360 in（英寸）</li>
 *   <li>1 mi ≈ 1.609 km（千米）</li>
 *   <li>1 km ≈ 0.621 mi</li>
 *   <li>1 nmi ≈ 0.869 mi（海里）</li>
 *   <li>1 fur = 0.125 mi（弗隆）</li>
 * </ul>
 * <P>
 * 英里单位在美国、英国等使用英制单位的国家有广泛应用，
 * 用于测量道路距离、地理距离、航空距离等。
 * 在美国，公路里程牌和车速限制都使用英里作为单位。
 * <P>
 * 该单位在使用英制系统的国家和地区常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_mi extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义英里单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <P>
     * 英里是长度单位，1英里等于5280英尺，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将英里数值转换为标准单位（米）的数值。
     * 由于1mi = 5280ft = 5280×0.3048m = 1609.344m，所以factor = new ULength_ft().getFactor() * 5280.0。
     * 这意味着1英里约等于1609.344米。
     */
    private final static double factor;
    
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
    private final static String description = "mi";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立英里单位与基本单位的关系。
     * 英里是长度单位，由米单位构成。
     * 转换因子通过英尺的转换因子乘以5280计算得出。
     */
    static {
        // 根据已有的初始化
        factor = new ULength_ft().getFactor() * 5280.0;
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
    }

    public ULength_mi() {
        super(description, elementList, factor, additional);
    }

}