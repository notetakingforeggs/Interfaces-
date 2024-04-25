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
        String className;
        for (T item : traffic) {
            className = this.getClass().getSimpleName();

            if (item instanceof Vehicle) {

                if (item instanceof Driveable && className.equals("Road")) {
                    ((Vehicle) item).move();

                } else if (item instanceof Flyable && className.equals("Sky")) {
                    System.out.println(item.getClass().getSimpleName() + " is flying!");
                }else if (item instanceof Swimmable && className.equals("Water")){
                    System.out.println(item.getClass().getSimpleName() + " is driving in water!");
                }
            }
        }

    }
}