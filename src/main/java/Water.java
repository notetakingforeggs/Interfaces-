public class Water extends Environment<Swimmable>{

    int maxSpeed = 88;


    @Override
    public void checkTraffic() {
        for ( Swimmable  item : traffic){
            if(item.getSpeed() >= maxSpeed){
                item.getSpeed()  maxSpeed;
            }
            System.out.println(item.getClass().getSimpleName() + " is moving through water!");
        }
    }


}
