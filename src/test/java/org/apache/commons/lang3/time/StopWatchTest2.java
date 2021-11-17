package org.apache.commons.lang3.time;

import org.junit.Test;

public class StopWatchTest2 {

    @Test
    public void reset() {
        StopWatch sw = StopWatch.create();
        sw.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sw.stop();
        long time = sw.getTime();
        System.out.println("reset之前此时时间是" + time + "ms");
        sw.reset();
        time = sw.getTime();
        System.out.println("reset之前此时时间是" + time + "ms");
    }

}
