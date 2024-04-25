public interface Driveable {

    default void drivable(){
        System.out.println(this.getClass().getSimpleName() + " is driving!");
    }
}
