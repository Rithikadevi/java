import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectorybook {
    public static void main(String[] args) {
        HashMap<String, String> name = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("name of person");
            String name1 = sc.next();
            if (name1.trim().equals("Q")) {
                break;
            }
            System.out.println("number of person");
            String number = sc.next();

            name.put(name1, number);

        }
        for (Map.Entry<String, String> map : name.entrySet()) {
            System.out.println(map.getKey() + "," + map.getValue());
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
                int k = (char) n;
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

