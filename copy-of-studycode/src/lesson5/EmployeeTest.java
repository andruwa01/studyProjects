package lesson5;

class Employee {

    Employee (int newid, String newsurname, int newage, int newsalary, String newdepartmentname){
        id = newid;
        surname = newsurname;
        age = newage;
        salary = newsalary;
        departmentname = newdepartmentname;

    }

    int id;
    String surname;
    int age;
    int salary;
    String departmentname;

    void salaryx2 (){
        salary *= 2;
    }

}

public class EmployeeTest {

    void getSalary(Employee user){
        System.out.printf("Salary of user %d: %d \n", user.id, user.salary);
    }

    public static void main(String[] args) {
        Employee user1 = new Employee(1, "Cheprasov", 19, 5000, "Software");
        Employee user2 = new Employee(2, "Petrov", 20, 6000, "Product");

        user1.salaryx2();
        user2.salaryx2();

        EmployeeTest newtest = new EmployeeTest();
        newtest.getSalary(user1);
        newtest.getSalary(user2);

    }
}
