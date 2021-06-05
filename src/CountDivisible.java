import java.util.Scanner;

public class CountDivisible {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int l = i; l <= j; l++) {
            if (l % k == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
