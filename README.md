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

## 许可证

本项目采用 CC0-1.0 许可证。您可以自由学习、使用和修改代码。
