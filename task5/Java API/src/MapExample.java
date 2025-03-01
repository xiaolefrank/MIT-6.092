import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> strings = new HashMap<String, String>();
        strings.put("Evan", "email1@mit.edu");
        strings.put("Eugene", "email2@mit.edu");
        strings.put("Adam", "email3@mit.edu");

        System.out.println(strings.size());
        strings.remove("Adam");
        System.out.println(strings.get("Eugene"));

        for (String s : strings.keySet()) {
            System.out.println(s);
        }
        for (String s : strings.values()) {
            System.out.println(s);
        }
        for (Map.Entry<String, String> p : strings.entrySet()) {
            System.out.println(p);
        }
    }
}
