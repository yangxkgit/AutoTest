package com.course.testng.parmeter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DateProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name=" + name + ";age=" + age);
    }

    @DataProvider(name="data")
    public Object[][] probiderData(){
        Object[][] obj = new Object[][]{
                {"zhangsan",10},
                {"lisi",12},
                {"wanger",15},
        };
        return obj;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test111方法：name=" + name + ";age=" + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test222方法：name=" + name + ";age=" + age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",10},
                    {"lisi",12},
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"zhanwu",16},
                    {"xiaobai",20},
            };
        }
        return result;
    }
}
