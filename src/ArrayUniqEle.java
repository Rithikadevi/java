import java.util.Scanner;

public class ArrayUniqEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array");
        int l = sc.nextInt();
        int[] s1 = new int[l];
        int[] s2 = new int[l];
        int k = 0;

        System.out.println("elements of array");
        for (int i = 0; i < l; i++) {
            s1[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            int flag = 0;
            for (int j = 0; j < l; j++) {
                if (i != j) {
                    if (s1[i] == s1[j]) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                s2[k] = s1[i];
                k++;
            }
        }
        System.out.println("Unique Elements are:");
        for (int i = 0; i < k; i++) {
            System.out.print(s2[i] + " ");
        }
    }
}

