package adapter;

public class PremiumCoffeeMachine implements  Equipment{
    private boolean isReady;
    public PremiumCoffeeMachine() {
        isReady = false;
    }

    public void pressHeatButton() {
        isReady = true;
    }

    public void putCream() {

    }
    public Coffee startBrew() {
        if (isReady) return new Coffee("Premium Coffee");
        else return null;
    }

}
