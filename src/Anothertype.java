import java.util.Scanner;

public class Anothertype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 100 == 0) {
            for (int month = 1; month <= 7; month++) {
                if (month % 2 != 0) {
                    for (int date = 1; date <= 31; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                } else if (month == 2) {
                    for (int date = 1; date <= 29; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                } else {
                    for (int date = 1; date <= 30; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                }
            }
            for (int month = 8; month <= 12; month++) {
                if (month % 2 == 0) {
                    for (int date = 1; date <= 31; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                } else {
                    for (int date = 1; date <= 30; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                }

            }
        } else {
            for (int month = 1; month <= 7; month++) {
                if (month % 2 != 0) {
                    for (int date = 1; date <= 31; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                } else if (month == 2) {
                    for (int date = 1; date <= 28; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                } else {
                    for (int date = 1; date <= 30; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                }
            }
            for (int month = 8; month <= 12; month++) {
                if (month % 2 == 0) {
                    for (int date = 1; date <= 31; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                } else {
                    for (int date = 1; date <= 30; date++) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                }

            }
        }

    }
}
