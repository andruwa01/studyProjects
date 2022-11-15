package repeatingJavaSeptember;

class Testing {
    int parametr;
    String name;
    String surname;
    Testing(int parametr, String name){
        this.parametr = parametr;
        this.name = name;
    }
    Testing(String surname){
        this(6, "Alex");
        this.surname = surname;
        System.out.println("You entered new surname");
    }

    public int getParametr() {
        return parametr;
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

public class SeptemberTest {
    public static void main(String[] args) {
        Testing test = new Testing(1, "Body");
        Testing testWithOutput = new Testing("Not body");
        System.out.println(test.getParametr());
        System.out.println(test.getName());
        System.out.println(test.getSurname());

        System.out.println(testWithOutput.getSurname());
    }
}
