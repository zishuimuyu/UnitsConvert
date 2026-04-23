package cn.nlte.science.units.time;

import cn.nlte.science.units.BasicUnit;
import cn.nlte.science.units.DerivedUnit;
import cn.nlte.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 时间单位：week（周）
 * <P>
 * 周是时间单位，符号为week。
 * 1周定义为7天，即604800秒。
 * <P>
 * 单位关系：
 * <ul>
 *   <li>1 week = 604,800 s（秒）</li>
 *   <li>1 week = 10,080 min（分钟）</li>
 *   <li>1 week = 168 h（小时）</li>
 *   <li>1 week = 7 days（天）</li>
 *   <li>1 week = 604,800,000 ms（毫秒）</li>
 *   <li>1 month ≈ 4.35 weeks（平均月）</li>
 *   <li>1 year ≈ 52.18 weeks（平年）</li>
 * </ul>
 * <P>
 * 周单位在日常生活、工作安排、学校教育、商业运营等领域有广泛应用，
 * 用于测量中长期的时间间隔，如工作周、课程安排、项目进度等。
 * 周是国际上通用的时间组织单位。
 * <P>
 * 该单位适合表示一周左右的时间间隔。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UTime_week extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <P>
     * 定义周单位的基本单位组成：
     * - 时间单位秒(s)，指数为1
     * <P>
     * 周是时间单位，1周等于604800秒，因此与秒具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子
     * <P>
     * 用于将周数值转换为标准单位（秒）的数值。
     * 由于1week = 7days = 7×24h = 7×24×3600s = 604800s，所以factor = 3600.0 * 24.0 * 7.0。
     * 这意味着1周等于604800秒。
     */
    private final static double factor = 3600.0 * 24.0 * 7.0;
    
    /**
     * 附加偏移量
     * <P>
     * 时间单位之间通常只有倍数关系，无零点偏移，因此附加偏移量为0.0。
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述
     * <P>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "week";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立周单位与基本单位的关系。
     * 周是时间单位，由秒单位构成。
     */
    static {
        elementList.add(new UnitElement(BasicUnit.s, 1.0));  // 秒，指数1
    }

    public UTime_week() {
        super(description, elementList, factor, additional);
    }

}