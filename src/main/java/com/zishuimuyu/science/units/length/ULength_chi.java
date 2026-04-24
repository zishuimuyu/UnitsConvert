package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度单位：chi（尺）
 * <p>
 * 尺是中国传统的长度单位，符号为chi。
 * 1尺定义为1/3米，约等于0.3333米。
 * <p>
 * 单位关系：
 * <ul>
 *   <li>1 chi = 1/3 m（米）≈ 0.3333 m</li>
 *   <li>1 chi = 10 cun（寸）</li>
 *   <li>1 chi = 100 fen（分）</li>
 *   <li>1 zhang = 10 chi（丈）</li>
 *   <li>1 li = 1500 chi（里）</li>
 *   <li>1 m = 3 chi</li>
 *   <li>1 ft ≈ 0.9144 chi</li>
 * </ul>
 * <p>
 * 尺单位在中国传统文化、建筑、裁缝、工艺品制作等领域有广泛应用，
 * 特别是在传统工艺和古典建筑中仍保留使用。
 * 在古代中国的度量衡体系中，尺是非常重要的长度单位。
 * <p>
 * 该单位在中国传统文化领域常见。
 *
 * @author 紫水木鱼
 * @company 斯塔克工业（STK）
 * @date 2026年04月23日
 */
public class ULength_chi extends DerivedUnit {

    /**
     * 基本单位元素列表
     * <p>
     * 定义尺单位的基本单位组成：
     * - 长度单位米(m)，指数为1
     * <p>
     * 尺是长度单位，1尺等于1/3米，因此与米具有相同的基本单位组成，
     * 只是转换因子不同。
     */
    private final static List<UnitElement> elementList = new ArrayList<>();

    /**
     * 转换因子
     * <p>
     * 用于将尺数值转换为标准单位（米）的数值。
     * 由于1chi = 1/3m，所以factor = 1.0 / 3.0。
     * 这意味着1尺等于1/3米。
     */
    private final static double factor = 1.0 / 3.0;

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
    private final static String description = "chi";

    /**
     * 静态初始化块
     * <P>
     * 初始化基本单位元素列表，建立尺单位与基本单位的关系。
     * 尺是长度单位，由米单位构成。
     */
    static {
        // 添加米基本单位，指数为1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    /**
     * 构造函数，创建一个尺长度单位(chi)实例
     * <p>
     * 初始化尺长度单位，设置单位符号为"chi"，基本单位组成为米，
     * 转换因子约为0.3333（即1chi ≈ 0.3333m），无附加偏移量。
     */
    public ULength_chi() {
        super(description, elementList, factor, additional);
    }

}