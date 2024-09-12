package utils.parser;

import java.util.Optional;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tokenizer {

    public static CommandParser cp = new CommandParser();
    private static Pattern commandPattern = Pattern.compile("\\[\\w+\\]");

    public static String[] tokenize(String line) {
        return line.split(" ");
    }

    public static String[] tokenize(String line, String separator) {
        return line.split(separator);
    }

    public static String[] tokenize(String line, String separator, int max) {
        return line.split(separator, max);
    }

    public static void setPattern(Pattern pattern) {
        commandPattern = pattern;
    }

    private static boolean isCommand(String line) {
        return line.matches(commandPattern.pattern());
    }

    private static String extractCommand(String line) {
        Pattern pattern = Pattern.compile("\\[(\\w+)\\]");
        Matcher matcher = pattern.matcher(line);
        return matcher.group(1);
    }

    public static Optional<Runnable> getCommand(String line) {
        if (isCommand(line)) {
            return cp.parseCommand(extractCommand(line), null);
        }

        return Optional.empty();
    }

}
