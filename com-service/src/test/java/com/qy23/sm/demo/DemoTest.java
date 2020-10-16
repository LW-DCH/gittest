package com.qy23.sm.demo;

import com.qy23.sm.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName DemoTest
 * @Author 刘伟
 * @Date 2020/10/16 20:38
 * @Description
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext-mapper.xml","classpath:applicationContext-service.xml"})
public class DemoTest {

    @Autowired
    private AdminService adminService;

    @Test
    public void doTest(){

        System.out.println(adminService.findAll());
    }
}
