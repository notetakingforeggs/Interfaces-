public class Boat extends Vehicle implements Swimmable{

    @Override
    public void swim() {
        Swimmable.super.swim();
    }

    @Override
    public void move() {

    }
}
