package virtual_pets_amok;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class OrganicDogTest {

	public void shouldHaveCage() {
		OrganicDog underTest = new OrganicDog("Fluffy", "dog");
		boolean result = underTest.getPetAlive();
		assertEquals(false, result);
	}

	public void cageShouldBeEmpty() {
		OrganicDog underTest = new OrganicDog(null, null);
		int result = underTest.getCageCleanliness();
		assertThat(result, is(10));
	}

	public void shouldCleanOrganicDogsCage() {
		OrganicDog underTest = new OrganicDog(null, null);
		underTest.cleanOrganicDogs();
		int result = underTest.getCageCleanliness();
		assertThat(result, is(20));
	}

	public void shouldAddLitterToDogCage() {
		OrganicDog underTest = new OrganicDog(null, null);
		underTest.addLitter();
		int result = underTest.getCageCleanliness();
		assertThat(result, is(11));
	}
}
