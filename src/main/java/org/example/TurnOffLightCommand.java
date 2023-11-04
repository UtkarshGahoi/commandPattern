package org.example;

public class TurnOffLightCommand implements Command{
    private Light light;

    TurnOffLightCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        System.out.println("Light is off");

    }
}
