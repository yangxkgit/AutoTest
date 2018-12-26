package com.course.testng.groupsTest;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

//组测试方法中分组测试
public class GroupsOnMetond  {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端1");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端2");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServers(){
        System.out.println("这是服务端运行之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServers(){
        System.out.println("这是服务端运行之后运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端运行之前运行的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端运行之后运行的方法");
    }
}
