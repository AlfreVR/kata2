package software.ulpgc.kata2;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CSVCarLoader carLoader = new CSVCarLoader(new File("CarDatabase.csv"));
        List<Car> cars = carLoader.load();
        Map<Integer, Integer> horsepowerOrganized = new HorsepowerCarOrganizer().organize(cars);
        for (Integer key :
                horsepowerOrganized.keySet()) {
            System.out.println(key + "-" + (key+49) + " -> " + horsepowerOrganized.get(key));

        }
    }
}
