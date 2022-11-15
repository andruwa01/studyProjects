package testing;

class Activity{
    void abc(int a){
        System.out.println("int");
    }
    void abc(float f){
        System.out.println("float");
    }
    void abc(Object o){
        System.out.println("Object");
    }
    public static void main(String[] args) {
        Activity activity = new Activity();
        activity.abc(3.14);
    }
}
