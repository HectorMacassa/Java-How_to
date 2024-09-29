public class AverageOfArray {
    public static void main(String[] args) {
        int[] ages = {40, 22, 19, 29, 35, 23, 77, 60};

        float avg, sum = 0;

        int length = ages.length;

        for (int age: ages) {
            sum += age;
        }
        avg = sum / length;

        System.out.println(avg);
    }
}
