# UnitsConvert - 专业单位转换库

## 项目概述

**UnitsConvert** 是一个专业的Java单位转换库，由斯塔克工业（STK）开发，采用Apache License 2.0协议发布。该项目主要服务于石油、化工、核电、建筑等传统行业的工程计算需求。

## 核心架构

### 基础架构类

#### BasicUnit - 国际单位制基本单位枚举
定义了7个SI基本单位：
- `m` - 米（长度）
- `Kg` - 千克（质量）
- `s` - 秒（时间）
- `A` - 安培（电流）
- `K` - 开尔文（温度）
- `mol` - 摩尔（物质的量）
- `cd` - 坎德拉（发光强度）

#### DerivedUnit - 导出单位抽象基类
所有具体单位都继承此类，提供以下功能：
- 支持单位的乘、除、幂运算
- 提供单位类型判断和转换功能
- 使用factor（倍数）和addition（偏移量）实现精确转换
- 支持单位复制和比较

#### UnitElement - 单位元素类
封装基本单位类型和指数，用于构建复合单位（如N = Kg·m·s⁻²）

#### ValueWithUnit - 带单位的数据类
封装数值和单位，支持：
- 带单位的四则运算和幂运算
- 单位转换功能
- 量纲验证

#### UnitUtils - 单位管理工具类
提供工厂方法获取单位实例，实现单位单例模式，提高性能

## 单位分类体系

项目按物理量分类，包含以下11个类别：

### 长度单位 (length)
**国际单位：**
- m, Km, cm, mm, dm, um, ft, in, yd, mi, nmi, fur

**中国传统单位：**
- chi（尺）、cun（寸）、fen（分）、li（里）、zhang（丈）

### 质量单位 (mass)
**国际单位：**
- Kg, g, mg, t

**英制单位：**
- lb, oz, st, dr, lt, UStf, ct

**中国传统单位：**
- jin（斤）、liang（两）、qian（钱）、dan（担）、q（斤）、mu（亩）

### 时间单位 (time)
- s, ms, us, h, day, week

### 温度单位 (temperature)
- C（摄氏度）、F（华氏度）、K（开尔文）、Ra（兰氏度）、Re（列氏度）

### 力单位 (force)
- N, KN, Kgf, lbf, dyn, gf, kip, tf, UStf

### 压强单位 (pressure)
- Pa, KPa, MPa, HPa, bar, mbar, atm, KgfPerm2, lbfPerft2, lbfPerin2, mmHg

### 能量单位 (energy)
- J, KJ, MJ, cal, Kcal, erg, Btn, KWh, Kgfm, ftlbf

### 功率单位 (power)
- W, KW, Hp, Ps, BtuPers, calPers, KcalPers, KgfmPers, ftlbfPers

### 加速度单位 (accelerate)
- m/s², g, ft/s², in/s²

### 速度单位 (velocity)
- m/s, Km/h, Km/s, ft/s, in/s, mi/h, kn, c（光速）

### 体积单位 (volume)
- m³, cm³, mm³, l, ml, cl, dl, dal, hl, ft³, in³, yd³

## 核心功能特性

### 1. 精确的单位转换
- 支持同量纲单位间的精确转换
- 处理温度等有偏移量的单位转换
- 转换公式：`newValue = (value × factor + addition - destAddition) / destFactor`

### 2. 带单位的数学运算
- **加法/减法**：自动转换单位后计算
- **乘法/除法**：自动生成新的复合单位
- **幂运算**：支持单位的指数运算

### 3. 单位体系验证
- 检查单位量纲是否匹配
- 防止不合理的单位运算
- 抛出`UnitsNotSameException`异常

### 4. 扩展性设计
- 用户可以自定义新的单位类
- 继承`DerivedUnit`即可扩展
- 支持工厂模式管理单位实例

## 使用示例

### 基本用法

```java
import com.zishuimuyu.science.units.UnitUtils;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.accelerate.UAccelerate_g;
import com.zishuimuyu.science.units.force.UForce_N;
import com.zishuimuyu.science.units.mass.UMass_Kg;

public class Example {
    public static void main(String[] args) {
        // 定义带单位的数据
        ValueWithUnit mass = new ValueWithUnit(2.0, new UMass_Kg());
        ValueWithUnit accelerate = new ValueWithUnit(1.0, new UAccelerate_g());

        // 带单位的数据计算（F = m × a）
        ValueWithUnit force = mass.multiply(accelerate);

        // 转换为指定单位
        force = force.convertTo(new UForce_N());
        System.out.println("Force: " + force.getValue() + force.getUnit().getDescription());

        // 使用工厂方法获取单位
        force = force.convertTo(UnitUtils.getUnit("UForce_KN"));
        System.out.println("Force: " + force.getValue() + force.getUnit().getDescription());
    }
}
```

### 单位转换示例

```java
// 测试MPa与psi的转化
ValueWithUnit stress = new ValueWithUnit(1.0, UnitUtils.getUnit("UPressure_MPa"));
stress = stress.convertTo(UnitUtils.getUnit("UPressure_lbfPerin2"));
System.out.println("Stress: " + stress.getValue() + stress.getUnit().getDescription());
```

### 温度转换示例

```java
import com.zishuimuyu.science.units.temperature.UTemperature_C;
import com.zishuimuyu.science.units.temperature.UTemperature_F;

// 摄氏度转华氏度
ValueWithUnit tempC = new ValueWithUnit(25.0, new UTemperature_C());
        ValueWithUnit tempF = tempC.convertTo(new UTemperature_F());
System.out.

        println("Temperature: "+tempF.getValue() +"°F");
```

### 复合单位运算

```java
import com.zishuimuyu.science.units.length.ULength_m;
import com.zishuimuyu.science.units.time.UTime_s;

// 计算速度
ValueWithUnit distance = new ValueWithUnit(100.0, new ULength_m());
        ValueWithUnit time = new ValueWithUnit(10.0, new UTime_s());
        ValueWithUnit velocity = distance.divide(time);
System.out.

        println("Velocity: "+velocity.getValue() +" "+velocity.

        getUnit().

        getStandardFormat());
```

## 技术特点

1. **类型安全**：编译时检查单位类型，防止计算错误
2. **高性能**：单位实例采用单例模式，减少内存开销
3. **国际化**：支持国际单位制、英制单位、中国传统单位
4. **精确计算**：使用double类型和自定义精度控制
5. **工程导向**：专为工程计算设计，覆盖常用物理量

## 项目结构

```
UnitsConvert/
├── src/
│   └── com/nlte/science/units/
│       ├── BasicUnit.java              # 基本单位枚举
│       ├── DerivedUnit.java            # 导出单位基类
│       ├── UnitElement.java            # 单位元素类
│       ├── ValueWithUnit.java          # 带单位数据类
│       ├── UnitUtils.java              # 单位工具类
│       ├── accelerate/                 # 加速度单位
│       ├── area/                       # 面积单位
│       ├── energy/                     # 能量单位
│       ├── force/                      # 力单位
│       ├── length/                     # 长度单位
│       ├── mass/                       # 质量单位
│       ├── power/                      # 功率单位
│       ├── pressure/                   # 压强单位
│       ├── temperature/                # 温度单位
│       ├── time/                       # 时间单位
│       ├── velocity/                   # 速度单位
│       └── volume/                     # 体积单位
├── out/                                # 编译输出目录
├── lib/                                # 第三方库
├── nbproject/                          # NetBeans项目配置
└── build.xml                           # Ant构建脚本
```

## 构建和运行

### 使用Ant构建
```bash
ant clean
ant compile
ant jar
```

### 运行测试
```bash
ant run
```

## 许可证

本项目采用Apache License Version 2.0协议发布。

## 版权信息

本源代码知识产权属于斯塔克工业（STK）所有。

**官方网址：** 
 * <P>
 *
 *     http://www.stk.com
 *
 * <P>

**公司简介：**
STK主要服务于石油、化工、核电、建筑等传统企业，致力于传统行业的现代科技化转型，提供软件培训、软件研发（包括二次研发）、研发咨询、系统架构、高性能计算集群（HPC）搭建等一体化的专业服务。

**核心价值：** 专于行业应用，用心铸造永恒

## 贡献指南

欢迎贡献代码和建议！请遵循以下步骤：
1. Fork本项目
2. 创建特性分支
3. 提交更改
4. 推送到分支
5. 创建Pull Request

## 联系方式

如有问题或建议，请通过以下方式联系：
- 官方网站：
 * <P>
 *
 *     http://www.stk.com
 *
 * <P>
- 项目Issues：在GitHub上提交Issue

## 更新日志

### 当前版本
- 支持11个物理量类别的单位转换
- 包含国际单位制、英制单位、中国传统单位
- 提供完整的单位运算功能
- 支持自定义单位扩展