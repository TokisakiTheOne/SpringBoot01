package com.yyh;

import com.yyh.dao.StudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

/**
 * SpringBoot  测试类
 *
 * @author YanYuHang
 * @create 2019-12-26-9:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootApplicationTest {
    @Autowired
    private StudentDao sd;

    @Test
    public void testSelectAll() {
        sd.selectAll().forEach(System.out::println);
       //  proxy_pass
        // sudo passwd root
        // su root
        //docker images  docker ps   docker ps -a

    }
}
