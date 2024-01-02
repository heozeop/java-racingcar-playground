package racingGame_V1;

import java.util.StringJoiner;

public class Prompt {
    public static String gameStartPrompt() {
        return "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    }

    public static String gameTryPrompt() {
        return "시도할 회수는 몇회인가요?";
    }

    public static String gamePlayStartPrompt() {
        return "실행결과";
    }

    public static String gamePlayPrompt(CarMoveResult result) {
        return String.format("%s : %s", result.name(), "-".repeat(result.position()));
    }

    public static String gameEndPrompt(String[] winner) {
        if(winner.length < 1) {
            return "승자는 없습니다.";
        }

        return String.format("%s가 최종 우승했습니다.", String.join(", ", winner));
    }
}
