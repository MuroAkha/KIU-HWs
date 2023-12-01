

public class Car {
    private static int count = 1;
    private int chassisNumber;
    private String brand;
    private LicensePlate licensePlate;

    public int getChassisNumber() {
        return chassisNumber;
    }

    public static int getCount() {
        return count;
    }

    public LicensePlate getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setChassisNumber(int chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public static void setCount(int count) {
        Car.count = count;
    }

    public void setLicensePlate(LicensePlate licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Car(String brand, LicensePlate licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;

        this.chassisNumber = count;
        count++;
    }

    public String toString() {
        return "Car " + this.chassisNumber + ": (Brand: " + this.brand + ", LicensePlate: " + this.licensePlate.toString() + ")";
    }
}