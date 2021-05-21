import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array's size");
        int n = sc.nextInt();

        System.out.println("Elements of array");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

