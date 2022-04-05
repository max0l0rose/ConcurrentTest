import java.util.NavigableSet;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
//        ConcurrentMap concurrentMap = new ConcurrentHashMap();
//        concurrentMap.put("test", 0);
//        concurrentMap.put(null, 1);
//        concurrentMap.compute("test", (s, o) -> null); // remove previous!


//        ConcurrentNavigableMap map = new ConcurrentSkipListMap();
//        map.put("test", 0);
////        map.put(null, 1); // error
//        map.compute("test", (s, o) -> null); // remove previous!


//        NavigableSet set = new ConcurrentSkipListSet();
//        set.add("test");
//        set.add(null); // error


        ConcurrentLinkedDeque deque = new ConcurrentLinkedDeque();
        deque.add("test");
        deque.offer(null); // error
        deque.add(null); // error


        int a = 1;
    }
}
