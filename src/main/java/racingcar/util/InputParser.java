package racingcar.util;

import lombok.experimental.UtilityClass;

import static racingcar.util.ViewMessages.COMMA;

@UtilityClass
public class InputParser {
    public String[] parseCarNames(String input) {
        return input.split(COMMA);
    }
}
