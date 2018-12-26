package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 异常测试
     * 在我们期望结果为某一种异常情况
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试方法");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
