import java.util.HashMap;
public class HashMapLoop {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("USA", "Washington");
        capitalCities.put("UK", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Kenya", "Nairobi");

        for (String i: capitalCities.keySet()) {
            System.out.println("Key: " + i + " " + "Value: " + capitalCities.get(i));
        }
    }
}
