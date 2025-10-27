package racingcar.util;

public final class InputValidator {
    public static void validateCarName(String input) {
        // 입력값이 null이거나 공백인 경우
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorMessages.ERROR_EMPTY_CAR_NAME);
        }

        String[] carNames = input.split(",", -1);

        // 자동차가 1대인 경우
        if (carNames.length < 2) {
            throw new IllegalArgumentException(ErrorMessages.ERROR_MINIMUM_TWO_CARS);
        }

        for (String name : carNames) {
            String trimmedName = name.trim();

            // 이름이 비거나 공백인 경우 (쉼표로 끝나는 경우 포함)
            if (trimmedName.isEmpty()) {
                throw new IllegalArgumentException(ErrorMessages.ERROR_INVALID_CAR_NAME_FORMAT);
            }

            // 이름 길이 5자 초과
            if (trimmedName.length() > 5) {
                throw new IllegalArgumentException(ErrorMessages.ERROR_CAR_NAME_LENGTH);
            }
        }
    }

    public static void validateAttemptCount(String input) {
        String trimmedInput = input.trim();

        // 입력값이 숫자로만 구성되어 있는지 확인
        if (!trimmedInput.matches("\\d+")) {
            throw new IllegalArgumentException(ErrorMessages.ERROR_NOT_NUMERIC);
        }

        int count = Integer.parseInt(trimmedInput);

        // 시도 횟수가 1 미만인 경우
        if (count < 1) {
            throw new IllegalArgumentException(ErrorMessages.ERROR_ATTEMPT_COUNT_MIN);
        }
    }
}
