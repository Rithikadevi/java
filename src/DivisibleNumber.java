import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = s.nextInt();
        }
        int rim = 0;
        for (int i = 0; i < N; i++) {
            int name = data[i];
            rim = name % 10;
        }
        if (rim % 10 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
/*
Last digit of 85 is .5
Last digit of 20 is .0
Last digit of 35 is .5
Last digit of 56 is .6
Last digit of 14 is .4
Therefore the number formed is 50564 which is not divisible by 10.
 */
