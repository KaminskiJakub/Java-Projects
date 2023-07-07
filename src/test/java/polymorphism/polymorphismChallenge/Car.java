package polymorphism.polymorphismChallenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car starts engine");
    }

    public void drive() {
        System.out.println("Car is driving. Type of car " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car run engine");
    }
}
