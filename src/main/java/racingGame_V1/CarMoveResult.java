package racingGame_V1;

public class CarMoveResult {

    private final int position;
    private final String name;

    public CarMoveResult(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String name() {
        return name;
    }

    public int position() {
        return position;
    }
}
