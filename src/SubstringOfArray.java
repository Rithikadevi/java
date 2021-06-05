import java.util.Scanner;

public class SubstringOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {

            for (int j = i; j < name.length(); j++) {

                subString(name, i, j);

            }

        }
    }

    public static void subString(String name, int i, int j) {
        String temp = "";
        boolean flag = false;
        for (int k = i; k <= j; k++) {
            if (temp.contains("" + name.charAt(k))) {
                flag = true;
                break;
            }
            temp += name.charAt(k);
        }
        if (!flag) System.out.println(temp);
    }

}
