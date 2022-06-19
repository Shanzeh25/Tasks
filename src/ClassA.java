public class ClassA {
    //Write program for multilevel inheritance where class C inherits from class B
    // and Class B inherits from Class A.

   String x ="Class A Method";
}
class ClassB extends ClassA{
   String y="Class B Method";
}
class ClassC extends ClassB {
    String z="Class C Method";

    public static void main(String args[]) {
        ClassC obj=new ClassC();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
    }
}



