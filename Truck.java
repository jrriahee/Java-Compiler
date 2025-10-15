public class Truck implements Vehicle, TruckVehicle {
    private String make, model, transmission;
    private int year;
    private double capacity;

    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setCargoCapacity(double tons) { this.capacity = tons; }
    public void setTransmissionType(String transmission) { this.transmission = transmission; }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getCargoCapacity() { return capacity; }
    public String getTransmissionType() { return transmission; }

    public void displayInfo() {
        System.out.println("\n--- Truck Information ---");
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
        System.out.println("Cargo Capacity: " + capacity + " tons, Transmission: " + transmission);
    }
}
