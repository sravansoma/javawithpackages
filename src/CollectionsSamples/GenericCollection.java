package CollectionsSamples;

import java.util.ArrayList;
import java.util.Collection;

public class GenericCollection {
    public static void main(String[] args) {
        // here Integer is generic type
        Collection<Integer> Test = new ArrayList<>();

        Test.add(10);
        Test.add(100);
        Test.add(110);

        // removes element
        Test.remove(10);

        // enhanced for loop
        for (int i : Test) {
            System.out.println(i);
        }
    }
}
