package polymorphism.compositionChallenge;

public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

//        smartKitchen.getDishwasher().setHasWorkToDo(true);
//        smartKitchen.getRefrigerator().setHasWorkToDo(true);
//        smartKitchen.getCoffeeMaker().setHasWorkToDo(true);
//
//        smartKitchen.getDishwasher().doDishes();
//        smartKitchen.getRefrigerator().orderFood();
//        smartKitchen.getCoffeeMaker().brewCoffee();

        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.doKitchenWork();
    }
}
