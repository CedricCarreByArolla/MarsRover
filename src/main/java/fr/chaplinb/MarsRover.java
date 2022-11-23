package fr.chaplinb;

public class MarsRover {
    private int x;
    private int y;
    private char orientation;

    public MarsRover(int x, int y, char orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            if (command == 'M') {
                moveForward();
            }
            if (command == 'R') {
                if (orientation == 'N') {
                    orientation = 'E';
                }
            }

        }
    }

    private void moveForward() {
        if (orientation == 'N') this.y += 1;
        if (orientation == 'E') this.x += 1;
        if (orientation == 'S') this.y -= 1;
        if (orientation == 'W') this.x -= 1;
    }

    public String getPosition() {
        return x + " " + y + " " + orientation;
    }

    public void setY(int y) {
        this.y = y;
    }
}
