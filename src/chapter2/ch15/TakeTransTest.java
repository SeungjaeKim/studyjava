package chapter2.ch15;

/**
 * James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
 * James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불 합니다.
 * Tomas는 10000원을 가지고 있었고, 2호선 지하철을 타면서 1200원을 지불합니다.
 * Edward는 지각을 해서 택시를 타야 했습니다. 20000만원을 가지고 있었는데 10000원을 택시비로 사용했습니다.
 * 택시는 '잘나간다 운수 회사' 택시를 탔습니다.
 */

public class TakeTransTest {
    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomas", 10000);
        Student edward = new Student("Edward", 20000);


        Bus bus100 = new Bus(100);

        Subway subway2 = new Subway(2);

        Taxi taxi = new Taxi("잘나간다 운수");

        james.takeBus(bus100);
        tomas.takeSubway(subway2);
        edward.takeTaxi(taxi, 10000);

        james.showInfo();
        tomas.showInfo();
        edward.showInfo();

        bus100.showBusInfo();
        subway2.showSubwayInfo();
        taxi.showTaxiInfo();

    }
}
