package polymorphism.polymorphismChallenge;

public class Main {
    public static void main(String[] args) {
        Car fiat = new Car("fiat uno");
        runRace(fiat);

        Car audi = new GasPoweredCar("audi quattro", 54.5, 6);
        runRace(audi);

        Car tesla = new ElectricCar("tesla X", 40, 5);
        runRace(tesla);

        Car toyotaHybrid = new HybridCar("toyota hybrid 40a", 60, 7, 6);
        runRace(toyotaHybrid);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
