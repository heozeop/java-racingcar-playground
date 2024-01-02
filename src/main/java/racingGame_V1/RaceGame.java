package racingGame_V1;

import java.util.List;
import java.util.Scanner;

public class RaceGame {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(Prompt.gameStartPrompt());
        final String carNames = scanner.nextLine();
        Racing race = new Racing(carNames, 1);

        System.out.println(Prompt.gameTryPrompt());
        int tryCount = scanner.nextInt();

        System.out.println(Prompt.gamePlayStartPrompt());
        for(int i = 0; i < tryCount; ++i) {
            race.play().forEach(result -> System.out.println(Prompt.gamePlayPrompt(result)));
            System.out.println();
        }

        System.out.println(Prompt.gameEndPrompt(race.winner()));
    }
}
