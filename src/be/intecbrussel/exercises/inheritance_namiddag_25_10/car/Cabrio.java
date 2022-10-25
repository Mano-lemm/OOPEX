package be.intecbrussel.exercises.inheritance_namiddag_25_10.car;

public class Cabrio extends Car{
    private boolean sunroof;

    public Cabrio(){
        super(1000);
        this.sunroof = false;
    }

    public Cabrio(String color){
        this();
        this.setColor(color);
    }

    public Cabrio(String color, int hp){
        super(color, hp);
    }

    public void openRoof(boolean roof){
        this.sunroof = !this.sunroof;
    }

    public boolean getRoof(){
        return this.sunroof;
    }

    @Override
    public String toString() {
        return String.format(
            "Cabrio { color = %s, speed = %s, sunroof is %s}"
                   ,getColor(), getSpeed(), this.sunroof ? "open" : "closed");
    }
}
