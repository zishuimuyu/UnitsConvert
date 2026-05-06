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

### 1. 长度 (length) - 锚点单位: 米 (m) [共31个单位]

**国际单位：**

| 序号 | 单位名称 | 符号 | 换算关系（米） | 应用场景 |
|------|---------|------|---------------|----------|
| 1 | 幺米 | ym | 10⁻²⁴m | 理论物理学、弦理论 |
| 2 | 仄米 | zm | 10⁻²¹m | 理论物理学 |
| 3 | 阿米 | am | 10⁻¹⁸m | 理论物理学 |
| 4 | 飞米 | fm | 10⁻¹⁵m | 核物理学、原子核尺度测量 |
| 5 | 皮米 | pm | 10⁻¹²m | 原子物理学、化学键长 |
| 6 | 纳米 | nm | 10⁻⁹m | 纳米技术、分子生物学 |
| 7 | 微米 | um | 10⁻⁶m | 微观尺度测量、细胞尺寸 |
| 8 | 毫米 | mm | 10⁻³m | 工程图纸、机械零件 |
| 9 | 英寸 | in | 2.54×10⁻²m | 工业制造、屏幕尺寸 |
| 10 | 厘米 | cm | 10⁻²m | 日常生活、服装尺码 |
| 11 | 传统寸 | cun | 3.33×10⁻²m | 中国传统长度 |
| 12 | 分米 | dm | 10⁻¹m | 教育教学 |
| 13 | 传统尺 | chi | 0.333m | 中国传统长度 |
| 14 | 英尺 | ft | 0.3048m | 建筑工程、高度测量 |
| 15 | 码 | yd | 0.9144m | 体育场地、布料销售 |
| 16 | 米 | m | 1m | 国际单位制基本单位 |
| 17 | 传统丈 | zhang | 3.33m | 中国传统长度 |
| 18 | 寻 | fathom | 1.8288m | 海洋深度测量 |
| 19 | 传统引 | yin | 33.33m | 中国传统长度 |
| 20 | 手宽 | hand | 0.1016m | 马匹高度测量 |
| 21 | 跋 | fur | 201.168m | 传统土地测量 |
| 22 | 传统里 | li | 500m | 中国传统长度、土地测量 |
| 23 | 千米 | Km | 10³m | 地理距离、交通里程 |
| 24 | 英里 | mi | 1609.344m | 长距离交通、航空航海 |
| 25 | 海里 | nmi | 1852m | 航海航空导航 |
| 26 | 兆米 | Mm | 10⁶m | 大地测量、行星半径 |
| 27 | 吉米 | Gm | 10⁹m | 天文学、行星间距离 |
| 28 | 天文单位 | AU | 1.5×10¹¹m | 天文学、太阳系距离 |
| 29 | 光年 | ly | 9.46×10¹⁵m | 天文学、宇宙距离 |
| 30 | 秒差距 | pc | 3.09×10¹⁶m | 天文学、恒星距离 |
| 31 | 尧米 | Ym | 10²⁴m | 宇宙学 |

### 2. 面积 (area) - 锚点单位: 平方米 (m²) [共22个单位]

| 序号 | 单位名称 | 符号 | 换算关系（平方米） | 应用场景 |
|------|---------|------|-------------------|----------|
| 1 | 靶恩 | b | 10⁻²⁸m² | 核物理、粒子物理 |
| 2 | 平方纳米 | nm² | 10⁻¹⁸m² | 纳米技术、半导体制造 |
| 3 | 平方微米 | μm² | 10⁻¹²m² | 细胞生物学、材料科学 |
| 4 | 平方毫米 | mm² | 10⁻⁶m² | 微小面积、精密加工 |
| 5 | 平方厘米 | cm² | 10⁻⁴m² | 小面积测量、实验室 |
| 6 | 平方分米 | dm² | 10⁻²m² | 中小面积测量 |
| 7 | 平方英寸 | in² | 6.452×10⁻⁴m² | 精密工程、小面积 |
| 8 | 平方米 | m² | 1m² | 国际单位制面积基本单位 |
| 9 | 公亩/十米² | dam² | 10²m² | 中等面积测量、欧洲使用 |
| 10 | 公亩 | a | 10²m² | 欧洲土地测量 |
| 11 | 平方英尺 | ft² | 0.0929m² | 建筑、房地产 |
| 12 | 平方码 | yd² | 0.8361m² | 美国建筑、纺织 |
| 13 | 平方杆 | rd² | 25.293m² | 英制传统土地测量 |
| 14 | 町 | cho | 991.736m² | 日本土地测量 |
| 15 | 市亩 | mu | 666.67m² | 中国农业、土地测量 |
| 16 | 公顷/百米² | ha | 10⁴m² | 农业、林业、土地规划 |
| 17 | 顷 | qing | 6.67×10³m² | 中国传统大面积测量 |
| 18 | 平方千米 | Km² | 10⁶m² | 大面积土地、地理测量 |
| 19 | 平方英里 | mi² | 2.59×10⁶m² | 大面积土地、地理测量 |
| 20 | 平方兆米 | Mm² | 10¹²m² | 地理学、天体物理 |
| 21 | 光年平方 | ly² | 8.95×10³²m² | 天文学 |
| 22 | 秒差距平方 | pc² | 9.52×10³²m² | 天文学、宇宙学 |

### 3. 质量 (mass) - 锚点单位: 千克 (Kg) [共28个单位]

| 序号 | 单位名称 | 符号 | 换算关系（千克） | 应用场景 |
|------|---------|------|------------------|----------|
| 1 | 阿托克 | ag | 10⁻²¹kg | 理论物理、基本粒子 |
| 2 | 飞克 | fg | 10⁻¹⁸kg | 分子物理学 |
| 3 | 皮克 | pg | 10⁻¹⁵kg | 分子生物学、纳米技术 |
| 4 | 纳克 | ng | 10⁻¹²kg | 医学、药学、环境检测 |
| 5 | 微克 | μg | 10⁻⁹kg | 精密化学、医学检验 |
| 6 | 毫克 | mg | 10⁻⁶kg | 医药剂量、化学试剂 |
| 7 | 原子质量单位 | u | 1.66×10⁻²⁷kg | 原子物理、生物化学 |
| 8 | 格令 | gr | 6.48×10⁻⁵kg | 珠宝、弹药 |
| 9 | 打兰 | dr | 1.77×10⁻³kg | 药物计量、珠宝 |
| 10 | 克 | g | 10⁻³kg | 日常食品、小件物品 |
| 11 | 克拉 | ct | 2.0×10⁻⁴kg | 珠宝、宝石 |
| 12 | 金衡盎司 | oz t | 3.11×10⁻²kg | 贵金属、珠宝 |
| 13 | 盎司 | oz | 2.84×10⁻²kg | 食品包装、贵金属 |
| 14 | 钱 | qian | 5.0×10⁻³kg | 传统中药 |
| 15 | 两 | liang | 5.0×10⁻²kg | 传统市场、中药 |
| 16 | 斤 | jin/q | 0.5kg | 传统市场、日常购物 |
| 17 | 磅 | lb | 0.4536kg | 体重测量、商品重量 |
| 18 | 英石 | st | 6.35kg | 人体重量（英国） |
| 19 | 担 | dan | 50kg | 农业产量、大宗货物 |
| 20 | 公旦 | q | 100kg | 农业、商业 |
| 21 | 千克 | Kg | 1kg | 国际单位制基本单位 |
| 22 | 美吨 | UStf | 907.185kg | 美国货物运输 |
| 23 | 长吨 | lt | 1016.047kg | 英国货物运输 |
| 24 | 兆克 | Mg | 10³kg | 科学文献（等同吨） |
| 25 | 吨 | t | 10³kg | 工业生产、货物运输 |
| 26 | 月球质量 | ML | 7.34×10²²kg | 天文学、月球研究 |
| 27 | 地球质量 | ME | 5.97×10²⁴kg | 天文学、行星科学 |
| 28 | 太阳质量 | M☉ | 1.99×10³⁰kg | 天文学、宇宙学 |

### 4. 时间 (time) - 锚点单位: 秒 (s) [共22个单位]

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
| 13 | 天 | day | 86,400s | 日周期 |
| 14 | 周 | week | 604,800s | 工作周期 |
| 15 | 刻 | ke | 900s | 中国传统时间 |
| 16 | 时辰 | shichen | 7,200s | 中国传统时间 |
| 17 | 月 | month | ~2.63×10⁶s | 合同、结算 |
| 18 | 季度 | quarter | ~7.89×10⁶s | 财务周期 |
| 19 | 年 | year | ~3.16×10⁷s | 年龄、历史 |
| 20 | 世纪 | century | ~3.16×10⁹s | 历史时期 |
| 21 | 千年 | millennium | ~3.16×10¹⁰s | 文明发展 |
| 22 | 百万年 | megaannum | ~3.16×10¹³s | 地质演化 |

### 5. 温度 (temperature) - 锚点单位: 开尔文 (K) [共10个单位]

| 序号 | 单位名称 | 符号 | 换算关系 | 应用场景 |
|------|---------|------|----------|----------|
| 1 | 列氏度 | Re | °Re = 4/5°C | 历史科学文献 |
| 2 | 德氏度 | De | °C = 100 - °De × 2/3 | 18-19世纪俄罗斯 |
| 3 | 湿球温度 | W | 与°C相同刻度 | 暖通空调、气象学 |
| 4 | 摄氏度 | C | °C = K - 273.15 | 日常生活、气象、科学 |
| 5 | 罗氏度 | Rø | °C = (°Rø - 7.5) × 40/21 | 18世纪航海、气象 |
| 6 | 华氏度 | F | °F = 9/5°C + 32 | 美国日常生活 |
| 7 | 牛氏度 | N | °C = °N × 100/33 | 物理学史 |
| 8 | 兰氏度 | Ra | °R = 9/5K | 工程热力学 |
| 9 | 开尔文 | K | K = °C + 273.15 | 科学研究、绝对零度 |
| 10 | 普朗克温度 | TP | 1 TP = 1.42×10³² K | 宇宙学、理论物理极限 |

### 6. 力 (force) - 锚点单位: 牛顿 (N) [共15个单位]

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
| 9 | 公斤力·米/秒² | kgf | 9.807N | 工程技术 |
| 10 | 千牛顿 | KN | 10³N | 结构工程、大型机械 |
| 11 | 英吨力 | STf | 8896.44N | 重型机械、建筑结构 |
| 12 | 美吨力 | UStf | 8896.44N | 美国工程标准 |
| 13 | 吨力 | tf | 9806.65N | 重型机械、起重能力 |
| 14 | 千磅力 | kip | 4448.22N | 土木工程、建筑结构 |
| 15 | 兆牛顿 | MN | 10⁶N | 大型结构工程、桥梁 |

### 7. 压强 (pressure) - 锚点单位: 帕斯卡 (Pa) [共13个单位]

| 序号 | 单位名称 | 符号 | 换算关系（帕斯卡） | 应用场景 |
|------|---------|------|--------------------|----------|
| 1 | 千克力/平方米 | KgfPerm2 | 9.807Pa | 工程技术、老旧文献 |
| 2 | 磅力/平方英尺 | lbfPerft2 | 47.88Pa | 美国工程标准 |
| 3 | 毫米汞柱 | mmHg | 133.322Pa | 医学血压测量 |
| 4 | 托 | Torr | 133.322Pa | 真空技术、科学实验 |
| 5 | 毫巴 | mbar | 100Pa | 气象学、低压测量 |
| 6 | 百帕 | HPa | 100Pa | 气象学、大气压力 |
| 7 | 千帕 | KPa | 10³Pa | 工程技术、轮胎气压 |
| 8 | 帕斯卡 | Pa | 1Pa | 国际单位制基本单位 |
| 9 | 磅力/平方英寸 | lbfPerin2 | 6894.76Pa | 工业、轮胎压力 |
| 10 | 巴 | bar | 10⁵Pa | 工业工程、气体压力 |
| 11 | 标准大气压 | atm | 101325Pa | 科学标准、实验室 |
| 12 | 兆帕 | MPa | 10⁶Pa | 高压工程、材料强度 |
| 13 | 千磅力/平方英寸 | ksi | 6.895×10⁶Pa | 材料工程、高强度钢 |

### 8. 能量 (energy) - 锚点单位: 焦耳 (J) [共17个单位]

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
| 14 | 吨标准煤 | kgce | 29.31×10⁶J | 能源统计、中国标准 |
| 15 | 吨TNT当量 | tTNT | 4.184×10⁹J | 爆炸力学、军事 |
| 16 | 吉焦 | GJ | 10⁹J | 大型工程、能源统计 |
| 17 | 吨油当量 | toe | 41.87×10⁹J | 能源统计、国际标准 |

### 9. 功率 (power) - 锚点单位: 瓦特 (W) [共19个单位]

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
| 14 | 英热单位/秒 | BtuPers | 1055.06W | 空调制冷 |
| 15 | 瓦特 | W | 1W | 国际单位制基本单位 |
| 16 | 千瓦 | KW | 10³W | 家用电器、小型发动机 |
| 17 | 兆瓦 | MW | 10⁶W | 电站发电、大型设备 |
| 18 | 吉瓦 | GW | 10⁹W | 大型电站、国家电网 |
| 19 | 太瓦 | TW | 10¹²W | 国家电力、全球能源 |

### 10. 加速度 (accelerate) - 锚点单位: 米/秒² (m/s²) [共7个单位]

| 序号 | 单位名称 | 符号 | 换算关系（米/秒²） | 应用场景 |
|------|---------|------|-------------------|----------|
| 1 | 毫米/秒² | mm/s² | 0.001m/s² | 精密工程、微小加速度 |
| 2 | 厘米/秒² | cm/s² | 0.01m/s² | CGS制、精密工程 |
| 3 | 英寸/秒² | in/s² | 0.0254m/s² | 精密仪器、小型机械 |
| 4 | 英尺/秒² | ft/s² | 0.3048m/s² | 美国工程、航空 |
| 5 | 伽 | gal | 0.01m/s² | 地球物理学、地震学 |
| 6 | 米/秒² | m/s² | 1m/s² | 国际单位制基本单位 |
| 7 | 重力加速度 | g | 9.807m/s² | 工程技术、重力相关计算 |

### 11. 速度 (velocity) - 锚点单位: 米/秒 (m/s) [共22个单位]

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
| 15 | 英里/分 | mi/min | 26.82m/s | 高速交通 |
| 16 | 十米/秒 | dam/s | 10m/s | 较高速度测量 |
| 17 | 百米/秒 | hm/s | 100m/s | 高速测量 |
| 18 | 千米/分 | Km/min | 16.67m/s | 交通运输 |
| 19 | 马赫 | Ma | 343m/s | 航空动力学、声速 |
| 20 | 英里/秒 | mi/s | 1609.344m/s | 高速运动 |
| 21 | 千米/秒 | Km/s | 10³m/s | 航天飞行、高速运动 |
| 22 | 光速 | c | 299792458m/s | 物理学、相对论 |

### 12. 体积 (volume) - 锚点单位: 立方米 (m³) [共35个单位]

| 序号 | 单位名称 | 符号 | 换算关系（立方米） | 应用场景 |
|------|---------|------|------------------|----------|
| 1 | 立方纳米 | nm³ | 10⁻²⁷m³ | 纳米技术 |
| 2 | 立方皮米 | pm³ | 10⁻³⁶m³ | 原子尺度 |
| 3 | 立方飞米 | fm³ | 10⁻⁴⁵m³ | 核物理 |
| 4 | 立方埃 | Å³ | 10⁻³⁰m³ | 原子物理 |
| 5 | 立方毫米 | mm³ | 10⁻⁹m³ | 微小容积、精密测量 |
| 6 | 液量打兰 | fl dr | 3.55×10⁻⁶m³ | 英制液体计量 |
| 7 | 毫升 | mL | 10⁻⁶m³ | 实验室、药品 |
| 8 | 市撮 | 撮 | 10⁻⁶m³ | 中国传统液体单位 |
| 9 | 立方厘米 | cm³ | 10⁻⁶m³ | 实验室、小容器 |
| 10 | 厘升 | cL | 10⁻⁵m³ | 欧洲酒类容量 |
| 11 | 市勺 | 勺 | 10⁻⁵m³ | 中国传统液体单位 |
| 12 | 液量盎司 | fl oz | 2.84×10⁻⁵m³ | 英制液体计量 |
| 13 | 分升 | dL | 10⁻⁴m³ | 欧洲液体测量 |
| 14 | 市合 | 合 | 10⁻⁴m³ | 中国传统液体单位 |
| 15 | 立方英寸 | in³ | 1.64×10⁻⁵m³ | 美国精密测量 |
| 16 | 升 | L | 10⁻³m³ | 日常液体测量 |
| 17 | 市升 | 升 | 10⁻³m³ | 中国传统液体单位 |
| 18 | 立方分米 | dm³ | 10⁻³m³ | 中等容积测量 |
| 19 | 液量品脱 | fl pt | 4.73×10⁻⁴m³ | 英制液体计量 |
| 20 | 干量品脱 | dry pt | 5.51×10⁻⁴m³ | 美制干量单位 |
| 21 | 液量夸脱 | fl qt | 9.46×10⁻⁴m³ | 英制液体计量 |
| 22 | 干量夸脱 | dry qt | 1.10×10⁻³m³ | 美制干量单位 |
| 23 | 加仑 | gal | 3.79×10⁻³m³ | 英制液体计量 |
| 24 | 干量加仑 | dry gal | 4.40×10⁻³m³ | 美制干量单位 |
| 25 | 十升 | daL | 10⁻²m³ | 工业液体测量 |
| 26 | 市斗 | 斗 | 10⁻²m³ | 中国传统液体单位 |
| 27 | 百升 | hL | 10⁻¹m³ | 啤酒酿造 |
| 28 | 市石 | 石 | 10⁻¹m³ | 中国传统液体单位 |
| 29 | 立方米 | m³ | 1m³ | 国际单位制基本单位 |
| 30 | 石油桶 | bbl | 0.159m³ | 石油工业 |
| 31 | 立方英尺 | ft³ | 0.0283m³ | 美国工程、空间测量 |
| 32 | 立方码 | yd³ | 0.7646m³ | 美国土木工程 |
| 33 | 立方十米 | dam³ | 10³m³ | 较大容积测量 |
| 34 | 立方百米 | hm³ | 10⁶m³ | 大型容积测量 |
| 35 | 立方千米 | Km³ | 10⁹m³ | 极大容积测量 |

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
│   │           └── {物理量类别}/               # 各物理量单位目录
│   │               ├── accelerate/             # 加速度单位
│   │               ├── area/                   # 面积单位
│   │               ├── energy/                 # 能量单位
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