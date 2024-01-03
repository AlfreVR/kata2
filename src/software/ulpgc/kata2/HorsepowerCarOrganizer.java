package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HorsepowerCarOrganizer implements carOrganizer{

    @Override
    public Map<Integer, Integer> organize(List<Car> carList) {
        HashMap<Integer, Integer> horsepower = new HashMap<>();
        for (Car car : carList ) {
            int hp = car.getHp();
            horsepower.put(minimun(hp), horsepower.getOrDefault(minimun(hp),0)+1);
        }

        return horsepower;
    }

    private Integer minimun(int hp) {
        return (hp / 50) *50;
    }
}
