public class Task2 {
   // Create a method that will take a String as a parameter
   //and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.

    public StringBuilder str (String x){
        StringBuilder st=new StringBuilder(x);
        return st.reverse();
    }

    public static void main(String[] args) {
        Task2 method=new Task2();
        String a= String.valueOf(method.str("Hello"));
        System.out.println(a);

    }
}
