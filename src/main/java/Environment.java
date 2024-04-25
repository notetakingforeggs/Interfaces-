import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Environment<T> {

    protected List<T> traffic = new ArrayList<>();

    public abstract void checkTraffic();

    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }

    public void checkVehicles() {
        for (T item : traffic) {

            if (item instanceof Vehicle) {

                if (item instanceof Driveable ) {
                    System.out.println(item.getClass().getSimpleName() + " is driven!");
                } else if (item instanceof Flyable) {
                    System.out.println(item.getClass().getSimpleName() + " is flying!");
                }else if (item instanceof Swimmable){
                    System.out.println(item.getClass().getSimpleName() + " is driving in water!");
                }
            }
        }

    }
}