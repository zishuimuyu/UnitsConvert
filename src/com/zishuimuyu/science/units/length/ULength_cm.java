package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：cm（厘米）
 * <P>
 * 厘米是国际单位制中的长度单位，符号为cm。
 * 1厘米定义为0.01米，即1米的百分之一。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 cm = 0.01 m（米）</li>
 *   <li>1 cm = 10 mm（毫米）</li>
 *   <li>1 cm = 0.3937 in（英寸）</li>
 *   <li>1 dm = 10 cm（分米）</li>
 *   <li>1 m = 100 cm（米）</li>
 *   <li>1 km = 100,000 cm（千米）</li>
 *   <li>1 in ≈ 2.54 cm（英寸）</li>
 *   <li>1 ft ≈ 30.48 cm（英尺）</li>
 * </ul>
 * <P>
 * 厘米单位在日常生活、教育、纺织、医疗等领域有广泛应用，
 * 用于测量中等大小的物体长度，如人体身高、纸张尺寸、布料长度等。
 * 在许多国家，厘米是测量人体身高的常用单位。
 * <P>
 * 该单位适合表示中小尺寸的长度。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_cm extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义厘米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <P>
     * 厘米是长度单位，1厘米等于0.01米，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将厘米数值转换为标准单位（米）的数值。
     * 由于1cm = 0.01m，所以factor = 0.01。
     * 这意味着1厘米等于0.01米。
     */
    private final static double factor = 0.01;
    
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
    private final static String description = "cm";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立厘米单位与基本单位的关系。
     * 厘米是长度单位，由米单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
    }

    public ULength_cm() {
        super(description, elementList, factor, additional);
    }

}