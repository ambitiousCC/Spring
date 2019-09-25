# 快速入门
## 准备工作

### 项目准备

* Maven项目
* Java模板
* Spring依赖jar包
	* 四个核心jar包
	* log4j
	* junit 4.0+
	
### 简要说明

IOC: Inverse of Control 反转控制：将人工创建对象的权利转移到Spring自动
	
## 关键代码

### 准备bean

```java
public class UserService{
	private String name;
	
	public void hello(){
		System.out.println("hello");
	}
	
	public void setName(String name){
		this.name = name;
	}
}
```

### 传统代码

* 简单调用方法

```java

public void demo(){
	//UserService userService = new UserServiceImpl();//原来调用实现类的方法
	UserServiceImpl userService = new UserServiceImpl();
	
	userService.setName("");
	
	userService.hello():
}
```

### Spring IOC 代码

#### 配置

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="https://www.springframework.org/schema/beans"
	   xmlns:sxi="http://www.w3.org/2001/XMLSchema-instance"
	   xsi:schemaLocation="http://www.springframework.org/schema/bean http://www.springframework.org/schema/bean/spring-beans.xsd">
	<!--UserService的创建权交给了Spring-->
	<bean id="userService" class="henu.cs.cq.demo.UserServiceImpl">
		<!--直接在此设置属性值而不用修改源代码-->
		<property name="name" value=""/>
	</bean>
</beans>
```


#### 实现方法

```java
public void demo(){
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserService userService = (UserService)applicationContext.getBean("userService");
	
	userService.setHello();
}
```


