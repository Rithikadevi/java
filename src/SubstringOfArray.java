import java.util.Scanner;

public class SubstringOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String name = sc.nextLine();
        String temp = "";
        boolean flag = true;
        for (int i = 0; i < name.length(); i++) {
            temp = "";

            for (int j = i; j < name.length(); j++) {
                temp += name.charAt(j);

                System.out.println(temp);

            }

        }
    }

    private static void subString() {


    }
}

