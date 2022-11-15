package lesson10.p1.p2;
import lesson10.p1.p2.p3.C;
public class B {
    C objectc1 = new C(4, "four");
    public int bint = objectc1.intvalc;
    public String stringb = objectc1.stringvalc;
    public static void GetInfoAboutBobject(B object){
        System.out.println(object.bint);
        System.out.println(object.stringb);
    }
}
