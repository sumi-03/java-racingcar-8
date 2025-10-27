package racingcar.controller;

import racingcar.util.InputParser;
import racingcar.util.InputValidator;
import racingcar.view.InputView;

public class GameController {
    public void run() {
        String carNamesInput = InputView.getCarNames();
        String attemptCountInput = InputView.getAttemptCount();

        InputValidator.validateCarName(carNamesInput);
        InputValidator.validateAttemptCount(attemptCountInput);

        String[] carNames = InputParser.parseCarNames(carNamesInput);
    }
}
