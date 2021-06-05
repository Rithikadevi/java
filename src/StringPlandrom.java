import java.util.Scanner;

public class StringPlandrom {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char b = s.charAt(i);
            s1 += b;
        }
        if (s1.equals(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
