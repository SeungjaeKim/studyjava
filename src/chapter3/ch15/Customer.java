package chapter3.ch15;

public class Customer implements Buy, Sell{

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() {
        System.out.println("Customer order");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    public void hello(){
        System.out.println("hello");
    }
}
