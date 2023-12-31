package org.example;

public class TurnOnLightCommand implements  Command{

    private Light light;

    TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();

    }
}
