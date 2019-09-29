# Spring Bean管理

## 最新版的工厂操作

使用到了`FileSystemXmlApplicationContext()`方法，读取的是设置的路径

## Bean配置

### id和name

* id唯一：作为名称
* name:是id中有特殊字符就使用name

### Bean的作用范围

* 加载配置文件的时候就会将配置文件中的bean就实例化了

#### 静态工厂实例化

* 无参构造
* 静态工厂

#### 