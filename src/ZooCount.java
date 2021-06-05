import java.util.Scanner;

public class ZooCount {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int xcount = 0;
        int ycount = 0;
        char x = s1.charAt(0);
        char y = s1.charAt(0);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'z') {
                xcount++;
            } else if (s1.charAt(i) == 'o') {
                ycount++;
            }
        }
        if (ycount == 2 * xcount) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }


}

