package polymorphism.polymorphismChallenge;

public class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas powered car starts engine with %d cylinders %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas average %.2f %n", avgKmPerLiter);
    }
}
