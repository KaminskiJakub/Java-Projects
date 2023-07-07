package polymorphism.polymorphismChallenge;

public class HybridCar extends Car  {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid powered car starts engine with %d cylinders %n", cylinders);
        System.out.printf("Hybrid powered car starts engine with %d batterySize %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid average %.2f %n", avgKmPerLiter);
    }
}
