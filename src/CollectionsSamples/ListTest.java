package CollectionsSamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> Test = new ArrayList<>();

        Test.add(10);
        Test.add(200);
        Test.add(101);

        Collections.sort(Test);

        // this will use stream api
        Test.forEach(System.out::println);

        for(int i : Test) {
            System.out.println(i);
        }

        Collections.reverse(Test);

        for(int i : Test) {
            System.out.println(i);
        }
    }
}
