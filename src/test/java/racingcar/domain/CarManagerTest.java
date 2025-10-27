package racingcar.domain;

import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarManagerTest {
    private static final int MOVING_FORWARD = 5;
    private static final int STOP = 2;

    // 게임 진행 테스트 (라운드 하나)
    @Test
    void 라운드_하나에서_자동차들이_이동_또는_정지한다() {
        assertRandomNumberInRangeTest(
                () -> {
                    // given
                    String[] carNames = {"aaa", "bbb"};
                    CarManager carManager = new CarManager(carNames);

                    // when
                    carManager.moveAllCars();

                    // then
                    assertThat(carManager.getCars().get(0).getPosition()).isEqualTo(1); // aaa 이동
                    assertThat(carManager.getCars().get(1).getPosition()).isEqualTo(0); // bbb 정지
                },
                MOVING_FORWARD, STOP // 난수 고정
        );
    }
}
