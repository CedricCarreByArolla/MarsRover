package fr.chaplinb;

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
        throw new UnsupportedOperationException();
    }

    public String getPosition() {
        throw new UnsupportedOperationException();
    }
}
