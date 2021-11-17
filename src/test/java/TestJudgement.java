import org.apache.commons.lang3.time.StopWatch;

public class TestJudgement {
    public static void main(String[] args) {
        StopWatch sw;
        sw = StopWatch.createStarted();
        System.out.println("秒表" + sw.isStarted() + "启动");
        sw.start();
        System.out.println("秒表" + sw.isStarted() + "启动");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("秒表" + sw.isStopped() + "停止");
        long time = sw.getTime();
        System.out.println("此时时间是"+ time + "ms");
        sw.stop();
        System.out.println("秒表" + sw.isStopped() + "停止");
        System.out.println("秒表" + sw.isStopped() + "清空");
        sw.reset();
        System.out.println("秒表" + sw.isStopped() + "清空");
        time = sw.getTime();
        System.out.println("此时时间是"+ time + "ms");
    }
}
