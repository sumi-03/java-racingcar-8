package racingcar.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class InputParser {
    public String[] parseCarNames(String input) {
        return input.split(",");
    }
}
