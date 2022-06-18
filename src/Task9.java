public class Task9 {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed.

    String name;
    String Author;



    Task9(String bookName,String bookAuthor) {
        name = bookName;
        Author = bookAuthor;
    }
    Task9(String bookName) {
        name=bookName;

    }
    void print(){
        System.out.println("The name if the Book is "+name+" and the author is "+Author);
    }

    void print1(){
        System.out.println("The name if the Book is "+name);
    }

    public static void main(String[] args) {
        Task9 book1=new Task9("Forty Rules of love","Elif Shafak");
        book1.print();
        Task9 book2=new Task9("The Kite Runner");
        book2.print1();
    }



}
