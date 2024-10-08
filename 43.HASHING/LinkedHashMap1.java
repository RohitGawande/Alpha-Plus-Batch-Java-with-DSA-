import java.util.LinkedHashMap;
public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Aus", 55);
        lhm.put("China", 98);
        System.out.println(lhm);
    }
}
