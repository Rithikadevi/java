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

class Assignments3 {
    public static void main(String[] args) {
        SearchString();
//        MatrixAddition();
//        ArrayColumnSum();
//        PrintSubMatrix();
//        MatrixDiagonal();
//        TransposeMatrix();
//        HumanReadableDate();
    }

    public static void SearchString() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String temp = "";
        for (int i = 0; i < s1.length(); i++) {

            for (int j = i; j < s1.length(); j++) {
                temp = temp + s1.charAt(j);
                if (temp.equals(s2)) {
                    System.out.println("TRUE");
                    break;
                }
            }
            temp = "";
        }
        System.out.println("FALSE");
    }

    public static void MatrixAddition() {
        int[][] s1 = {{1, 2, 3}, {5, 6, 7}, {7, 8, 9}};
        int[][] s2 = {{2, 1, 2}, {1, 2, 1}, {2, 1, 2}};
        int[][] s3 = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                s3[row][col] = s1[row][col] + s2[row][col];
                System.out.print(s3[row][col] + " ");
            }
            System.out.println();
        }

    }

    public static void ArrayColumnSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("matrix's row and column");
        int[][] s1 = {{1, 2, 1}, {2, 1, 2}};
        int s3;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                s3 = s1[row][col] + s1[row + 1][col];
                System.out.println(s3);

            }
        }
    }

    public static void PrintSubMatrix() {
        int rowend = 1;
        int colend = 1;
        int[][] array = {{1, 2, 3}, {5, 6, 7}, {7, 8, 9}};
        for (int i = 0; i <= rowend; i++) {
            for (int j = 0; j <= colend; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void MatrixDiagonal() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int add1 = 0;
        int add2 = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if ((row == col)) {
                    add1 += matrix[row][col];
                }
                if ((row == 0 && col == 2) || (col == 0 && row == 2) || (row == col) && (row != 0 && col != 2)) {
                    add2 += matrix[row][col];
                }
            }
        }
        System.out.println(add1);
        System.out.println(add2);
        System.out.println(add1 - add2);
    }

    public static void TransposeMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix's row and col size");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("input matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose of matrix");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[j][i]);
            }
            System.out.println();
        }
    }

    public static void HumanReadableDate() {
        String date = "2020-06-01";
        String array[] = date.split("-");
        String month = "";
        String year = "";
        String date1 = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 1) {
                month += array[i];
            } else if (i == 0) {
                year += array[i];
            } else {
                date1 += array[i];
            }
        }
        System.out.println(year);
        System.out.println(month);
        System.out.println(date1);
        switch (month) {
            case "01":
                System.out.println(date1 + " January " + year);
                break;
            case "02":
                System.out.println(date1 + " Februray " + year);
                break;
            case "03":
                System.out.println(date1 + " March " + year);
                break;
            case "04":
                System.out.println(date1 + " April " + year);
                break;
            case "05":
                System.out.println(date1 + " May " + year);
                break;
            case "06":
                System.out.println(date1 + " June " + year);
                break;
            case "07":
                System.out.println(date1 + " July " + year);
                break;
            case "08":
                System.out.println(date1 + " August " + year);
                break;
            case "09":
                System.out.println(date1 + " September " + year);
                break;
            case "10":
                System.out.println(date1 + " October " + year);
                break;
            case "11":
                System.out.println(date1 + " November " + year);
                break;
            case "12":
                System.out.println(date1 + " December " + year);
                break;
        }
    }
}

