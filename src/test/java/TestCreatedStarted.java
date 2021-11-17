import org.apache.commons.lang3.time.StopWatch;

public class TestCreatedStarted {
    public static void main(String[] args) {
        StopWatch sw;
        sw = StopWatch.createStarted();
        System.out.println("该秒表是否开始计时:" + sw.isStarted());
    }
}
