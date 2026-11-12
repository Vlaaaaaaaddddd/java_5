import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Cars vesta1 = new LadaVesta("front_wheel", "92 petrol",
                11.2, 162, 100_000);
        Cars modelS1 = new TeslaModelS("all_wheel", "electric",
                3.2, 250, 80);

        List<Cars> garage = new ArrayList<>();

        garage.add(vesta1);
        garage.add(modelS1);

        for (Cars car : garage) {
            car.startEngine();
        }

        Collections.sort(garage);

        for (Cars car : garage) {
            System.out.print(car.getClass().getSimpleName());
            System.out.print(" ");
            System.out.println(car.getAcceleration());
        }
    }
}
