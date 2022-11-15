package lesson6;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String departmentname;

    private Employee(int id2, String surname2, int age2){
        id = id2;
        surname = surname2;
        age = age2;
    }

    Employee(String surname3, int age3){
        this(0, surname3, age3, 0, null);
    }

    public Employee(int id4, String surname4, int age4, double salary4, String departmentname4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        departmentname = departmentname4;
    }

    public void getUserSalary(){
        System.out.println(salary);
    }

    public void getUserId(){
        System.out.println(id);
    }

    public void getUserSurname(){
        System.out.println(surname);
    }

}


class EmployeeTest2 {

    public static void main(String[] args) {
        Employee user1 = new Employee(1, "Petrov", 18, 6000, "Marketing");
        user1.getUserSalary();
        user1.getUserId();
        Employee user2 = new Employee("Cheprasov", 19);
        user2.getUserSurname();

    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Ivanov", 25, 5000, "Development");
        emp1.getUserId();
        emp1.getUserSurname();
        emp1.getUserSalary();

    }
}
