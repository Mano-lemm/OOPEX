package be.intecbrussel.exercises.inheritance.canines;

public class Dog extends Wolf{
    boolean canSkateboard;

    public boolean isCanSkateboard() {
        return canSkateboard;
    }

    public void setCanSkateboard(boolean canSkateboard) {
        this.canSkateboard = canSkateboard;
    }

    @Override
    public void makeNoise() {
        System.out.println("WAF WAF");
    }
}
