package com.zishuimuyu.science.units;

import java.util.List;

/**
 * 通用单位类，封装DerivedUnit类的通用实例
 * <P>
 * 该类继承自DerivedUnit，用于表示通过单位运算（乘、除、幂）生成的复合单位。
 * <P>
 * 主要应用场景：
 * <ul>
 *   <li>当两个单位相乘时，生成新的复合单位（如：m × m = m²）</li>
 *   <li>当两个单位相除时，生成新的复合单位（如：m ÷ s = m/s）</li>
 *   <li>当单位进行幂运算时，生成新的复合单位（如：m²）</li>
 * </ul>
 * <P>
 * 例如：计算速度时，距离（米）除以时间（秒），结果单位为米/秒（m/s），
 * 这种动态生成的复合单位就通过UCommon类来表示。
 * <P>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UCommon extends DerivedUnit {

    /**
     * 构造方法，创建一个通用单位实例
     * <P>
     * 该构造方法直接调用父类DerivedUnit的构造方法，传入单位描述、
     * 单位元素列表、倍数因子和偏移量。
     * <P>
     * 参数说明：
     * <ul>
     *   <li>description：单位的描述字符串，可以为null（对于复合单位通常为null）</li>
     *   <li>units：单位元素列表，包含构成该单位的基本单位和对应的指数</li>
     *   <li>factor：相对于基本单位的倍数因子，复合单位通常为1.0</li>
     *   <li>addition：相对于基本单位的偏移量，复合单位通常为0.0</li>
     * </ul>
     *
     * @param description 单位的描述字符串，如"m/s"、"kg·m/s²"等，可以为null
     * @param units 单位元素列表，包含构成该单位的基本单位和对应的指数
     * @param factor 相对于基本单位的倍数因子
     * @param addition 相对于基本单位的偏移量
     */
    public UCommon(String description, List<UnitElement> units, double factor, double addition) {
        super(description, units, factor, addition);
    }

}