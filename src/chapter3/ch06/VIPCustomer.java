package chapter3.ch06;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;



    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)price * salesRatio;
        return price;
    }

    public int getAgentID() {
        return agentID;
    }
}
