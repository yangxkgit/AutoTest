package com.course.testng.groupsClass;

import org.testng.annotations.Test;

//组测试中类分组测试

@Test(groups = "stu")
public class GroupsClass1 {
    public void stu1(){
        System.out.println("groupsOmClass111 stu1方法运行");
    }
    public void stu2(){
        System.out.println("groupsOmClass111 stu2方法运行");
    }
}
