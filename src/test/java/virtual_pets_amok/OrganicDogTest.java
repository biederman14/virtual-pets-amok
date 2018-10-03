package virtual_pets_amok;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class OrganicDogTest {

	@Test
	public void shouldCreateAOrganicDog() {
		OrganicDog underTest = new OrganicDog(null, null);
		assertNotNull(underTest);
	}

	@Test
	public void shouldGetCageCleanliness() {
		OrganicDog underTest = new OrganicDog("Fluffy", "Organic Dog");

		int instance = underTest.getCageCleanliness(10);
		assertEquals(10, instance);
	}

	@Test
	public void shouldSetCageCleanlinessTo0() {
		OrganicDog underTest = new OrganicDog("Fluffy", "Organic Dog");
		underTest.cleanCage();
		int instance = underTest.getCageCleanliness(0);
		assertEquals(0, instance);
	}

}
