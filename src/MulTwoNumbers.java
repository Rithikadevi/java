import java.util.Scanner;

public class MulTwoNumbers {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(a * b);
    }
}

class FibanocciNum {
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

class PrimeNumbers {
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

class PaindromNum {
    public static void main(String[] args) {
        int N, r = 0, ans = 0, t;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        t = N;
        while (N > 0) {
            r = N % 10;
            ans = (ans * 10) + r;
            N = N / 10;
        }

        if (t == ans) {
            System.out.println("Palindrom Number");
        } else {
            System.out.println("Not a Palindrom Number");
        }

    }
}

class Amstrong {
    public static void main(String[] args) {
        int N, r, ans = 0, t;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        t = N;
        while (N > 0) {
            r = N % 10;
            ans = (r * r * r) + ans;
            N = N / 10;
        }
        System.out.print(ans);

        if (t == ans) {
            System.out.println("Amstrong number");
        } else {
            System.out.println("Not a Amstrong number");
        }
    }
}

class PyramidSandClock {
    public static void main(String[] args) {
        int N, row, col, spc, var = 1, var1 = 1;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (row = N; row >= 1; row--) {
            for (spc = 1; spc <= N - row; spc++) {
                System.out.print(" ");
            }
            for (col = 1; col <= row; col++) {
                System.out.print(var + " ");
                var++;
            }
            System.out.println();
        }
        for (row = 1; row <= N; row++) {
            for (spc = 1; spc <= N - row; spc++) {
                System.out.print(" ");
            }
            for (col = 1; col <= row; col++) {

                System.out.print(var1 + " ");
                var1++;
            }
            System.out.println();
        }
    }
}

