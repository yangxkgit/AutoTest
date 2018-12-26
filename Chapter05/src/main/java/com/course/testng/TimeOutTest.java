package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {
    /**
     * 超时测试
     * @throws InterruptedException
     */
    @Test(timeOut = 3000) //单位毫秒值
    public void testSucess() throws InterruptedException{
        Thread.sleep(2000);//直接写秒值不要写millis
    }
    @Test(timeOut = 2000)
    public void TestFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
