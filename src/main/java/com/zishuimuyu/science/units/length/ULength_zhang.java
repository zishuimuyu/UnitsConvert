package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：zhang（丈）
 * <p>
 * 丈是中国传统的长度单位，符号为zhang。
 * 1丈定义为10尺，约等于3.333米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 zhang = 10 chi（尺）</li>
 *   <li>1 zhang = 100 cun（寸）</li>
 *   <li>1 zhang = 1000 fen（分）</li>
 *   <li>1 li = 150 zhang（里）</li>
 *   <li>1 zhang ≈ 3.333 m（米）</li>
 *   <li>1 m ≈ 0.3 zhang</li>
 *   <li>1 ft ≈ 0.305 zhang</li>
 * </ul>
 * <p>
 * 丈单位在中国古代度量衡体系中占有重要地位，
 * 广泛用于土地测量、建筑规划、布料裁剪等领域。
 * 在古代文献和诗词中，丈是一个常见的长度单位。
 * <p>
 * 该单位在中国传统文化领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_zhang extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义丈单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 丈是长度单位，1丈等于10尺，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将丈数值转换为标准单位（米）的数值。
     * 由于1zhang = 10chi = 10×(1/3)m = 10/3m，所以factor = new ULength_chi().getFactor() * 10.0。
     * 这意味着1丈约等于3.333米。
     */
    private final static double factor;

    /**
     * 附加偏移量
     * <p>
     * 长度单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "zhang";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立丈单位与基本单位的关系。
     * 丈是长度单位，由米单位构成。
     * 转换因子通过尺的转换因子乘以10计算得出。
     */
    static {
        factor = new ULength_chi().getFactor() * 10.0;
        // 添加米基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个丈长度单位(zhang)实例
     * <p>
     * 初始化丈长度单位，设置单位符号为"zhang"，基本单位组成为米，
     * 转换因子约为3.333（即1zhang ≈ 3.333m），无附加偏移量。
     */
    public ULength_zhang() {
        super(description, elementList, factor, additional);
    }

}