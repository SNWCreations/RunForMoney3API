# RunForMoney3API

这是逃走中插件第三代的公开 API ，提供给脚本引擎用于游戏脚本包的编写。

## 导入

脚本引擎的相关代码在开发中。

你可以使用 Maven/Gradle 导入此 API 以调用逃走中插件的内容。

此仓库的工件在 JitPack 编译，因此需要添加 JitPack 仓库:
```groovy
repositories {
    maven {
        name = 'JitPack'
        url = 'https://jitpack.io'
    }
}
```

工件坐标: `com.github.SNWCreations:RunForMoney3API:main-SNAPSHOT`

如对于 Gradle 的完整示例:
```groovy
repositories {
    maven {
        name = 'JitPack'
        url = 'https://jitpack.io'
    }
}

dependencies {
    compileOnly 'com.github.SNWCreations:RunForMoney3API:main-SNAPSHOT'
}
```

## 许可

RunForMoney3 API - 逃走中插件第三代的编程接口

Copyright (C) 2024, 2025 SNWCreations, 使用 Apache License 2.0 。

关于许可条款，详见 `LICENSE` 文件。
