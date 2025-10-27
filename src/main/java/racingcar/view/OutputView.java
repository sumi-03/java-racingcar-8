package racingcar.view;

import racingcar.domain.Car;
import racingcar.util.ViewMessages;

import java.util.List;

public class OutputView {
    private OutputView() {
    }

    public static void printRoundResultHeader() {
        System.out.println(ViewMessages.EXECUTION_RESULT_HEADER);
    }

    public static void printRoundResult(Car car) {
        String name = car.getName();
        int position = car.getPosition();

        System.out.print(name + ViewMessages.NAME_SEPARATOR);
        for (int i = 0; i < position; i++) {
            System.out.print(ViewMessages.MOVE_SYMBOL);
        }
        System.out.println();
    }

    public static void printTotalResult(List<Car> cars) {
        int maxPosition = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        List<String> winners = cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .map(Car::getName)
                .toList();

        String winnerNames = String.join(ViewMessages.COMMA, winners);
        System.out.println(ViewMessages.WINNERS + ViewMessages.NAME_SEPARATOR + winnerNames);
    }
}
