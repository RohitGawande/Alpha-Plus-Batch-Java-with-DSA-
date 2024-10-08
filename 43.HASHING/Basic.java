import java.util.HashMap;

public class Basic {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        //Insert O(1)
        map.put("India", 100);
        map.put("America", 55);
        map.put("Aus", 50);
        map.put("SA", 60);
        System.out.println(map);
        int popu=map.get("India");
        System.out.println(popu);

        System.out.println(map.get("America"));
        System.out.println(map.get("Bhutan"));
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Sri"));
        System.out.println(map.remove("SA"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());

    }

}
