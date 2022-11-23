import fr.chaplinb.MarsRover;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {

    @ParameterizedTest(name = "to position {1} when it receive commands {0} ")
    @CsvSource({
            "M,0 1 N",
            "MM,0 2 N",
            "MMM,0 3 N",
    })
    void given_starting_of_0_0_and_heading_North_should_move_forward(String commands, String finalPosition) {
        //Arrange
        int x = 0;
        int y = 0;
        MarsRover northFacingRover = new MarsRover(x, y, "N");
        //Act
        northFacingRover.executeCommands(commands);
        //Assert
        assertThat(northFacingRover.getPosition()).isEqualTo(finalPosition);
    }

    @ParameterizedTest(name = "to position {1} when it receive commands {0} ")
    @CsvSource({
            "M,1 0 E",
    })
    void given_starting_of_0_0_and_heading_Est_should_move_forward(String commands, String finalPosition) {
        //Arrange
        int x = 0;
        int y = 0;
        MarsRover estFacingRover = new MarsRover(x, y, "E");
        //Act
        estFacingRover.executeCommands(commands);
        //Assert
        assertThat(estFacingRover.getPosition()).isEqualTo(finalPosition);
    }
}
