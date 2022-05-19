package adapter;

public class AdapterMain {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V apater = new SocketAdapter(cleaner);
        connect(apater);

        AirConditioner airConditioner = new AirConditioner();

        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }

    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
