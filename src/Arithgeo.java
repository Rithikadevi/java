import java.util.Scanner;

public class Arithgeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of string");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("elements of array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[0] - arr[1] == arr[2] - arr[1]) {
                System.out.println("Arithmatic");
                break;
            } else if (arr[1] / arr[0] == arr[2] / arr[1]) {
                System.out.println("geometric");
                break;
            } else {
                System.out.println("-1");
                break;
            }

        }


    }
}

