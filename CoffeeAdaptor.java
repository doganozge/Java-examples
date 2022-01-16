package adapter;

import java.util.HashMap;

public class CoffeeAdaptor implements CommonCoffeeMachineInterface{

    private java.util.HashMap<String, Equipment> introducedMachines = new HashMap<String, Equipment>() ;


    public void introduceMachine (Equipment eq, String name) {
        introducedMachines.put(name, eq);
    }


    @Override
    public Coffee brewCoffeeButton(String type) {

        Equipment coffeeEquipment = introducedMachines.get(type);
        if (coffeeEquipment == null) {
            return null;
        } else {
            // 1. adaptor herşeyi bilen baristadır
            if (type=="filter") {
               return ((FilterCoffeeMachine)coffeeEquipment  ).brewCoffee();

            } else  if (type=="premium") {
                 ((PremiumCoffeeMachine)coffeeEquipment  ).pressHeatButton();
                ((PremiumCoffeeMachine)coffeeEquipment  ).putCream();
                return ((PremiumCoffeeMachine)coffeeEquipment  ).startBrew();
            } else  if (type=="turkish") {
                return ((TurkishCoffeeMachine)coffeeEquipment  ).cookCoffee(2);

            } else  if (type=="branda") {
               // ((BrandACoffeMachine)coffeeEquipment). stear();
               // ((BrandACoffeMachine)coffeeEquipment).putCreame();
               // Coffee cof = ((BrandACoffeMachine)coffeeEquipment  ).brewIt();
               // return cof;

                return ((BrandACoffeMachine)coffeeEquipment  ).bigStartButton();



            } else {
                return null;
            }



        }
    }
}
