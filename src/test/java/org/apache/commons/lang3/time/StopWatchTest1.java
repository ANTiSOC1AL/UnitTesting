package org.apache.commons.lang3.time;

import org.junit.Test;

import static org.junit.Assert.*;

public class StopWatchTest1 {

    @Test
    public void createStarted() {
        StopWatch sw = StopWatch.createStarted();
        System.out.println("该秒表是否开始计时" + sw.isStarted());
    }

    @Test
    public void GetTime() {
        StopWatch sw = StopWatch.create();
        sw.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sw.stop();
        long time = sw.getTime();
        System.out.println("时间是" + time + "ms");
    }

}