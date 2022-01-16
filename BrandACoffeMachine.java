package adapter;

public class BrandACoffeMachine implements  Equipment, MyCoffeeMachineRedBox{

    public BrandACoffeMachine() {

    }


    public void stear() {

    }
    public void putCreame() {

    }
    public Coffee  brewIt() {
        return new Coffee("BrandA");
    }

    @Override
    public Coffee bigStartButton() {
        stear();
        putCreame();
        Coffee cof = brewIt();
        return cof;
    }
}
