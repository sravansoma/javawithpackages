import java.util.ArrayList;

public class TimeTest {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        long start = System.currentTimeMillis();
        for (int i =1; i<1000000; i++) {
            a.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        long time = System.currentTimeMillis();
    }
}
