import java.util.HashMap;
import java.util.Map;

public class CreateSecurityKey {
    public static void main(String[] args) {
        HashMap<String, String> name = new HashMap<>();
        name.put("devi", "9514471735");
        name.put("rithika", "8825532411");
        name.put("mukesh", "9843415529");
        for (Map.Entry<String, String> map : name.entrySet()) {
            String a = map.getKey();
            String b = map.getValue();
            SecurityKey(a, b);
        }
    }

    public static void SecurityKey(String a, String b) {
        String c = "";
        int length = a.length();
        int lengthb = b.length();

        try {
            for (int i = 0; i < 5; i++) {
                c += a.charAt(i);
            }
            int add = 0;
            for (int j = 0; j < lengthb; j++) {
                char n = b.charAt(j);
                int k = (int) n;
                add += k;
                add = add / 10;

            }
            c += add;
            System.out.println(c);
        } catch (
                Exception e) {
            System.out.println(e);
        }
    }
}


