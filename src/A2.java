public class A2 {
 // Write program to inherit class A that has method printF which is static
 // and call or reuse that method into class B
 public static void printF() {
  System.out.println("Method is static");
 }
}
class B2 extends A2 {

 public void show() {
  printF();
 }public void printF1() {
  System.out.println("Used Class A in Class B");
 }

 public static void main(String[] args) {
  A2 a = new A2();
  a.printF();

  B2 b = new B2();
  b.printF1();
 }
}





