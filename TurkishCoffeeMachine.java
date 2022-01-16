package adapter;

public class TurkishCoffeeMachine implements Equipment {

    public Coffee cookCoffee(int sugarAmount) {
       return new Coffee("Turkish Coffee");
    }

}
