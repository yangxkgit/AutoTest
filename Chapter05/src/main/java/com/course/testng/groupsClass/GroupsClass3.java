package com.course.testng.groupsClass;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsClass3 {
    public void teacher1(){
        System.out.println("groupsOnClass333 teacher1方法运行");
    }

    public void teacher2(){
        System.out.println("groupsOnClass333 teacher2方法运行");
    }
}
