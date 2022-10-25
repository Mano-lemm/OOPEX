package be.intecbrussel.exercises.OOPEx;

import java.util.Scanner;

import be.intecbrussel.hulpClasses.Tuple;

public class ExerciseThree {
    public static void main(String[] args) {
        Tuple[] tuples = {  new Tuple(9300, "Aalst"),
                            new Tuple(2000, "Antwerpen"),
                            new Tuple(1000, "Brussel"),
                            new Tuple(9200, "Dendermonde"),
                            new Tuple(9000, "Gent"),
                            new Tuple(8500, "Kortrijk"),
                            new Tuple(9700, "Oudenaarde"),
                            new Tuple(2300, "Turnhout")
                        };
        Scanner s = new Scanner(System.in);
        System.out.println("Welk postnummer wil je opzoeken?");
        int lookup = s.nextInt();
        boolean found = false;
        for (Tuple city : tuples) {
            if(city.getX() == lookup){
                found = true;
                System.out.println("De stad die je opzocht is: " + city.getY());
            }
        }
        if(!found){
            System.out.println("De stad die je zocht ken ik niet.");
        }
        s.close();
    }
}
