package fr.chaplinb;

import java.util.Objects;

public class MarsRover {
    private int x;
    private int y;
    private String orientation;

    public MarsRover(int x, int y, String orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            if (orientation == "N") {
                this.y += 1;
            }
        }
    }

    public String getPosition() {
        return x + " " + y + " " + orientation;
    }

    public void setY(int y) {
        this.y = y;
    }
}
