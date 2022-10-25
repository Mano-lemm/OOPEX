package be.intecbrussel.exercises.inheritance_namiddag_25_10.car;

public class Car {
    private String color;
    private int speed;
    private int hp;

    public Car(){
        this.color = "Black";
        this.speed = 0;
        this.hp = 0;
    }

    public Car(int hp){
        this();
        this.hp = hp;
    }

    public Car(String color){
        this();
        this.color = color;
    }

    public Car(String color, int hp){
        this(color);
        this.hp = hp;
    }

    public void accelerater(int amount){
        this.speed += (amount + (hp/100));
    }

    public void slow(int amount){
        this.speed -= (amount + (hp/100));
    }

    public void park(int amount){
        this.speed = 0;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getSpeed(){
        return this.speed;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car { color = " + color + ", speed = " + speed + "}";
    }
}
