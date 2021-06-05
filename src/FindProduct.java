import java.util.Scanner;

public class FindProduct {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        ProductArray(array);


    }

    public static void ProductArray(int[] array) {
        long m = 10;
        long product = 1;
        for (int i = 0; i < array.length; i++) {
            product = (array[i] * product) % m;
        }

        System.out.println(product);
    }
}
