package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：fen（分）
 * <P>
 * 分是中国传统的长度单位，符号为fen。
 * 1分定义为0.01尺，约等于0.003333米。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 fen = 0.003333 m（米）</li>
 *   <li>1 fen = 0.3333 mm（毫米）</li>
 *   <li>1 cun = 10 fen（寸）</li>
 *   <li>1 chi = 100 fen（尺）</li>
 *   <li>1 zhang = 1000 fen（丈）</li>
 *   <li>1 chi = 10 fen</li>
 *   <li>1 in ≈ 8.333 fen</li>
 * </ul>
 * <P>
 * 分单位在中国传统工艺、裁缝、精密测量等领域有应用，
 * 用于表示非常精细的长度，特别是在传统手工艺制作中。
 * 在古代中国的度量衡体系中，分是较小的长度单位之一。
 * <P>
 * 该单位在中国传统文化和传统工艺领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_fen extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义分单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <P>
     * 分是长度单位，1分等于0.01尺，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将分数值转换为标准单位（米）的数值。
     * 由于1fen = 0.01尺 = 0.01×(1/3)m = 0.003333m，所以factor = new ULength_chi().getFactor() * 0.01。
     * 这意味着1分约等于0.003333米。
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
    private final static String description = "fen";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立分单位与基本单位的关系。
     * 分是长度单位，由米单位构成。
     * 转换因子通过尺的转换因子乘以0.01计算得出。
     */
    static {
        factor = new ULength_chi().getFactor() * 0.01;
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
    }

    public ULength_fen() {
        super(description, elementList, factor, additional);
    }

}