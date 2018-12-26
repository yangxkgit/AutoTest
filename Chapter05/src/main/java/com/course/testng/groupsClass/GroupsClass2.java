package com.course.testng.groupsClass;

import org.testng.annotations.Test;

public class GroupsClass2 {

    @Test(groups = "stu")
    public class GroupsClass1 {
        public void stu1(){
            System.out.println("groupsOmClass222 stu1方法运行");
        }
        public void stu2(){
            System.out.println("groupsOmClass222 stu2方法运行");
        }
    }
}
