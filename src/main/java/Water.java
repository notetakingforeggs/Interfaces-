public class Water extends Environment<Swimmable>{
    @Override
    public void checkTraffic() {
        for ( Swimmable  item : traffic){
            System.out.println(item.getClass().getSimpleName() + " is moving through water!");
        }
    }


}
