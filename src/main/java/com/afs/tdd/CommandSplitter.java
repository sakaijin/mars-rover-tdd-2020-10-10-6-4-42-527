package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class CommandSplitter {
    public CommandSplitter() { }

    public List<String> splitCommands(String commands) {
        return Arrays.asList(commands.split(""));
    }
}
