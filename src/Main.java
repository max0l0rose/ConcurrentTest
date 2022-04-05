import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Main {

    public static void main(String[] args) {
        ConcurrentMap concurrentMap = new ConcurrentHashMap();
        concurrentMap.put("test", 0);
        concurrentMap.compute("test", (s, o) -> null);

        int a = 1;
    }
}
