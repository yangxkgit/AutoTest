package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    /**
     *   最基本的注解，用来把方法标记为测试的一部分
     */

    @Test
    public void testcase1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例1：支付宝登录成功");
    }
    @Test
    public void testcase2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例2：淘宝登录成功");
    }
    @Test
    public void testcase3(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例3：天猫登录成功");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("beforeMethod是测试方法之前运行的方法");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("afterMethod是测试方法之后运行的方法");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("beforeClass是类运行之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("afterClass是类运行之后运行的方法");
    }

    @BeforeSuite
    public void  beforeSuite(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("beforeSuite测试套件执行之前运行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("afterSuite测试套件执行之后运行");
    }

}
