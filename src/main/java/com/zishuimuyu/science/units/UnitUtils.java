package com.zishuimuyu.science.units;

import java.util.HashMap;

/**
 * 单位工具类
 * <p>
 * 该类封装了单位管理的常用操作，提供工厂方法获取单位实例，实现单位单例模式，提高性能。
 * 通过反射机制动态加载单位类，并缓存实例以避免重复创建。
 * <p>
 * 核心功能：
 * <ul>
 *   <li>单位实例缓存：使用HashMap缓存已创建的单位实例</li>
 *   <li>动态加载：通过反射机制动态加载单位类</li>
 *   <li>包名解析：根据类名自动解析对应的包名</li>
 *   <li>单例管理：确保每个单位类只有一个实例</li>
 * </ul>
 * <p>
 * 使用示例：
 * <pre>
 * // 获取长度单位米
 * DerivedUnit meter = UnitUtils.getUnit("ULength_m");
 *
 * // 获取质量单位千克
 * DerivedUnit kilogram = UnitUtils.getUnit("UMass_Kg");
 *
 * // 获取力单位牛顿
 * DerivedUnit newton = UnitUtils.getUnit("UForce_N");
 * </pre>
 * <p>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class UnitUtils {

    /**
     * 单位实例缓存映射表
     * <p>
     * 以单位类名为键，单位实例为值的HashMap，用于缓存已创建的单位实例，
     * 实现单位的单例模式，避免重复创建相同的单位实例，提高性能。
     */
    private static final HashMap<String, DerivedUnit> unitMap = new HashMap<>();

    /**
     * 根据单位名称获取单位实例
     * <p>
     * 该方法通过单位类名获取对应的单位实例，如果该实例尚未创建，则通过反射机制创建并缓存；
     * 如果已经存在缓存，则直接返回缓存的实例，实现单例模式。
     * <p>
     * 该方法使用反射机制动态加载单位类，类的完整路径为：
     * com.zishuimuyu.science.units.[包名].[类名]
     * 其中包名通过getPackageName方法根据类名自动推断。
     * <p>
     * 常用单位类名示例：
     * <ul>
     *   <li>长度单位：ULength_m, ULength_cm, ULength_mm</li>
     *   <li>质量单位：UMass_Kg, UMass_g, UMass_t</li>
     *   <li>力单位：UForce_N, UForce_KN, UForce_Kgf</li>
     *   <li>温度单位：UTemperature_C, UTemperature_F, UTemperature_K</li>
     * </ul>
     *
     * @param name 单位的名称，即单位的类名，如"ULength_m"、"UMass_Kg"等
     * @return 对应的单位实例，如果类名不正确或加载失败则返回null
     */
    public static DerivedUnit getUnit(String name) {
        // 检查unitMap缓存中是否已有该单位实例
        DerivedUnit unit = unitMap.get(name);
        // 如果缓存中不存在该单位实例
        if (unit == null) {
            // 尝试通过反射机制动态加载单位类并创建实例
            try {
                // 通过反射获取完整类名并创建实例，完整类路径为：com.zishuimuyu.science.units.[包名].[类名]
                unit = (DerivedUnit) Class.forName("com.zishuimuyu.science.units." + getPackageName(name) + "." + name).newInstance();
                // 将新创建的单位实例添加到缓存中，以便下次直接使用
                unitMap.put(name, unit);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
                // 如果类未找到、无法访问或实例化失败，则返回null
                return null;
            }
        }
        // 返回单位实例（从缓存中获取或新创建的）
        return unit;
    }

    /**
     * 解析单位类对应的包名
     * <p>
     * 该私有方法根据单位类名解析出对应的包名。
     * 单位类命名规范为：U[物理量]_[单位符号]，如ULength_m、UMass_Kg等。
     * 该方法提取类名中的物理量部分并转换为小写，作为包名。
     * <p>
     * 解析规则：
     * <ol>
     *   <li>以"_"分割类名，获取第一部分（如"ULength"）</li>
     *   <li>去掉首字母"U"，获取物理量名称（如"Length"）</li>
     *   <li>转换为小写，作为包名（如"length"）</li>
     * </ol>
     *
     * @param className 单位类名，如"ULength_m"、"UMass_Kg"等
     * @return 解析出的包名，如"length"、"mass"等；如果解析失败则返回空字符串
     */
    private static String getPackageName(String className) {
        // 以"_"分割类名，获取第一部分（如"ULength"）
        String front = className.split("_")[0];
        try {
            // 去掉首字母"U"，获取物理量名称（如"Length"），然后转换为小写作为包名（如"length"）
            return front.substring(1).toLowerCase();
        } catch (Exception ex) {
            // 如果解析过程中发生异常，则返回空字符串
            return "";
        }
    }
}