public class Fish extends Animal implements Swimmable{
    @Override
    public void makeSound() {

    }


    public void swim() {
        Swimmable.super.swim();
    }
}
