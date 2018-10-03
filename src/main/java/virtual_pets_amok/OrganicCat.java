package virtual_pets_amok;

public class OrganicCat extends VirtualPet {

	int cleanliness;

	public OrganicCat(String petName, String petType) {
		super(petName, petType, 10, 10, 10, 10, true);
	}

	@Override
	public String toString() {
		return "Name = " + getPetName() + ", Type = " + getPetType("Organic Cat") + ", Thirst = " + getPetThirst()
				+ ", Hunger = " + getPetHunger() + ", Health = " + getPetHealth() + ", Happiness = "
				+ getPetHappiness();
	}

}