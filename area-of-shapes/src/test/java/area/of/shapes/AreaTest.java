package area.of.shapes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AreaTest {

	Shape areashape = new Area();

	@Test
	public void rectangleAreaTestCase0() {
		double result = areashape.rectangleArea(5, 10);
		assertEquals(50, result, 0.0);
	}

	@Test
	public void squareAreaTestCase0() {

		assertEquals(8, areashape.squareArea(2), 0.0);
	}

	@Test
	public void circleAreaTestCase0() {
		assertEquals(78.5, areashape.circleArea(5), 0.0);
	}

}
