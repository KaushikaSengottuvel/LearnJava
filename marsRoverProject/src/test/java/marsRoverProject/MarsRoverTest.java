package marsRoverProject;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MarsRoverTest {

	@Test
	public void givenRoverPosition66N_whenLimitIs55_shouldThrowException() {
		MarsRover marsRover = new MarsRover();
		marsRover.setRoverLimit(5, 5);
		assertThrows(Exception.class, () -> marsRover.setRoverInitialPosition(6, 6, 'N'));
	}

	@Test
	public void givenRoverPosition12N_whenLimitIs55_shouldNotThrowException() {
		MarsRover marsRover = new MarsRover();
		marsRover.setRoverLimit(5, 5);
		assertDoesNotThrow(() -> marsRover.setRoverInitialPosition(1, 2, 'N'));
	}

	@Test
	public void givenRoverPosition62N_whenLimitIs55_shouldNotThrowException() {
		MarsRover marsRover = new MarsRover();
		marsRover.setRoverLimit(5, 5);
		assertThrows(Exception.class, () -> marsRover.setRoverInitialPosition(6, 2, 'N'));
	}

	@Test
	public void givenRoverPosition18N_whenLimitIs55_shouldNotThrowException() {
		MarsRover marsRover = new MarsRover();
		marsRover.setRoverLimit(5, 5);
		assertThrows(Exception.class, () -> marsRover.setRoverInitialPosition(1, 8, 'N'));
	}

	@ParameterizedTest
	@MethodSource("provideRoverMoveCommands")
	public void givenRoverPosition12N_whenMoveCommandIsGiven_shouldReturnCorrectPosition(char[] commands,
			String expectedLocation) throws Exception {
		MarsRover marsRover = new MarsRover();
		marsRover.setRoverLimit(5, 5);
		marsRover.setRoverInitialPosition(1, 2, 'N');
		assertEquals(expectedLocation, marsRover.moveCommand(commands));
	}

	private static Stream<Arguments> provideRoverMoveCommands() {
		return Stream.of(Arguments.of(new char[] { 'L' }, "1 2 W"), Arguments.of(new char[] { 'L', 'L' }, "1 2 S"),
				Arguments.of(new char[] { 'L', 'L', 'L' }, "1 2 E"),
				Arguments.of(new char[] { 'L', 'L', 'L', 'L' }, "1 2 N"), Arguments.of(new char[] { 'R' }, "1 2 E"),
				Arguments.of(new char[] { 'R', 'R' }, "1 2 S"), Arguments.of(new char[] { 'R', 'R', 'R' }, "1 2 W"),
				Arguments.of(new char[] { 'R', 'R', 'R', 'R' }, "1 2 N"),
				Arguments.of(new char[] { 'L', 'M' }, "0 2 W"), Arguments.of(new char[] { 'L', 'L', 'M' }, "1 1 S"),
				Arguments.of(new char[] { 'L', 'L', 'L', 'M' }, "2 2 E"),
				Arguments.of(new char[] { 'L', 'L', 'L', 'L', 'M' }, "1 3 N"),
				Arguments.of(new char[] { 'R', 'M' }, "2 2 E"), Arguments.of(new char[] { 'R', 'R', 'M' }, "1 1 S"),
				Arguments.of(new char[] { 'R', 'R', 'R', 'M' }, "0 2 W"),
				Arguments.of(new char[] { 'R', 'R', 'R', 'R', 'M' }, "1 3 N"),
				Arguments.of(new char[] { 'L', 'M', 'L', 'M', 'L', 'M', 'L', 'M', 'M' }, "1 3 N"));
	}

	@Test
	public void givenRoverPosition12N_afterMoveCommands_XshouldNotExceed_Limit55() throws Exception {
		MarsRover marsRover = new MarsRover();
		marsRover.setRoverLimit(5, 5);
		marsRover.setRoverInitialPosition(1, 2, 'N');
		assertThrows(Exception.class,
				() -> marsRover.moveCommand(new char[] { 'R', 'M', 'M', 'M', 'M', 'M', 'M', 'M' }));
	}

	@Test
	public void givenRoverPosition12N_afterMoveCommands_YshouldNotExceed_Limit55() throws Exception {
		MarsRover marsRover = new MarsRover();
		marsRover.setRoverLimit(5, 5);
		marsRover.setRoverInitialPosition(1, 2, 'N');
		assertThrows(Exception.class, () -> marsRover.moveCommand(new char[] { 'M', 'M', 'M', 'M', 'M', 'M', 'M' }));
	}

	@Test
	public void givenRoverPosition12N_afterMoveCommands_XshouldNotBeLessThan_Limit00() throws Exception {
		MarsRover marsRover = new MarsRover();
		marsRover.setRoverLimit(5, 5);
		marsRover.setRoverInitialPosition(1, 2, 'N');
		assertThrows(Exception.class,
				() -> marsRover.moveCommand(new char[] { 'L', 'M', 'M', 'M', 'M', 'M', 'M', 'M' }));
	}

	@Test
	public void givenRoverPosition12N_afterMoveCommands_YshouldNotBeLessThan_Limit00() throws Exception {
		MarsRover marsRover = new MarsRover();
		marsRover.setRoverLimit(5, 5);
		marsRover.setRoverInitialPosition(1, 2, 'N');
		assertThrows(Exception.class,
				() -> marsRover.moveCommand(new char[] { 'L', 'L', 'M', 'M', 'M', 'M', 'M', 'M', 'M' }));
	}
}
