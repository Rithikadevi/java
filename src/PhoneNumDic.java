import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumDic {
    public static void main(String[] args) {
        HashMap<String, Integer> hello = new HashMap<>();
//        Scanner sc=new Scanner(System.in);
//        while(true){
//            System.out.println("person's name");
//            String person=sc.nextLine();
//            if(person.equals("no")){
//                break;
//            }
//            while(true){
//                System.out.printf("person's phone number");
//                String number=sc.nextLine();
//
//            }
//        }
        hello.put("Yogesh", 915678);
        hello.put("Nrupul", 512345);
        hello.put("prateek", 213456);
        hello.put("Aman", 120987);
        hello.put("Madhukar", 769871);
        System.out.println("Person's name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean flag = true;
        for (Map.Entry<String, Integer> map : hello.entrySet()) {
            if (map.getKey().equals(name)) {
                System.out.println(map.getValue());
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("No user found");
        }
    }
}
