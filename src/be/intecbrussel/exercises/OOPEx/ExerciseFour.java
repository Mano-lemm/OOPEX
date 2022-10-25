package be.intecbrussel.exercises.OOPEx;

import java.util.Arrays;
import java.util.Scanner;

import be.intecbrussel.hulpClasses.Pos;

public class ExerciseFour {
    static boolean[][] veld;
    static Pos eiPositie;
    static Pos[] guessed;

    public static boolean hasBeenGuessed(Pos gues){
        for (Pos pos : guessed) {
            if(pos.equals(gues)){
                return true;
            }
        }
        return false;
    }

    public static void printVeld(){
        for (int i = 0; i < veld.length; i++) {
            for (int j = 0; j < veld.length; j++) {
                if(hasBeenGuessed(new Pos(i, j))){
                    System.out.print("X\t");
                } else {
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initGame();
        Scanner s = new Scanner(System.in);
        do {
            printVeld();
            System.out.println("Vind het paasei, geef een rij (0-9):");
            int x = s.nextInt();
            System.out.println("Geef een kolom(0-9):");
            int y = s.nextInt();
            guessed = Arrays.copyOf(guessed, guessed.length + 1);
            guessed[guessed.length - 1] = new Pos(x, y);
            if(x < eiPositie.x){
                System.out.println("Het ei ligt meer naar het zuiden.");
            } else if(x > eiPositie.x){
                System.out.println("Het ei ligt meer naar het noorden.");
            }

            if(y < eiPositie.y){
                System.out.println("Het ei ligt meer naar het oosten.");
            } else if(y > eiPositie.y){
                System.out.println("Het ei ligt meer naar het westen.");
            }


            if(x == eiPositie.x && y == eiPositie.y){
                System.out.println("Je hebt het ei gevonden!");
                System.out.println("Druk <enter> om opnieuw te spelen");
                System.out.println("Typ e om af te sluiten");
                s.nextLine();
                String in = s.nextLine();
                if(in.equalsIgnoreCase("e")){
                    break;
                } else {
                    initGame();
                    continue;
                }
            }
        } while (guessed.length == 0 || guessed[guessed.length - 1].equals(eiPositie));
        s.close();
    }

    private static void initGame() {
        veld = new boolean[10][10];
        guessed = new Pos[0];
        eiPositie = new Pos((int) (Math.random() * 10), (int) (Math.random() * 10));
    }
}
