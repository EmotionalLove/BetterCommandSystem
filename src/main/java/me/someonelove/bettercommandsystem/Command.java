package me.someonelove.bettercommandsystem;

public abstract class Command {

    private String commandName;

    public Command(String name) {
        this.commandName = name;
    }

    public abstract void onCommand(boolean hasArgs, String[] args);

    public final String getCommandName(CommandProcessor processor, boolean withPrefix) {
        return withPrefix ? processor.commmandPrefix + this.commandName : this.commandName;
    }
}
