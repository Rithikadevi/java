import java.util.Scanner;

public class MaxBorder {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of times");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("row");
            int n = sc.nextInt();
            System.out.println("coloum");
            int m = sc.nextInt();
            char shape[][] = new char[n][m];
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < m; col++) {
                    shape[row][col] = sc.next().charAt(0);
                }
            }
            mixborder(n, m, shape);
        }
    }

    public static void mixborder(int n, int m, char[][] shape) {
        int count = 0;
        int finalcount = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (shape[row][col] == '#') {
                    count++;
                }
            }
            if (finalcount < count) {
                finalcount = count;
            }
            count = 0;
        }
        System.out.println("count");
        System.out.println(finalcount);
    }
}
