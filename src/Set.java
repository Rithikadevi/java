import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Set {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        String[] s = {"m", "a", "s", "a", "i", " ", "s", "c", "h", "o", "o", "l"};
        for (String i : s) {
            hashSet.add(i);
        }
        System.out.println(hashSet);
    }
}

class UniqeHash {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashSet = new HashMap<>();
        String s1 = "Masai school";

        for (int i = 0; i < s1.length(); i++) {
            int count = 1;
            for (int j = 0; j < s1.length(); j++) {
                if (i != j) {
                    if (s1.charAt(i) == s1.charAt(j)) {
                        count++;
                    }
                }
            }
            hashSet.put(s1.charAt(i), count);

        }
        for (Map.Entry<Character, Integer> map : hashSet.entrySet()) {
            System.out.println(map.getKey() + "-" + map.getValue());
        }
    }
}
