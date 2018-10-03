package virtual_pets_amok;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class OrganicCatTest {

	public void shouldHaveLitterBox() {
		VirtualPet underTest = new VirtualPet("Fluffy", "cat", 10, 10, 9, 0, true);
		boolean result = underTest.getPetAlive();
		assertEquals(false, result);
	}

	public void ShouldBeEmpty() {
		OrganicCat underTest = new OrganicCat(null, null);
		int result = underTest.getLitterBoxCleanliness();
		assertThat(result, is(10));
	}

	public void shouldCleanOrganicCats() {
		OrganicCat underTest = new OrganicCat(null, null);
		underTest.cleanLitterBox();
		int result = underTest.getLitterBoxCleanliness();
		assertThat(result, is(20));
	}

	public void shouldAddLitter() {
		OrganicCat underTest = new OrganicCat(null, null);
		underTest.addLitter();
		int result = underTest.getLitterBoxCleanliness();
		assertThat(result, is(11));
	}

}
