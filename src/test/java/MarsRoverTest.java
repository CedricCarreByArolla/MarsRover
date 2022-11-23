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
        MarsRover northFacingRover = new MarsRover(x, y, 'N');
        //Act
        northFacingRover.executeCommands(commands);
        //Assert
        assertThat(northFacingRover.getPosition()).isEqualTo(finalPosition);
    }

    @ParameterizedTest(name = "to position {1} when it receive commands {0} ")
    @CsvSource({
            "M,1 0 E",
            "MM,2 0 E",
            "MMM,3 0 E",
            "MMMM,4 0 E",
    })
    void given_starting_of_0_0_and_heading_Est_should_move_forward(String commands, String finalPosition) {
        //Arrange
        int x = 0;
        int y = 0;
        MarsRover estFacingRover = new MarsRover(x, y, 'E');
        //Act
        estFacingRover.executeCommands(commands);
        //Assert
        assertThat(estFacingRover.getPosition()).isEqualTo(finalPosition);
    }

    @ParameterizedTest(name = "to position {1} when it receive commands {0} ")
    @CsvSource({
            "M,5 4 S",
            "MM,5 3 S",
            "MMM,5 2 S",
            "MMMM,5 1 S",
    })
    void given_starting_of_5_5_and_heading_South_should_move_forward(String commands, String finalPosition) {
        //Arrange
        int x = 5;
        int y = 5;
        MarsRover estFacingRover = new MarsRover(x, y, 'S');
        //Act
        estFacingRover.executeCommands(commands);
        //Assert
        assertThat(estFacingRover.getPosition()).isEqualTo(finalPosition);
    }

    @ParameterizedTest(name = "to position {1} when it receive commands {0} ")
    @CsvSource({
            "M,4 5 W",
            "MM,3 5 W",
            "MMM,2 5 W",
            "MMMM,1 5 W",
    })
    void given_starting_of_5_5_and_heading_West_should_move_forward(String commands, String finalPosition) {
        //Arrange
        int x = 5;
        int y = 5;
        MarsRover estFacingRover = new MarsRover(x, y, 'W');
        //Act
        estFacingRover.executeCommands(commands);
        //Assert
        assertThat(estFacingRover.getPosition()).isEqualTo(finalPosition);
    }

    @ParameterizedTest(name = "to position {1} when it receive commands {0} ")
    @CsvSource({
            "R,0 0 E",
            "RR,0 0 S",
            "RRR,0 0 W",
            "RRRR,0 0 N",
            "RRRRR,0 0 E",
    })
    void given_starting_of_0_0_and_heading_North_should_turn_right(String commands, String finalPosition) {
        //Arrange
        int x = 0;
        int y = 0;
        MarsRover estFacingRover = new MarsRover(x, y, 'N');
        //Act
        estFacingRover.executeCommands(commands);
        //Assert
        assertThat(estFacingRover.getPosition()).isEqualTo(finalPosition);
    }
}
