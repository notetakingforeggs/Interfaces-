public class Sky extends Environment<Flyable>{
    @Override
    public void checkTraffic() {
        for ( Flyable  item : traffic){
            System.out.println(item.getClass().getSimpleName() + " is flying!");
        }
    }


}
