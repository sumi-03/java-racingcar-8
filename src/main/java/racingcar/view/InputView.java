package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.ViewMessages;

public class InputView {
    private InputView() {
    }

    public static String getCarNames() {
        System.out.println(ViewMessages.INPUT_CAR_NAME_MESSAGE);
        return Console.readLine();
    }

    public static String getAttemptCount() {
        System.out.println(ViewMessages.INPUT_ATTEMPT_COUNT_MESSAGE);
        return Console.readLine();
    }
}
