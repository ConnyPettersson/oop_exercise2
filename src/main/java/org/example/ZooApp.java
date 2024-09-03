package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class ZooApp {
    private static final ArrayList<Animal> animals = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Zoo app!");
            System.out.println("1. Add an animal");
            System.out.println("2. Display all animals");
            System.out.println("3. Exit");
            System.out.println("Make a choice");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    displayAnimals();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addAnimal() {
        System.out.println("Enter the animal's name: ");
        String name = sc.nextLine();
        System.out.println("Enter the animal's species: ");
        String species = sc.nextLine();
        System.out.println("Add your color:" );
        String color = sc.nextLine();
        Animal newAnimal = new Animal(name, species, color);
        animals.add(newAnimal);
        System.out.println("Animal " + newAnimal.getName() + ", " + newAnimal.getSpecies() + ", " + newAnimal.getColor() + " is added");
        while(true) {
            System.out.println("Do you want to add another animal press y , otherwise press n");
            String response = sc.nextLine();
            if(response.equals("n")) {
                break;
            }else if(response.equals("y")) {
                System.out.println("Enter the animal's name: ");
                name = sc.nextLine();
                System.out.println("Enter the animal's species: ");
                species = sc.nextLine();
                Animal anotherAnimal = new Animal(name, species, color);
                System.out.println("Add your color:" );
                color = sc.nextLine();
                animals.add(anotherAnimal);
                System.out.println("Animal " + anotherAnimal.getName() + ", " + anotherAnimal.getSpecies() + ", " + anotherAnimal.getColor() + " is added");
            }else {
                System.out.println("You must enter y or n!");
            }

        }
    }
    private static void displayAnimals() {
       if (animals.isEmpty()) {
           System.out.println("There is no animals to display!");
       }else {
           for (Animal animal : animals) {
               System.out.println("Your animals are: " + animal);
           }
       }
    }
}