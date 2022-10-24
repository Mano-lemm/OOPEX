package be.intecbrussel.exercises;

import java.util.Scanner;

import be.intecbrussel.hulpClasses.PasswordGenerator;

public class ExerciseTwo {
    public static void main(String[] args) {
        PasswordGenerator gen = new PasswordGenerator();
        Scanner s = new Scanner(System.in);
        String keepGoing = "";
        do {
            System.out.printf("Het gegenereerde wachtwoord is ");
            Character[] pwd = gen.generatePassword();
            for (Character character : pwd) {
                System.out.print(character);
            }
            System.out.println();
            System.out.println("Wilt u nog een wachtwoord genereren? (Y/N)");
            keepGoing = s.nextLine();
        } while (keepGoing.equalsIgnoreCase("y"));

        s.close();
    }
}
