package com.zishuimuyu.science.units.mass;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 质量单位：quarter（夸特）
 * <p>
 * 夸特是英国传统质量单位，符号为quarter。
 * 1夸特定义为28磅（衡），约等于12.7千克。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 quarter = 28 lb（磅）</li>
 *   <li>1 quarter = 2 st（英石，1 st = 14 lb）</li>
 *   <li>1 quarter = 1/4 cwt（英制百weight，112 lb）</li>
 *   <li>1 quarter ≈ 12.7006 kg（千克）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 夸特源自英国农业称重体系，长期用于谷物、羊毛等农产品的批量计量，
 * 是英石（stone）与英制担（hundredweight）之间的中间单位。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>农产品贸易：谷物、牲畜的传统称重</li>
 *   <li>历史文献：英制旧度量衡换算</li>
 * </ul>
 * <p>
 * 注意：本库中时间类别亦有符号为 quarter 的「季度」单位，二者量纲不同、互不影响。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UMass_quarter extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 夸特是质量单位，由千克单位构成，指数为1。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 1 quarter = 28 lb，故 factor = lb因子 × 28 = 0.45359237 × 28 = 12.70058636。
     * 通过引用 {@link UMass_lb} 的因子计算，保证与库内磅定义完全一致。
     */
    private final static double factor;

    /**
     * 附加偏移量
     * <p>
     * 质量单位之间只有倍数关系，无零点偏移，固定为0.0。
     */
    private final static double additional = 0.0;

    /**
     * 单位描述
     * <p>
     * 该单位的符号表示，用于显示和标识。
     */
    private final static String description = "quarter";

    /**
     * 静态初始化块
     * <p>
     * 初始化转换因子与基本单位元素列表。
     */
    static {
        factor = new UMass_lb().getFactor() * 28.0;
        // 千克，指数1
        elementList.add(new UnitElement(BasicUnit.Kg, 1.0));
    }

    /**
     * 构造函数，创建一个夸特质量单位(quarter)实例
     */
    public UMass_quarter() {
        super(description, elementList, factor, additional);
    }

}
