package be.intecbrussel.exercises.shapes;

public class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle { radius = " + this.radius + "}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Circle){
            return this.radius == ((Circle) obj).radius;
        }
        return false;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
