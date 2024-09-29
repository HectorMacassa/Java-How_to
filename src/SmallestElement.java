public class SmallestElement {
    public static void main(String[] args) {
        int[] ages = {40, 22, 19, 29, 35, 23, 77, 60};

        int lowestAge = ages[0];

        for (int age: ages) {
            if (age < lowestAge) {
                lowestAge = age;
            }
        }
        System.out.println(lowestAge);
    }
}
