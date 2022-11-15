package lesson22.hometask;

class Student{
    private boolean ERROR_CODE = false;
    private StringBuilder name;
    private int course;
    private int grade;

    public void setName(StringBuilder name) {
        if(name.length() >= 3){
            this.name = name;
        } else {
            System.out.println("ERROR, SET ANOTHER NAME");
            ERROR_CODE = true;
        }
    }

    public void setGrade(int grade) {
        if(grade >= 1 && grade <= 10){
            this.grade = grade;
        } else {
            System.out.println("ERROR, SET ANOTHER GRADE");
            ERROR_CODE = true;
        }
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4){
            this.course = course;
        } else {
            System.out.println("ERROR, SET ANOTHER COURSE");
            ERROR_CODE = true;
        }
    }

    public StringBuilder getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void showInfo(){
        if (!ERROR_CODE) {
            System.out.println("Name: " + getName());
            System.out.println("Course: " + getCourse());
            System.out.println("Grade: " + getGrade());
        }
    }
}

public class Hometask1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Andrew"));
        student.setCourse(3);
        student.setGrade(3);
        student.showInfo();
    }
}
