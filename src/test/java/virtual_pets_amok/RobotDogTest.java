package virtual_pets_amok;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RobotDogTest {

	@Test
	public void shouldCreateARobotDog() {
		RobotDog underTest = new RobotDog(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}
}
