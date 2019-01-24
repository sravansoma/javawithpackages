package CollectionsSamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterfaceTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "sravan");
        map.put("hobbie", "dance");
        map.put("place", "California");

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(map.get(key));
        }


    }
}
