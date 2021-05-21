public class MaximalNumber {
    public static void main(String[] args) {
        int[] array = {1, 4, 0, 3};
        int temp = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = i + 1; j < array.length; j++) {
                if ((i == array.length - 1 && array[j] != 0 || (i != array.length - 1))) {
                    if (array[i] < array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
