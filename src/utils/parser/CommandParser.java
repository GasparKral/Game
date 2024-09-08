package utils.parser;

import java.util.HashMap;
import java.util.Optional;

public class CommandParser {

    private HashMap<String, Runnable> libCommands = new HashMap<>();

    public CommandParser() {

    }

    public CommandParser(HashMap<String, Runnable> libCommands) {

        for (String command : libCommands.keySet()) {
            command = command.toLowerCase();
        }

        this.libCommands = libCommands;
    }

    public HashMap<String, Runnable> getLibCommands() {
        return libCommands;
    }

    public void setLibCommands(HashMap<String, Runnable> libCommands) {
        this.libCommands = libCommands;
    }

    public void addNewCommand(String command, Runnable callback) {
        libCommands.put(command.toLowerCase(), callback);
    }

    public Optional<Runnable> parseCommand(String command, Runnable callback) {

        if (this.libCommands.containsKey(command)) {

            return Optional.of(this.libCommands.get(command));
        } else {
            return Optional.empty();
        }
    }

}
