package adapter;

public class FilterCoffeeMachine  implements Equipment{

    public FilterCoffeeMachine() {

    }

    public Coffee brewCoffee() {
         return new Coffee("filter coffee");
    }

}
