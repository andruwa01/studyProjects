package lesson12.hometask;
import Lesson11.Student;
public class StudentTest {
    void abscomparsion (Student stud1, Student stud2){
        if (stud1.name.equals(stud2.name) && (stud1.course == stud2.course) && (stud1.grade == stud2.grade)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }

    void comparsion (Student stud1, Student stud2){
        if (stud1.name == stud2.name){
            if (stud1.course == stud2.course){
                if (stud1.grade == stud2.grade){
                    System.out.println("Equal in all");
                } else {
                    System.out.println("Not equal in grade");
                }
            } else {
                System.out.println("Not equal in course");
            }
        } else {
            System.out.println("Not equal in name");
        }
    }

    public static void main(String[] args) {
        StudentTest functions = new StudentTest();
        Student stud1 = new Student("Andrew", 2, 5.0);
        Student stud2 = new Student("Andrew", 2, 5.0);
        functions.abscomparsion(stud1, stud2);


    }
}
