import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverTest {
    @Test
    void should_move_forward() {
        //Arrange
        int x = 0;
        int y = 0;
        String orientation = "N";
        MarsRover marsRover = new MarsRover(x, y, orientation);
        //Act
        rover.executeCommands("M");
        //Assert
        assertThat(rover.getPosition()).isEqualTo("0 1 N");
    }
}
