package racingGame_V1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingTest {
    static Racing race = null;

    @BeforeAll
    static void Racing_init() {
        race = new Racing("aaaaa,bbbbb,ccccc", 5);
    }

    @Test
    void Racing_이름을_쉼표로_구분해_차_생성가능() {
        assertThat(race.length()).isEqualTo(3);
    }

    @Test
    void Racing_게임을_플레이_할_수_있다() {
        assertThat(race.play().size()).isEqualTo(3);
    }

    @Test
    void Racing_게임이_끝난지_알_수_있다() {
        assertThat(race.isGameEnd()).isEqualTo(true);
    }

    @Test
    void Racing_승자를_알_수_있다() {
        race.play();
        assertThat(race.winner().length).isEqualTo(3);
    }
}
