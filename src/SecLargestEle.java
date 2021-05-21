import java.util.Scanner;

public class SecLargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array's size");
        int n = sc.nextInt();

        System.out.println("Elements of array");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int first = array[0];
        int second = array[0];
        for (int i = 0; i < n; i++) {
            if (first < array[i]) {
                second = first;
                first = array[i];
            } else if (array[i] > second && second < first) {
                second = array[i];
            }
        }
        System.out.println(second);
    }
}
