package henu.cs.cq.ioc.demo;

import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo1 {

    /**
     * 传统开发
     */
    @Test
    public void demo11() {
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }

    @Test
    public void demo2() {
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.sayHello();
    }
}
