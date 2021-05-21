import java.util.HashMap;
import java.util.Map;

public class Maphash {
    public static void main(String[] args) {
        HashMap<String, Integer> hello = new HashMap<>();
        hello.put("devi", 10);
        hello.put("hate", 100);
        for (Map.Entry<String, Integer> map : hello.entrySet()) {
            System.out.println(map.getKey() + "," + map.getValue());
        }
    }
}

class Maphello {
    public static void main(String[] args) {
        HashMap<String, Integer> hello = new HashMap<>();
        hello.put("Nrupul", 32);
        hello.put("Prateek", 30);
        hello.put("Aman", 26);
        hello.put("Albert", 28);
        hello.put("Yogesh", 44);
        for (Map.Entry<String, Integer> map : hello.entrySet()) {
            if (map.getValue() > 30) {
                System.out.println(map.getKey());
            }
        }

    }
}

