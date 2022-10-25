package be.intecbrussel.exercises.inheritance_namiddag_25_10.car;

public class SUV extends Car{
    private boolean bullbar;

    // niet op de UML maar vereist ivm defenities van methodes
    private boolean FourxFour;

    public SUV(){
        super(100);
        bullbar = false;
        FourxFour = false;
    }

    public SUV(String color){
        this();
        this.setColor(color);
    }
    
    public SUV(String color, int hp){
        super(color, hp);

    }

    public SUV(String color, boolean bullbar){
        this(color);
        this.bullbar = bullbar;
    }

    public boolean getBullbar(){
        return bullbar;
    }

    public void setBullbar(boolean bullbar){
        this.bullbar = bullbar;
    }

    public void FourxFourDriving(boolean FourxFourDriving){
        FourxFour = FourxFourDriving;
    }

    @Override
    public int getSpeed(){
        if(FourxFour){
            return Math.min(super.getSpeed(), 30);
        }
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return String.format(
            "SUV { color = %s, speed = %s, %sin 4x4 mode, %s bullbar}",
            getColor(), getSpeed(), this.FourxFour ? "": "not in ", this.bullbar ? "has a" : "has no");
    }
}
