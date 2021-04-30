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
//       int[] array={10,2,16,15,5};
//       int temp,max=1;
//       for(int i=0;i<array.length;i++){
//           for(int j=i+1;j<array.length;j++){
//               if(array[i]<array[j]){
//                   temp=array[i];
//                   array[i]=array[j];
//                   array[j]=temp;
//               }
//           }
//       }
//       System.out.println(array[0]);
//       AnotherArray();
        AnotherArrayb();

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


