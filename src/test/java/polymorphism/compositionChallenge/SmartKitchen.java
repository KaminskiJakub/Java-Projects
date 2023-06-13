package polymorphism.compositionChallenge;

public class SmartKitchen {
        private CoffeeMaker coffeeMaker;
        private Refrigerator refrigerator;
        private Dishwasher dishwasher;

        public SmartKitchen() {
                coffeeMaker = new CoffeeMaker();
                refrigerator = new Refrigerator();
                dishwasher = new Dishwasher();
        }

        public CoffeeMaker getCoffeeMaker() {
                return coffeeMaker;
        }

        public Refrigerator getRefrigerator() {
                return refrigerator;
        }

        public Dishwasher getDishwasher() {
                return dishwasher;
        }

        public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishwasherFlag) {
                coffeeMaker.setHasWorkToDo(coffeeFlag);
                refrigerator.setHasWorkToDo(fridgeFlag);
                dishwasher.setHasWorkToDo(dishwasherFlag);
        }

        public void doKitchenWork() {
                coffeeMaker.brewCoffee();
                refrigerator.orderFood();
                dishwasher.doDishes();
        }
}
