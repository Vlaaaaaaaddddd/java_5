public abstract class Cars implements Comparable<Cars>{
    private String drive;
    private String fuel;
    private double acceleration;
    private int max_speed;

    public Cars(String drive, String fuel, double acceleration, int max_speed) {
        System.out.println("Объект создан");
        this.drive = drive;
        this.fuel = fuel;
        this.acceleration = acceleration;
        this.max_speed = max_speed;
    }

    public String getDrive() {
        return this.drive;
    }

    public String getFuel() {
        return this.fuel;
    }

    public double getAcceleration() {
        return this.acceleration;
    }

    public int getMax_speed(){
        return this.max_speed;
    }

    public abstract void startEngine();

    @Override
    public int compareTo(Cars other) {
        return Double.compare(this.acceleration, other.acceleration);
    }
}
