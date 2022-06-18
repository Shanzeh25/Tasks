public class Task3 {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.

   private String name(String x) {
       return x.replaceAll("[^aeiou]","");

    }

    public static void main(String[] args) {
        Task3 method=new Task3();
        String a=method.name("Hello");
        System.out.println(a);
    }

}
