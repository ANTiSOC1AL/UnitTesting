import org.apache.commons.lang3.time.StopWatch;
import java.lang.Thread;

public class TestGetTime {
    public static void main(String[] args) {
        StopWatch sw;
        sw = StopWatch.create();
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
