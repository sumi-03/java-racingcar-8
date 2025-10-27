package racingcar.util;

public final class InputParser {
    public static String[] parseCarNames(String input) {
        return input.split(",");
    }
}
