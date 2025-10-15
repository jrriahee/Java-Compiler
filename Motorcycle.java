public class Motorcycle implements Vehicle, MotorVehicle {
    private String make, model, type;
    private int year, wheels;

    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setNumOfWheels(int wheels) { this.wheels = wheels; }
    public void setMotorcycleType(String type) { this.type = type; }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public int getNumOfWheels() { return wheels; }
    public String getMotorcycleType() { return type; }

    public void displayInfo() {
        System.out.println("\n--- Motorcycle Information ---");
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
        System.out.println("Wheels: " + wheels + ", Type: " + type);
    }
}
