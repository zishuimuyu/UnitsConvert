package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：fur（弗隆）
 * <p>
 * 弗隆是英制长度单位，符号为fur。
 * 1弗隆定义为0.125英里，等于220码或660英尺。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 fur = 0.125 mi（英里）</li>
 *   <li>1 fur = 220 yd（码）</li>
 *   <li>1 fur = 660 ft（英尺）</li>
 *   <li>1 fur = 7920 in（英寸）</li>
 *   <li>1 mi = 8 fur</li>
 *   <li>1 fur ≈ 201.17 m（米）</li>
 *   <li>1 km ≈ 4.97 fur</li>
 * </ul>
 * <p>
 * 弗隆单位在英国和其他使用英制单位的国家有历史上的广泛应用，
 * 主要用于土地测量、赛马场距离测量等。
 * 在英国，赛马比赛的距离常以弗隆为单位表示。
 * 虽然现在多使用国际单位制，但弗隆在某些传统场合仍有使用。
 * <p>
 * 该单位在英国传统测量领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_fur extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义弗隆单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 弗隆是长度单位，1弗隆等于201.168米，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将弗隆数值转换为标准单位（米）的数值。
     * 由于1fur = 0.125mi = 0.125×1609.344m，所以factor = new ULength_mi().getFactor() * 0.125。
     * 这意味着1弗隆约等于201.17米。
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
    private final static String description = "fur";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立弗隆单位与基本单位的关系。
     * 弗隆是长度单位，由米单位构成。
     * 转换因子通过英里的转换因子乘以0.125计算得出。
     */
    static {
        factor = new ULength_mi().getFactor() * 0.125;
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个弗隆长度单位(fur)实例
     * <p>
     * 初始化弗隆长度单位，设置单位符号为"fur"，基本单位组成为米，
     * 转换因子约为201.17（即1fur ≈ 201.17m），无附加偏移量。
     */
    public ULength_fur() {
        // 调用父类DerivedUnit的构造方法，初始化弗隆长度单位
        // 参数依次为：单位描述("fur")、基本单位元素列表([m^1])、转换因子(约为201.17)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}