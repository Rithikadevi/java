import java.util.Scanner;

public class EqulibiriumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Size of an array");
        int N = sc.nextInt();
        int[] array = new int[N];

        System.out.println("Elements of an array");
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        int addleft = 0;
        for (int i = 0; i < N; i++) {

            int addright = 0;
            for (int j = i + 1; j < N; j++) {
                addright += array[j];
            }

            if (addleft == addright) {
                flag = false;
                System.out.println(i + 1);
                break;
            }
            addleft += array[i];
        }
        if (flag) {
            System.out.println("-1");
        }

    }
}
