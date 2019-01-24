import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) throws Exception{
        int i = 15;
        Vector<Integer> v = new Vector<>();

        for (i = 0; i < 14; i++) {
            v.add(i);
            System.out.println(v.get(i));
        }

        System.out.println("capacity" + v.capacity());
    }
}
