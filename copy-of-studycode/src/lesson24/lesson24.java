package lesson24;

public class lesson24 {

    public static void main(String[] args) {



        Figure square1 = new Square();
        System.out.println(square1.countSides); // because class Figure has 0 sides
        square1.squareArea();
    }
}

abstract class Figure{
    int countSides;
    abstract void perimeter();
    abstract void squareArea();
    void showInfo(){
        System.out.println("This is figure ");
    }
}

class Square extends Figure{
    void showInfo(){
        System.out.println("This is square");
    }
    int countSides = 4;
    int side = 10;
    public void perimeter(){
        System.out.println("Perimeter of square: " + 4 * side);
    }
    public void squareArea(){
        System.out.println("Square of square(figure): " + Math.pow(side, 2));
    }
}

class Rectangle extends Figure{
    int countSides = 4;
    int side1 = 10;
    int side2 = 5;
    public void perimeter(){
        System.out.println("Perimeter of square: " + 2 * (side1 + side2));
    }
    public void squareArea(){
        System.out.println("Square of square(figure): " + side1 * side2);
    }
}

class Circle extends Figure{
    int countSides = 0;
    int radius;
    public void perimeter(){
        System.out.println("Perimeter of circle: " + 2 * Math.PI * radius);
    }
    public void squareArea(){
        System.out.println("Square of circle: " + Math.PI * Math.pow(radius, 2));
    }
}

abstract class Quadrilateral extends Figure{
    void def(){
        System.out.println("This is quadrilateral");
    }
}

