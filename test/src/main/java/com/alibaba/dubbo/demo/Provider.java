package com.alibaba.dubbo.demo;

/**
 * Created by Administrator on 2016/7/25.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.out.println("请按任意键退出");
        System.in.read(); // 按任意键退出
    }

}
