public class Masai {
    public static void main(String[] args) {
        String s1 = "Masai school";

        for (int i = 0; i < s1.length(); i++) {
            int count = 1;
            for (int j = 0; j < s1.length(); j++) {
                if (i != j) {
                    if (s1.charAt(i) == s1.charAt(j)) {
                        count++;
                    }
                }
            }
            System.out.println(s1.charAt(i) + "-" + count);
        }
    }
}

