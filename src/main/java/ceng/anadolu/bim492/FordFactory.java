package ceng.anadolu.bim492;

public class FordFactory implements CarFactory {
    public SportsCar createSportsCar() {
        return new Mustang();
    }
    public EconomyCar createEconomyCar() {
        return new Focus();
    }
}
