package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：cun（寸）
 * <p>
 * 寸是中国传统的长度单位，符号为cun。
 * 1寸定义为0.1尺，约等于3.333厘米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 cun = 0.1 chi（尺）</li>
 *   <li>1 cun = 10 fen（分）</li>
 *   <li>1 chi = 10 cun（尺）</li>
 *   <li>1 zhang = 100 cun（丈）</li>
 *   <li>1 cun ≈ 3.333 cm（厘米）</li>
 *   <li>1 m = 300 cun</li>
 *   <li>1 in ≈ 0.833 cun</li>
 * </ul>
 * <p>
 * 寸单位在中国传统手工艺、中医、建筑等领域有广泛应用，
 * 特别是在中医针灸中，穴位定位常使用寸作为测量单位。
 * 在传统木工、裁缝等行业中，寸也是常用的测量单位。
 * <p>
 * 该单位在传统工艺和中医领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_cun extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义寸单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 寸是长度单位，1寸等于0.1尺，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将寸数值转换为标准单位（米）的数值。
     * 由于1cun = 0.1chi = 0.1×(1/3)m = 1/30m，所以factor = new ULength_chi().getFactor() * 0.1。
     * 这意味着1寸约等于0.0333米。
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
    private final static String description = "cun";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立寸单位与基本单位的关系。
     * 寸是长度单位，由米单位构成。
     * 转换因子通过尺的转换因子乘以0.1计算得出。
     */
    static {
        factor = new ULength_chi().getFactor() * 0.1;
        // 添加米基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个寸长度单位(cun)实例
     * <p>
     * 初始化寸长度单位，设置单位符号为"cun"，基本单位组成为米，
     * 转换因子约为0.0333（即1cun ≈ 0.0333m），无附加偏移量。
     */
    public ULength_cun() {
        super(description, elementList, factor, additional);
    }

}