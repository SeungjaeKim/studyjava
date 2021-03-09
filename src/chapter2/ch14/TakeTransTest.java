package chapter2.ch14;

/**
 * James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
 * James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불 합니다.
 * Tomas는 10000원을 가지고 있었고, 2호선 지하철을 타면서 1200원을 지불합니다.
 */
public class TakeTransTest {
    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);

        Subway subway2 = new Subway(2);

        james.takeBus(bus100);
        tomas.takeSubway(subway2);

        james.showInfo();
        tomas.showInfo();
        bus100.showBusInfo();
        subway2.showSubwayInfo();

    }
}
