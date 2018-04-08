package ceng.anadolu.bim492;

public class AudiFactory implements CarFactory {
    public SportsCar createSportsCar() {
        return new AudiTT();
    }
    public EconomyCar createEconomyCar() {
        return new A3();
    }
}
