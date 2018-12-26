package com.course.testng.parmeter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 参数化测试-xml文件参数化
 */
public class ParmeterTest {

    @Test
    @Parameters({"name","age"})
    public void parameter(String name,int age){
        System.out.println("name=" + name + ";age=" + age);
    }
}
