package virtual_pets_amok;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VirtualPetTest {

	@Test
	public void myDefaultPet() {
		String petName = "Smith";
		String petType = "Cat";
		VirtualPet defaultPet = new VirtualPet(petName, petType);
		assertEquals("Should create new name, description, and set defaults", 10, defaultPet.getPetHunger());

	}

	@Test
	public void shouldCheckPetAliveorDead() {
		VirtualPet underTest = new VirtualPet("Fluffy", "", 10, 10, 9, 0, true);
		boolean result = underTest.getPetAlive();
		assertEquals(false, result);
	}

}
