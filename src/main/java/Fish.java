public class Fish extends Animal implements Swimmable{

    public Fish(){
        this.speed = 9;
    }

    @Override
    public void makeSound() {
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    public void swim() {
        Swimmable.super.swim();
    }
}
