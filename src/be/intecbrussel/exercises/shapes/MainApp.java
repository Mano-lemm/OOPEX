package be.intecbrussel.exercises.shapes;

public class MainApp {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle(2.0);
        Square s1 = new Square(10);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(s1));
    } 
}
