package lesson10.p4;
import lesson10.p1.A;
import lesson10.p1.p2.B;
import lesson10.p1.p2.p3.C;
import lesson10.p4.p5.E;
import static lesson10.p1.p2.B.GetInfoAboutBobject;
public class D {
    public static void main(String[] args) {
        A obja = new A(5, 6);

        B objectb = new B();
        objectb.bint = 11;
        objectb.stringb = "eleven";
        GetInfoAboutBobject(objectb);

        C objectc = new C(10, "ten");
        System.out.println(objectc.intvalc);
        System.out.println(objectc.stringvalc);

        E obje = new E();
        System.out.println(obje.e1);
        System.out.println(obje.e2);
        System.out.println(obje.e1 + obje.e2);
    }
}
