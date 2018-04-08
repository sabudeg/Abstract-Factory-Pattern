package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {
        System.out.println("Test project 1");
//Sait Burak Değirmenci
System.out.println("Abstract Factory Pattern");

// Create abstract factories
System.out.println("Abstract factories creating...");
    CarFactory factoryOne = new FordFactory();
    CarFactory factoryTwo = new AudiFactory();

// Create cars via abstract factories
System.out.println("Concrete cars creating...");
    SportsCar car1 = factoryOne.createSportsCar();
    EconomyCar car2 = factoryOne.createEconomyCar();
    SportsCar car3 = factoryTwo.createSportsCar();
    EconomyCar car4 = factoryTwo.createEconomyCar();

System.out.println("Calling drive on the cars.");
    car1.driveFast();
    car2.driveSlow();
    car3.driveFast();
    car4.driveSlow();
    }
}
