package racingGame_V1;

import java.util.Random;

public class Car {


    private final String name;
    private final int moveLimit;
    private int position;

    public Car(String name, int position, int moveLimit) {
        if(name.length() > 5)  {
            throw new RuntimeException();
        }

        if(position > moveLimit) {
            throw new RuntimeException();
        }

        this.moveLimit = moveLimit;
        this.name = name;
        this.position = position;
    }

    public CarMoveResult move() {
        if (position >= moveLimit) {
            return new CarMoveResult(name, moveLimit);
        }

        final Random random = new Random();
        final int randomNumber = random.nextInt(8) + 1;

        if(randomNumber > 4) {
            position += 1;
        }

        return new CarMoveResult(name, position);
    }
}
