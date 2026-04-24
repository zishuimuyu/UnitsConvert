package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：ft（英尺）
 * <p>
 * 英尺是英制长度单位，符号为ft。
 * 1英尺定义为0.3048米，等于12英寸。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 ft = 0.3048 m（米）</li>
 *   <li>1 ft = 12 in（英寸）</li>
 *   <li>1 yd = 3 ft（码）</li>
 *   <li>1 mi = 5280 ft（英里）</li>
 *   <li>1 m ≈ 3.281 ft</li>
 *   <li>1 cm ≈ 0.0328 ft</li>
 * </ul>
 * <p>
 * 英尺单位在美国、英国等使用英制单位的国家有广泛应用，
 * 用于建筑、工程、航空、航海等领域。
 * 在日常生活中也常用于测量身高、房间尺寸等。
 * <p>
 * 该单位在使用英制系统的国家和地区常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_ft extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义英尺单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 英尺是长度单位，1英尺等于0.3048米，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将英尺数值转换为标准单位（米）的数值。
     * 由于1ft = 0.3048m，所以factor = 0.3048。
     * 这个值通过英寸的转换因子乘以12计算得出。
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
    private final static String description = "ft";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表和转换因子，建立英尺单位与基本单位的关系。
     * 英尺是长度单位，由米单位构成。
     * 转换因子通过英寸的转换因子乘以12计算得出。
     */
    static {
        // 根据已有的初始化
        factor = new ULength_in().getFactor() * 12.0;
        // 添加米基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个英尺长度单位(ft)实例
     * <p>
     * 初始化英尺长度单位，设置单位符号为"ft"，基本单位组成为米，
     * 转换因子为0.3048（即1ft = 0.3048m），无附加偏移量。
     */
    public ULength_ft() {
        // 调用父类DerivedUnit的构造方法，初始化英尺长度单位
        // 参数依次为：单位描述("ft")、基本单位元素列表([m^1])、转换因子(0.3048)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }

}