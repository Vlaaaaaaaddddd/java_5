public class TeslaModelS extends Cars{
    private int charge;

    public TeslaModelS(String drive, String fuel, double acceleration, int max_speed, int charge){
        super(drive, fuel, acceleration, max_speed);
        this.charge = charge;
    }

    @Override
    public void startEngine() {
        System.out.println("Движок запущен. пи-пи-пи");
    }
}
