package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.DemoService;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Created by Administrator on 2016/7/25.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String out(String name) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(new Date()));
        return name + " " + df.format(new Date());
    }
}