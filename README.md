# UnitsConvert - 专业单位转换库

## 1.1 项目概述

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

项目按物理量分类，包含以下12个类别：

### 1. 长度单位 (length)
**国际单位：**

| 单位名称 | 符号 | 换算关系（米） | 应用场景 |
|---------|------|---------------|----------|
| 微米 | um | 10⁻⁶m (百万分之一米) | 微观尺度测量、细胞尺寸、精密加工 |
| 毫米 | mm | 10⁻³m (千分之一米) | 工程图纸、机械零件、日常精细测量 |
| 厘米 | cm | 10⁻²m (百分之一米) | 日常生活、服装尺码、人体测量 |
| 分米 | dm | 10⁻¹m (十分之一米) | 教育教学、简单测量 |
| 英寸 | in | 2.54×10⁻²m | 工业制造、屏幕尺寸、管道规格 |
| 英尺 | ft | 0.3048m | 建筑工程、高度测量 |
| 码 | yd | 0.9144m | 体育场地、布料销售 |
| 米 | m | 1m (基本单位) | 国际单位制基本单位、科学测量 |
| 跋 | fur | 201.168m | 传统土地测量 |
| 千米 | Km | 10³m (一千米) | 地理距离、交通里程 |
| 英里 | mi | 1609.344m | 长距离交通、航空航海 |
| 海里 | nmi | 1852m | 航海航空导航 |

**中国传统单位：**

| 单位名称 | 符号 | 换算关系（米） | 应用场景 |
|---------|------|---------------|----------|
| 分 | fen | 3.33×10⁻³m | 传统测量、中医用药 |
| 寸 | cun | 3.33×10⁻²m | 传统测量、中医穴位 |
| 尺 | chi | 0.333m | 传统测量、木工裁缝 |
| 丈 | zhang | 3.33m | 传统土地测量 |
| 里 | li | 500m | 传统地理距离 |

### 2. 面积单位 (area)
**国际单位：**

| 单位名称 | 符号 | 换算关系（平方米） | 应用场景 |
|---------|------|-------------------|----------|
| 平方毫米 | mm² | 10⁻⁶m² | 微小面积、精密加工 |
| 平方厘米 | cm² | 10⁻⁴m² | 小面积测量、实验室 |
| 平方分米 | dm² | 10⁻²m² | 中小面积测量 |
| 平方米 | m² | 1m² (基本单位) | 国际单位制面积基本单位 |
| 公亩/十米² | dam² | 10²m² | 中等面积测量、欧洲使用 |
| 公顷/百米² | ha | 10⁴m² | 农业、林业、土地规划 |
| 平方千米 | Km² | 10⁶m² | 大面积土地、地理测量 |

**英制单位：**

| 单位名称 | 符号 | 换算关系（平方米） | 应用场景 |
|---------|------|-------------------|----------|
| 平方英寸 | in² | 6.452×10⁻⁴m² | 精密工程、小面积 |
| 平方英尺 | ft² | 0.0929m² | 建筑、房地产 |
| 平方码 | yd² | 0.8361m² | 美国建筑、纺织 |
| 英亩 | acre | 4046.856m² | 农业、土地测量 |
| 平方英里 | mi² | 2.59×10⁶m² | 大面积土地、地理测量 |

**中国传统单位：**

| 单位名称 | 符号 | 换算关系（平方米） | 应用场景 |
|---------|------|-------------------|----------|
| 市亩 | mu | 666.67m² | 中国农业、土地测量 |
| 顷 | qing | 6.67×10³m² | 中国传统大面积测量 |

### 3. 质量单位 (mass)
**国际单位：**

| 单位名称 | 符号 | 换算关系（千克） | 应用场景 |
|---------|------|------------------|----------|
| 毫克 | mg | 10⁻⁶kg (百万分之一千克) | 医药剂量、化学试剂 |
| 克 | g | 10⁻³kg (千分之一千克) | 日常食品、小件物品 |
| 千克 | Kg | 1kg (基本单位) | 国际单位制基本单位、科学测量 |
| 吨 | t | 10³kg (一千千克) | 工业生产、大型货物运输 |

**英制单位：**

| 单位名称 | 符号 | 换算关系（千克） | 应用场景 |
|---------|------|------------------|----------|
| 格令 | gr | 6.48×10⁻⁵kg | 珠宝、弹药、药品 |
| 打兰 | dr | 1.77×10⁻³kg | 药物计量、珠宝 |
| 盎司 | oz | 2.835×10⁻²kg | 食品包装、贵金属 |
| 磅 | lb | 0.4536kg | 体重测量、商品重量 |
| 英石 | st | 6.35kg | 人体重量（英国） |
| 美吨 | UStf | 907.185kg | 美国货物运输 |
| 长吨 | lt | 1016.047kg | 英国货物运输 |

**中国传统单位：**

| 单位名称 | 符号 | 换算关系（千克） | 应用场景 |
|---------|------|------------------|----------|
| 钱 | qian | 5.0×10⁻³kg | 传统中药、小量物品 |
| 两 | liang | 5.0×10⁻²kg | 传统市场、中药 |
| 斤 | jin/q | 0.5kg | 传统市场、日常购物 |
| 担 | dan | 50kg | 农业产量、大宗货物 |

### 4. 时间单位 (time)
- fs, ps, ns, us, ms, s, min, h, day, week, month, quarter, year, century, millennium, megaannum

时间单位涵盖了从极短时间间隔到极长时间跨度的完整体系：

| 单位名称 | 符号 | 换算关系（秒） | 典型应用场景 |
|---------|------|---------------|-------------|
| 飞秒 | fs | 10⁻¹⁵s (千万亿分之一秒) | 化学键断裂与形成的瞬间、阿秒物理学的门槛 |
| 皮秒 | ps | 10⁻¹²s (万亿分之一秒) | 超高頻激光脉冲、半导体物理研究 |
| 纳秒 | ns | 10⁻⁹s (十亿分之一秒) | 现代CPU/内存读写速度、光速传播极短距离的时间 |
| 微秒 | μs | 10⁻⁶s (百万分之一秒) | 高速摄像头帧间隔、早期CPU时钟周期 |
| 毫秒 | ms | 10⁻³s (千分之一秒) | 计算机响应时间、日常网络延迟（Ping值） |
| 秒 | s | 1s (基本单位) | 日常时间计量、国际单位制基本单位 |
| 分钟 | min | 60s | 日常时间段、会议时长 |
| 小时 | h | 3,600s | 工作时间、旅行时间 |
| 天 | day | 86,400s | 日常生活周期、工作日 |
| 周 | week | 604,800s | 工作周期、学校周次 |
| 月 | month | ~2,629,800s | 合同期限、财务结算 |
| 季度 | quarter | ~7,889,400s | 财务报告、预算周期 |
| 年 | year | ~31,557,600s | 年龄计算、历史纪年 |
| 世纪 | century | ~3,155,760,000s | 历史时期、长期规划 |
| 千年 | millennium | ~31,557,600,000s | 文明发展、地质年代 |
| 百万年 | megaannum | ~31,557,600,000,000s | 地质演化、物种进化 |

### 5. 温度单位 (temperature)
| 单位名称 | 符号 | 换算关系 | 应用场景 |
|---------|------|----------|----------|
| 摄氏度 | C | °C = K - 273.15 | 日常生活、气象预报、科学实验 |
| 华氏度 | F | °F = 9/5°C + 32 | 美国日常生活、医学温度 |
| 开尔文 | K | K = °C + 273.15 | 科学研究、绝对零度基准 |
| 兰氏度 | Ra | °R = 9/5K | 工程热力学 |
| 列氏度 | Re | °Re = 4/5°C | 历史科学文献 |

### 6. 力单位 (force)
| 单位名称 | 符号 | 换算关系（牛顿） | 应用场景 |
|---------|------|------------------|----------|
| 达因 | dyn | 10⁻⁵N | 微观力测量、分子间作用力 |
| 克力 | gf | 9.80665×10⁻³N | 实验室精密测量、小型机械 |
| 磅力 | lbf | 4.44822N | 工程力学、航空航天 |
| 牛顿 | N | 1N (基本单位) | 国际单位制力的基本单位 |
| 千克力 | Kgf | 9.80665N | 工程技术、起重设备 |
| 千牛顿 | KN | 10³N (一千牛顿) | 结构工程、大型机械 |
| 千磅力 | kip | 4448.22N | 美国土木工程、建筑结构 |
| 吨力 | tf | 9806.65N | 重型机械、起重能力 |
| 美吨力 | UStf | 8896.44N | 美国工程标准 |

### 7. 压强单位 (pressure)
| 单位名称 | 符号 | 换算关系（帕斯卡） | 应用场景 |
|---------|------|--------------------|----------|
| 帕斯卡 | Pa | 1Pa (基本单位) | 国际单位制压强基本单位 |
| 百帕 | HPa | 10²Pa (一百帕) | 气象学、大气压力 |
| 千帕 | KPa | 10³Pa (一千帕) | 工程技术、轮胎气压 |
| 毫巴 | mbar | 10²Pa (百帕) | 气象学、低压测量 |
| 毫米汞柱 | mmHg | 133.322Pa | 医学血压测量 |
| 标准大气压 | atm | 101325Pa | 科学标准、实验室 |
| 巴 | bar | 10⁵Pa (十万帕) | 工业工程、气体压力 |
| 千克力/平方米 | KgfPerm2 | 9.80665Pa | 工程技术、老旧文献 |
| 磅力/平方英尺 | lbfPerft2 | 47.8803Pa | 美国工程标准 |
| 磅力/平方英寸 | lbfPerin2 | 6894.76Pa | 工业、轮胎压力 |
| 兆帕 | MPa | 10⁶Pa (一百万帕) | 高压工程、材料强度 |

### 8. 能量单位 (energy)
| 单位名称 | 符号 | 换算关系（焦耳） | 应用场景 |
|---------|------|------------------|----------|
| 尔格 | erg | 10⁻⁷J | 历史物理文献、微观能量 |
| 焦耳 | J | 1J (基本单位) | 国际单位制能量基本单位 |
| 英尺·磅力 | ftlbf | 1.35582J | 美国工程、机械功 |
| 克力·米 | Kgfm | 9.80665J | 工程技术、机械功 |
| 卡路里 | cal | 4.184J | 营养学、热力学 |
| 千焦 | KJ | 10³J (一千焦) | 化学反应、营养标签 |
| 千卡 | Kcal | 4184J | 营养学、食物热量 |
| 英热单位 | Btn | 1055.06J | 空调制冷、能源计量 |
| 千瓦时 | KWh | 3.6×10⁶J | 电力计量、家庭用电 |
| 兆焦 | MJ | 10⁶J (一百万焦) | 大型能源、化学反应 |

### 9. 功率单位 (power)
| 单位名称 | 符号 | 换算关系（瓦特） | 应用场景 |
|---------|------|------------------|----------|
| 皮瓦 | pW | 10⁻¹²W | 微电子、生物信号 |
| 纳瓦 | nW | 10⁻⁹W | 微电子、传感器 |
| 微瓦 | uW | 10⁻⁶W | 微电子、射频信号 |
| 毫瓦 | mW | 10⁻³W | 小型电子设备、激光器 |
| 瓦特 | W | 1W (基本单位) | 国际单位制功率基本单位 |
| 千瓦 | KW | 10³W (一千瓦) | 家用电器、小型发动机 |
| 马力 | Hp | 745.7W | 发动机功率、汽车工业 |
| 公制马力 | Ps | 735.5W | 欧洲发动机功率 |
| 英热单位/秒 | BtuPers | 1055.06W | 空调制冷 |
| 卡路里/秒 | calPers | 4.184W | 生物代谢、热交换 |
| 千卡/小时 | KcalPerh | 1.163W | 制冷制热 |
| 英热单位/小时 | BtnPerh | 0.2931W | 空调制冷 |
| 公斤力·米/秒 | KgfmPers | 9.80665W | 工程技术 |
| 英尺·磅力/秒 | ftlbfPers | 1.35582W | 美国工程 |
| 英尺·磅力/分钟 | ftlbfPermin | 0.022597W | 美国工程 |
| 尔格/秒 | ergPers | 10⁻⁷W | 历史物理文献 |
| 兆瓦 | MW | 10⁶W (一百万瓦) | 电站发电、大型设备 |
| 吉瓦 | GW | 10⁹W (十亿瓦) | 大型电站、国家电网 |
| 太瓦 | TW | 10¹²W (一万亿瓦) | 国家电力、全球能源 |

### 10. 加速度单位 (accelerate)
| 单位名称 | 符号 | 换算关系（米/秒²） | 应用场景 |
|---------|------|-------------------|----------|
| 英寸/秒² | in/s² | 0.0254m/s² | 精密仪器、小型机械 |
| 英尺/秒² | ft/s² | 0.3048m/s² | 美国工程、航空 |
| 米/秒² | m/s² | 1m/s² (基本单位) | 国际单位制加速度基本单位 |
| 重力加速度 | g | 9.80665m/s² | 工程技术、重力相关计算 |

### 11. 速度单位 (velocity)
| 单位名称 | 符号 | 换算关系（米/秒） | 应用场景 |
|---------|------|------------------|----------|
| 英寸/秒 | in/s | 0.0254m/s | 精密机械、低速测量 |
| 英尺/秒 | ft/s | 0.3048m/s | 美国工程、风速 |
| 米/秒 | m/s | 1m/s (基本单位) | 国际单位制速度基本单位 |
| 千米/时 | Km/h | 0.2778m/s | 交通运输、车辆速度 |
| 英里/时 | mi/h | 0.4470m/s | 交通运输、美国车速 |
| 千米/秒 | Km/s | 10³m/s (一千米/秒) | 航天飞行、高速运动 |
| 节 | kn | 0.5144m/s | 航海航空、船舶飞机 |
| 光速 | c | 299792458m/s | 物理学、相对论 |

### 12. 体积单位 (volume)
| 单位名称 | 符号 | 换算关系（立方米） | 应用场景 |
|---------|------|------------------|----------|
| 立方毫米 | mm³ | 10⁻⁹m³ | 微小容积、精密测量 |
| 立方厘米 | cm³ | 10⁻⁶m³ | 实验室、小容器 |
| 毫升 | ml | 10⁻⁶m³ | 实验室、药品 |
| 厘升 | cl | 10⁻⁵m³ | 欧洲酒类容量 |
| 分升 | dl | 10⁻⁴m³ | 欧洲液体测量 |
| 升 | l | 10⁻³m³ | 日常液体测量、容器容积 |
| 十升 | dal | 10⁻²m³ | 工业液体测量 |
| 百升 | hl | 10⁻¹m³ | 啤酒酿造、大容器 |
| 立方英尺 | ft³ | 0.02832m³ | 美国工程、空间测量 |
| 立方英寸 | in³ | 1.639×10⁻⁵m³ | 美国精密测量 |
| 立方码 | yd³ | 0.7646m³ | 美国土木工程 |
| 立方米 | m³ | 1m³ (基本单位) | 国际单位制体积基本单位 |

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
System.out.println("Temperature: " + tempF.getValue() + "°F");
```

### 复合单位运算

```java
import com.zishuimuyu.science.units.length.ULength_m;
import com.zishuimuyu.science.units.time.UTime_s;

// 计算速度
ValueWithUnit distance = new ValueWithUnit(100.0, new ULength_m());
ValueWithUnit time = new ValueWithUnit(10.0, new UTime_s());
ValueWithUnit velocity = distance.divide(time);
System.out.println("Velocity: " + velocity.getValue() + " " + velocity.getUnit().getStandardFormat());
```

## 设计模式

### 1. 工厂模式
通过`UnitUtils.getUnit()`方法获取单位实例，实现单例管理，提高性能并减少内存开销。

### 2. 模板方法模式
`DerivedUnit`定义了单位的基本行为，具体单位类实现细节。

### 3. 单例模式
单位实例通过工厂方法管理，避免重复创建，提高性能。

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
│   ├── main/
│   │   └── java/
│   │       └── com/zishuimuyu/science/units/
│   │           ├── BasicUnit.java              # 基本单位枚举
│   │           ├── DerivedUnit.java            # 导出单位基类
│   │           ├── UnitElement.java            # 单位元素类
│   │           ├── ValueWithUnit.java          # 带单位数据类
│   │           ├── UnitUtils.java              # 单位工具类
│   │           ├── accelerate/                 # 加速度单位
│   │           ├── area/                       # 面积单位
│   │           ├── energy/                     # 能量单位
│   │           ├── force/                      # 力单位
│   │           ├── length/                     # 长度单位
│   │           ├── mass/                       # 质量单位
│   │           ├── power/                      # 功率单位
│   │           ├── pressure/                   # 压强单位
│   │           ├── temperature/                # 温度单位
│   │           ├── time/                       # 时间单位
│   │           ├── velocity/                   # 速度单位
│   │           └── volume/                     # 体积单位
│   └── test/
│       └── java/
│           └── testall/
│               └── TestUse.java                # 测试类
├── pom.xml                                     # Maven配置文件
├── target/                                     # 编译输出目录
└── README.md                                   # 项目说明文档
```

## 构建和运行

### 使用Maven构建
```bash
# 编译项目
mvn clean compile

# 运行测试
mvn test

# 打包项目
mvn package

# 安装到本地仓库
mvn clean install
```

### 运行测试
```bash
mvn test
# 或者运行特定测试类
mvn test -Dtest=TestUse
```

## 第三方系统集成指南

### 1. Maven项目集成

由于项目已经迁移到Maven，您可以直接在您的 `pom.xml` 中添加依赖：

```xml
<dependency>
    <groupId>com.zishuimuyu.science</groupId>
    <artifactId>unitsconvert</artifactId>
    <version>2.0.0</version>
</dependency>
```

为了在IDE中查看详细的API文档和注释，请同时添加Javadoc依赖：

```xml
<dependency>
    <groupId>com.zishuimuyu.science</groupId>
    <artifactId>unitsconvert</artifactId>
    <version>2.0.0</version>
    <classifier>javadoc</classifier>
    <scope>provided</scope>
</dependency>
```

或者，如果您使用IDE（如IntelliJ IDEA或Eclipse），IDE通常会自动下载Javadoc和源码包以提供更好的代码补全和文档查看体验。

**注意**：由于项目中的注释主要是中文文档而非标准Javadoc格式，自动生成的Javadoc包可能内容有限。但源码包（sources）包含了完整的中文注释，IDE能够更好地解析和显示这些注释。

如果需要将此库安装到本地Maven仓库，可以执行：

```bash
mvn clean install
```

### 2. Gradle项目集成

如果您使用Gradle，可以在 `build.gradle` 中添加：

```gradle
dependencies {
    implementation 'com.zishuimuyu.science:unitsconvert:1.0.0'
}
```

### 3. 传统项目集成（非Maven/Gradle）

如果您无法使用Maven或Gradle进行依赖管理，可以手动构建JAR包：

```bash
# 构建JAR包
mvn clean package
```

JAR文件将生成在 `target/` 目录下，您可以将其添加到您的项目类路径中。

### 4. 基本使用示例

#### 导入必要的类

```java
import com.zishuimuyu.science.units.UnitUtils;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.length.ULength_m;
import com.zishuimuyu.science.units.mass.UMass_Kg;
import com.zishuimuyu.science.units.force.UForce_N;
import com.zishuimuyu.science.units.temperature.UTemperature_C;
```

#### 简单位转换

```java
// 创建带单位的数据
ValueWithUnit length = new ValueWithUnit(100.0, new ULength_m());

// 转换为厘米
ValueWithUnit lengthInCm = length.convertTo(UnitUtils.getUnit("ULength_cm"));
System.out.println("100米 = " + lengthInCm.getValue() + "厘米");
```

#### 复杂计算

```java
// 物理公式计算：F = m × a
ValueWithUnit mass = new ValueWithUnit(2.0, new UMass_Kg());
ValueWithUnit acceleration = new ValueWithUnit(9.8, UnitUtils.getUnit("UAccelerate_mPers2"));

// 计算力
ValueWithUnit force = mass.multiply(acceleration);

// 转换为牛顿
force = force.convertTo(new UForce_N());
System.out.println("力: " + force.getValue() + " N");
```

#### 温度转换

```java
// 摄氏度转华氏度
ValueWithUnit tempC = new ValueWithUnit(25.0, new UTemperature_C());
ValueWithUnit tempF = tempC.convertTo(UnitUtils.getUnit("UTemperature_F"));
System.out.println("25°C = " + tempF.getValue() + "°F");
```

### 5. 常见单位类名列表

以下是常用的单位类名，可以通过 `UnitUtils.getUnit("类名")` 获取：

**长度单位：**
- `ULength_m` - 米
- `ULength_cm` - 厘米
- `ULength_mm` - 毫米
- `ULength_Km` - 千米
- `ULength_ft` - 英尺
- `ULength_in` - 英寸

**质量单位：**
- `UMass_Kg` - 千克
- `UMass_g` - 克
- `UMass_t` - 吨
- `UMass_lb` - 磅

**力单位：**
- `UForce_N` - 牛顿
- `UForce_KN` - 千牛顿
- `UForce_Kgf` - 千克力

**压强单位：**
- `UPressure_Pa` - 帕斯卡
- `UPressure_MPa` - 兆帕
- `UPressure_bar` - 巴

**温度单位：**
- `UTemperature_C` - 摄氏度
- `UTemperature_F` - 华氏度
- `UTemperature_K` - 开尔文

**时间单位：**
- `UTime_fs` - 飞秒
- `UTime_ps` - 皮秒
- `UTime_ns` - 纳秒
- `UTime_us` - 微秒
- `UTime_ms` - 毫秒
- `UTime_s` - 秒
- `UTime_min` - 分钟
- `UTime_h` - 小时
- `UTime_day` - 天
- `UTime_week` - 周
- `UTime_month` - 月
- `UTime_quarter` - 季度
- `UTime_year` - 年
- `UTime_century` - 世纪
- `UTime_millennium` - 千年
- `UTime_megaannum` - 百万年

**功率单位：**
- `UPower_pW` - 皮瓦
- `UPower_nW` - 纳瓦
- `UPower_uW` - 微瓦
- `UPower_mW` - 毫瓦
- `UPower_W` - 瓦特
- `UPower_KW` - 千瓦
- `UPower_MW` - 兆瓦
- `UPower_GW` - 吉瓦
- `UPower_TW` - 太瓦
- `UPower_Hp` - 马力
- `UPower_Ps` - 公制马力
- `UPower_BtuPers` - 英热单位/秒
- `UPower_calPers` - 卡路里/秒
- `UPower_KcalPers` - 千卡/秒
- `UPower_KcalPerh` - 千卡/小时
- `UPower_BtnPerh` - 英热单位/小时
- `UPower_KgfmPers` - 公斤力·米/秒
- `UPower_ftlbfPers` - 英尺·磅力/秒
- `UPower_ftlbfPermin` - 英尺·磅力/分钟
- `UPower_ergPers` - 尔格/秒

### 6. 注意事项

1. **包名**：确保导入正确的包名 `com.zishuimuyu.science.units.*`
2. **单位验证**：不同量纲的单位不能直接相加减，会抛出 `UnitsNotSameException`
3. **工厂方法**：推荐使用 `UnitUtils.getUnit()` 方法获取单位实例，提高性能
4. **精度控制**：项目使用 `double` 类型进行计算，注意浮点数精度问题
5. **温度转换**：温度转换考虑了偏移量，确保转换的准确性

## 集成测试示例

创建一个简单的测试类验证集成是否成功：

```java
import com.zishuimuyu.science.units.UnitUtils;
import com.zishuimuyu.science.units.ValueWithUnit;
import com.zishuimuyu.science.units.length.ULength_m;

public class IntegrationTest {
    public static void main(String[] args) {
        System.out.println("UnitsConvert 集成测试");
        
        // 测试基本功能
        ValueWithUnit length = new ValueWithUnit(1.0, new ULength_m());
        ValueWithUnit cm = length.convertTo(UnitUtils.getUnit("ULength_cm"));
        
        System.out.println("1米 = " + cm.getValue() + "厘米");
        
        if (Math.abs(cm.getValue() - 100.0) < 0.001) {
            System.out.println("集成成功！");
        } else {
            System.out.println("集成失败！");
        }
    }
}
```

## 故障排除

如果遇到类找不到的问题，请检查：
1. 依赖是否正确添加到项目中
2. 包名是否正确（`com.zishuimuyu.science.units`）
3. Java版本兼容性（项目使用Java 8编译）

## 许可证

本项目采用Apache License Version 2.0协议发布。

## 版权信息

本源代码知识产权属于斯塔克工业（STK）所有。

**官方网址：** http://www.stk.cn

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
- 官方网站：http://www.stk.cn
- 项目Issues：在GitHub上提交Issue

## 更新日志

### 当前版本
- 支持11个物理量类别的单位转换
- 包含国际单位制、英制单位、中国传统单位
- 提供完整的单位运算功能
- 支持自定义单位扩展
- 项目已从NetBeans项目迁移到Maven项目结构
- 支持现代Java构建和依赖管理
- 功率单位现已支持从皮瓦(pW)到太瓦(TW)的完整范围，以及工程和物理常用单位如BTU/h、kcal/h、ft·lbf/min、erg/s等
- 所有单位换算关系表已整合至本README文件中，便于查阅