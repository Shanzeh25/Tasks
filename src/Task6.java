public class Task6 {
    ///Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    //and create 4 objects of this class:
    // 1 - inside same class;
    // 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.

    public Task6(int x){
        System.out.println(x+ " : Public");
    }
    private Task6() {
        System.out.println("2 : Private");
    }
    Task6 (String y) {
        System.out.println(y + " : Default");
    }
    protected Task6(double z) {
        System.out.println(z + " : Protected");
    }

    public static void main(String[] args) {
        Task6 pub=new Task6(1);
        Task6 pri=new Task6();
        Task6 def=new Task6("3");
        Task6 pro=new Task6(4.0);

    }
}
