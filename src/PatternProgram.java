import java.util.Scanner;

public class PatternProgram {
    public static void main(String[] args) {
        int N, row, col;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (row = 1; row <= N; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

class PatternProgramTwo {
    public static void main(String[] args) {
        int N, row, col;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (row = 1; row <= N; row++) {
            for (col = 1; col <= (row * 2) - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}