public class Duck extends Bird implements Swimmable{
    @Override
    public void swim() {
        Swimmable.super.swim();
    }
}
