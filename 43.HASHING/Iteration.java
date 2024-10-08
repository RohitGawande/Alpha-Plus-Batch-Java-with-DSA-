import java.util.*;
import java.util.Map.Entry;

public class Iteration {
    public static void main(String[] args) {
          HashMap<String,Integer>map1=new HashMap<>();
        map1.put("India", 100);
        map1.put("America", 55);
        map1.put("Aus", 50);
        map1.put("SA", 60);
        // Iterate
        Set<String>key=map1.keySet();
        System.out.println(key);
        for (String  k: key) {
            System.out.println("Key="+k+" "+" value="+map1.get(k));
        }
        // Entryset()

        Set<Entry<String, Integer>>key1=map1.entrySet();
        System.out.println(key1);

    }
}
