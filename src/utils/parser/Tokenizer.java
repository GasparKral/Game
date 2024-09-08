package utils.parser;

import java.util.Optional;

public class Tokenizer {

    public static CommandParser cp = new CommandParser();

    public static String[] tokenize(String line) {
        return line.split(" ");
    }

    public static String[] tokenize(String line, String separator) {
        return line.split(separator);
    }

    public static String[] tokenize(String line, String separator, int max) {
        return line.split(separator, max);
    }

    private static boolean isCommand(String line) {
        return line.matches("\\[\\w+\\]");
    }

    public static Optional<Runnable> getCommand(String line) {
        if (isCommand(line)) {
            return cp.parseCommand(line, null);
        }

        return Optional.empty();
    }

}
