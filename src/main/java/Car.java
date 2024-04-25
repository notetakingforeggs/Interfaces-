public class Car extends Vehicle implements Driveable{
    @Override
    public void move() {
        System.out.println("Car is driving.");
    }
}
