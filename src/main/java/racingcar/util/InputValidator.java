package racingcar.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class InputValidator {
    public void validateCarName(String input) {
        // 입력값이 null이거나 공백인 경우
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 입력해야 합니다.");
        }

        String[] carNames = input.split(",", -1);

        // 자동차가 1대인 경우
        if (carNames.length < 2) {
            throw new IllegalArgumentException("자동차는 최소 2대여야 합니다");
        }

        for (String name : carNames) {
            String trimmedName = name.trim();

            // 이름이 비거나 공백인 경우 (쉼표로 끝나는 경우 포함)
            if (trimmedName.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.(형식 오류)");
            }

            // 이름 길이 5자 초과
            if (trimmedName.length() > 5) {
                throw new IllegalArgumentException("자동차 이름 길이는 5자 이하만 가능합니다.");
            }
        }
    }

    public void validateAttemptCount(String input) {
    }
}
