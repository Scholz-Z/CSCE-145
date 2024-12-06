//Zachary Scholz
import java.util.Scanner;

public class Ship {
    // Instance variables
    private String name;
    private String date;

    // Constructor
    public Ship(String name, String launchDate) {
        this.name = name;
        setLaunchDate(launchDate);
    }

    // Accessor and Mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLaunchDate() {
        return date;
    }

    public void setLaunchDate(String xDate) {
        if (validLaunchDate(xDate)) {
            this.date = xDate;
        } else {
            this.date = "01/01/1990"; // Default date if invalid
            System.out.println("Error: Launch date is not between 1990 and 2019. Resetting to 01/01/1990.");
        }
    }

    // Method to check if launch date is valid
    private boolean validLaunchDate(String date) {
        try {
            String[] dateParts = date.split("/");
            int year = Integer.parseInt(dateParts[2]);
            return year >= 1990 && year <= 2019;
        } catch (Exception e) {
            return false;
        }
    }

    // toString method to display ship's name and launch date
    @Override
    public String toString() {
        return "Name: " + name + "\nLaunch Date: " + date;
    }
}