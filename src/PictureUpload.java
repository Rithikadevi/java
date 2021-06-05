import java.util.Scanner;

public class PictureUpload {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("lenght");
        int L = sc.nextInt();
        System.out.println("pictures");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("width and height");
            int W = sc.nextInt();
            int H = sc.nextInt();
            if (W < L || H < L) {
                System.out.println("UPLOAD ANOTHER");
            } else if ((W == L && H == L) || W == H) {
                System.out.println("ACCEPTED");

            } else if (W >= L && H >= L) {
                System.out.println("CROP IT");
            }

        }
    }
}
