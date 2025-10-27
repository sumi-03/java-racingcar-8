package racingcar.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class InputValidatorTest {
    // 자동차 이름 검증 테스트
    @Test
    void 올바른_자동차_이름이면_예외가_발생하지_않는다() {
        // given
        String input = "aaa,bbb,ccc";

        // when & then
        assertThatCode(() -> InputValidator.validateCarName(input))
                .doesNotThrowAnyException();
    }

    @Test
    void 자동차_이름이_공백이면_예외가_발생한다() {
        // given
        String input = " , ";

        // when & then
        assertThatThrownBy(() -> InputValidator.validateCarName(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름");
    }

    @Test
    void 자동차_이름이_6자_이상이면_예외가_발생한다() {
        // given
        String input = "aaaaaa,bbb";

        // when & then
        assertThatThrownBy(() -> InputValidator.validateCarName(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("이름 길이");
    }

    @Test
    void 자동차가_한대_라면_예외가_발생한다() {
        // given
        String input = "solo";

        // when & then
        assertThatThrownBy(() -> InputValidator.validateCarName(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("최소 2대");
    }

    @Test
    void 자동차_이름이_올바르지_않은_형식이면_예외가_발생한다_1() {
        // given
        String input = "aaa,,bbb";

        // when & then
        assertThatThrownBy(() -> InputValidator.validateCarName(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("형식");
    }

    @Test
    void 자동차_이름이_올바르지_않은_형식이면_예외가_발생한다_2() {
        // given
        String input = "aaa,bbb,";

        // when & then
        assertThatThrownBy(() -> InputValidator.validateCarName(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("형식");
    }
}
