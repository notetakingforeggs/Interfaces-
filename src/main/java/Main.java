public class Main {

    public static void main(String[] args) {

        Sky sky = new Sky();
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());

        sky.checkTraffic();

    }

}