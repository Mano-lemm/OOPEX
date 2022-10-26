package be.intecbrussel.exercises.inheritance;

import be.intecbrussel.exercises.inheritance.canines.Dog;
import be.intecbrussel.exercises.inheritance.canines.Labrador;
import be.intecbrussel.exercises.inheritance.canines.Wolf;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Wolf wolf = new Wolf("Jan", 23);
        Wolf LBozo = new Labrador();

        dog.makeNoise();
        wolf.makeNoise();
        LBozo.makeNoise();
    } 
}
