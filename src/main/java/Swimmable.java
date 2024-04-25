public interface Swimmable extends Movable{



    default void swim(){
        System.out.println(this.getClass().getSimpleName() + " is swimming!");
    }




}
