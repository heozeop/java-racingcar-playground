package racingGame_V1;

import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipFile;

public class Racing {

    public static final int MOVE_LIMIT = 5;
    private final List<Car> cars;
    private String[] winner;

    public Racing(String s, int position) {
        cars = Arrays.stream(s.split(",")).map(name -> new Car(name, position, MOVE_LIMIT)).toList();
        winner = new String[]{};
    }

    public int length() {
        return cars.size();
    }

    public List<CarMoveResult> play() {
        final List<CarMoveResult> result = cars.stream().map(Car::move).toList();

        if(winner.length < 1) {
            winner = result.stream()
                .filter(carMoveResult -> carMoveResult.position() == MOVE_LIMIT)
                .map(CarMoveResult::name)
                .toArray(String[]::new);
        }

        return result;
    }

    public boolean isGameEnd() {
        return play().stream().filter(car -> car.position() == MOVE_LIMIT).count() == length();
    }

    public String[] winner() {
        return winner;
    }
}
