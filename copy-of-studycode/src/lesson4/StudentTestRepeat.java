package lesson4;
class StudentRepeat {
    int id;
    String secondName;
    int studyDate;
    float midMath;
    float midEconomics;
    float midEnglish;
    StudentRepeat(float midMath, float midEconomics, float midEnglish){
        this.midMath = midMath;
        this.midEnglish = midEnglish;
        this.midEconomics = midEconomics;
    }
    void outStudent(){
        System.out.printf("%.2f", (midMath + midEconomics + midEnglish)/3);
    }

}

public class StudentTestRepeat {
    public static void main(String[] args) {
        StudentRepeat stud1 = new StudentRepeat(5.55f, 6.43f, 3.43f);
        stud1.outStudent();
    }
}
