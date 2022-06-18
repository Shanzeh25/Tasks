public class Task5Student {
   // Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    //
    // Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name.
    // NOTE: please use different names for instance and local variables.

    String name;
    int sub1;
    int sub2;
    int sub3;

    Task5Student(String stuName,int gSub1,int gSub2,int gSub3){
        name=stuName;
        sub1=gSub1;
        sub2=gSub2;
        sub3=gSub3;
    }
    void printInfo(){
        System.out.println("Student name is "+name+" and her average score is "+ averageGrade());
    }
    int averageGrade(){
        return(sub1+sub2+sub3)/3;
    }

    public static void main(String[] args) {
        Task5Student stu1=new Task5Student("Javeria",80,70,90);
        stu1.printInfo();
        Task5Student stu2=new Task5Student("Manahil",90,60,85);
        stu2.printInfo();
        Task5Student stu3=new Task5Student("Rimsha",60,90,15);
        stu3.printInfo();
        Task5Student stu4=new Task5Student("Fajar",40,30,67);
        stu4.printInfo();
        Task5Student stu5=new Task5Student("Kalsoom",43,25,67);
        stu5.printInfo();
    }
}

