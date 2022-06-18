public class Task8 {
   // Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.

    String name;
    String address;

    Task8(String studentName,String studentAddress){
        name=studentName;
        address=studentAddress;
    }
    void displayInfo() {
        System.out.println(name + " " + address);
    }

    public static void main(String[] args) {
        Task8 info=new Task8("Shanzeh","Pakistan");
        info.displayInfo();
    }

}
