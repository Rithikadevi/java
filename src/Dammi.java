import java.util.Scanner;

public class Dammi {
    public static void main(String[] args) {
        String s = "I love myself";
        String[] array = s.split("e");
        for (String i : array) {
            System.out.print(i);
        }
    }
}

class StringClass {
    public static void main(String[] args) {
        String s = "I love myself";
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'l') {
                array[i] = 'o';
            }
        }
        s = s.valueOf(array);
        System.out.println(s);


    }
}

class Arraybig {
    public static void main(String[] args) {
        int s = 0;
        int[][] array = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}, {10, 11, 12}};
        for (int row = 0; row < array[0].length; row++) {
            for (int col = 0; col < array.length; col++) {
                s += array[col][row];
            }
            System.out.println(s);
            s = 0;
        }
    }

    public static void AnotherArray() {
        int[] array = {10, 2, 16, 15, 5};
        int big = array[0];
        for (int i = 0; i < array.length - 1; i++) {

            int a = array[i];
            int b = array[i + 1];
            System.out.println(a + "," + b);
            if (a < b) {
                if (big < b) {
                    big = b;
                }
            } else if (big < a) {

                big = a;
            }

        }
        System.out.println(big);

    }

    public static void AnotherArrayb() {
        int[] array = {10, 2, 16, 15, 5};
        int small = array[0];
        for (int i = 0; i < array.length - 1; i++) {

            int a = array[i];
            int b = array[i + 1];
            System.out.println(a + "," + b);
            if (a < b) {
                if (small > a) {
                    small = a;
                }
            } else if (small > b) {

                small = b;
            }

        }
        System.out.println(small);

    }
}

class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = 0;
//        int a = Math.abs(n - m);
        if (n < m) {
            a = m - n;
        } else {
            a = n - m;
        }

        System.out.println(a);
    }
}

class MirrorValue {
    public static void main(String[] args) {
        String word = "azby";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int a = (122 - c) + 97;
            char s = (char) a;
            System.out.print(s);
        }
    }
}

class SwapSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] array = new int[l];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((i == 0 && array[j] != 0) || i != 0) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}

class AddEqualNum {
    public static void main(String[] args) {
        int[] array = {8, 4, 6, 2, 1, 5, 5};
        int sum = 10;
        int add = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                add = 0;
                if (i != j) {
                    add = array[i] + array[j];
                    if (add == sum) {
                        System.out.println(array[i] + "," + array[j]);
                    }
                }
            }
        }
    }
}
//class Continue{
//    public static void main(String[]args){
//        String name="masai";
//        String temp="masa";
//        for(int i=0;i<name.length();i++);{
//            for(int j=0;j<temp.length();j++){
//                if(temp.charAt(j)==name.charAt(i)){
//                    continue;
//                }
//
//            }
//        }
//    }
//}

