package be.intecbrussel.exercises.inheritance_namiddag_25_10;

import be.intecbrussel.exercises.inheritance_namiddag_25_10.car.*;

public class MainApp {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new SUV("rood", 250);
        cars[1] = new Cabrio("geel", 200);
        cars[2] = new ElectrischeWagen("groen", 60);
        System.out.println("Alle wagens:");
        for (Car car : cars) {
            System.out.println("\t" + car);
        }

        System.out.println("Versnel alle wagens met 50:");
        for (Car car : cars) {
            car.accelerater(50);
            System.out.println("\t" + car);
        }

        System.out.println("Parkeer alle wagens:");
        for (Car car : cars) {
            car.park(0);
            System.out.println("\t" + car);
        }
    }
}
