// Author: [Your Name]

public class CruiseShip extends Ship {
    // Instance variables
    private int capacity;
    private int members;

    // Constructor
    public CruiseShip(String name, String launchDate, int xCapacity, int xMembers) {
        super(name, launchDate);
        this.capacity = xCapacity;
        this.members = xMembers;
    }

    // Accessor and Mutator for passengerCapacity
    public int getPassengerCapacity() {
        return capacity;
    }

    public void setPassengerCapacity(int xCapacity) {
        this.capacity = xCapacity;
    }

    // Accessor and Mutator for crewMembers
    public int getCrewMembers() {
        return members;
    }

    public void setCrewMembers(int xMembers) {
        this.members = xMembers;
    }

    // toString method to override base class toString and display CruiseShip details
    @Override
    public String toString() {
        return "Name: " + getName() + "\nPassenger Capacity: " + capacity + "\nCrew: " + members;
    }
}
