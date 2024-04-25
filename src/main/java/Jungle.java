public class Jungle extends Environment<Swingable>{


    @Override
    public void checkTraffic() {
        for ( Swingable item : traffic){
            System.out.println(item.getClass().getSimpleName() + " is swinging through something!");
        }
    }
}
