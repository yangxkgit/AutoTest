package com.course.testng;

import org.testng.annotations.Test;

/**
 * 忽略测试
 */

public class LgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1 执行1");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行2");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行3");
    }
}
