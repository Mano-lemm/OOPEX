package be.intecbrussel.hulpClasses;

public class Pos{
    public int x;
    public int y;

    public Pos(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Pos){
            Pos obj = (Pos) o;
            return this.x == obj.x && this.y == obj.y;
        }
        return false;
    }
}
