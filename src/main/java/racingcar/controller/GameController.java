package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.CarManager;
import racingcar.util.InputParser;
import racingcar.util.InputValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {
    private CarManager carManager;

    public void run() {
        String carNamesInput = InputView.getCarNames();
        String attemptCountInput = InputView.getAttemptCount();

        InputValidator.validateCarName(carNamesInput);
        InputValidator.validateAttemptCount(attemptCountInput);

        String[] carNames = InputParser.parseCarNames(carNamesInput);

        carManager = new CarManager(carNames);

        OutputView.printRoundResultHeader();
        int attemptCount = Integer.parseInt(attemptCountInput);

        for (int i = 0; i < attemptCount; i++) {
            carManager.moveAllCars();

            for (Car car : carManager.getCars()) {
                OutputView.printRoundResult(car);
            }
            System.out.println();
        }

        OutputView.printTotalResult(carManager.getCars());
    }
}
