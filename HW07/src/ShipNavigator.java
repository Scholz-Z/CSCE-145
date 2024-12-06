//Zachary Scholz

import java.util.Scanner;

public class ShipNavigator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueBuilding = "yes";

        System.out.println("Welcome to ShipNavigator!!!");

        while (continueBuilding.equalsIgnoreCase("yes")) {
            System.out.println("Enter the name of the ship:");
            String name = scanner.nextLine();

            System.out.println("Enter its launch date (mm/dd/yyyy):");
            String launchDate = scanner.nextLine();

            System.out.println("Is it a cruise ship or a cargo ship?");
            String shipType = scanner.nextLine().toLowerCase();

            if (shipType.equals("cruise ship")) {
                System.out.println("Enter the ship's passenger capacity:");
                int passengerCapacity = scanner.nextInt();
                System.out.println("How many crew members are on this ship?");
                int crewMembers = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer

                // Create a CruiseShip object
                CruiseShip cruiseShip = new CruiseShip(name, launchDate, passengerCapacity, crewMembers);
                System.out.println("Creating a cruise ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cruiseShip);

            } else if (shipType.equals("cargo ship")) {
                System.out.println("Enter the ship's tonnage (DWT):");
                int tonnage = scanner.nextInt();
                System.out.println("Enter the maximum speed of the ship (in mph):");
                double maxSpeed = scanner.nextDouble();
                scanner.nextLine(); // Clear the buffer

                // Create a CargoShip object
                CargoShip cargoShip = new CargoShip(name, launchDate, tonnage, maxSpeed);
                System.out.println("Creating a cargo ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cargoShip);
            } else {
                System.out.println("Invalid ship type. Please enter either 'cruise ship' or 'cargo ship'.");
                continue;
            }

            System.out.println("Do you want to construct another ship object? Enter yes or no:");
            continueBuilding = scanner.nextLine();
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
