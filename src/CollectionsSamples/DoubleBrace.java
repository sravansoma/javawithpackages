package CollectionsSamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBrace {
    public static void main(String[] args) {
//        List<Integer> values = Arrays.asList(56, 67, 90);

//        values.add(10);
//        values.add(11);
//        values.add(12);
        // instatiation initializers
        List<Integer> values = new ArrayList<Integer>()
        {{
            add(10);
            add(30);
            add(80);
        }};
        for (int i : values) {
            System.out.println(i);
        }
    }
}
