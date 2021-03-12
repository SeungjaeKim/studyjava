package chapter3.ch03;

public class CustomerTest {
    public static void main(String[] args) {
       /* Customer lee = new Customer();
        lee.setCustomerName("이순신");
        lee.setCustomerID(10010);
        lee.bonusPoint = 1000;
        System.out.println(lee.showCustomerInfo());*/

        VIPCustomer kim = new VIPCustomer();
        kim.setCustomerName("김유신");
        kim.setCustomerID(10020);
        kim.bonusPoint = 10000;
        System.out.println(kim.showCustomerInfo());

        Customer vc = new VIPCustomer();
    }
}
