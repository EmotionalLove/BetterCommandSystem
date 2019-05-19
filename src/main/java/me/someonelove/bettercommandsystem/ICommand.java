package me.someonelove.bettercommandsystem;

public interface ICommand {
    void onCommand(boolean hasArgs, String[] args);

    String getCommandName(CommandProcessor processor, boolean withPrefix);
}
