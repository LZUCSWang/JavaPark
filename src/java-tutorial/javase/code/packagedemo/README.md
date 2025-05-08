# 包演示项目

这个项目演示了Java中包(package)的基本用法。项目包含三个包：
- `caocao` - 包含曹操的`PublicUtil`类
- `zhouyu` - 包含周瑜的`PublicUtil`类
- `zhugeliang` - 包含诸葛亮的`Util`类，该类使用前两个包中的类

## 项目结构
```
packagedemo/
├── caocao/
│   └── PublicUtil.java
├── zhouyu/
│   └── PublicUtil.java
└── zhugeliang/
    └── Util.java
```

## 编译与运行

切换到`packagedemo`的父目录，然后编译所有类：
```bash
javac packagedemo/caocao/PublicUtil.java
javac packagedemo/zhouyu/PublicUtil.java
javac packagedemo/zhugeliang/Util.java
```

运行诸葛亮的`Util`类：
```bash
java packagedemo.zhugeliang.Util
```

## 输出结果
```
曹操军队兵力: 150000
周瑜军队兵力: 100000
曹操使用了美人计，效果拔群！
周瑜对曹操水军发动了火攻，火光冲天！
诸葛亮使用草船借箭之计，成功借得50000支箭！
```

通过这个示例，我们可以看到：
1. 如何定义包(`package`语句)
2. 如何导入其他包中的类(`import`语句)
3. 如何区分不同包中的同名类(使用完全限定类名)
