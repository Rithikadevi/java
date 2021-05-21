import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 4};
        int max;
        System.out.println("Ascending order of the list:-");
        for (int i = 0; i < array.length; i++) { // i=1
            for (int j = i + 1; j < array.length; j++) { // j=1+1=2
                if (array[i] > array[j]) {
                    max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

//    public static boolean String(int[] array) {
//    }
}

class Arraysdec {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 4};
        int max;
        System.out.println("Descending order of the list:-");
        for (int i = 0; i < array.length; i++) { // i=1
            for (int j = i + 1; j < array.length; j++) { // j=1+1=2
                if (array[i] < array[j]) {
                    max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

class Patternnum {
    public static void main(String[] args) {
        int left = 3;
        int right = 5;
        for (int i = 1; i <= left; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + "." + j);
            }
        }
    }
}

class Printyears {
    public static void main(String[] args) {
        int year = 2020;
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
    }
}

class OddposChar {
    public static void main(String[] args) {
        String word = "Rithikadevi Prakasam";
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(word.charAt(i));
            }
        }
    }
}

class PrintSwitch {
    public static void main(String[] args) {
        int month = 1;
        int year = 2020;
        switch (month) {
            case 1:
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + "-" + "01" + "-" + date);

                }
            case 2:
                for (int date = 1; date <= 29; date++) {
                    System.out.println(year + "-" + "02" + "-" + date);
                }
            case 3:
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + "-" + "03" + "-" + date);
                }
            case 4:
                for (int date = 1; date <= 30; date++) {
                    System.out.println(year + "-" + "04" + "-" + date);
                }
            case 5:
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + "-" + "05" + "-" + date);
                }
            case 6:
                for (int date = 1; date <= 30; date++) {
                    System.out.println(year + "-" + "06" + "-" + date);
                }
            case 7:
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + "-" + "07" + "-" + date);
                }
            case 8:
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + "-" + "08" + "-" + date);
                }
            case 9:
                for (int date = 1; date <= 30; date++) {
                    System.out.println(year + "-" + "09" + "-" + date);
                }
            case 10:
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + "-" + "10" + "-" + date);
                }
            case 11:
                for (int date = 1; date <= 30; date++) {
                    System.out.println(year + "-" + "11" + "-" + date);
                }
            case 12:
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + "-" + "12" + "-" + date);
                }
        }
    }
}

class Anotheryear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year == 4 || year == 100 || year == 400) {
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




