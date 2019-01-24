package CollectionsSamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
         Collection values = new ArrayList();

        values.add(10);
        values.add("sravan");
        values.add(1.0);

        Iterator i = values.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }

        for (Object j : values) {
            System.out.println(j);
        }

    }
}
