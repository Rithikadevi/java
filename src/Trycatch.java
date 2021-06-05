import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        try {
            for (int i = 0; i < n + 1; i++) {
                System.out.println(array[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("run rest of the code");
    }
}

class tryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        try {
            c = a / b;
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
