package lesson4;

class Student {
    int id;
    String name;
    String surname;
    int course;
    float mathval;
    float engval;
    float economval;

    Student (int newid, String newname, String newsurname, int newcourse, float newmathval, float newengval, float neweconomval){
        id = newid;
        name = newname;
        surname = newsurname;
        course = newcourse;
        mathval = newmathval;
        engval = newengval;
        economval = neweconomval;
    }

    Student(int newid, String newname, String newsurname, int newcourse){
        this(newid, newname, newsurname, newcourse, 0, 0, 0);
    }

    Student(){
        this(0, null, null, 0, 0, 0, 0);
    }


}

public class StudentTest extends Student{

    void userout (Student user){
        System.out.println(user.id + ": " + user.name);
    }

    public static void main(String[] args) {
        Student user1 = new Student(1, "John", "Mackensy", 1, 3, 5, 2);
        Student user2 = new Student(2, "Andrew", "Cheprasov", 2);
        Student user3 = new Student();

        StudentTest usertest = new StudentTest();
        usertest.userout(user1);
        usertest.userout(user2);
        usertest.userout(user3);

    }
}
