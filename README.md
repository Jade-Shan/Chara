# Chara

Chara是一款基于JavaFX的桌面人物软件。

目前支持如下功能：

1. 随机动画：例如头发飘动、眨眼等
2. 点击人物的某些部位，人物给出对应的反馈
3. 眼睛跟随鼠标
4. 聊天功能：需要接入第三方chatbot
5. 互动好感度系统
6. 少量meta元素
7. 管理员指令
8. 模型文件封装
9. 插件功能

# 框架可以用来

制作：

1. 桌宠（桌面人物）
2. Widget
3. 动态桌面

# 演示

## 眼睛跟踪鼠标

![](docs/readme-bundle/kokori-eye-track.gif)

## 触摸反馈

![](docs/readme-bundle/kokori-touch.gif)

触摸后的反应会根据羁绊值的高低而不同哦～

## 菜单交互

![](docs/readme-bundle/kokori-menu.gif)

## 羁绊值

![](docs/readme-bundle/kokori-bond-bar.gif)

通过增加羁绊值和▇▇值解锁更多新交互吧～

<details><summary>...</summary>
减少羁绊值也会发生变化～
</details>

## 聊天交互

![](docs/readme-bundle/kokori-chat-feature.gif)

聊天交互需要事先配置chatbot

<details><summary>别点我</summary>

## R18特性

![](docs/readme-bundle/kokori-r18.gif)

</details>

# 目前实现的角色

## 心璃

[<img src="docs/readme-bundle/kokori.png" width="128px" height="128px">](https://github.com/wkgcass/Chara/tree/master/characters/kokori)

中文名：心璃  
英文名：Kokori  
日文名：心(ココ)璃(リ)  

设定：wkgcass  
[原画](https://www.pixiv.net/artworks/85094809)：wkgcass  
模型：wkgcass  
编码：wkgcass

一句话人物概述：神社的巫女，外表柔弱内心坚强的小姐姐，少量病娇属性。

# 目前实现的插件

将插件放置在`~/.chara/plugin/`（`%userprofile%\.chara\plugin`）目录中即可启用。

## dev

提供一些在开发模型中常常能用到的功能。目前实现了：鼠标点击时显示坐标。

点击右键菜单中的按钮启用或关闭标记功能。

## wqy-font

使用文泉驿字体。

## tianxing-chatbot

使用[天行机器人](https://www.tianapi.com/search/机器人)作为聊天机器人。

默认使用天行机器人，点击右键菜单中的按钮可切换天行图灵。（天行图灵免费额度较低）

# 开发文档

* [如何开发一个新角色](docs/how-to-develop-a-new-character.md)
* [如何开发一个插件](docs/how-to-develop-a-new-plugin.md)
