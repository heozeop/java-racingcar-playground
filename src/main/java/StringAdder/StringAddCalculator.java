package StringAdder;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static final String DEFAULT_DELIMITER = "[,:]";

    private static boolean isEmpty(String text) {
        return text == null || text.isEmpty();
    }

    public static int splitAndSum(String text) {
        if (isEmpty(text)) {
            return 0;
        }

        final String delimiter = MatcherText.getDelimiter(text);
        final String textToSplit = MatcherText.getString(text);

        return getSum(textToSplit, delimiter);
    }

    private static Integer getSum(String textToSplit, String delimiter) {
        return Arrays.stream(textToSplit.split(delimiter)).map(numberString -> {
            final int number = Integer.parseInt(numberString);

            if (number < 0) {
                throw new RuntimeException();
            }

            return number;
        }).reduce(Integer::sum).orElse(0);
    }

    private static class MatcherText {
        public static final String DELIMITER_INPUT = "//(.*)\n(.*)";
        static Pattern pattern =Pattern.compile(DELIMITER_INPUT);;

        public static String getDelimiter(String text) {
            final Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                return matcher.group(1);
            }

            return DEFAULT_DELIMITER;
        }

        public static String getString(String text) {
            final Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                return matcher.group(2);
            }

            return text;
        }
    }
}
