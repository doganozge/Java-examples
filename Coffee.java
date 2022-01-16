package adapter;

public class Coffee {
    private String myType;
    public Coffee (String type) {
       this.myType  = type;
    }
    public void displayMe(){
        System.out.println("I am a " + myType);
    }
}
