package chapter3.ch03;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
        System.out.println("VIPCustomer() call");
    }

    public int getAgentID() {
        return agentID;
    }
}
