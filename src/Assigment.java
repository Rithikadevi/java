import java.util.Scanner;

public class Assigment {
    public static void main(String[] args) {
//        CountVowels();
//        CountWords();
//        Palindrome();
        NumToWord();
    }

    public static void CountVowels() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u' ||
                    s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'O' || s1.charAt(i) == 'U') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void CountWords() {
        String word = "i love myself";
        int count = 1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void Palindrome() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("YES (:");
        } else {
            System.out.println("NO ):");
        }
    }

    public static void NumToWord() {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        System.out.println(number);
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '0') {
                System.out.print("Zero" + " ");
            }
            if (number.charAt(i) == '1') {
                System.out.print("one" + " ");
            }
            if (number.charAt(i) == '2') {
                System.out.print("two" + " ");
            }
            if (number.charAt(i) == '3') {
                System.out.print("Three" + " ");
            }
            if (number.charAt(i) == '4') {
                System.out.print("Four" + " ");
            }
            if (number.charAt(i) == '5') {
                System.out.print("Five" + " ");
            }
            if (number.charAt(i) == '6') {
                System.out.print("Six" + " ");
            }
            if (number.charAt(i) == '7') {
                System.out.print("Seven" + " ");
            }
            if (number.charAt(i) == '8') {
                System.out.print("Eight" + " ");
            }
            if (number.charAt(i) == '9') {
                System.out.print("Nine" + " ");
            }
        }
    }
}

class Assigment2 {
    public static void main(String[] args) {
//        CountArrayValues();
        AverageOfOddEven();
    }

    public static void CountArrayValues() {
        int[] array = {1, 4, 3, 7, 5, 2, 3};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = count + array[i];
        }
        System.out.println(count);
    }

    public static void AverageOfOddEven() {
        int[] array = {1, 4, 3, 7, 5, 2};
        int averageOfEven = 0;
        int averageOfOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                averageOfEven++;
            } else {
                averageOfOdd++;
            }
        }
        System.out.println("count of odd position is " + averageOfOdd);
        System.out.println("count of even position is " + averageOfEven);
    }
}
