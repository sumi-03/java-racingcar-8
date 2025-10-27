package racingcar.view;

import racingcar.domain.Car;
import racingcar.util.ViewMessages;

public class OutputView {
    private OutputView() {
    }

    public static void printRoundResultHeader() {
        System.out.println(ViewMessages.EXECUTION_RESULT_HEADER);
    }

    public static void printRoundResult(Car car) {
        String name = car.getName();
        int status = car.getPosition();

        System.out.print(name + ViewMessages.NAME_SEPARATOR);
        for (int i = 0; i < status; i++) {
            System.out.print(ViewMessages.MOVE_SYMBOL);
        }
        System.out.println();
    }
}
