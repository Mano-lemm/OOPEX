package be.intecbrussel.hulpClasses;

public class Tuple {
    private int x;
    private String y;
    
    public Tuple(int x, String y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public String getY(){
        return y;
    }
}
