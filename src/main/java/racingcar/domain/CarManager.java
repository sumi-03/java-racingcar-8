package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private List<Car> cars;

    public CarManager(String[] carNames) {
        this.cars = new ArrayList<>(carNames.length);

        for (String name : carNames) {
            cars.add(new Car(name));
        }
    }
}
