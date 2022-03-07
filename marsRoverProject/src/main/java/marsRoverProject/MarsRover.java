package marsRoverProject;

//Test using MarsRoverTest class

public class MarsRover {
	private int limitPositionX;
	private int limitPositionY;
	private int roverPositionX;
	private int roverPositionY;
	private char direction;

	public void setRoverLimit(int limitPositionX, int limitPositionY) {
		this.limitPositionX = limitPositionX;
		this.limitPositionY = limitPositionY;

	}

	public void setRoverInitialPosition(int roverPositionX, int roverPositionY, char direction) throws Exception {
		this.roverPositionX = roverPositionX;
		this.roverPositionY = roverPositionY;
		this.direction = direction;

		if (roverPositionX > limitPositionX || roverPositionY > limitPositionY)
			throw new Exception();

	}

	public String moveCommand(char[] commands) throws Exception {

		for (char command : commands) {
			switch (command) {
			case 'L': {
				switch (direction) {
				case 'N': {
					direction = 'W';
					break;
				}
				case 'W': {
					direction = 'S';
					break;
				}
				case 'S': {
					direction = 'E';
					break;
				}
				case 'E': {
					direction = 'N';
					break;
				}
				default:
					break;
				}
				break;
			}
			case 'R': {
				switch (direction) {
				case 'N': {
					direction = 'E';
					break;
				}
				case 'W': {
					direction = 'N';
					break;
				}
				case 'S': {
					direction = 'W';
					break;
				}
				case 'E': {
					direction = 'S';
					break;
				}
				default:
					break;
				}
				break;
			}
			case 'M': {
				switch (direction) {
				case 'W': {
					roverPositionX--;
					break;
				}
				case 'S': {
					roverPositionY--;
					break;
				}
				case 'E': {
					roverPositionX++;
					break;
				}
				case 'N': {
					roverPositionY++;
					break;
				}
				default:
					break;
				}
				break;
			}
			default:
				break;
			}
		}
		if (roverPositionX >= 5 || roverPositionY >= 5 || roverPositionX < 0 || roverPositionY < 0)
			throw new Exception();
		else
			return roverPositionX + " " + roverPositionY + " " + direction;
	}

}
