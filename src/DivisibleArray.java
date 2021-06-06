public class DivisibleArray {
    public static void main(String args[]) {
        int[] array = {123, 345, 437, 894};
        int size = array.length;
        String[] str = new String[size];
        for (int i = 0; i < size; i++) {
            str[i] = String.valueOf(array[i]);

        }
        for (int i = 0; i < size; i++) {
            System.out.println(str[i]);
        }

    }
}

class Summa {
    public static void main(String[] args) {
        char a = '2';
        int b = (char) a;
        System.out.println(b);
    }
}
