import java.util.List;
public class Main {

    public static void main(String[] args) {

        Duck duck1 = new Duck();
        duck1.swim();

        Sky sky = new Sky();
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());
        sky.addTraffic(new MultiDrone());

        Water water = new Water();
        water.addTraffic(new Duck());
        water.addTraffic(new Fish());
        water.addTraffic(new Boat());
        water.addTraffic(new MultiDrone());

        Road road = new Road();
        road.addTraffic(new Car());
        road.addTraffic(new Van());
        road.addTraffic(new Lorry());
        road.addTraffic(new MultiDrone());
        road.addTraffic(new HGV());

        Jungle jungle = new Jungle();
        jungle.addTraffic(new Orangutan());

        List<Environment<?>> environments = List.of(sky, water, road, jungle);

        for (Environment<?> environment: environments) {
            environment.checkTraffic();
           //environment.checkVehicles();
        }

    }

}