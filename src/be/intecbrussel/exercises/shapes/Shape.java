package be.intecbrussel.exercises.shapes;

public abstract class Shape {
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public abstract double area();
}
