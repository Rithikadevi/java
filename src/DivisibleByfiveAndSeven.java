import java.util.Scanner;

public class DivisibleByfiveAndSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Get the character:");
        int c = sc.next().charAt(0);

        while (c == 'Y') {
            System.out.println("Get the number:");
            int n = sc.nextInt();
            if (n % 5 == 0 && n % 7 == 0) {
                System.out.println("divisible by both the numbers");
            } else if (n % 5 == 0) {
                System.out.println("divisible by 5 and not divisible by 7");
            } else if (n % 7 == 0) {
                System.out.println("divisible by 7 and not divisible by 5");
            }
            c++;
        }
        if (c == 'N')
            System.out.println("Exit");

    }
}
