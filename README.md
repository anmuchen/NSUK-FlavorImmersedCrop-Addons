# 烟火凡人心：作物附属

把**烟火凡人心（Flavor Immersed Daily）**的作物接入 **New: Sim-U-Kraft（simukraft）** 的农田盒，由雇佣农民统一种植、收割与补种。

- 模组 ID：`flavorimmersedcropaddons`
- 版本：2.0.0
- 运行环境：Minecraft 1.21.1 / NeoForge 21.1.228 – 21.1.x
- 前置：`New: Sim-U-Kraft`、`NSUK：作物 API`（nsukcropapi）
- 许可证：GNU General Public License v3.0

本模组**不注册任何方块或物品**，只是把已安装的烟火凡人心作物登记到 NSUK 作物 API 的注册表里；作业流程、存档字段与选择界面全部由 API 提供。

---

## 收录的作物

数据定义位于：

```
src/main/resources/data/flavorimmersedcropaddons/kaleidoscope_crops/
├─ flavor_immersed_daily.json          # 大田作物
└─ flavor_immersed_daily_trellis.json  # 雨棚作物
```

| 类别 | 数量 | 种植方式 |
| --- | --- | --- |
| 大田作物 | 54 种 | 标准耕地，农民自行铺土、播种、施骨粉、收割并补种 |
| 雨棚作物 | 9 种 | 四角立柱 + 顶盖，由农民自建结构（`layout: trellis`） |

大田作物覆盖以下门类：

- **谷物**：小麦、燕麦、荞麦、小米、高粱
- **豆类**：大豆、绿豆、红豆、豌豆
- **薯类**：甘薯、紫薯、木薯、山药、芋头
- **瓜果**：南瓜、冬瓜、苦瓜、丝瓜、黄瓜、茄子、辣椒、甜椒
- **叶菜**：白菜、生菜、菠菜、芹菜、韭菜、香菜
- **香辛料**：花椒、八角、孜然、小茴香、肉桂、肉豆蔻、姜、蒜、葱
- **经济作物**：咖啡、茶、芝麻、花生、油菜

雨棚作物共 9 种：番茄、黄瓜、茄子、豇豆、芸豆、丝瓜、冬瓜、葡萄、青葡萄。

---

## 使用

1. 放置农田盒并圈定范围。
2. 打开「循环作物」，在「烟火凡人心」分组里选一种作物（支持搜索中文 / 英文）。
3. 把对应种子放进农田盒旁的箱子。
4. 雇佣农民并启动。

雨棚作物除种子外还需要搭架材料，农民会自动消耗箱内材料立柱搭顶。

---

## 构建

标准 NeoForge ModDevGradle 工程：

```bash
./gradlew build
```

产物：`build/libs/flavorimmersedcropaddons-2.0.0.jar`

### 依赖说明

`build.gradle` 通过 `compileOnly files('libs/nsukcropapi-1.0.0.jar')` 引用 API。该 jar 不在本仓库内（`libs/` 已被 `.gitignore` 排除），需要先构建 [nsukcropapi](../nsukcropapi) 并放到 `libs/` 下：

```bash
mkdir -p libs
cp ../nsukcropapi-dev/build/libs/nsukcropapi-1.0.0.jar libs/
```

---

## 许可证

GNU General Public License v3.0，全文见 [LICENSE](LICENSE)。
