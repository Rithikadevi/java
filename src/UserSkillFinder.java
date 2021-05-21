import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserSkillFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList> hello = new HashMap<>();
        while (true) {
            ArrayList<String> personskills = new ArrayList<>();
            System.out.println("User name");
            String person = sc.nextLine();
            if (person.equals("no")) {
                break;
            }
            while (true) {
                System.out.println("person's skill");
                String skills = sc.nextLine();
                if (skills.equals("no")) {
                    break;
                }
                personskills.add(skills);
            }
            hello.put(person, personskills);
        }
        for (Map.Entry<String, ArrayList> map : hello.entrySet()) {
            for (int i = 0; i < map.getValue().size(); i++) {
                if (map.getValue().get(i).equals("html")) {
                    System.out.println(map.getKey());
                    break;
                }
            }
        }
    }
}
