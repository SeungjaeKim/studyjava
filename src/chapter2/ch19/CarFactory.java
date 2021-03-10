package chapter2.ch19;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    static int carNumber = 10001;
    private CarFactory(){

    }

    public static CarFactory getInstance(){
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        Car car = new Car();
        car.setCarNumber(carNumber);
        carNumber++;
        return car;
    }
}
