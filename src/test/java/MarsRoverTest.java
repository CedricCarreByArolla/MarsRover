import fr.chaplinb.MarsRover;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverTest {


    @ParameterizedTest(name = "to position {1} when it receive commands {0} ")
    @CsvSource({
            "M,0 1 N",
            "MM,0 2 N",
    })
    void given_starting_of_0_0_and_heading_North_should_move_forward(String commands, String finalPosition) {
        //Arrange
        int x = 0;
        int y = 0;
        String orientation = "N";
        MarsRover rover = new MarsRover(x, y, orientation);
        //Act
        rover.executeCommands(commands);
        //Assert
        assertThat(rover.getPosition()).isEqualTo(finalPosition);
    }
}
