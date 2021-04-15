import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args) {
        int firstnum = 0, secondnum = 1, i, t, end = 10;
        System.out.print(firstnum + " " + secondnum);
        for (i = firstnum; i <= end; i++) {

            t = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = t;
            System.out.print(" " + t);
        }
    }
}

class PrimeNumber {
    public static void main(String[] args) {
        int N, i, count = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (i = 1; i <= N; i++) {
            if (N % i == 0) {
                count = count + 1;
            }

        }
        if (count == 2) {
            System.out.print("Prime Number");
        } else {
            System.out.print(" Not a Prime Number");
        }

    }
}
