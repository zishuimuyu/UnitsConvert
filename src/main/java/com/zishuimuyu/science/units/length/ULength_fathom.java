package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：fathom（寻）
 * <p>
 * 寻是英制系统中用于测量水深的长度单位，符号为ftm或fm。
 * 1寻定义为6英尺，约等于1.8288米。这个单位在航海和海洋测量中广泛使用。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 fathom = 6 ft（英尺）</li>
 *   <li>1 fathom = 72 in（英寸）</li>
 *   <li>1 fathom = 1.8288 m（米）</li>
 *   <li>1 fathom = 1.0133 yards（码）</li>
 *   <li>1 nautical mile = 1012.686 fathoms（海里）</li>
 *   <li>1 chain = 100 fathoms（链）</li>
 * </ul>
 * <p>
 * 寻主要用于测量海洋深度，特别是在航海图和水深测量中。
 * 尽管现代航海越来越多地使用公制单位，但寻仍然是海洋测量中的重要单位。
 * <p>
 * 该单位源于人类两臂伸展时的大致距离，历史上人们用双臂伸展来测量绳索长度。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_fathom extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义寻单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 寻虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现寻到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 寻单位的转换因子为1.8288。
     * 1 fathom = 6 feet = 1.8288 meters
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 1.8288;

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
    private final static String description = "fathom";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立寻单位与基本单位的关系。
     * 寻本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个寻单位(fathom)实例
     * <p>
     * 初始化寻单位，设置单位符号为"fathom"，基本单位组成为m，
     * 转换因子为1.8288（即1fathom = 1.8288m），
     * 无附加偏移量。
     */
    public ULength_fathom() {
        // 调用父类DerivedUnit的构造方法，初始化寻单位
        // 参数依次为：单位描述("fathom")、基本单位元素列表([m^1])、转换因子(1.8288)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}