public class Road extends Environment<Driveable>{
    @Override
    public void checkTraffic() {
        for ( Driveable item : traffic){
            System.out.println(item.getClass().getSimpleName() + " is driving!");
        }
    }


}
