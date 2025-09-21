# Elytra Flight Cancel

一个简单而实用的Minecraft Fabric模组，允许玩家在鞘翅飞行过程中通过连续按两次空格键来取消飞行。

## 功能特性

- **简单易用**：在鞘翅飞行时，连续按两次空格键即可取消飞行
- **智能检测**：自动检测玩家的飞行状态，避免误操作
- **无冲突**：不会干扰正常的游戏机制
- **轻量级**：代码简洁，对游戏性能影响极小

## 使用方法

1. 装备鞘翅并开始飞行
2. 在飞行过程中，连续快速按两次空格键
3. 鞘翅飞行状态将被取消，玩家回到正常的下落状态

## 兼容性说明

### 与 Oh My Minecraft Client 的交互

本mod的行为会根据是否安装了 **Oh My Minecraft Client** 及其自动切换鞘翅功能而有所不同：

#### 🔸 **原版环境**（未安装 Oh My Minecraft Client 或未启用自动切换鞘翅功能）
- **停止飞行**：按**一次**空格键取消飞行
- **重新飞行**：需要按**两次**空格键重新开始飞行

#### 🔸 **安装 Oh My Minecraft Client 并启用自动切换鞘翅功能后**
- **停止飞行**：按**一次**空格键即可取消飞行
- **重新飞行**：只需按**一次**空格键重新开始飞行

> **说明**：这种行为差异是由于 Oh My Minecraft Client 的自动装备切换机制与本mod的交互产生的。两种模式都能正常工作，请根据你的mod配置选择合适的操作方式。

## 安装要求

- Minecraft 1.21
- Fabric Loader 0.15.11+
- Fabric API

## 安装方法

1. 确保已安装Fabric Loader和Fabric API
2. 将 `elytra-flight-cancel-1.0.0.jar` 文件放入 `.minecraft/mods` 文件夹
3. 启动游戏即可使用

## 开发环境设置

如需进行开发，请参考 [Fabric官方文档](https://docs.fabricmc.net/develop/getting-started/setting-up-a-development-environment) 中关于IDE设置的说明。

## 构建

```bash
./gradlew build
```

构建完成后，mod文件将位于 `build/libs/` 目录中。

## 技术文档

### 功能分析文件

本仓库包含一个详细的功能分析文件 `自动切换鞘翅功能分析.txt`，该文件详细分析了 **Oh My Minecraft Client** 的自动切换鞘翅功能的技术实现原理。

> **文件来源**：该分析文件基于 Oh My Minecraft Client 的自动切换鞘翅功能进行技术解析，帮助理解本mod与其他相关mod的交互机制。

## 许可证

本项目采用 CC0-1.0 许可证。您可以自由学习、使用和修改代码。
