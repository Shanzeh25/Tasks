import java.util.Arrays;

class Task1 {
    // Create a method that will accept an array as parameters and
    //will return a sum of all elements from that array.
    // Method should be visibly only within same package
    // and accessible by the creating an instance of the class.

    private void method (int[] x) {
        int sum = Arrays.stream(x).sum();
        System.out.println(sum);
    }

        public static void main(String[] args) {
        int[] myArray = {1,2,8};
        Task1 array = new Task1();
        array.method(myArray);

        }

}