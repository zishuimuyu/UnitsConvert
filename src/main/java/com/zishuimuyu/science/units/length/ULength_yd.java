package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：yd（码）
 * <p>
 * 码是英制长度单位，符号为yd。
 * 1码定义为36英寸，等于3英尺，约等于0.9144米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 yd = 0.9144 m（米）</li>
 *   <li>1 yd = 3 ft（英尺）</li>
 *   <li>1 yd = 36 in（英寸）</li>
 *   <li>1 yd = 91.44 cm（厘米）</li>
 *   <li>1 mi = 1760 yd（英里）</li>
 *   <li>1 m ≈ 1.094 yd</li>
 *   <li>1 ft = 0.333 yd</li>
 * </ul>
 * <p>
 * 码单位在美国、英国等使用英制单位的国家有广泛应用，
 * 用于测量布料长度、体育场地尺寸（如美式足球场）、
 * 土地测量等。在纺织业中，布料的长度常用码作为单位。
 * 在高尔夫球场设计和体育场馆建设中也经常使用码作为单位。
 * <p>
 * 该单位在使用英制系统的国家和地区常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_yd extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义码单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 码是长度单位，1码等于36英寸，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将码数值转换为标准单位（米）的数值。
     * 由于1yd = 36in = 36×0.0254m = 0.9144m，所以factor = new ULength_in().getFactor() * 36.0。
     * 这意味着1码约等于0.9144米。
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
    private final static String description = "yd";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立码单位与基本单位的关系。
     * 码是长度单位，由米单位构成。
     * 转换因子通过英寸的转换因子乘以36计算得出。
     */
    static {
        factor = new ULength_in().getFactor() * 36.0;
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个码长度单位(yd)实例
     * <p>
     * 初始化码长度单位，设置单位符号为"yd"，基本单位组成为米，
     * 转换因子为0.9144（即1yd = 0.9144m），无附加偏移量。
     */
    public ULength_yd() {
        // 调用父类DerivedUnit的构造方法，初始化码长度单位
        // 参数依次为：单位描述("yd")、基本单位元素列表([m^1])、转换因子(约为0.9144)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}