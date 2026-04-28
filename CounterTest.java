class Counter {
    static int cnt = 0;
    Counter() {
        increment();
    }
    void increment() {
        cnt++;
    }
    void displayCount() {
        System.out.println("Total objects created: " + cnt);
    }
}
public class CounterTest {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        c1.displayCount();
    }
}
