package be.intecbrussel.exercises.shapes;

public class Square extends Shape{
    double length;

    public Square(double len){
        this.length = len;
    }

    public double area(){
        return this.length * this.length;
    }

    @Override
    public String toString() {
        return "Square { length = " + this.length + "}"; 
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Square){
            return this.length == ((Square)obj).length;
        }
        return false;
    }
}
