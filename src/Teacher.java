public class Teacher {
    //Write a Java program called Teacher.  Identify features and behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    // that would have it their own features and behaviour. Test all 4 classes

    String name;
    int age;

    void print() {
        System.out.println("Name of the Teacher is " + name + " and his age is " + age);
    }
}

 class mathTeacher extends Teacher {
        mathTeacher(String name, int age) {
            this.name = name;
            this.age = age;

        }
    }

    class chemistryTeacher extends Teacher {
        chemistryTeacher(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    class pianoTeacher extends Teacher {
        pianoTeacher(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public static void main(String[] args) {
            mathTeacher math=new mathTeacher("Saeed",40);
            math.print();
            chemistryTeacher chem=new chemistryTeacher("AbuBakar",36);
            chem.print();
            pianoTeacher pia=new pianoTeacher("Sabir",25);
            pia.print();

        }
    }
