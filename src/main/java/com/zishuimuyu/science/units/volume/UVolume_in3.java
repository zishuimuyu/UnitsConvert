package com.zishuimuyu.science.units.volume;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 体积单位：in³（立方英寸）
 * <p>
 * 立方英寸是体积单位，符号为in³，是英制单位制中体积的常用单位。
 * 1立方英寸等于边长为1英寸的正方体的体积。
 * <p>
 * <b>换算关系：</b>
 * <ul>
 *   <li>1 in³ = 1.639×10⁻⁵ m³（立方米）</li>
 *   <li>1 in³ = 16.387 cm³（立方厘米）</li>
 *   <li>1 in³ = 16,387 mm³（立方毫米）</li>
 *   <li>1 in³ = 0.01639 L（升）</li>
 *   <li>1 in³ = 16.387 mL（毫升）</li>
 *   <li>1 in³ = 1/1728 ft³（立方英尺）</li>
 *   <li>1 m³ ≈ 61,024 in³</li>
 * </ul>
 * <p>
 * <b>历史背景：</b>
 * 立方英寸起源于英制单位制，基于英寸这一长度单位。
 * 英寸的传统定义为国王拇指的宽度，或者3颗大麦粒首尾相连的长度。
 * 现代英寸定义为1/12英尺，1959年被正式确定为2.54厘米。
 * 立方英寸作为体积单位在英制单位使用国家广泛使用。
 * <p>
 * <b>应用场景：</b>
 * <ul>
 *   <li>机械工程：发动机排量、汽车引擎容量（如V8发动机）</li>
 *   <li>水管工程：管道直径、水表容量</li>
 *   <li>摄影器材：相机镜头滤镜尺寸</li>
 *   <li>电子制造：电子元件封装尺寸</li>
 *   <li>家具制造：抽屉、柜子内部容积</li>
 * </ul>
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月29日
 */
public class UVolume_in3 extends DerivedUnit {

    /**
     * 单位元素列表，表示体积由长度单位的三次方组成
     * 立方英寸 = (英寸)^3 = (0.0254米)^3 = 1.639×10⁻⁵ 立方米
     */
    private final static List<UnitElement> elementList = new ArrayList<>();
    
    /**
     * 转换因子，表示立方英寸相对于立方米的关系
     * 1 in³ = 1.639×10⁻⁵ m³
     */
    private final static double factor;
    
    /**
     * 附加量，体积单位无偏移量，固定为0.0
     */
    private final static double additional = 0.0;
    
    /**
     * 单位描述字符串，用于显示和标识
     */
    private final static String description = "in\u00B3";

    /**
     * 静态初始化块，设置转换因子和单位元素
     */
    static {
        factor = 1.639e-5;
        elementList.add(new UnitElement(BasicUnit.m, 3.0));
    }

    /**
     * 构造函数，创建立方英寸单位实例
     * 调用父类DerivedUnit构造函数，传入单位描述、元素列表、转换因子和附加量
     */
    public UVolume_in3() {
        super(description, elementList, factor, additional);
    }
}