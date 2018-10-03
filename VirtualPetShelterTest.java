package virtual_pets_amok;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VirtualPetShelterTest {

	@Test
	public void shouldAcceptPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(new VirtualPet("Smasho", "Cat", 10, 10, 5, 0, true));
		assertEquals(1, underTest.getPetMap().size());
	}

	@Test
	public void shouldInitiateTick() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(new VirtualPet("Smasho", "Dog", 10, 10, 5, 0, true));
		underTest.timeTickShelter();
		underTest.getPetByName("Smasho");
		assertEquals("hunger should decrease by 1", 9, VirtualPet.getPetHunger());
	}

	// Test Feed
	@Test
	public void shouldFeedPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(new OrganicPet("Smasho", "Dog", 10, 10, 5, 0, true));
		underTest.feedPets();
		underTest.getPetByName("Smasho");
		assertEquals("hunger should increase by 5", 15, VirtualPet.getPetHunger());
	}

	@Test
	public void shouldWaterPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(new OrganicPet("Smasho", "Dog", 10, 10, 5, 0, true));
		underTest.waterPets();
		underTest.getPetByName("Smasho");
		assertEquals("thirst should increase by 5", 15, VirtualPet.getPetThirst());
	}

	@Test
	public void shouldPlayWithPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(new OrganicPet("Smasho", "Dog", 10, 10, 5, 0, true));
		underTest.playWithPets();
		underTest.getPetByName("Smasho");
		assertEquals("happiness should increase by 5", 5, VirtualPet.getPetHappiness());
	}

	@Test
	public void shouldCrematePet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(new OrganicPet("Smasho", "Dog", 10, 10, 5, 0, false));
		underTest.crematePet("Smasho");
		assertEquals("pet map size = 0", 0, underTest.getPetMap().size());
	}

	@Test
	public void shouldWalkDogs() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(new OrganicPet("Smasho", "Dog", 10, 10, 5, 0, true));
		underTest.walkPets();
		underTest.getPetByName("Smasho");
		assertEquals("happiness should increase by 10", 10, VirtualPet.getPetHappiness());
	}
}