import java.util.Scanner;

public class MaxOccurEle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int[] s1 = new int[l];
        int temp = 0;
        int time = 1;
        for (int i = 0; i < l; i++) {
            s1[i] = s.nextInt();
        }

        for (int i = 0; i < l; i++) {
            int count = 1;
            for (int j = i + 1; j < l; j++) {
                if (s1[i] == s1[j]) {
                    time = count++;
                    if (time < count) {
                        temp = s1[i];
                    }
                }
            }
        }
        System.out.println(temp);
    }
}
