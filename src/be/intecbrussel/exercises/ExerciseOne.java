package be.intecbrussel.exercises;

import java.util.Scanner;

public class ExerciseOne {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Hoeveel euro is de factuur exact?");
        int factuur = s.nextInt();

        if(factuur > 5000){
            System.out.printf("Het totaal te betalen is %.2f euro want u had recht op 5%% korting.\n", factuur * .95);
        } else {
            System.out.printf("U had geen recht op korting en betaalt %.2f euro.\n", factuur);
        }
        s.close();
    }
}
