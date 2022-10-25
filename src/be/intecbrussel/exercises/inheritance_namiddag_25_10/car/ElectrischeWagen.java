package be.intecbrussel.exercises.inheritance_namiddag_25_10.car;

public class ElectrischeWagen extends Car{
    private int battery;

    public ElectrischeWagen(){
        super();
    }

    public ElectrischeWagen(String color){
        this();
        this.setColor(color);
    }

    public ElectrischeWagen(String color, int battery){
        this();
        this.setColor(color);
        this.battery = battery;
    }

    public void accelerater(int amount){
        this.setSpeed(amount + (battery/100));
        battery -= 10;
    }

    public void slow(int amount){
        this.setSpeed(-(amount + (battery / 100)));
        battery -= 10;
    }

    public void charge(int amount){
        this.battery += amount;
    }

    public void park(int amount){
        this.setSpeed(0);
        this.battery -= 10;
    }
}
