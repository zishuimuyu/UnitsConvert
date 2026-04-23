package cn.nlte.science.units.length;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：m（米）
 * <P>
 * 米是国际单位制中长度的基本单位，符号为m。
 * 1米定义为光在真空中1/299,792,458秒内传播的距离。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 m = 10 dm（分米）</li>
 *   <li>1 m = 100 cm（厘米）</li>
 *   <li>1 m = 1000 mm（毫米）</li>
 *   <li>1 m = 1,000,000 μm（微米）</li>
 *   <li>1 m = 1×10⁹ nm（纳米）</li>
 *   <li>1 km = 1000 m（千米）</li>
 *   <li>1 m ≈ 3.28084 ft（英尺）</li>
 *   <li>1 m ≈ 39.3701 in（英寸）</li>
 * </ul>
 * <P>
 * 米单位广泛应用于科学、工程、日常生活等领域，用于测量各种距离和长度。
 * 在国际单位制中，米是定义其他长度单位的基础。
 * <P>
 * 米是七个基本物理单位之一，具有重要的基础地位。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_m extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义米单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <P>
     * 米是基本物理单位，因此在单位系统中直接使用自身作为基本单位。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 米是长度的标准单位，因此转换因子为1.0。
     * 用于与其他长度单位进行数值转换。
     */
    private final static double factor = 1.0;
    
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
    private final static String description = "m";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立米单位与基本单位的关系。
     * 米是基本单位，因此只包含一个基本单位元素。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.m, 1.0));  // 米，指数1
    }

    public ULength_m() {
        super(description, elementList, factor, additional);
    }

}