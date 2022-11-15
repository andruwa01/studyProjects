package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    double multiplynum(double a){
        return a *= 2;
    }

    double myltiplynum (){
        return salary *= 2;
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        double result = emp1.myltiplynum();
        System.out.println(result);

    }
}
