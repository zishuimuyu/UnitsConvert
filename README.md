# UnitsConvert - 专业单位转换库

## 目录

- [项目概述](#项目概述)
- [快速开始](#快速开始)
- [核心架构](#核心架构)
- [单位分类体系](#单位分类体系)
- [核心功能特性](#核心功能特性)
- [API 速查表](#api-速查表)
- [使用示例](#使用示例)
- [设计模式](#设计模式)
- [技术特点](#技术特点)
- [项目结构](#项目结构)
- [构建和运行](#构建和运行)
- [单元测试与覆盖率](#单元测试与覆盖率)
- [第三方系统集成指南](#第三方系统集成指南)
- [集成测试示例](#集成测试示例)
- [故障排除](#故障排除)
- [许可证](#许可证)
- [版权信息](#版权信息)
- [贡献指南](#贡献指南)
- [联系方式](#联系方式)
- [更新日志](#更新日志)

## 项目概述

**UnitsConvert** 是一个专业的Java单位转换库，由斯塔克工业（STK）开发，采用Apache License 2.0协议发布。该项目主要服务于石油、化工、核电、建筑等传统行业的工程计算需求。

## 快速开始

三步上手：获取单位 → 绑定数值 → 换算。

```java
import com.zishuimuyu.science.units.UnitUtils;
import com.zishuimuyu.science.units.ValueWithUnit;

// 1 千米 → 换算为米
ValueWithUnit km = new ValueWithUnit(1.0, UnitUtils.getUnit("ULength_Km"));
ValueWithUnit m = km.convertTo(UnitUtils.getUnit("ULength_m"));
System.out.println(m.getValue() + " " + m.getUnit().getDescription()); // 1000.0 m
```

> `UnitUtils.getUnit()` 传入的是**类名**（如 `"ULength_Km"`）；若加载失败返回 `null`，需判空。更多用法见下文[使用示例](#使用示例)。

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
封装基本单位类型和指数，用于构建复合单位（如 `N = Kg·m·s⁻²`）

#### ValueWithUnit - 带单位的数据类
封装数值和单位，支持：
- 带单位的四则运算和幂运算
- 单位转换功能
- 量纲验证

#### UnitUtils - 单位管理工具类
提供工厂方法获取单位实例，实现单位单例模式，提高性能

## 单位分类体系

项目按物理量分类，包含以下12个类别：

### 1. 长度 (length) - 锚点单位: 米 (`m`) [共32个单位]

| 序号 | 单位名称 | 符号 | 换算关系（米） | 应用场景 |
|------|---------|------|---------------|----------|
| 1 | 幺米 | ym | 10⁻²⁴m | 理论物理学、弦理论 |
| 2 | 仄米 | zm | 10⁻²¹m | 理论物理学 |
| 3 | 阿米 | am | 10⁻¹⁸m | 理论物理学 |
| 4 | 飞米 | fm | 10⁻¹⁵m | 核物理学、原子核尺度测量 |
| 5 | 皮米 | pm | 10⁻¹²m | 原子物理学、化学键长 |
| 6 | 埃 | Å | 10⁻¹⁰m | 原子物理、晶体学、化学键长 |
| 7 | 纳米 | nm | 10⁻⁹m | 纳米技术、分子生物学 |
| 8 | 微米 | um | 10⁻⁶m | 微观尺度测量、细胞尺寸 |
| 9 | 毫米 | mm | 10⁻³m | 工程图纸、机械零件 |
| 10 | 英寸 | in | 2.54×10⁻²m | 工业制造、屏幕尺寸 |
| 11 | 传统分 | fen | 3.333×10⁻³m | 中国传统长度 |
| 12 | 厘米 | cm | 10⁻²m | 日常生活、服装尺码 |
| 13 | 传统寸 | cun | 3.333×10⁻²m | 中国传统长度（1/30 m） |
| 14 | 分米 | dm | 10⁻¹m | 教育教学 |
| 15 | 传统尺 | chi | 0.3333m | 中国传统长度（1/3 m） |
| 16 | 英尺 | ft | 0.3048m | 建筑工程、高度测量 |
| 17 | 码 | yd | 0.9144m | 体育场地、布料销售 |
| 18 | 米 | m | 1m | 国际单位制基本单位 |
| 19 | 传统丈 | zhang | 3.333m | 中国传统长度（10/3 m） |
| 20 | 寻 | fathom | 1.8288m | 海洋深度测量 |
| 21 | 手宽 | hand | 0.1016m | 马匹高度测量 |
| 22 | 跋 | fur | 201.168m | 传统土地测量 |
| 23 | 传统里 | li | 500m | 中国传统长度、土地测量 |
| 24 | 千米 | Km | 10³m | 地理距离、交通里程 |
| 25 | 英里 | mi | 1609.344m | 长距离交通、航空航海 |
| 26 | 海里 | nmi | 1852m | 航海航空导航 |
| 27 | 兆米 | Mm | 10⁶m | 大地测量、行星半径 |
| 28 | 吉米 | Gm | 10⁹m | 天文学、行星间距离 |
| 29 | 天文单位 | AU | 1.496×10¹¹m | 天文学、太阳系距离 |
| 30 | 光年 | ly | 9.46×10¹⁵m | 天文学、宇宙距离 |
| 31 | 秒差距 | pc | 3.086×10¹⁶m | 天文学、恒星距离 |
| 32 | 尧米 | Ym | 10²⁴m | 宇宙学 |

### 2. 面积 (area) - 锚点单位: 平方米 (`m²`) [共24个单位]

| 序号 | 单位名称 | 符号 | 换算关系（平方米） | 应用场景 |
|------|---------|------|-------------------|----------|
| 1 | 靶恩 | b | 10⁻²⁸m² | 核物理、粒子物理 |
| 2 | 平方纳米 | nm² | 10⁻¹⁸m² | 纳米技术、半导体制造 |
| 3 | 平方微米 | μm² | 10⁻¹²m² | 细胞生物学、材料科学 |
| 4 | 平方毫米 | mm² | 10⁻⁶m² | 微小面积、精密加工 |
| 5 | 平方厘米 | cm² | 10⁻⁴m² | 小面积测量、实验室 |
| 6 | 平方英寸 | in² | 6.452×10⁻⁴m² | 精密工程、小面积 |
| 7 | 平方分米 | dm² | 10⁻²m² | 中小面积测量 |
| 8 | 平方英尺 | ft² | 0.0929m² | 建筑、房地产 |
| 9 | 平方米 | m² | 1m² | 国际单位制面积基本单位 |
| 10 | 平方码 | yd² | 0.8361m² | 美国建筑、纺织 |
| 11 | 平方杆 | rd² | 25.293m² | 英制传统土地测量 |
| 12 | 分（亩制） | fen | 66.667m² | 中国传统土地测量 |
| 13 | 公亩 | a | 10²m² | 欧洲土地测量 |
| 14 | 市亩 | mu | 666.67m² | 中国农业、土地测量 |
| 15 | 町 | cho | 991.736m² | 日本土地测量 |
| 16 | 英亩 | acre | 4046.86m² | 英制/美制土地测量 |
| 17 | 公顷 | ha | 10⁴m² | 农业、林业、土地规划 |
| 18 | 顷 | qing | 6.667×10⁴m² | 中国传统大面积测量 |
| 19 | 平方千米 | Km² | 10⁶m² | 大面积土地、地理测量 |
| 20 | 平方英里 | mi² | 2.59×10⁶m² | 大面积土地、地理测量 |
| 21 | 平方兆米 | Mm² | 10¹²m² | 地理学、天体物理 |
| 22 | 平方天文单位 | AU² | 2.238×10²²m² | 天文学、太阳系距离 |
| 23 | 平方光年 | ly² | 8.95×10³¹m² | 天文学 |
| 24 | 平方秒差距 | pc² | 9.52×10³²m² | 天文学、宇宙学 |

> 注：英亩与常用面积单位的换算关系：`1 mi²（平方英里）= 640 acre（英亩）`，`1 acre = 4840 yd² = 4046.86 m² ≈ 0.4047 ha（公顷）`。源码中 `UArea_acre` 的因子由 `UArea_ft2` 推导（`1 acre = 43560 ft²`），与库内平方英尺定义保持一致。

### 3. 质量 (mass) - 锚点单位: 千克 (`Kg`) [共30个单位]

| 序号 | 单位名称 | 符号 | 换算关系（千克） | 应用场景 |
|------|---------|------|------------------|----------|
| 1 | 阿托克 | ag | 10⁻²¹kg | 理论物理、基本粒子 |
| 2 | 飞克 | fg | 10⁻¹⁸kg | 分子物理学 |
| 3 | 皮克 | pg | 10⁻¹⁵kg | 分子生物学、纳米技术 |
| 4 | 纳克 | ng | 10⁻¹²kg | 医学、药学、环境检测 |
| 5 | 微克 | μg | 10⁻⁹kg | 精密化学、医学检验 |
| 6 | 毫克 | mg | 10⁻⁶kg | 医药剂量、化学试剂 |
| 7 | 原子质量单位 | u | 1.6605×10⁻²⁷kg | 原子物理、生物化学 |
| 8 | 格令 | gr | 6.48×10⁻⁵kg | 珠宝、弹药 |
| 9 | 打兰 | dr | 1.77×10⁻³kg | 药物计量、珠宝 |
| 10 | 克 | g | 10⁻³kg | 日常食品、小件物品 |
| 11 | 克拉 | ct | 2.0×10⁻⁴kg | 珠宝、宝石 |
| 12 | 金衡盎司 | oz t | 3.11×10⁻²kg | 贵金属、珠宝 |
| 13 | 盎司 | oz | 2.84×10⁻²kg | 食品包装、贵金属 |
| 14 | 钱 | qian | 5.0×10⁻³kg | 传统中药 |
| 15 | 两 | liang | 5.0×10⁻²kg | 传统市场、中药 |
| 16 | 斤 | jin | 0.5kg | 传统市场、日常购物 |
| 17 | 磅 | lb | 0.4536kg | 体重测量、商品重量 |
| 18 | 英石 | st | 6.35kg | 人体重量（英国） |
| 19 | 夸特 | quarter | 12.7kg | 英制传统（=28 lb，=2 st） |
| 20 | 担 | dan | 50kg | 农业产量、大宗货物 |
| 21 | 公担 | q | 100kg | 农业、商业（公担，符号 q） |
| 22 | 公担 | q2 | 100kg | 公制质量（与 q 同值） |
| 23 | 千克 | Kg | 1kg | 国际单位制基本单位 |
| 24 | 美吨 | UStf | 907.185kg | 美国货物运输 |
| 25 | 长吨 | lt | 1016.047kg | 英国货物运输 |
| 26 | 兆克 | Mg | 10³kg | 科学文献（等同吨） |
| 27 | 吨 | t | 10³kg | 工业生产、货物运输 |
| 28 | 月球质量 | ML | 7.34×10²²kg | 天文学、月球研究 |
| 29 | 地球质量 | ME | 5.97×10²⁴kg | 天文学、行星科学 |
| 30 | 太阳质量 | M☉ | 1.99×10³⁰kg | 天文学、宇宙学 |

### 4. 时间 (time) - 锚点单位: 秒 (`s`) [共24个单位]

| 序号 | 单位名称 | 符号 | 换算关系（秒） | 典型应用场景 |
|------|---------|------|---------------|-------------|
| 1 | 幺秒 | ys | 10⁻²⁴s | 理论物理学 |
| 2 | 仄秒 | zs | 10⁻²¹s | 理论物理学 |
| 3 | 阿秒 | as | 10⁻¹⁸s | 原子物理学 |
| 4 | 普朗克时间 | tP | 5.39×10⁻⁴⁴s | 量子引力 |
| 5 | 飞秒 | fs | 10⁻¹⁵s | 化学反应动力学 |
| 6 | 皮秒 | ps | 10⁻¹²s | 激光脉冲、半导体 |
| 7 | 纳秒 | ns | 10⁻⁹s | 计算机、通信 |
| 8 | 微秒 | μs | 10⁻⁶s | 电子设备、高速测量 |
| 9 | 毫秒 | ms | 10⁻³s | 计算机响应、日常延迟 |
| 10 | 秒 | s | 1s | 日常时间、国际单位制 |
| 11 | 分钟 | min | 60s | 会议、计时 |
| 12 | 小时 | h | 3,600s | 工作时间、旅行 |
| 13 | 刻 | ke | 900s | 中国传统时间 |
| 14 | 天 | day | 86,400s | 日周期 |
| 15 | 时辰 | shichen | 7,200s | 中国传统时间 |
| 16 | 周 | week | 604,800s | 工作周期 |
| 17 | 双周 | fortnight | 1,209,600s | 英美传统时间 |
| 18 | 朔望月 | lunarMonth | 2,551,443s | 历法、潮汐、天文 |
| 19 | 月 | month | ~2.63×10⁶s | 合同、结算 |
| 20 | 季度 | quarter | ~7.89×10⁶s | 财务周期 |
| 21 | 年 | year | ~3.16×10⁷s | 年龄、历史 |
| 22 | 世纪 | century | ~3.16×10⁹s | 历史时期 |
| 23 | 千年 | millennium | ~3.16×10¹⁰s | 文明发展 |
| 24 | 百万年 | megaannum | ~3.16×10¹³s | 地质演化 |

### 5. 温度 (temperature) - 锚点单位: 开尔文 (`K`) [共10个单位]

| 序号 | 单位名称 | 符号 | 换算关系 | 应用场景 |
|------|---------|------|----------|----------|
| 1 | 列氏度 | Re | °Re = 4/5°C | 历史科学文献 |
| 2 | 德氏度 | De | °C = 100 - °De × 2/3 | 18-19世纪俄罗斯 |
| 3 | 湿球温度 | W | 与°C同刻度（数值随湿度而变，非固定换算单位） | 暖通空调、气象学 |
| 4 | 摄氏度 | C | °C = K - 273.15 | 日常生活、气象、科学 |
| 5 | 罗氏度 | Rø | °C = (°Rø - 7.5) × 40/21 | 18世纪航海、气象 |
| 6 | 华氏度 | F | °F = 9/5°C + 32 | 美国日常生活 |
| 7 | 牛氏度 | N | °C = °N × 100/33 | 物理学史 |
| 8 | 兰氏度 | Ra | °R = 9/5K | 工程热力学 |
| 9 | 开尔文 | K | K = °C + 273.15 | 科学研究、绝对零度 |
| 10 | 普朗克温度 | TP | 1 TP = 1.42×10³² K | 宇宙学、理论物理极限 |

### 6. 力 (force) - 锚点单位: 牛顿 (`N`) [共14个单位]

| 序号 | 单位名称 | 符号 | 换算关系（牛顿） | 应用场景 |
|------|---------|------|------------------|----------|
| 1 | 微牛顿 | uN | 10⁻⁶N | 微观粒子研究、纳米技术 |
| 2 | 达因 | dyn | 10⁻⁵N | 微观力测量 |
| 3 | 毫牛顿 | mN | 10⁻³N | 精密仪器、微型机械 |
| 4 | 克力 | gf | 9.81×10⁻³N | 实验室精密测量 |
| 5 | 盎司力 | ozf | 0.278N | 轻型机械、精密仪器 |
| 6 | 磅力 | lbf | 4.448N | 工程力学、航空航天 |
| 7 | 牛顿 | N | 1N | 国际单位制基本单位 |
| 8 | 千克力 | Kgf | 9.807N | 工程技术、起重设备 |
| 9 | 千牛顿 | KN | 10³N | 结构工程、大型机械 |
| 10 | 短吨力 | STf | 8896.44N | 美制工程、起重设备（=2000 lbf，英制长吨力应约9964N） |
| 11 | 美吨力 | UStf | 8896.44N | 美国工程标准 |
| 12 | 吨力 | tf | 9806.65N | 重型机械、起重能力 |
| 13 | 千磅力 | kip | 4448.22N | 土木工程、建筑结构 |
| 14 | 兆牛顿 | MN | 10⁶N | 大型结构工程、桥梁 |

### 7. 压强 (pressure) - 锚点单位: 帕斯卡 (`Pa`) [共13个单位]

| 序号 | 单位名称 | 符号 | 换算关系（帕斯卡） | 应用场景 |
|------|---------|------|--------------------|----------|
| 1 | 千克力/平方米 | Kgf/m² | 9.807Pa | 工程技术、老旧文献 |
| 2 | 磅力/平方英尺 | lbf/ft² | 47.88Pa | 美国工程标准 |
| 3 | 毫米汞柱 | mmHg | 133.322Pa | 医学血压测量 |
| 4 | 托 | Torr | 133.322Pa | 真空技术、科学实验 |
| 5 | 毫巴 | mbar | 100Pa | 气象学、低压测量 |
| 6 | 百帕 | HPa | 100Pa | 气象学、大气压力 |
| 7 | 千帕 | KPa | 10³Pa | 工程技术、轮胎气压 |
| 8 | 帕斯卡 | Pa | 1Pa | 国际单位制基本单位 |
| 9 | 磅力/平方英寸 | lbf/in² | 6894.76Pa | 工业、轮胎压力 |
| 10 | 巴 | bar | 10⁵Pa | 工业工程、气体压力 |
| 11 | 标准大气压 | atm | 101325Pa | 科学标准、实验室 |
| 12 | 兆帕 | MPa | 10⁶Pa | 高压工程、材料强度 |
| 13 | 千磅力/平方英寸 | ksi | 6.895×10⁶Pa | 材料工程、高强度钢 |

### 8. 能量 (energy) - 锚点单位: 焦耳 (`J`) [共17个单位]

| 序号 | 单位名称 | 符号 | 换算关系（焦耳） | 应用场景 |
|------|---------|------|------------------|----------|
| 1 | 电子伏特 | eV | 1.60×10⁻¹⁹J | 粒子物理、原子物理 |
| 2 | 尔格 | erg | 10⁻⁷J | 历史物理文献 |
| 3 | 焦耳 | J | 1J | 国际单位制基本单位 |
| 4 | 卡路里 | cal | 4.184J | 营养学、热力学 |
| 5 | 英尺·磅力 | ftlbf | 1.356J | 美国工程、机械功 |
| 6 | 千克力·米 | Kgfm | 9.807J | 工程技术、机械功 |
| 7 | 瓦时 | Wh | 3600J | 电力计量、电池容量 |
| 8 | 千卡 | Kcal | 4184J | 营养学、食物热量 |
| 9 | 英热单位 | Btn | 1055.06J | 空调制冷、能源计量 |
| 10 | 标准立方英尺 | scf | 2.68×10³J | 天然气计量 |
| 11 | 千焦 | KJ | 10³J | 化学反应、营养标签 |
| 12 | 千瓦时 | KWh | 3.6×10⁶J | 电力计量、家庭用电 |
| 13 | 兆焦 | MJ | 10⁶J | 大型能源、化学反应 |
| 14 | 千克标准煤 | kgce | 29.26×10⁶J | 能源统计、中国标准 |
| 15 | 吨TNT当量 | tTNT | 4.184×10⁹J | 爆炸力学、军事 |
| 16 | 吉焦 | GJ | 10⁹J | 大型工程、能源统计 |
| 17 | 吨油当量 | toe | 41.87×10⁹J | 能源统计、国际标准 |

> 注：本库中英热单位符号统一采用 `Btn`（对应类 `UEnergy_Btn`、`UPower_BtnPers`、`UPower_BtnPerh`），即 BTU/Btu。

### 9. 功率 (power) - 锚点单位: 瓦特 (`W`) [共19个单位]

| 序号 | 单位名称 | 符号 | 换算关系（瓦特） | 应用场景 |
|------|---------|------|------------------|----------|
| 1 | 尔格/秒 | ergPers | 10⁻⁷W | 历史物理文献 |
| 2 | 皮瓦 | pW | 10⁻¹²W | 微电子、生物信号 |
| 3 | 纳瓦 | nW | 10⁻⁹W | 微电子、传感器 |
| 4 | 微瓦 | uW | 10⁻⁶W | 微电子、射频信号 |
| 5 | 英热单位/小时 | BtnPerh | 0.2931W | 空调制冷 |
| 6 | 英尺·磅力/分钟 | ftlbfPermin | 0.0226W | 美国工程 |
| 7 | 英尺·磅力/秒 | ftlbfPers | 1.356W | 美国工程 |
| 8 | 卡路里/秒 | calPers | 4.184W | 生物代谢、热交换 |
| 9 | 千卡/小时 | KcalPerh | 1.163W | 制冷制热 |
| 10 | 公斤力·米/秒 | KgfmPers | 9.807W | 工程技术 |
| 11 | 毫瓦 | mW | 10⁻³W | 小型电子设备、激光器 |
| 12 | 公制马力 | Ps | 735.5W | 欧洲发动机功率 |
| 13 | 马力 | Hp | 745.7W | 发动机功率、汽车工业 |
| 14 | 英热单位/秒 | BtnPers | 1055.06W | 空调制冷 |
| 15 | 瓦特 | W | 1W | 国际单位制基本单位 |
| 16 | 千瓦 | KW | 10³W | 家用电器、小型发动机 |
| 17 | 兆瓦 | MW | 10⁶W | 电站发电、大型设备 |
| 18 | 吉瓦 | GW | 10⁹W | 大型电站、国家电网 |
| 19 | 太瓦 | TW | 10¹²W | 国家电力、全球能源 |

### 10. 加速度 (accelerate) - 锚点单位: 米/秒² (`m/s²`) [共7个单位]

| 序号 | 单位名称 | 符号 | 换算关系（米/秒²） | 应用场景 |
|------|---------|------|-------------------|----------|
| 1 | 毫米/秒² | mm/s² | 0.001m/s² | 精密工程、微小加速度 |
| 2 | 厘米/秒² | cm/s² | 0.01m/s² | CGS制、精密工程 |
| 3 | 英寸/秒² | in/s² | 0.0254m/s² | 精密仪器、小型机械 |
| 4 | 英尺/秒² | ft/s² | 0.3048m/s² | 美国工程、航空 |
| 5 | 伽 | gal | 0.01m/s² | 地球物理学、地震学 |
| 6 | 米/秒² | m/s² | 1m/s² | 国际单位制基本单位 |
| 7 | 重力加速度 | g | 9.807m/s² | 工程技术、重力相关计算 |

### 11. 速度 (velocity) - 锚点单位: 米/秒 (`m/s`) [共19个单位]

| 序号 | 单位名称 | 符号 | 换算关系（米/秒） | 应用场景 |
|------|---------|------|------------------|----------|
| 1 | 毫米/分 | mm/min | 1.67×10⁻⁵m/s | 精密测量 |
| 2 | 厘米/分 | cm/min | 1.67×10⁻⁴m/s | 精密测量 |
| 3 | 米/分 | m/min | 0.0167m/s | 工业测量 |
| 4 | 毫米/秒 | mm/s | 0.001m/s | 精密工程、微小速度 |
| 5 | 英寸/秒 | in/s | 0.0254m/s | 精密机械、低速 |
| 6 | 厘米/秒 | cm/s | 0.01m/s | CGS制速度单位 |
| 7 | 英尺/秒 | ft/s | 0.3048m/s | 美国工程、风速 |
| 8 | 码/秒 | yd/s | 0.9144m/s | 美国工程 |
| 9 | 分米/秒 | dm/s | 0.1m/s | 中等速度测量 |
| 10 | 千米/时 | Km/h | 0.2778m/s | 交通运输、车辆速度 |
| 11 | 英里/时 | mi/h | 0.4470m/s | 交通运输、美国车速 |
| 12 | 米/秒 | m/s | 1m/s | 国际单位制基本单位 |
| 13 | 海里/时 | nmi/h | 0.5144m/s | 航海航空 |
| 14 | 节 | kn | 0.5144m/s | 航海航空、船舶飞机 |
| 15 | 千米/分 | Km/min | 16.67m/s | 交通运输 |
| 16 | 马赫 | Ma | 343m/s | 航空动力学、声速 |
| 17 | 英里/秒 | mi/s | 1609.344m/s | 高速运动 |
| 18 | 千米/秒 | Km/s | 10³m/s | 航天飞行、高速运动 |
| 19 | 光速 | c | 299792458m/s | 物理学、相对论 |

> 注：“节”（kn）与“海里/时”（nmi/h）为等价单位：源码中 `UVelocity_kn` 与 `UVelocity_nmiPerh` 的因子均为 `0.514444 m/s`，即 `1 kn = 1 nmi/h ≈ 0.5144 m/s`（1 节 = 1 海里每小时）。二者可互换，仅为航海/航空场景的不同表述习惯。

### 12. 体积 (volume) - 锚点单位: 立方米 (`m³`) [共33个单位]

| 序号 | 单位名称 | 符号 | 换算关系（立方米） | 应用场景 |
|------|---------|------|------------------|----------|
| 1 | 立方毫米 | mm³ | 10⁻⁹m³ | 微小容积、精密测量 |
| 2 | 液量打兰 | fl dr | 3.55×10⁻⁶m³ | 英制液体计量 |
| 3 | 毫升 | mL | 10⁻⁶m³ | 实验室、药品 |
| 4 | 市撮 | 撮 (cuō) | 10⁻⁶m³ | 中国传统液体单位 |
| 5 | 立方厘米 | cm³ | 10⁻⁶m³ | 实验室、小容器 |
| 6 | 厘升 | cL | 10⁻⁵m³ | 欧洲酒类容量 |
| 7 | 市勺 | 勺 (sháo) | 10⁻⁵m³ | 中国传统液体单位 |
| 8 | 液量盎司 | fl oz | 2.84×10⁻⁵m³ | 英制液体计量 |
| 9 | 分升 | dL | 10⁻⁴m³ | 欧洲液体测量 |
| 10 | 市合 | 合 (gě) | 10⁻⁴m³ | 中国传统液体单位 |
| 11 | 立方英寸 | in³ | 1.64×10⁻⁵m³ | 美国精密测量 |
| 12 | 升 | L | 10⁻³m³ | 日常液体测量 |
| 13 | 市升 | 升 (shēng) | 10⁻³m³ | 中国传统液体单位 |
| 14 | 立方分米 | dm³ | 10⁻³m³ | 中等容积测量 |
| 15 | 液量品脱 | fl pt | 4.73×10⁻⁴m³ | 英制液体计量 |
| 16 | 干量品脱 | dry pt | 5.51×10⁻⁴m³ | 美制干量单位 |
| 17 | 液量夸脱 | fl qt | 9.46×10⁻⁴m³ | 英制液体计量 |
| 18 | 干量夸脱 | dry qt | 1.10×10⁻³m³ | 美制干量单位 |
| 19 | 加仑 | gal | 3.79×10⁻³m³ | 美制液体计量 |
| 20 | 干量加仑 | dry gal | 4.40×10⁻³m³ | 美制干量单位 |
| 21 | 英制加仑 | imp gal | 4.546×10⁻³m³ | 英国及英联邦液体计量 |
| 22 | 蒲式耳 | pk | 8.81×10⁻³m³ | 美制干量（谷物） |
| 23 | 十升 | daL | 10⁻²m³ | 工业液体测量 |
| 24 | 市斗 | 斗 (dǒu) | 10⁻²m³ | 中国传统液体单位 |
| 25 | 百升 | hL | 10⁻¹m³ | 啤酒酿造 |
| 26 | 市石 | 石 (dàn) | 10⁻¹m³ | 中国传统液体单位 |
| 27 | 立方米 | m³ | 1m³ | 国际单位制基本单位 |
| 28 | 石油桶 | bbl | 0.159m³ | 石油工业 |
| 29 | 立方英尺 | ft³ | 0.0283m³ | 美国工程、空间测量 |
| 30 | 立方码 | yd³ | 0.7646m³ | 美国土木工程 |
| 31 | 立方十米 | dam³ | 10³m³ | 较大容积测量 |
| 32 | 立方百米 | hm³ | 10⁶m³ | 大型容积测量 |
| 33 | 立方千米 | Km³ | 10⁹m³ | 极大容积测量 |

> 注：符号列中括号内为汉字读音拼音（作为量词时，「合」读 gě、「石」读 dàn）。另需注意类名拼音与汉字读音并不总是一致：如 `UVolume_sheng` 对应的是「合」，而 `UVolume_sheng_L` 才对应「升」；`getUnit()` 请传类名（如 `UVolume_sheng`）。
>
> 注（加仑）：本库同时提供三种加仑，不可混用——`gal`（美制液体加仑，=231 in³ ≈ 3.785 L）、`dry gal`（美制干量加仑 ≈ 4.405 L）、`imp gal`（英制加仑，≈ 4.546 L）。英制加仑比美制液体加仑大约 20%（`1 imp gal ≈ 1.201 US gal`）。

## 核心功能特性

### 1. 精确的单位转换
- 支持同量纲单位间的精确转换
- 处理温度等有偏移量的单位转换
- 转换公式：`newValue = (value × factor + addition - destAddition) / destFactor`

#### 换算值精度说明
表格中的换算值分为两类，使用时请注意区分：

- **定义精确值**：由国际协议或单位定义严格确定，无误差。例如长度 `in=2.54×10⁻²m`、`ft=0.3048m`、`mi=1609.344m`、`nmi=1852m`；质量 `lb=0.45359237kg`；压强 `atm=101325Pa`；全部 SI 词头（千、兆、纳等 10 的整数次幂）；中国传统 `尺=1/3 m`、`寸=1/30 m`、`丈=10/3 m` 等定比关系。
- **近似值**：依赖于天文观测、物理常数或约定俗成，表格中以 `~` 或有限小数标注，仅供估算。例如时间 `月/年/世纪/千年/百万年`（回归年长度逐年微变）、`朔望月`；长度 `AU/光年/秒差距`；能量 `kgce/toe`（标准煤/油当量为约定热值）；加速度 `g`（标准重力 9.80665）、速度 `马赫`（声速随介质/温度而变，表中取 343 m/s）。

> 说明：表中数值均按有效数字做了四舍五入显示；如需完全精度，请以源码中各类 `factor` 字段的字面量为准（如 `UMass_lb.factor = 0.45359237`）。

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

## API 速查表

> 以下方法签名均依据源码整理。注意：减法方法名为 `sub`（非 `subtract`），幂运算方法名为 `power`（非 `pow`）。

### ValueWithUnit（带单位数值，`final` 类）

| 方法 | 返回 | 说明 |
|------|------|------|
| `ValueWithUnit(double value, DerivedUnit unit)` | 构造 | 绑定数值与单位 |
| `add(ValueWithUnit vwu)` | ValueWithUnit | 同量纲相加，自动换算，结果保留当前单位 |
| `sub(ValueWithUnit vwu)` | ValueWithUnit | 同量纲相减，自动换算，结果保留当前单位 |
| `multiply(ValueWithUnit vwu)` | ValueWithUnit | 相乘，按基本单位组合出新复合单位（忽略偏移） |
| `divide(ValueWithUnit vwu)` | ValueWithUnit | 相除，按基本单位组合出新复合单位（忽略偏移） |
| `power(double pow)` | ValueWithUnit | 幂运算，数值与单位指数同步变化 |
| `convertTo(DerivedUnit destUnit)` | ValueWithUnit | 完整转换（含偏移量），如温度 |
| `convertToWithoutAdditional(DerivedUnit destUnit)` | ValueWithUnit | 忽略偏移的转换，用于温差等场景 |
| `getBasicValue()` | double | 基本单位制下的数值（含偏移） |
| `getBasicValueWithoutAdditional()` | double | 基本单位制下的数值（忽略偏移） |
| `getValue()` | double | 获取数值部分 |
| `getUnit()` | DerivedUnit | 获取单位部分 |
| `toString()` | String | 调试用字符串 |

### DerivedUnit（导出单位抽象基类）

| 方法 | 返回 | 说明 |
|------|------|------|
| `multiply(DerivedUnit unit)` | DerivedUnit | 单位相乘，返回 `UCommon` 复合单位 |
| `divide(DerivedUnit unit)` | DerivedUnit | 单位相除，返回 `UCommon` 复合单位 |
| `power(double pow)` | DerivedUnit | 单位幂运算，返回 `UCommon` 复合单位 |
| `isSameAs(DerivedUnit unit)` | boolean | 判断是否属于同一量纲（可互转） |
| `isEqual(DerivedUnit unit)` | boolean | 判断是否完全相同（含因子/偏移） |
| `copy()` | DerivedUnit | 深拷贝当前单位 |
| `getStandardFormat()` | String | 标准格式串，如 `Kg*m*s^-2` |
| `getDescription()` | String | 单位描述符号，如 `m`、`MPa` |
| `getUnits()` | List\<UnitElement\> | 基本单位元素列表的副本 |
| `getFactor()` | double | 相对基本单位的转换因子 |
| `getAddition()` | double | 相对基本单位的偏移量 |

### UnitUtils（单位工厂/单例管理）

| 方法 | 返回 | 说明 |
|------|------|------|
| `UnitUtils.getUnit(String name)` | DerivedUnit | 按类名（如 `ULength_m`）获取单位单例，加载失败返回 `null` |

### UnitElement（基本单位 + 指数）

| 方法 | 返回 | 说明 |
|------|------|------|
| `getUnit()` | BasicUnit | 获取基本单位类型 |
| `getExp()` | double | 获取指数 |
| `setExp(double exp)` | void | 设置指数 |
| `copy()` | UnitElement | 拷贝元素 |
| `isEqual(UnitElement element)` | boolean | 比较基本单位与指数是否一致 |

### 相关异常

| 异常 | 触发场景 |
|------|----------|
| `UnitsNotSameException` | `add`/`sub`/`convertTo` 等遇到不同量纲时抛出 |
| `BasicUnitDuplicateException` | 构造单位时 `elementList` 含重复基本单位 |

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

> **温度转换的特殊性**：与普通单位只含倍数因子 `factor` 不同，温度类单位额外使用偏移量 `addition`（零点偏移）。以华氏度为例，其定义为 `°F = 9/5°C + 32`，换算含非零偏移，因此必须走带 `addition` 的 `convertTo()` 完整转换；若错用 `convertToWithoutAdditional()`（忽略偏移）则会得到错误结果。
>
> **温差 vs 温度**：`convertTo()` 用于“某个温度值”的换算（含零点偏移）；而“温差/温度变化量”只关心倍数关系，应使用 `convertToWithoutAdditional()` 或 `getBasicValueWithoutAdditional()`。例如“升高 10°C”等于“升高 18°F”（只乘 9/5），而不是按绝对温度换算后的 50°F。

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

```java
// 面积计算：长 × 宽（两个长度相乘自动得到 m² 复合单位）
ValueWithUnit length = new ValueWithUnit(5.0, new ULength_m());
ValueWithUnit width = new ValueWithUnit(3.0, new ULength_m());
ValueWithUnit area = length.multiply(width);
System.out.println("Area: " + area.getValue() + " " + area.getUnit().getStandardFormat()); // 15.0 [m^2.0]

// 密度计算：质量 ÷ 体积（自动得到 Kg/m³ 复合单位）
ValueWithUnit mass = new ValueWithUnit(1000.0, new com.zishuimuyu.science.units.mass.UMass_Kg());
ValueWithUnit vol = new ValueWithUnit(1.0, new com.zishuimuyu.science.units.volume.UVolume_m3());
ValueWithUnit density = mass.divide(vol);
System.out.println("Density: " + density.getValue() + " " + density.getUnit().getStandardFormat()); // 1000.0 [Kg^1.0, m^-3.0]
```

> 提示：`multiply`/`divide` 返回的是由基本单位拼合的 `UCommon` 复合单位，`getStandardFormat()` 以基本单位幂次形式展示（如 `Kg^1.0, m^-3.0`）。若需换算为某个具名单位，可再调用 `convertTo(目标单位)`。

### 异常处理示例

当对**不同量纲**的单位执行 `add`/`sub`/`convertTo` 时，会抛出 `UnitsNotSameException`，应捕获处理：

```java
import com.zishuimuyu.science.units.UnitsNotSameException;
import com.zishuimuyu.science.units.length.ULength_m;
import com.zishuimuyu.science.units.mass.UMass_Kg;
import com.zishuimuyu.science.units.ValueWithUnit;

try {
    ValueWithUnit len = new ValueWithUnit(1.0, new ULength_m());
    ValueWithUnit mass = new ValueWithUnit(1.0, new UMass_Kg());
    // 长度 + 质量：量纲不匹配
    ValueWithUnit bad = len.add(mass);
} catch (UnitsNotSameException e) {
    System.out.println("不能对不同量纲的单位做运算：" + e.getMessage());
}
```

> 运算前也可用 `unit.isSameAs(otherUnit)` 主动判断量纲是否一致，避免异常。构造单位时若 `elementList` 含重复基本单位，则抛出 `BasicUnitDuplicateException`。

### 自定义单位扩展示例

继承 `DerivedUnit` 即可新增库内未收录的单位。以下定义“1 链 (chain) = 20.1168 m”的长度单位：

```java
package com.zishuimuyu.science.units.length;

import com.zishuimuyu.science.units.BasicUnit;
import com.zishuimuyu.science.units.DerivedUnit;
import com.zishuimuyu.science.units.UnitElement;
import java.util.ArrayList;
import java.util.List;

public class ULength_chain extends DerivedUnit {

    private final static List<UnitElement> elementList = new ArrayList<>();
    private final static double factor = 20.1168;   // 1 chain = 20.1168 m
    private final static double additional = 0.0;    // 无零点偏移
    private final static String description = "chain";

    static {
        // 长度量纲：基本单位米，指数 1
        elementList.add(new UnitElement(BasicUnit.m, 1.0));
    }

    public ULength_chain() {
        super(description, elementList, factor, additional);
    }
}
```

使用（类名遵循 `U[物理量]_[符号]` 命名且置于对应包下时，`UnitUtils.getUnit()` 可通过反射自动定位）：

```java
import com.zishuimuyu.science.units.UnitUtils;
import com.zishuimuyu.science.units.ValueWithUnit;

ValueWithUnit len = new ValueWithUnit(10.0, UnitUtils.getUnit("ULength_chain"));
ValueWithUnit meters = len.convertTo(UnitUtils.getUnit("ULength_m"));
System.out.println(meters.getValue() + " m"); // 201.168 m
```

> 自定义类无需重新编译整个库即可被 `getUnit()` 加载——只要类在类路径上且命名符合包名推断规则（`getPackageName` 取 `_` 前部分、去首字母 `U`、转小写作为包名）。有偏移量的单位（如自定义温标）则将 `additional` 设为非零，参考 `UTemperature_F`。

## 设计模式

### 1. 工厂模式
通过`UnitUtils.getUnit()`方法获取单位实例，实现单例管理，提高性能并减少内存开销。

### 2. 模板方法模式
`DerivedUnit`定义了单位的基本行为，具体单位类实现细节。

### 3. 单例模式
单位实例通过工厂方法管理，避免重复创建，提高性能。

**具体实现**（见 `UnitUtils`）：采用“类名 → 实例”的懒加载缓存式单例，而非传统私有构造+静态实例。核心是一个静态 `HashMap<String, DerivedUnit> unitMap`：

```java
private static final HashMap<String, DerivedUnit> unitMap = new HashMap<>();

public static DerivedUnit getUnit(String name) {
    DerivedUnit unit = unitMap.get(name);          // 1) 先查缓存
    if (unit == null) {
        try {
            // 2) 未命中则反射创建（包名由类名自动推断）
            unit = (DerivedUnit) Class.forName(
                "com.zishuimuyu.science.units." + getPackageName(name) + "." + name
            ).newInstance();
            unitMap.put(name, unit);               // 3) 放入缓存，后续复用
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            return null;                            // 加载失败返回 null
        }
    }
    return unit;
}
```

要点：
- **惰性单例**：首次请求某单位时才创建并缓存，同一类名多次 `getUnit()` 返回同一实例。
- **反射定位**：`getPackageName()` 取 `_` 前部分、去首字母 `U`、转小写作为包名（`ULength_m` → `length`）。
- **失败静默**：类不存在或无法实例化时返回 `null`（不抛异常），调用方需自行判空。
- **非线程安全**：`HashMap` 与懒加载未加锁；若需在并发环境共享，应在外部同步，或直接 `new UXxx()` 创建实例（各具体单位类均为 public 无参构造，实例不可变、可安全多例）。

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
│   │           └── {物理量类别}/               # 各物理量单位目录
│   │               ├── accelerate/             # 加速度单位
│   │               ├── area/                   # 面积单位
│   │               ├── energy/                 # 能量单位
│   │               ├── empty/                  # 空单位（UEmpty，无量纲占位）
│   │               ├── force/                  # 力单位
│   │               ├── length/                 # 长度单位
│   │               ├── mass/                   # 质量单位
│   │               ├── power/                  # 功率单位
│   │               ├── pressure/               # 压强单位
│   │               ├── temperature/            # 温度单位
│   │               ├── time/                   # 时间单位
│   │               ├── velocity/               # 速度单位
│   │               └── volume/                 # 体积单位
│   └── test/
│       └── java/
│           └── com/zishuimuyu/science/units/  # 各物理量单位测试目录
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
# 运行全部标准 JUnit 测试
mvn test
# 或者运行特定测试类
mvn test -Dtest=AccelerationUnitTest
```

## 单元测试与覆盖率

本库的测试位于 `src/test/java/com/zishuimuyu/science/units/{类别}/`，现状如下（均以实际文件为准）：

| 类别 | 测试文件 | 形式 | 是否被 `mvn test` 自动执行 |
|------|----------|------|------------------------------|
| accelerate | `AccelerationUnitTest` | 标准 JUnit4（`@Test`） | 是 |
| pressure | `PressureUnitTest` | 标准 JUnit4（`@Test`） | 是 |
| area | `AreaUnitTest` | `main` 方法 + 手写断言 | 否 |
| energy | `EnergyUnitTest` | `main` 方法 + 手写断言 | 否 |
| force | `ForceUnitTest` | `main` 方法 + 手写断言 | 否 |
| mass | `MassUnitTest` | `main` 方法 + 手写断言 | 否 |
| temperature | `TemperatureUnitTest` | `main` 方法 + 手写断言 | 否 |
| time | `TimeUnitTest` | `main` 方法 + 手写断言 | 否 |

说明：
- **已覆盖 8 个类别**；`length`、`power`、`velocity`、`volume` 四个类别**尚无测试文件**。
- 6 个 `main` 方法形式的脚本不会被 Surefire 当作测试执行，仅能手动运行查看输出；建议改写为 `@Test` + `org.junit.Assert` 以纳入 `mvn test`。
- **测试覆盖率**：`pom.xml` 未配置 JaCoCo 等覆盖率插件，因此**无现成覆盖率数据**；如需，可添加 `jacoco-maven-plugin` 后执行 `mvn clean test jacoco:report`。
- **已清理的失效引用**：早期 `pom.xml` 曾将 jar 清单与 exec 插件的 `<mainClass>` 指向源码中并不存在的 `com.zishuimuyu.science.TestUse`；现已修正——作为纯库项目，产物 jar 不再声明 `Main-Class`，并移除了只为运行 `TestUse` 而保留的 `exec-maven-plugin`。

## 第三方系统集成指南

### 1. Maven项目集成

由于项目已经迁移到Maven，您可以直接在您的 `pom.xml` 中添加依赖：

```xml
<dependency>
    <groupId>com.zishuimuyu.science</groupId>
    <artifactId>UnitsConvert</artifactId>
    <version>2.0.0</version>
</dependency>
```

为了在IDE中查看详细的API文档和注释，请同时添加Javadoc依赖：

```xml
<dependency>
    <groupId>com.zishuimuyu.science</groupId>
    <artifactId>UnitsConvert</artifactId>
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
    implementation 'com.zishuimuyu.science:UnitsConvert:2.0.0'
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

> **类命名约定**：类名统一为 `U{物理量}_{单位符号}`（如 `ULength_Km`、`UPressure_MPa`）。少数单位因符号与同类中另一单位**仅首字母大小写不同**（SI 词头 Mega=M、Yotta=Y 对应 milli=m、yocto=y），若按符号命名会在 Windows/macOS 等**大小写不敏感文件系统**上与现有类产生文件名冲突，因此这几个类改用全称：
> - `ULength_MegaMeter`（兆米 Mm，区别于毫米 `ULength_mm`）
> - `ULength_YottaMeter`（尧米 Ym，区别于幺米 `ULength_ym`）
> - `UMass_MegaGram`（兆克 Mg，区别于毫克 `UMass_mg`）
> - `UArea_SquareMegameter`（平方兆米 Mm²，区别于平方毫米 `UArea_mm2`）
> - `UForce_MegaNewton`（兆牛顿 MN，区别于毫牛顿 `UForce_mN`）
>
> 此为规避文件名冲突的既定规则（非疏漏）；另 `UTime_megaannum`（百万年）本身符号即为单词，不属于例外。`getUnit()` 传入类名时**区分大小写**。

**长度单位：**
- `ULength_m` - 米
- `ULength_cm` - 厘米
- `ULength_mm` - 毫米
- `ULength_MegaMeter` - 兆米
- `ULength_Km` - 千米
- `ULength_Gm` - 吉米
- `ULength_ft` - 英尺
- `ULength_in` - 英寸
- `ULength_mi` - 英里
- `ULength_nmi` - 海里
- `ULength_ym` - 幺米
- `ULength_nm` - 纳米
- `ULength_um` - 微米
- `ULength_pm` - 皮米
- `ULength_fm` - 飞米
- `ULength_angstrom` - 埃格斯特朗
- `ULength_AU` - 天文单位
- `ULength_ly` - 光年
- `ULength_pc` - 秒差距

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
- `UPower_BtnPers` - 英热单位/秒
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
- 支持12个物理量类别的单位转换
- 包含国际单位制、英制单位、中国传统单位
- 提供完整的单位运算功能
- 支持自定义单位扩展
- 项目已从NetBeans项目迁移到Maven项目结构
- 支持现代Java构建和依赖管理
- 功率单位现已支持从皮瓦(pW)到太瓦(TW)的完整范围，以及工程和物理常用单位如BTU/h、kcal/h、ft·lbf/min、erg/s等
- 所有单位换算关系表已整合至本README文件中，便于查阅