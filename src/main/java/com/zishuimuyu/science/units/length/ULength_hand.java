package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：hand（手宽）
 * <p>
 * 手宽是专门用于测量马的高度的传统长度单位，符号为hh或h。
 * 1手宽定义为4英寸，约等于10.16厘米。这种测量方法在马术界沿用至今。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 hand = 4 in（英寸）</li>
 *   <li>1 hand = 1/3 ft（英尺）</li>
 *   <li>1 hand = 10.16 cm（厘米）</li>
 *   <li>1 hand = 0.1016 m（米）</li>
 *   <li>1 ft = 3 hands（英尺）</li>
 *   <li>16.5 hands = 1 fathom（寻）</li>
 * </ul>
 * <p>
 * 手宽主要用于测量马的肩高（从地面到马肩胛骨顶部的距离）。
 * 马的高度通常以"手宽+英寸"的形式表示，例如15.2手宽表示15手宽又2英寸。
 * <p>
 * 该单位起源于古埃及和古希腊，当时人们用手掌宽度作为测量标准。
 * 尽管公制系统普及，但马术界仍坚持使用此单位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class ULength_hand extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义手宽单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 手宽虽然不是基本单位，但在内部表示中使用基本单位米，
     * 通过转换因子factor来实现手宽到米的转换。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 手宽单位的转换因子为0.1016。
     * 1 hand = 4 inches = 0.1016 meters
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 0.1016;

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
    private final static String description = "hand";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立手宽单位与基本单位的关系。
     * 手宽本质上仍是长度单位，由米单位组成。
     */
    static {
        // 米，指数1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个手宽单位(hand)实例
     * <p>
     * 初始化手宽单位，设置单位符号为"hand"，基本单位组成为m，
     * 转换因子为0.1016（即1hand = 0.1016m），
     * 无附加偏移量。
     */
    public ULength_hand() {
        // 调用父类DerivedUnit的构造方法，初始化手宽单位
        // 参数依次为：单位描述("hand")、基本单位元素列表([m^1])、转换因子(0.1016)、附加偏移量(0.0)
        super(description, elementList, factor, additional);
    }
}