package Dealership;
import java.util.HashMap;
import java.util.Scanner;


public class Vehicles {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        System.out.println("What car (model) are you looking for");

        String carModel = input.nextLine();

        //Create an empty HashMap
        HashMap<String, String> car = new HashMap<>();

        //Add cars to our inventory
        car.put("Civic", "Honda");
        car.put("Cruze", "Chevrolet");
        car.put("Corolla", "Toyota");
        car.put("F150", "Ford");

        //Filter out cars
        if (car.containsKey(carModel)) {
            System.out.println("Our selection is right over here.");
        } else {
            System.out.println("Unfortunately we don't have that model");
        }

    }
}
