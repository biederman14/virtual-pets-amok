package virtual_pets_amok;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RobotCatTest {

	@Test
	public void shouldCreateARobotCat() {
		RobotCat underTest = new RobotCat(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}
}
