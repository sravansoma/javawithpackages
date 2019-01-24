package CollectionsSamples;

import java.util.*;

public class CollectionTest2 {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        Random r = new Random();

        c.add(10);
        c.add(20);
        c.add(40);
        c.add(2, 3);

        for (int i = 1; i < 10; i++) {
            c.add(r.nextInt(1000));
        }

        Collections.sort(c, (o1, o2) -> {
                return o1%10 > o2%10 ? 1 : o1%10 < o2%10 ? -1 : 0;
            }
        );
        for (int i : c) {
            System.out.println(i);
        }
    }
}

class numCompare implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int diff = 0;
        if (o1%10 > o2%10) {
            diff = 1;
        } else if (o1%10 < o2%10) {
            diff = -1;
        }

        return diff;
    }
}
