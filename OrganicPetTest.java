package virtual_pets_amok;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class OrganicPetTest {

	@Test
	public void shouldGiveCatName() {
		OrganicCat underTest = new OrganicCat("Fluffy", "");
		String result = underTest.getPetName();
		assertThat(result, is("Fluffy"));
	}

	@Test
	public void shouldGiveCatHealth() {
		OrganicCat underTest = new OrganicCat("Fluffy", "Cat");
		int result = underTest.getPetHealth();
		assertThat(result, is(15));
	}

	@Test
	public void shouldGiveCatHunger() {
		new OrganicCat("Fluffy", "Cat");
		int result = VirtualPet.getPetHunger();
		assertThat(result, is(10));
	}

	@Test
	public void shouldGiveCatThirst() {
		OrganicCat underTest = new OrganicCat("Fluffy", "Cat");
		int result = underTest.getPetThirst();
		assertThat(result, is(10));
	}

	@Test
	public void shouldGivePeType() {
		OrganicCat underTest = new OrganicCat("Fluffy", "Cat");
		String result = underTest.getPetType();
		assertThat(result, is("Cat"));
	}

	@Test
	public void shouldShowPetHappieness() {
		new OrganicCat("Fluffy", "Cat");
		int result = VirtualPet.getPetHappiness();
		assertThat(result, is(15));
	}

}