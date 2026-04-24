package com.zishuimuyu.science.units;

/**
 * 基本单位重复异常类
 * <p>
 * 当在定义导出单位时，单位元素列表中出现重复的基本单位时抛出此异常。
 * <p>
 * 该异常继承自RuntimeException，是一个非受检异常，
 * 表示程序运行时的错误情况，不需要在方法签名中声明。
 * <p>
 * 异常触发场景：
 * <ul>
 *   <li>在定义单位时，单位元素列表中包含相同的基本单位</li>
 *   <li>例如：定义力单位时，如果单位元素列表中包含两个"Kg"元素</li>
 *   <li>这通常是由于编程错误或单位定义不当造成的</li>
 * </ul>
 * <p>
 * 设计原理：
 * <ul>
 *   <li>一个合法的单位定义中，每个基本单位只能出现一次</li>
 *   <li>例如：力的单位定义为 Kg·m·s⁻²，其中Kg、m、s各出现一次</li>
 *   <li>如果出现重复，说明单位定义有误，需要合并指数</li>
 * </ul>
 * <p>
 * 使用示例：
 * <pre>
 * // 错误的单位定义示例（会抛出此异常）
 * List&lt;UnitElement&gt; elements = new ArrayList&lt;&gt;();
 * elements.add(new UnitElement(BasicUnit.Kg, 1.0));
 * elements.add(new UnitElement(BasicUnit.Kg, 2.0));
 * // 重复的Kg
 * // 创建单位时会抛出BasicUnitDuplicateException
 * </pre>
 * <p>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class BasicUnitDuplicateException extends RuntimeException {

    /**
     * 构造方法，创建一个基本单位重复异常实例
     * <p>
     * 该构造方法接收一个错误信息字符串，用于描述异常的具体原因。
     * <p>
     * 典型的错误信息格式：
     * <pre>
     * "The basic unit [Kg] is duplicated !"
     * "The basic unit [m] is duplicated !"
     * </pre>
     * <p>
     * 该异常通常在DerivedUnit的构造方法中抛出，
     * 当检测到单位元素列表中有重复的基本单位时立即抛出，
     * 防止创建不合法的单位对象。
     *
     * @param info 错误信息字符串，描述异常的具体原因，包含重复的基本单位名称
     */
    public BasicUnitDuplicateException(String info) {
        // 调用父类RuntimeException的构造方法，设置异常信息
        super(info);
    }

}