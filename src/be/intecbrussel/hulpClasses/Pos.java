package be.intecbrussel.hulpClasses;

public class Pos implements Comparable<Pos>{
    public int x;
    public int y;

    public Pos(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pos o) {
        if(this.x == o.x && this.y == o.y){
            return 0;
        }
        return 1;
    }
}
