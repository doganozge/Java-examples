package adapter;

public class MyCoffeeApp {

    public static void main(String[] arg) {
        // We have two different machine in out coffee
        FilterCoffeeMachine filterCoffeeMachine = new  FilterCoffeeMachine();
        PremiumCoffeeMachine premiumCoffeeMachine = new PremiumCoffeeMachine();
        TurkishCoffeeMachine turkishCoffeeMachine = new TurkishCoffeeMachine();

        BrandACoffeMachine brandAMachine = new BrandACoffeMachine();


        CommonCoffeeMachineInterface herseyiBilenBarista = new CoffeeAdaptor ();
        herseyiBilenBarista.introduceMachine(filterCoffeeMachine, "filter");
        herseyiBilenBarista.introduceMachine(premiumCoffeeMachine, "premium");
        herseyiBilenBarista.introduceMachine(turkishCoffeeMachine, "turkish");
        herseyiBilenBarista.introduceMachine(brandAMachine, "branda");



        Coffee aCoffee = herseyiBilenBarista.brewCoffeeButton("filter");
        Coffee bCoffee = herseyiBilenBarista.brewCoffeeButton("turkish");
        Coffee cCoffee = brandAMachine.bigStartButton();

        Coffee dCoffee = herseyiBilenBarista.brewCoffeeButton("branda");




        aCoffee.displayMe();;
        bCoffee.displayMe();
        cCoffee.displayMe();
        dCoffee.displayMe();

        //








        // We had two orders. One filter coffee, one premium coffeee

       // Coffee aFilterCoffee = filterCoffeeMachine.brewCoffee();

       // premiumCoffeeMachine.startBrew();
       // premiumCoffeeMachine.putCream();
       // Coffee aPremiumCaffee  = premiumCoffeeMachine.startBrew();










        return;
    }
}
