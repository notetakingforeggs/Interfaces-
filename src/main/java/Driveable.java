public interface Driveable extends Movable {

    default void drivable(){
        System.out.println(this.getClass().getSimpleName() + " is driving!");
    }

    @Override
    default void getSpeed() {

    }
}
