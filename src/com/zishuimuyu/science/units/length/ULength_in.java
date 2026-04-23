package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：in（英寸）
 * <P>
 * 英寸是英制长度单位，符号为in。
 * 1英寸定义为25.4毫米，即0.0254米。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 in = 0.0254 m（米）</li>
 *   <li>1 in = 2.54 cm（厘米）</li>
 *   <li>1 in = 25.4 mm（毫米）</li>
 *   <li>1 ft = 12 in（英尺）</li>
 *   <li>1 yd = 36 in（码）</li>
 *   <li>1 m ≈ 39.37 in</li>
 *   <li>1 cm ≈ 0.3937 in</li>
 * </ul>
 * <P>
 * 英寸单位在美国、英国等使用英制单位的国家有广泛应用，
 * 用于测量屏幕尺寸、管道直径、螺栓规格、服装尺寸等。
 * 在电子设备行业，如电视、电脑显示器的对角线尺寸常用英寸表示。
 * 在机械工程中，螺纹规格和管径也常使用英寸。
 * <P>
 * 该单位在使用英制系统的国家和地区常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_in extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义英寸单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <P>
     * 英寸是长度单位，1英寸等于0.0254米，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将英寸数值转换为标准单位（米）的数值。
     * 由于1in = 25.4mm = 25.4×10⁻³m = 0.0254m，所以factor = 25.4E-3。
     * 这意味着1英寸等于0.0254米。
     */
    private final static double factor = 25.4E-3;
    
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
    private final static String description = "in";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立英寸单位与基本单位的关系。
     * 英寸是长度单位，由米单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
    }

    public ULength_in() {
        super(description, elementList, factor, additional);
    }

}