package chapter3.ch02;

public class VIPCustomer extends Customer{

    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public int getAgentID() {
        return agentID;
    }
}
