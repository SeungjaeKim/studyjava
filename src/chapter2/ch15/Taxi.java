package chapter2.ch15;

public class Taxi {
    String taxiCompanyName;
    int passengerCount;
    int money;

    public Taxi(String taxiCompanyName){
        this.taxiCompanyName = taxiCompanyName;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showTaxiInfo(){
        System.out.println(taxiCompanyName + "회사의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }


}
