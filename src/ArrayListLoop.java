import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("volvo");

        for (String i: cars) {
            System.out.println(i);
        }
    }
}
