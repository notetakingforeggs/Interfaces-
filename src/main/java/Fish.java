public class Fish extends Animal implements Swimmable{
    @Override
    public void makeSound() {

    }

    @Override
    public void swim() {
        Swimmable.super.swim();
    }
}
