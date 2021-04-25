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
        for (int month = 1; month <= 12; month++) {
            if (month % 2 == 0) {
                for (int date = 1; date <= 30; date++) {
                    System.out.println(year + "-" + month + "-" + date);
                }
            } else {
                for (int date = 1; date <= 31; date++) {
                    System.out.println(year + "-" + month + "-" + date);
                }
            }
            if (month == 2) {
                for (int date = 1; date <= 29; date++) {
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
