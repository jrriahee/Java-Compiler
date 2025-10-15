public class Car implements Vehicle, CarVehicle {
    private String make, model, fuelType;
    private int year, doors;

    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setNumOfDoors(int doors) { this.doors = doors; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public int getNumOfDoors() { return doors; }
    public String getFuelType() { return fuelType; }

    public void displayInfo() {
        System.out.println("\n--- Car Information ---");
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
        System.out.println("Doors: " + doors + ", Fuel Type: " + fuelType);
    }
}
