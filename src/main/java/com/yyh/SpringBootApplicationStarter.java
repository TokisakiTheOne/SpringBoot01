package com.yyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author YanYuHang
 * @SpringBootApplication springboot工程的唯一启动类
 * 具有  main方法的入口程序
 * @create 2019-12-26-8:52
 */
@SpringBootApplication
public class SpringBootApplicationStarter {
    public static void main(String[] args) {
        /**
         * 调用  run()方法   实现当前 springboot 独立运行的类名
         * .class就可以拿到这个启动类包名 和 注解  (com.yyh) 就可以扫描
         * 这个包下的所有文件和子包文件
         */
        SpringApplication.run(SpringBootApplicationStarter.class, args);
    }
}
