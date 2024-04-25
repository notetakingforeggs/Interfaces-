public class Aeroplane extends Vehicle implements Flyable{
    @Override
    public void fly() {
        Flyable.super.fly();
    }

    @Override
    public void move() {
        System.out.println("Aeroplane is flying.");
    }
}
