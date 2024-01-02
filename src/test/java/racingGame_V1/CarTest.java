package racingGame_V1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void Car_전진하면_이름과_위치를_출력한다() {
        final String carName = "test";
        final Car car = new Car(carName, 0);

        final CarMoveResult result = car.move();

        assertThat(result.name()).isEqualTo(carName);
        assertThat(result.position()).isBetween(0, 1);
    }

    @Test
    public void Car_이름이_5글자_이상이면_실패() throws Exception {
        assertThatThrownBy(() -> new Car("testlt", 0)).isInstanceOf(RuntimeException.class);
    }


}