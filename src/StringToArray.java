public class StringToArray {
    public static void main(String[] args) {
        String myString = "Hello World";
        char[] myArray = myString.toCharArray();

        System.out.println(myArray[0]);

        for (char i: myArray) {
            System.out.println(i);
        }
    }
}
