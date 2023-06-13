package polymorphism.compositionChallenge;

public class Dishwasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Do dishes");
            hasWorkToDo = false;
        }
    }
}
