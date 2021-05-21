import java.util.Scanner;

public class MinArrayUpdateRequire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Given number");
        int n = sc.nextInt();

        System.out.println("Size of an array");
        int size = sc.nextInt();

        System.out.println("Elements of an array");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int val = 1;
            if (array[i] < n) {
                int s = array[i];
                while (val > 0) {
                    s += val;
                    if (s >= n) {
                        sum += val;
                        break;
                    }
                    s = array[i];
                    val++;
                }
            }
        }
        System.out.println("sum of minimum numbers:");
        System.out.println(sum);
    }
}
