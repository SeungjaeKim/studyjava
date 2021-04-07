package springchapter2.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditional airConditional = new AirConditional();
        Electronic110V airAdapter = new SocketAdapter(airConditional);
        connect(airAdapter);

    }

    // 우리집 콘센트
    public static void connect(Electronic110V electronic110v){
        electronic110v.powerOn();
    }
}
