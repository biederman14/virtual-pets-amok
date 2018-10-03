package virtual_pets_amok;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RobotDogTest {

	public RobotDogTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testIfRoboticDogWasAdded() {
		RobotDog underTest = new RobotDog("Fluffy", "Robot Dog");
		String result = underTest.getPetName();
		assertThat(result, is("Fluffy"));
	}

}
