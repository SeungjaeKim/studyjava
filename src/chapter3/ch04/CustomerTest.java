package chapter3.ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer lee = new Customer();
        lee.setCustomerName("이순신");
        lee.setCustomerID(10010);
        lee.bonusPoint = 1000;
        int price = lee.calcPrice(1000);
        System.out.println(lee.showCustomerInfo() + price);

        VIPCustomer kim = new VIPCustomer();
        kim.setCustomerName("김유신");
        kim.setCustomerID(10020);
        kim.bonusPoint = 10000;
        price = kim.calcPrice(1000);
        System.out.println(kim.showCustomerInfo() + price);

        Customer vc = new VIPCustomer();
    }
}
