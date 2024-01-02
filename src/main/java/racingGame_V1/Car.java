package racingGame_V1;

import java.util.Random;

public class Car {


    private final String name;
    private int position;

    public Car(String name, int position) {
        if(name.length() > 5)  {
            throw new RuntimeException();
        }

        this.name = name;
        this.position = position;
    }

    public CarMoveResult move() {
        final Random random = new Random();
        final int randomNumber = random.nextInt(8) + 1;

        if(randomNumber > 4) {
            position += 1;
        }

        return new CarMoveResult(name, position);
    }
}
