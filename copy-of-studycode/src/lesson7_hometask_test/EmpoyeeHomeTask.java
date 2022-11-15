package lesson7_hometask_test;

public class EmpoyeeHomeTask {
    public static void main(String[] args) {
        lesson6.Employee usertest = new lesson6.Employee(1, "Petya", 10, 3000, "Play");
        System.out.println(usertest.surname);
        usertest.getUserId();
    }
}
