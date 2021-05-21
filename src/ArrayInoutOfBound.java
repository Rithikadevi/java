public class ArrayInoutOfBound {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, 5};
        int[] index = {3, 0, 2};
        int[] inout = new int[array.length];
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < index.length; j++) {
                if (index[j] == i) {
                    inout[i] = 0;
                    flag = false;
                }
            }
        }
        if (flag == true) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(index[i]);
            }
        } else {
            System.out.println("Array Index out of Bounds");
        }
    }
}
