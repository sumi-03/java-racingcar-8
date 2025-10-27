package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.util.Constants;

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

    public List<Car> getCars() {
        return cars;
    }

    public void moveAllCars() {
        for (Car car : cars) {
            int randomNumber = Randoms.pickNumberInRange(Constants.MIN_RANDOM_NUMBER, Constants.MAX_RANDOM_NUMBER);

            if (randomNumber >= 4) {
                car.move();
            }
        }
    }
}
