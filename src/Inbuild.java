public class Inbuild {
    public static void main(String[] args) {
//        compareTo();
//        System.out.println(toEqual());
//        conCatString();
//        substringSting();
//        System.out.println(ifEmpty());
//        toReplce();
//        lengthString();
        trimString();
    }

    public static void compareTo() {
        String s1 = "hello";
        String s2 = "hei";
        if (s1.length() < s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    System.out.println(s1.charAt(i) - s2.charAt(i));
                    break;
                }

            }
        } else {
            for (int i = 0; i < s2.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    System.out.println(s1.charAt(i) - s2.charAt(i));
                    break;
                }
            }
        }
    }

    public static boolean toEqual() {
        String s1 = "hello";
        String s2 = "hel";
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void conCatString() {
        String s1 = "hi";
        String s2 = "everyone";
        System.out.println(s1 + " " + s2);
    }

    public static void substringSting() {
        String s1 = "hello everyone";
        int a = 1;
        int b = 10;
        for (int i = 0; i < s1.length(); i++) {
            if (i >= a && i <= b) {

                System.out.print(s1.charAt(i));


            }
        }
    }

    public static boolean ifEmpty() {
        String s1 = "";
        if (s1.length() == 0) {
            return true;
        }
        return false;
    }

    public static void toReplce() {
        String s1 = "hi Devi";
        StringBuffer s2 = new StringBuffer();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'D') {
                s2.append('k');
            } else {
                s2.append(s1.charAt(i));
            }

        }
        System.out.println(s2);

    }

    //    public static void lengthString(){
//        String s1="hello hi";
//        int count = 0;
//        int i = 0;
//        while(s1!="") {
//            if(s1!=""){
//                count++;
//
//        }i++;
//        }
//        System.out.println(count);
//
//    }
    public static void trimString() {
        String s1 = "    hello hi   ";
        int startidx = 0;
        int endidx = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ') {
                startidx = i;
                break;
            }


        }
        System.out.println(startidx);
        for (int i = s1.length() - 1; i > 0; i--) {
            if (s1.charAt(i) != ' ') {
                endidx = i + 1;
                break;
            }
        }
        System.out.println(endidx);
        System.out.println(s1.substring(startidx, endidx));


    }
}
