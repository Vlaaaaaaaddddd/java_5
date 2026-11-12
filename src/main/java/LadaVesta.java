public class LadaVesta extends Cars{
    private int mileage;

    public LadaVesta(String drive, String fuel, double acceleration, int max_speed, int mileage){
        super(drive, fuel, acceleration, max_speed);
        this.mileage = mileage;
    }


    public int getMileage(){
        return this.mileage;
    }


    @Override
    public void startEngine() {
        System.out.println("Движок запущен. Врум-врум");
    }
}
