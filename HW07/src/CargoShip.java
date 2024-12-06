//Z

public class CargoShip extends Ship {
    // Instance variables
    private int tonnage;
    private double maxSpeed;

    // Constructor
    public CargoShip(String xName, String xDate, int xTonnage, double xMaxSpeed) {
        super(xName, xDate);
        this.tonnage = xTonnage;
        this.maxSpeed = xMaxSpeed;
    }

    // Accessors and Mutators
    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int xTonnage) {
        this.tonnage = xTonnage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double xMaxSpeed) {
        this.maxSpeed = xMaxSpeed;
    }

    // toString method to override base class toString and display CargoShip details
    public String toString() {
        return "Name: " + getName() + "\nTonnage: " + tonnage + " DWT\nMaximum Speed: " + maxSpeed + " mph";
    }
}
