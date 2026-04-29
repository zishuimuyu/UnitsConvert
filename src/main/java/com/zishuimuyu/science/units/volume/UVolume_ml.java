package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：mL（毫升）
 * <p>
 * 毫升是体积单位，符号为mL，是公制系统中常用的液体体积分数单位。
 * 1毫升等于1升的千分之一，即1立方厘米的体积。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 mL = 0.001 L（升）</li>
 *   <li>1 mL = 1 cm³（立方厘米）</li>
 *   <li>1 mL = 1,000 mm³（立方毫米）</li>
 *   <li>1 mL ≈ 0.0353 fl oz（美制液量盎司）</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 毫升是随着公制系统在19世纪的广泛采用而确立的单位。
 * 它最初定义为1升的千分之一，与立方厘米完全等价。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>医药领域：药物剂量、疫苗注射量</li>
 *   <li>化学实验：试剂配制、滴定分析</li>
 *   <li>食品工业：调味料、添加剂的精确添加</li>
 *   <li>化妆品：香水、乳液等产品的容量标注</li>
 *   <li>日常用品：化妆品小样、样品包装</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_mL extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 毫升 = 立方厘米 = (厘米)^3 = (0.01米)^3 = 10^-6 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示毫升相对于立方米的关系
     * 1 mL = 10^-6 m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串
     */
    private final static String description = "mL";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1e-6;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建毫升单位实例
     */
    public UVolume_mL() {
        super(description, elementList, factor, additional);
    }
}