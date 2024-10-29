import java.util.Scanner;

abstract class Vehicle {
    private String manufacturer;

    public Vehicle(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public abstract void displayInfo();
}

class Car extends Vehicle {
    private int numSeats;

    public Car(String manufacturer, int numSeats) {
        super(manufacturer);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Number of Seats: " + getNumSeats());
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String manufacturer, double loadCapacity) {
        super(manufacturer);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Information:");
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Load Capacity: " + getLoadCapacity() + " tons");
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car manufacturer: ");
        String carManufacturer = scanner.nextLine();
        System.out.print("Enter number of seats in the car: ");
        int numSeatsCar = scanner.nextInt();
        Car car = new Car(carManufacturer, numSeatsCar);
        car.displayInfo();
        System.out.println();

        scanner.nextLine();
        System.out.print("Enter truck manufacturer: ");
        String truckManufacturer = scanner.nextLine();
        System.out.print("Enter load capacity of the truck: ");
        double loadCapacity = scanner.nextDouble();
        Truck truck = new Truck(truckManufacturer, loadCapacity);
        truck.displayInfo();

        scanner.close();
    }
}
